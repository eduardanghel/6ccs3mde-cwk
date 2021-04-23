package uk.ac.kcl.eanghel.planning.generator

import uk.ac.kcl.eanghel.planning.planning.AnalyseTask
import uk.ac.kcl.eanghel.planning.planning.BugTask
import uk.ac.kcl.eanghel.planning.planning.DeployTask
import uk.ac.kcl.eanghel.planning.planning.DocumentTask
import uk.ac.kcl.eanghel.planning.planning.FeatureTask
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning
import uk.ac.kcl.eanghel.planning.planning.Tasks
import uk.ac.kcl.eanghel.planning.planning.TestTask

class SiteGenerator {
	def static html(TaskPlanning root) '''
	<!doctype html>
	<html lang="en">
	<!-- Required meta tags -->
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Team planning for «root.name»</title>
	<script src="https://www.kryogenix.org/code/browser/sorttable/sorttable.js"></script>
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	«createPieChart(root)»
	«prepareAndDownloadCsv()»
	</head>
	
	
	<body>
	<div class="container">
	
	<h1>Team «root.name» planning.</h1>
	<p></p>
	<p>The table can be sorted by clicking on any header.</p>
	<p>You can download a CSV by clicking the button below.</p>
	<p></p>
	«createMainTable(root)»
	<button onclick="exportTableToCSV()">Save as CSV</button>
	<div id="piechart" style="width: 900px; height: 500px; "></div>
	<div id="columnchart_material" style="width: 900px; height: 500px;"></div>
	</body>
	</div>
	</html>
	'''
	
	def static createMainTable(TaskPlanning root)'''
	«var env = new Environment»
	<table class="table table-striped table-hover sortable" id="table01">
	<tr>
	<th>ID</th>
	<th>Owners</th>
	<th>Task</th>
	<th>Priority</th>
	<th>Story Points</th>
	<th>Status</th>
	<th>Projects</th>
	<tr>
	«FOR t: root.tasks»
	<tr>
	<td>«env.freshVarName»</td>
	<td>«listOwners(t)»</td>
	<td>«taskText(t.taskType)»</td>
	<td>«t.priority»</td>
	<td>«t.points.value»</td>
	<td>«t.status.toString»</td>
	<td>«listProjects(t)»</td>
	</tr>
	«ENDFOR»
	</table>
	'''
	
	def static createPieChart(TaskPlanning root)'''
	«var results = counting(root)»
	
	<script type="text/javascript">
	  google.charts.load('current', {'packages':['corechart']});
	  google.charts.setOnLoadCallback(drawChart);
	
	  function drawChart() {
	
	    var data = google.visualization.arrayToDataTable([
	      ['Status', 'Number of Tasks'],
	      ['Stuck',     «results.get('S')»],
	      ['In Progress',      «results.get('P')»],
	      ['Done',  «results.get('D')»],
	      ['Waiting for review', «results.get('R')»]
	    ]);
	
	    var options = {
	      title: 'Status Chart'
	    };
	
	    var chart = new google.visualization.PieChart(document.getElementById('piechart'));
	
	    chart.draw(data, options);
	  }
	</script>
	'''
	
	def static prepareAndDownloadCsv()'''
	<script>
	function downloadCSV(csv) {
	    let csvFile = new Blob([csv], {type: "text/csv"});
		let downloadLink = document.createElement("a");
	    downloadLink.download = 'planning.csv';
	    downloadLink.href = window.URL.createObjectURL(csvFile);
	    downloadLink.style.display = "none";
	    document.body.appendChild(downloadLink);
	    downloadLink.click();
	}
	</script>
	
	<script>
		function exportTableToCSV() {
		    var csv = [];
		    var elem = document.getElementById("table01")
		    
		    var rows = elem.getElementsByTagName("tr")
		    
		    for (var i = 0; i < rows.length; i++) {
		        var row = [], cols = rows[i].querySelectorAll("td, th");
		        
		        for (var j = 0; j < cols.length; j++) {
		        	row.push('"' + cols[j].innerText + '"');
		        }
		        
		        csv.push(row.join(","));        
		    }
		    downloadCSV(csv.join("\n"));
		}
	</script>
	'''
	
	def static counting(TaskPlanning root){
		var results = newLinkedHashMap('S' -> 0, 'P' -> 0, 'D' -> 0, 'R' ->0)
		for (t:root.tasks){
			
			results.replace(t.status.name().charAt(0).toString, results.get(t.status.name().charAt(0).toString)+1)
		}
		results
	}
	
	def static listOwners(Tasks task)'''
	«FOR o: task.owner SEPARATOR ', '» «o.name» «ENDFOR»
	'''
	
	def static listProjects(Tasks task)'''
	«FOR p:task.proj SEPARATOR ', '»«p.name»«ENDFOR»
	'''
	
	def static dispatch taskText(FeatureTask task)'''
		Implement the feature '«task.feat»'.
	'''
	
	def static dispatch taskText(BugTask task)'''
		Fix the bug '«task.bug»'.
	'''
	
	def static dispatch taskText(AnalyseTask task)'''
		Analyse '«task.analyse»'.
	'''
	
	def static dispatch taskText(TestTask task)'''
		Test the '«task.test»'.
	'''
	
	def static dispatch taskText(DocumentTask task)'''
		Document the '«task.doc»'.
	'''
	
	def static dispatch taskText(DeployTask task)'''
		Deploy the '«task.deploy»'.
	'''
	
	private static class Environment {
		var int counter = 0

		def getFreshVarName() '''«counter++»'''

		def exit() { counter-- }
		
		
	}
}