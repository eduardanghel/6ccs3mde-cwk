/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import uk.ac.kcl.eanghel.planning.validation.PlanningValidator

/** 
 * Custom quickfixes.
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class PlanningQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(PlanningValidator.INVALID_STORY_POINT) 
	def suggestFibonacciNumber(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Set to Fibonacci number", "The story points need to be in the Fibonacci sequence.", null)[context |
				val xtextDocument = context.xtextDocument
				val storypoint = Integer::parseInt(xtextDocument.get(issue.offset, issue.length))
				
				
				if (storypoint >= 100){
					xtextDocument.replace(issue.offset, issue.length, "89")
				} else {
					xtextDocument.replace(issue.offset, issue.length, "5")
//			        xtextDocument.replace(issue.offset, issue.length, calculateFib(storypoint).toString)
				}
			]
	}
	
//	This recursive method breaks eclipse :(
//	def Integer calculateFib(Integer number){
//		if (number <= 1)
//       		return number;
//    	return calculateFib(number-1) + calculateFib(number-2);
//	}
	
	@Fix(PlanningValidator.DUPLICATE_OWNER) 
	def fixDuplicateOwner(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "De-duplicate owners", "Cannot assign the same name to multiple owners.", null)
			[ context |
				val xtextDocument = context.xtextDocument
				val name = xtextDocument.get(issue.offset, issue.length)
				xtextDocument.replace(issue.offset, issue.length, name+"1")
			]
	}
	
	@Fix(PlanningValidator.INVALID_OWNER) 
	def fixLowerCaseName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Fix name capitalisation", "The name of an owner needs to start with an upper case letter.", null)[context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		]
	}
	
	@Fix(PlanningValidator.PRIORITY_TOO_HIGH) 
	def fixPriorityTooHigh(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,  "Reduce priority to 25.", "Priority should be lower or equal to 25", null)[context | 
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, "25")
		]
		}
}