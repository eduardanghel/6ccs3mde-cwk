/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.validation

import java.util.Arrays
import java.util.List
import org.eclipse.xtext.validation.Check
import uk.ac.kcl.eanghel.planning.planning.Owner
import uk.ac.kcl.eanghel.planning.planning.Points
import uk.ac.kcl.eanghel.planning.planning.TaskPlanning
import uk.ac.kcl.eanghel.planning.planning.Tasks
import uk.ac.kcl.eanghel.planning.typing.validation.PlanningTypeSystemValidator
import uk.ac.kcl.eanghel.planning.planning.PlanningPackage

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PlanningValidator extends PlanningTypeSystemValidator {
	
	public static val INVALID_STORY_POINT = 'uk.ac.kcl.eanghel.planning.INVALID_STORY_POINT'
	public static val DUPLICATE_OWNER = 'uk.ac.kcl.eanghel.planning.DUPLICATE_OWNER'
	public static val INVALID_OWNER = 'uk.ac.kcl.eanghel.planning.INVALID_OWNER'
	public static val PRIORITY_TOO_HIGH = 'uk.ac.kcl.eanghel.planning.PRIORITY_TOO_HIGH'
	
	@Check 
	def package void checkStoryPointsFibonacci(Points points) {
		var List<Integer> fibList = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
		if(!fibList.contains(points.getValue())) 
			error(
			"The amount of story points needs to a Fibonacci number lower than 100", points,
			PlanningPackage.Literals.POINTS__VALUE, INVALID_STORY_POINT)
	}
	
	@Check
	def checkDuplicateOwners(TaskPlanning tasks){
		var owners = tasks.owners
		for (var i = 0; i < owners.size; i++){
			for (var j = i+1; j < owners.size; j++){
				if (owners.get(i).name.equals(owners.get(j).name)){
					error("Cannot declare duplicate owners.", tasks,
						PlanningPackage.Literals.TASK_PLANNING__OWNERS, DUPLICATE_OWNER)
				}
			}
		}
	}
	
	@Check
	def checkOwnersAreUppercased(Owner owner){
		if (!Character.isUpperCase(owner.name.charAt(0))) {
			error("Owners' names must start with a capital letter.", owner,
				PlanningPackage.Literals.OWNER__NAME, INVALID_OWNER)
		}
	}
	
	@Check(NORMAL)
	def checkPriorityIsNotOverstated(Tasks tasks){
		if (tasks.priority > 10){
			info("Make sure you don't overstate your priorities.", null)
		}
		if (tasks.priority > 20) {
			warning ('This priority is quite high.', null)
		}
		if (tasks.priority > 25){
			error("Priority too high.", tasks,
				PlanningPackage.Literals.TASKS__PRIORITY, PRIORITY_TOO_HIGH)
		}
	}
	
	// TODO: check if the sum of priorities is too high
	// TODO: check if the sum of the story points is over a certain threshold
}
