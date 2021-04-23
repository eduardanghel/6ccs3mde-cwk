package uk.ac.kcl.eanghel.planning.generator

import uk.ac.kcl.eanghel.planning.planning.AnalyseTask
import uk.ac.kcl.eanghel.planning.planning.BugTask
import uk.ac.kcl.eanghel.planning.planning.DeployTask
import uk.ac.kcl.eanghel.planning.planning.DocumentTask
import uk.ac.kcl.eanghel.planning.planning.FeatureTask
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning
import uk.ac.kcl.eanghel.planning.planning.Tasks
import uk.ac.kcl.eanghel.planning.planning.TestTask

class TextGenerator {
	def static toText(TaskPlanning root)'''
		«var env = new Environment»
		Planning session for team «root.name».
		Team stakeholders: «'\n'»«FOR o:root.owners»«'\t'»«o.name»,«ENDFOR»
		«'\n'»
		Tasks planned in the session: «'\n'»
		«FOR t:root.tasks BEFORE "\n" SEPARATOR '\n' AFTER "\n"»
		«env.freshVarName». «taskText(t.taskType)»«taskInfo(t)»«ENDFOR»
		'''
	
	def static dispatch taskText(FeatureTask task)'''
		Implement the feature '«task.feat»': 
	'''
	
	def static dispatch taskText(BugTask task)'''
		Fix the bug '«task.bug»': 
	'''
	
	def static dispatch taskText(AnalyseTask task)'''
		Analyse '«task.analyse»': 
	'''
	
	def static dispatch taskText(TestTask task)'''
		Test the '«task.test»': 
	'''
	
	def static dispatch taskText(DocumentTask task)'''
		Document the '«task.doc»': 
	'''
	
	def static dispatch taskText(DeployTask task)'''
		Deploy the '«task.deploy»': 
	'''
	
	def static taskInfo(Tasks t)'''
		«'\t'» owned by «FOR o:t.owner SEPARATOR ', ' AFTER '\n'»«o.name»«ENDFOR»
		«IF t.points.value != 0»«'\t'» worth «t.points.value» Story Points.«'\n'»«ENDIF»
		«IF t.status !== null»«'\t'» status: «t.status».«'\n'»«ENDIF»
		«IF !t.proj.isEmpty»«'\t'» defined in the «IF t.proj.length > 1»projects «ELSE»project «ENDIF»«FOR p:t.proj SEPARATOR ', '»«p.name»«ENDFOR»«ENDIF».
	'''

	
	private static class Environment {
		var int counter = 0

		def getFreshVarName() '''«counter++»'''

		def exit() { counter-- }
	}
}