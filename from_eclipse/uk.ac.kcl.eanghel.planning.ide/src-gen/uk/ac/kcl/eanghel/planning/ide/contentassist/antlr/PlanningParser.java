/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.eanghel.planning.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.eanghel.planning.ide.contentassist.antlr.internal.InternalPlanningParser;
import uk.ac.kcl.eanghel.planning.services.PlanningGrammarAccess;

public class PlanningParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PlanningGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PlanningGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTaskTypeAccess().getAlternatives(), "rule__TaskType__Alternatives");
			builder.put(grammarAccess.getStatusAccess().getAlternatives(), "rule__Status__Alternatives");
			builder.put(grammarAccess.getTaskPlanningAccess().getGroup(), "rule__TaskPlanning__Group__0");
			builder.put(grammarAccess.getTasksAccess().getGroup(), "rule__Tasks__Group__0");
			builder.put(grammarAccess.getFeatureTaskAccess().getGroup(), "rule__FeatureTask__Group__0");
			builder.put(grammarAccess.getBugTaskAccess().getGroup(), "rule__BugTask__Group__0");
			builder.put(grammarAccess.getAnalyseTaskAccess().getGroup(), "rule__AnalyseTask__Group__0");
			builder.put(grammarAccess.getTestTaskAccess().getGroup(), "rule__TestTask__Group__0");
			builder.put(grammarAccess.getDocumentTaskAccess().getGroup(), "rule__DocumentTask__Group__0");
			builder.put(grammarAccess.getDeployTaskAccess().getGroup(), "rule__DeployTask__Group__0");
			builder.put(grammarAccess.getTaskPlanningAccess().getNameAssignment_1(), "rule__TaskPlanning__NameAssignment_1");
			builder.put(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3(), "rule__TaskPlanning__OwnersAssignment_3");
			builder.put(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5(), "rule__TaskPlanning__ProjsAssignment_5");
			builder.put(grammarAccess.getTaskPlanningAccess().getTasksAssignment_6(), "rule__TaskPlanning__TasksAssignment_6");
			builder.put(grammarAccess.getOwnerAccess().getNameAssignment(), "rule__Owner__NameAssignment");
			builder.put(grammarAccess.getProjectAccess().getNameAssignment(), "rule__Project__NameAssignment");
			builder.put(grammarAccess.getTasksAccess().getTaskTypeAssignment_1(), "rule__Tasks__TaskTypeAssignment_1");
			builder.put(grammarAccess.getTasksAccess().getOwnerAssignment_3(), "rule__Tasks__OwnerAssignment_3");
			builder.put(grammarAccess.getTasksAccess().getPriorityAssignment_5(), "rule__Tasks__PriorityAssignment_5");
			builder.put(grammarAccess.getTasksAccess().getPointsAssignment_7(), "rule__Tasks__PointsAssignment_7");
			builder.put(grammarAccess.getTasksAccess().getStatusAssignment_9(), "rule__Tasks__StatusAssignment_9");
			builder.put(grammarAccess.getTasksAccess().getProjAssignment_11(), "rule__Tasks__ProjAssignment_11");
			builder.put(grammarAccess.getPointsAccess().getValueAssignment(), "rule__Points__ValueAssignment");
			builder.put(grammarAccess.getFeatureTaskAccess().getFeatAssignment_1(), "rule__FeatureTask__FeatAssignment_1");
			builder.put(grammarAccess.getBugTaskAccess().getBugAssignment_1(), "rule__BugTask__BugAssignment_1");
			builder.put(grammarAccess.getAnalyseTaskAccess().getAnalyseAssignment_1(), "rule__AnalyseTask__AnalyseAssignment_1");
			builder.put(grammarAccess.getTestTaskAccess().getTestAssignment_1(), "rule__TestTask__TestAssignment_1");
			builder.put(grammarAccess.getDocumentTaskAccess().getDocAssignment_1(), "rule__DocumentTask__DocAssignment_1");
			builder.put(grammarAccess.getDeployTaskAccess().getDeployAssignment_1(), "rule__DeployTask__DeployAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PlanningGrammarAccess grammarAccess;

	@Override
	protected InternalPlanningParser createParser() {
		InternalPlanningParser result = new InternalPlanningParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PlanningGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlanningGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
