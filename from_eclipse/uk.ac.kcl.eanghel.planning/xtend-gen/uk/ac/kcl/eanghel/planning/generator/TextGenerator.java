package uk.ac.kcl.eanghel.planning.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import uk.ac.kcl.eanghel.planning.planning.AnalyseTask;
import uk.ac.kcl.eanghel.planning.planning.BugTask;
import uk.ac.kcl.eanghel.planning.planning.DeployTask;
import uk.ac.kcl.eanghel.planning.planning.DocumentTask;
import uk.ac.kcl.eanghel.planning.planning.FeatureTask;
import uk.ac.kcl.eanghel.planning.planning.Owner;
import uk.ac.kcl.eanghel.planning.planning.Project;
import uk.ac.kcl.eanghel.planning.planning.Status;
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning;
import uk.ac.kcl.eanghel.planning.planning.TaskType;
import uk.ac.kcl.eanghel.planning.planning.Tasks;
import uk.ac.kcl.eanghel.planning.planning.TestTask;

@SuppressWarnings("all")
public class TextGenerator {
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
  
  public static CharSequence toText(final TaskPlanning root) {
    StringConcatenation _builder = new StringConcatenation();
    TextGenerator.Environment env = new TextGenerator.Environment();
    _builder.newLineIfNotEmpty();
    _builder.append("Planning session for team ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("Team stakeholders: ");
    _builder.append("\n");
    {
      EList<Owner> _owners = root.getOwners();
      for(final Owner o : _owners) {
        _builder.append("\t");
        String _name_1 = o.getName();
        _builder.append(_name_1);
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("Tasks planned in the session: ");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Tasks> _tasks = root.getTasks();
      boolean _hasElements = false;
      for(final Tasks t : _tasks) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("\n");
        } else {
          _builder.appendImmediate("\n", "");
        }
        CharSequence _freshVarName = env.getFreshVarName();
        _builder.append(_freshVarName);
        _builder.append(". ");
        CharSequence _taskText = TextGenerator.taskText(t.getTaskType());
        _builder.append(_taskText);
        CharSequence _taskInfo = TextGenerator.taskInfo(t);
        _builder.append(_taskInfo);
      }
      if (_hasElements) {
        _builder.append("\n");
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
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final BugTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Fix the bug \'");
    String _bug = task.getBug();
    _builder.append(_bug);
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final AnalyseTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Analyse \'");
    String _analyse = task.getAnalyse();
    _builder.append(_analyse);
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final TestTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test the \'");
    String _test = task.getTest();
    _builder.append(_test);
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final DocumentTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Document the \'");
    String _doc = task.getDoc();
    _builder.append(_doc);
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _taskText(final DeployTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Deploy the \'");
    String _deploy = task.getDeploy();
    _builder.append(_deploy);
    _builder.append("\': ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence taskInfo(final Tasks t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append(" owned by ");
    {
      EList<Owner> _owner = t.getOwner();
      boolean _hasElements = false;
      for(final Owner o : _owner) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = o.getName();
        _builder.append(_name);
      }
      if (_hasElements) {
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      int _value = t.getPoints().getValue();
      boolean _notEquals = (_value != 0);
      if (_notEquals) {
        _builder.append("\t");
        _builder.append(" worth ");
        int _value_1 = t.getPoints().getValue();
        _builder.append(_value_1);
        _builder.append(" Story Points.");
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Status _status = t.getStatus();
      boolean _tripleNotEquals = (_status != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append(" status: ");
        Status _status_1 = t.getStatus();
        _builder.append(_status_1);
        _builder.append(".");
        _builder.append("\n");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = t.getProj().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append(" defined in the ");
        {
          int _length = ((Object[])Conversions.unwrapArray(t.getProj(), Object.class)).length;
          boolean _greaterThan = (_length > 1);
          if (_greaterThan) {
            _builder.append("projects ");
          } else {
            _builder.append("project ");
          }
        }
        {
          EList<Project> _proj = t.getProj();
          boolean _hasElements_1 = false;
          for(final Project p : _proj) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name_1 = p.getName();
            _builder.append(_name_1);
          }
        }
      }
    }
    _builder.append(".");
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
