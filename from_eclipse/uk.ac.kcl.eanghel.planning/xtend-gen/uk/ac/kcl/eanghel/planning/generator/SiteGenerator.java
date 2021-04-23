package uk.ac.kcl.eanghel.planning.generator;

import java.util.Arrays;
import java.util.LinkedHashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.eanghel.planning.planning.AnalyseTask;
import uk.ac.kcl.eanghel.planning.planning.BugTask;
import uk.ac.kcl.eanghel.planning.planning.DeployTask;
import uk.ac.kcl.eanghel.planning.planning.DocumentTask;
import uk.ac.kcl.eanghel.planning.planning.FeatureTask;
import uk.ac.kcl.eanghel.planning.planning.Owner;
import uk.ac.kcl.eanghel.planning.planning.Project;
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning;
import uk.ac.kcl.eanghel.planning.planning.TaskType;
import uk.ac.kcl.eanghel.planning.planning.Tasks;
import uk.ac.kcl.eanghel.planning.planning.TestTask;

@SuppressWarnings("all")
public class SiteGenerator {
  private static class Environment {
    private int counter = 0;
    
    public CharSequence getFreshVarName() {
      StringConcatenation _builder = new StringConcatenation();
      int _plusPlus = this.counter++;
      _builder.append(_plusPlus);
      return _builder;
    }
    
    public int exit() {
      return this.counter--;
    }
  }
  
  public static CharSequence html(final TaskPlanning root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<!-- Required meta tags -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("<title>Team planning for ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<script src=\"https://www.kryogenix.org/code/browser/sorttable/sorttable.js\"></script>");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>");
    _builder.newLine();
    CharSequence _createPieChart = SiteGenerator.createPieChart(root);
    _builder.append(_createPieChart);
    _builder.newLineIfNotEmpty();
    CharSequence _prepareAndDownloadCsv = SiteGenerator.prepareAndDownloadCsv();
    _builder.append(_prepareAndDownloadCsv);
    _builder.newLineIfNotEmpty();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<h1>Team ");
    String _name_1 = root.getName();
    _builder.append(_name_1);
    _builder.append(" planning.</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p></p>");
    _builder.newLine();
    _builder.append("<p>The table can be sorted by clicking on any header.</p>");
    _builder.newLine();
    _builder.append("<p>You can download a CSV by clicking the button below.</p>");
    _builder.newLine();
    _builder.append("<p></p>");
    _builder.newLine();
    CharSequence _createMainTable = SiteGenerator.createMainTable(root);
    _builder.append(_createMainTable);
    _builder.newLineIfNotEmpty();
    _builder.append("<button onclick=\"exportTableToCSV()\">Save as CSV</button>");
    _builder.newLine();
    _builder.append("<div id=\"piechart\" style=\"width: 900px; height: 500px; \"></div>");
    _builder.newLine();
    _builder.append("<div id=\"columnchart_material\" style=\"width: 900px; height: 500px;\"></div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createMainTable(final TaskPlanning root) {
    StringConcatenation _builder = new StringConcatenation();
    SiteGenerator.Environment env = new SiteGenerator.Environment();
    _builder.newLineIfNotEmpty();
    _builder.append("<table class=\"table table-striped table-hover sortable\" id=\"table01\">");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<th>ID</th>");
    _builder.newLine();
    _builder.append("<th>Owners</th>");
    _builder.newLine();
    _builder.append("<th>Task</th>");
    _builder.newLine();
    _builder.append("<th>Priority</th>");
    _builder.newLine();
    _builder.append("<th>Story Points</th>");
    _builder.newLine();
    _builder.append("<th>Status</th>");
    _builder.newLine();
    _builder.append("<th>Projects</th>");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<Tasks> _tasks = root.getTasks();
      for(final Tasks t : _tasks) {
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("<td>");
        CharSequence _freshVarName = env.getFreshVarName();
        _builder.append(_freshVarName);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        CharSequence _listOwners = SiteGenerator.listOwners(t);
        _builder.append(_listOwners);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        CharSequence _taskText = SiteGenerator.taskText(t.getTaskType());
        _builder.append(_taskText);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        int _priority = t.getPriority();
        _builder.append(_priority);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        int _value = t.getPoints().getValue();
        _builder.append(_value);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        String _string = t.getStatus().toString();
        _builder.append(_string);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        CharSequence _listProjects = SiteGenerator.listProjects(t);
        _builder.append(_listProjects);
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createPieChart(final TaskPlanning root) {
    StringConcatenation _builder = new StringConcatenation();
    LinkedHashMap<String, Integer> results = SiteGenerator.counting(root);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("google.charts.load(\'current\', {\'packages\':[\'corechart\']});");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("google.charts.setOnLoadCallback(drawChart);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("function drawChart() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var data = google.visualization.arrayToDataTable([");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("[\'Status\', \'Number of Tasks\'],");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("[\'Stuck\',     ");
    Integer _get = results.get("S");
    _builder.append(_get, "      ");
    _builder.append("],");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("[\'In Progress\',      ");
    Integer _get_1 = results.get("P");
    _builder.append(_get_1, "      ");
    _builder.append("],");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("[\'Done\',  ");
    Integer _get_2 = results.get("D");
    _builder.append(_get_2, "      ");
    _builder.append("],");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("[\'Waiting for review\', ");
    Integer _get_3 = results.get("R");
    _builder.append(_get_3, "      ");
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("]);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var options = {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("title: \'Status Chart\'");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var chart = new google.visualization.PieChart(document.getElementById(\'piechart\'));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("chart.draw(data, options);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence prepareAndDownloadCsv() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("function downloadCSV(csv) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("let csvFile = new Blob([csv], {type: \"text/csv\"});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let downloadLink = document.createElement(\"a\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("downloadLink.download = \'planning.csv\';");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("downloadLink.href = window.URL.createObjectURL(csvFile);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("downloadLink.style.display = \"none\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("document.body.appendChild(downloadLink);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("downloadLink.click();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function exportTableToCSV() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("var csv = [];");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("var elem = document.getElementById(\"table01\")");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("var rows = elem.getElementsByTagName(\"tr\")");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("for (var i = 0; i < rows.length; i++) {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("var row = [], cols = rows[i].querySelectorAll(\"td, th\");");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("for (var j = 0; j < cols.length; j++) {");
    _builder.newLine();
    _builder.append("\t        \t");
    _builder.append("row.push(\'\"\' + cols[j].innerText + \'\"\');");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("csv.push(row.join(\",\"));        ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("downloadCSV(csv.join(\"\\n\"));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public static LinkedHashMap<String, Integer> counting(final TaskPlanning root) {
    LinkedHashMap<String, Integer> _xblockexpression = null;
    {
      Pair<String, Integer> _mappedTo = Pair.<String, Integer>of("S", Integer.valueOf(0));
      Pair<String, Integer> _mappedTo_1 = Pair.<String, Integer>of("P", Integer.valueOf(0));
      Pair<String, Integer> _mappedTo_2 = Pair.<String, Integer>of("D", Integer.valueOf(0));
      Pair<String, Integer> _mappedTo_3 = Pair.<String, Integer>of("R", Integer.valueOf(0));
      LinkedHashMap<String, Integer> results = CollectionLiterals.<String, Integer>newLinkedHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3);
      EList<Tasks> _tasks = root.getTasks();
      for (final Tasks t : _tasks) {
        String _string = Character.valueOf(t.getStatus().name().charAt(0)).toString();
        Integer _get = results.get(Character.valueOf(t.getStatus().name().charAt(0)).toString());
        int _plus = ((_get).intValue() + 1);
        results.replace(_string, Integer.valueOf(_plus));
      }
      _xblockexpression = results;
    }
    return _xblockexpression;
  }
  
  public static CharSequence listOwners(final Tasks task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Owner> _owner = task.getOwner();
      boolean _hasElements = false;
      for(final Owner o : _owner) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(" ");
        String _name = o.getName();
        _builder.append(_name);
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence listProjects(final Tasks task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Project> _proj = task.getProj();
      boolean _hasElements = false;
      for(final Project p : _proj) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = p.getName();
        _builder.append(_name);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final FeatureTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Implement the feature \'");
    String _feat = task.getFeat();
    _builder.append(_feat);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final BugTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Fix the bug \'");
    String _bug = task.getBug();
    _builder.append(_bug);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final AnalyseTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Analyse \'");
    String _analyse = task.getAnalyse();
    _builder.append(_analyse);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final TestTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test the \'");
    String _test = task.getTest();
    _builder.append(_test);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final DocumentTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Document the \'");
    String _doc = task.getDoc();
    _builder.append(_doc);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final DeployTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Deploy the \'");
    String _deploy = task.getDeploy();
    _builder.append(_deploy);
    _builder.append("\'.");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence taskText(final TaskType task) {
    if (task instanceof AnalyseTask) {
      return _taskText((AnalyseTask)task);
    } else if (task instanceof BugTask) {
      return _taskText((BugTask)task);
    } else if (task instanceof DeployTask) {
      return _taskText((DeployTask)task);
    } else if (task instanceof DocumentTask) {
      return _taskText((DocumentTask)task);
    } else if (task instanceof FeatureTask) {
      return _taskText((FeatureTask)task);
    } else if (task instanceof TestTask) {
      return _taskText((TestTask)task);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(task).toString());
    }
  }
}
