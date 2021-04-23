package uk.ac.kcl.eanghel.planning.generator

import java.util.ArrayList
import java.util.List
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning
import uk.ac.kcl.eanghel.planning.planning.TaskType
import uk.ac.kcl.eanghel.planning.planning.Tasks
import uk.ac.kcl.eanghel.planning.planning.Owner

class Auxiliary {
	def static List<TaskType> getTasks(TaskPlanning root) {
		var List<TaskType> TasksList = new ArrayList<TaskType>()
		for (Tasks x : root.tasks) {
			TasksList.add(x.taskType)
		}
		return TasksList;
	}
	
	def static TaskPlanning getTaskOwner(Owner owner) {
		return owner.eContainer() as TaskPlanning
	}
}