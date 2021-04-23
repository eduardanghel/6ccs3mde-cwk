/*
 * generated by Xtext 2.24.0
 */
grammar InternalPlanning;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.eanghel.planning.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.eanghel.planning.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.eanghel.planning.services.PlanningGrammarAccess;

}
@parser::members {
	private PlanningGrammarAccess grammarAccess;

	public void setGrammarAccess(PlanningGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTaskPlanning
entryRuleTaskPlanning
:
{ before(grammarAccess.getTaskPlanningRule()); }
	 ruleTaskPlanning
{ after(grammarAccess.getTaskPlanningRule()); } 
	 EOF 
;

// Rule TaskPlanning
ruleTaskPlanning 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskPlanningAccess().getGroup()); }
		(rule__TaskPlanning__Group__0)
		{ after(grammarAccess.getTaskPlanningAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOwner
entryRuleOwner
:
{ before(grammarAccess.getOwnerRule()); }
	 ruleOwner
{ after(grammarAccess.getOwnerRule()); } 
	 EOF 
;

// Rule Owner
ruleOwner 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOwnerAccess().getNameAssignment()); }
		(rule__Owner__NameAssignment)
		{ after(grammarAccess.getOwnerAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProject
entryRuleProject
:
{ before(grammarAccess.getProjectRule()); }
	 ruleProject
{ after(grammarAccess.getProjectRule()); } 
	 EOF 
;

// Rule Project
ruleProject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProjectAccess().getNameAssignment()); }
		(rule__Project__NameAssignment)
		{ after(grammarAccess.getProjectAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTasks
entryRuleTasks
:
{ before(grammarAccess.getTasksRule()); }
	 ruleTasks
{ after(grammarAccess.getTasksRule()); } 
	 EOF 
;

// Rule Tasks
ruleTasks 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTasksAccess().getGroup()); }
		(rule__Tasks__Group__0)
		{ after(grammarAccess.getTasksAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePoints
entryRulePoints
:
{ before(grammarAccess.getPointsRule()); }
	 rulePoints
{ after(grammarAccess.getPointsRule()); } 
	 EOF 
;

// Rule Points
rulePoints 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPointsAccess().getValueAssignment()); }
		(rule__Points__ValueAssignment)
		{ after(grammarAccess.getPointsAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTaskType
entryRuleTaskType
:
{ before(grammarAccess.getTaskTypeRule()); }
	 ruleTaskType
{ after(grammarAccess.getTaskTypeRule()); } 
	 EOF 
;

// Rule TaskType
ruleTaskType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTaskTypeAccess().getAlternatives()); }
		(rule__TaskType__Alternatives)
		{ after(grammarAccess.getTaskTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureTask
entryRuleFeatureTask
:
{ before(grammarAccess.getFeatureTaskRule()); }
	 ruleFeatureTask
{ after(grammarAccess.getFeatureTaskRule()); } 
	 EOF 
;

// Rule FeatureTask
ruleFeatureTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureTaskAccess().getGroup()); }
		(rule__FeatureTask__Group__0)
		{ after(grammarAccess.getFeatureTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBugTask
entryRuleBugTask
:
{ before(grammarAccess.getBugTaskRule()); }
	 ruleBugTask
{ after(grammarAccess.getBugTaskRule()); } 
	 EOF 
;

// Rule BugTask
ruleBugTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBugTaskAccess().getGroup()); }
		(rule__BugTask__Group__0)
		{ after(grammarAccess.getBugTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnalyseTask
entryRuleAnalyseTask
:
{ before(grammarAccess.getAnalyseTaskRule()); }
	 ruleAnalyseTask
{ after(grammarAccess.getAnalyseTaskRule()); } 
	 EOF 
;

// Rule AnalyseTask
ruleAnalyseTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnalyseTaskAccess().getGroup()); }
		(rule__AnalyseTask__Group__0)
		{ after(grammarAccess.getAnalyseTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTestTask
entryRuleTestTask
:
{ before(grammarAccess.getTestTaskRule()); }
	 ruleTestTask
{ after(grammarAccess.getTestTaskRule()); } 
	 EOF 
;

// Rule TestTask
ruleTestTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTestTaskAccess().getGroup()); }
		(rule__TestTask__Group__0)
		{ after(grammarAccess.getTestTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDocumentTask
entryRuleDocumentTask
:
{ before(grammarAccess.getDocumentTaskRule()); }
	 ruleDocumentTask
{ after(grammarAccess.getDocumentTaskRule()); } 
	 EOF 
;

// Rule DocumentTask
ruleDocumentTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDocumentTaskAccess().getGroup()); }
		(rule__DocumentTask__Group__0)
		{ after(grammarAccess.getDocumentTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeployTask
entryRuleDeployTask
:
{ before(grammarAccess.getDeployTaskRule()); }
	 ruleDeployTask
{ after(grammarAccess.getDeployTaskRule()); } 
	 EOF 
;

// Rule DeployTask
ruleDeployTask 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeployTaskAccess().getGroup()); }
		(rule__DeployTask__Group__0)
		{ after(grammarAccess.getDeployTaskAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Status
ruleStatus
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatusAccess().getAlternatives()); }
		(rule__Status__Alternatives)
		{ after(grammarAccess.getStatusAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskTypeAccess().getFeatureTaskParserRuleCall_0()); }
		ruleFeatureTask
		{ after(grammarAccess.getTaskTypeAccess().getFeatureTaskParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTaskTypeAccess().getBugTaskParserRuleCall_1()); }
		ruleBugTask
		{ after(grammarAccess.getTaskTypeAccess().getBugTaskParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTaskTypeAccess().getAnalyseTaskParserRuleCall_2()); }
		ruleAnalyseTask
		{ after(grammarAccess.getTaskTypeAccess().getAnalyseTaskParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTaskTypeAccess().getTestTaskParserRuleCall_3()); }
		ruleTestTask
		{ after(grammarAccess.getTaskTypeAccess().getTestTaskParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getTaskTypeAccess().getDocumentTaskParserRuleCall_4()); }
		ruleDocumentTask
		{ after(grammarAccess.getTaskTypeAccess().getDocumentTaskParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getTaskTypeAccess().getDeployTaskParserRuleCall_5()); }
		ruleDeployTask
		{ after(grammarAccess.getTaskTypeAccess().getDeployTaskParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Status__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0()); }
		('Stuck')
		{ after(grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1()); }
		('In Progress')
		{ after(grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2()); }
		('Done')
		{ after(grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3()); }
		('Waiting for review')
		{ after(grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__0__Impl
	rule__TaskPlanning__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskPlanningAccess().getTeamKeyword_0()); }
	'Team'
	{ after(grammarAccess.getTaskPlanningAccess().getTeamKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__1__Impl
	rule__TaskPlanning__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskPlanningAccess().getNameAssignment_1()); }
	(rule__TaskPlanning__NameAssignment_1)
	{ after(grammarAccess.getTaskPlanningAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__2__Impl
	rule__TaskPlanning__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskPlanningAccess().getOwnersKeyword_2()); }
	'Owners'
	{ after(grammarAccess.getTaskPlanningAccess().getOwnersKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__3__Impl
	rule__TaskPlanning__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); }
		(rule__TaskPlanning__OwnersAssignment_3)
		{ after(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); }
		(rule__TaskPlanning__OwnersAssignment_3)*
		{ after(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__4__Impl
	rule__TaskPlanning__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskPlanningAccess().getProjectsKeyword_4()); }
	'Projects'
	{ after(grammarAccess.getTaskPlanningAccess().getProjectsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__5__Impl
	rule__TaskPlanning__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); }
		(rule__TaskPlanning__ProjsAssignment_5)
		{ after(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); }
	)
	(
		{ before(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); }
		(rule__TaskPlanning__ProjsAssignment_5)*
		{ after(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TaskPlanning__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTaskPlanningAccess().getTasksAssignment_6()); }
	(rule__TaskPlanning__TasksAssignment_6)*
	{ after(grammarAccess.getTaskPlanningAccess().getTasksAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tasks__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__0__Impl
	rule__Tasks__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getTaskKeyword_0()); }
	'Task'
	{ after(grammarAccess.getTasksAccess().getTaskKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__1__Impl
	rule__Tasks__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getTaskTypeAssignment_1()); }
	(rule__Tasks__TaskTypeAssignment_1)
	{ after(grammarAccess.getTasksAccess().getTaskTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__2__Impl
	rule__Tasks__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getOwnerKeyword_2()); }
	'owner'
	{ after(grammarAccess.getTasksAccess().getOwnerKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__3__Impl
	rule__Tasks__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTasksAccess().getOwnerAssignment_3()); }
		(rule__Tasks__OwnerAssignment_3)
		{ after(grammarAccess.getTasksAccess().getOwnerAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTasksAccess().getOwnerAssignment_3()); }
		(rule__Tasks__OwnerAssignment_3)*
		{ after(grammarAccess.getTasksAccess().getOwnerAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__4__Impl
	rule__Tasks__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getPriorityKeyword_4()); }
	'priority'
	{ after(grammarAccess.getTasksAccess().getPriorityKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__5__Impl
	rule__Tasks__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getPriorityAssignment_5()); }
	(rule__Tasks__PriorityAssignment_5)
	{ after(grammarAccess.getTasksAccess().getPriorityAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__6__Impl
	rule__Tasks__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getPointsKeyword_6()); }
	'points'
	{ after(grammarAccess.getTasksAccess().getPointsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__7__Impl
	rule__Tasks__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getPointsAssignment_7()); }
	(rule__Tasks__PointsAssignment_7)
	{ after(grammarAccess.getTasksAccess().getPointsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__8__Impl
	rule__Tasks__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getStatusKeyword_8()); }
	'status'
	{ after(grammarAccess.getTasksAccess().getStatusKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__9__Impl
	rule__Tasks__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getStatusAssignment_9()); }
	(rule__Tasks__StatusAssignment_9)
	{ after(grammarAccess.getTasksAccess().getStatusAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__10__Impl
	rule__Tasks__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTasksAccess().getProjectKeyword_10()); }
	'project'
	{ after(grammarAccess.getTasksAccess().getProjectKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tasks__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTasksAccess().getProjAssignment_11()); }
		(rule__Tasks__ProjAssignment_11)
		{ after(grammarAccess.getTasksAccess().getProjAssignment_11()); }
	)
	(
		{ before(grammarAccess.getTasksAccess().getProjAssignment_11()); }
		(rule__Tasks__ProjAssignment_11)*
		{ after(grammarAccess.getTasksAccess().getProjAssignment_11()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureTask__Group__0__Impl
	rule__FeatureTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureTaskAccess().getFeatureKeyword_0()); }
	'Feature'
	{ after(grammarAccess.getFeatureTaskAccess().getFeatureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureTaskAccess().getFeatAssignment_1()); }
	(rule__FeatureTask__FeatAssignment_1)
	{ after(grammarAccess.getFeatureTaskAccess().getFeatAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BugTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BugTask__Group__0__Impl
	rule__BugTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BugTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBugTaskAccess().getBugKeyword_0()); }
	'Bug'
	{ after(grammarAccess.getBugTaskAccess().getBugKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BugTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BugTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BugTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBugTaskAccess().getBugAssignment_1()); }
	(rule__BugTask__BugAssignment_1)
	{ after(grammarAccess.getBugTaskAccess().getBugAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AnalyseTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnalyseTask__Group__0__Impl
	rule__AnalyseTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AnalyseTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnalyseTaskAccess().getAnalyseKeyword_0()); }
	'Analyse'
	{ after(grammarAccess.getAnalyseTaskAccess().getAnalyseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnalyseTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AnalyseTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AnalyseTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnalyseTaskAccess().getAnalyseAssignment_1()); }
	(rule__AnalyseTask__AnalyseAssignment_1)
	{ after(grammarAccess.getAnalyseTaskAccess().getAnalyseAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TestTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TestTask__Group__0__Impl
	rule__TestTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TestTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestTaskAccess().getTestKeyword_0()); }
	'Test'
	{ after(grammarAccess.getTestTaskAccess().getTestKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TestTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TestTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TestTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestTaskAccess().getTestAssignment_1()); }
	(rule__TestTask__TestAssignment_1)
	{ after(grammarAccess.getTestTaskAccess().getTestAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DocumentTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DocumentTask__Group__0__Impl
	rule__DocumentTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DocumentTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDocumentTaskAccess().getDocumentKeyword_0()); }
	'Document'
	{ after(grammarAccess.getDocumentTaskAccess().getDocumentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DocumentTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DocumentTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DocumentTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDocumentTaskAccess().getDocAssignment_1()); }
	(rule__DocumentTask__DocAssignment_1)
	{ after(grammarAccess.getDocumentTaskAccess().getDocAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeployTask__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeployTask__Group__0__Impl
	rule__DeployTask__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeployTask__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeployTaskAccess().getDeployKeyword_0()); }
	'Deploy'
	{ after(grammarAccess.getDeployTaskAccess().getDeployKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeployTask__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeployTask__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeployTask__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeployTaskAccess().getDeployAssignment_1()); }
	(rule__DeployTask__DeployAssignment_1)
	{ after(grammarAccess.getDeployTaskAccess().getDeployAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TaskPlanning__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskPlanningAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTaskPlanningAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__OwnersAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskPlanningAccess().getOwnersOwnerParserRuleCall_3_0()); }
		ruleOwner
		{ after(grammarAccess.getTaskPlanningAccess().getOwnersOwnerParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__ProjsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskPlanningAccess().getProjsProjectParserRuleCall_5_0()); }
		ruleProject
		{ after(grammarAccess.getTaskPlanningAccess().getProjsProjectParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TaskPlanning__TasksAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTaskPlanningAccess().getTasksTasksParserRuleCall_6_0()); }
		ruleTasks
		{ after(grammarAccess.getTaskPlanningAccess().getTasksTasksParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Owner__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOwnerAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getOwnerAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__TaskTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getTaskTypeTaskTypeParserRuleCall_1_0()); }
		ruleTaskType
		{ after(grammarAccess.getTasksAccess().getTaskTypeTaskTypeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__OwnerAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getOwnerOwnerCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTasksAccess().getOwnerOwnerIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTasksAccess().getOwnerOwnerIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTasksAccess().getOwnerOwnerCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__PriorityAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getPriorityINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getTasksAccess().getPriorityINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__PointsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getPointsPointsParserRuleCall_7_0()); }
		rulePoints
		{ after(grammarAccess.getTasksAccess().getPointsPointsParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__StatusAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getStatusStatusEnumRuleCall_9_0()); }
		ruleStatus
		{ after(grammarAccess.getTasksAccess().getStatusStatusEnumRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tasks__ProjAssignment_11
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTasksAccess().getProjProjectCrossReference_11_0()); }
		(
			{ before(grammarAccess.getTasksAccess().getProjProjectIDTerminalRuleCall_11_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTasksAccess().getProjProjectIDTerminalRuleCall_11_0_1()); }
		)
		{ after(grammarAccess.getTasksAccess().getProjProjectCrossReference_11_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Points__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPointsAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getPointsAccess().getValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureTask__FeatAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureTaskAccess().getFeatSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getFeatureTaskAccess().getFeatSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BugTask__BugAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBugTaskAccess().getBugSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getBugTaskAccess().getBugSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AnalyseTask__AnalyseAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnalyseTaskAccess().getAnalyseSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAnalyseTaskAccess().getAnalyseSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TestTask__TestAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTestTaskAccess().getTestSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTestTaskAccess().getTestSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DocumentTask__DocAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDocumentTaskAccess().getDocSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDocumentTaskAccess().getDocSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeployTask__DeployAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeployTaskAccess().getDeploySTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDeployTaskAccess().getDeploySTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
