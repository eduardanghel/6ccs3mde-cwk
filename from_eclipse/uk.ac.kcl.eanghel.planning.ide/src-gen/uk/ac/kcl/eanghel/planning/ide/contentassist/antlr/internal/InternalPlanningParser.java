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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanningParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Stuck'", "'In Progress'", "'Done'", "'Waiting for review'", "'Team'", "'Owners'", "'Projects'", "'Task'", "'owner'", "'priority'", "'points'", "'status'", "'project'", "'Feature'", "'Bug'", "'Analyse'", "'Test'", "'Document'", "'Deploy'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlanningParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanningParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlanningParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlanning.g"; }


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



    // $ANTLR start "entryRuleTaskPlanning"
    // InternalPlanning.g:53:1: entryRuleTaskPlanning : ruleTaskPlanning EOF ;
    public final void entryRuleTaskPlanning() throws RecognitionException {
        try {
            // InternalPlanning.g:54:1: ( ruleTaskPlanning EOF )
            // InternalPlanning.g:55:1: ruleTaskPlanning EOF
            {
             before(grammarAccess.getTaskPlanningRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskPlanning();

            state._fsp--;

             after(grammarAccess.getTaskPlanningRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskPlanning"


    // $ANTLR start "ruleTaskPlanning"
    // InternalPlanning.g:62:1: ruleTaskPlanning : ( ( rule__TaskPlanning__Group__0 ) ) ;
    public final void ruleTaskPlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:66:2: ( ( ( rule__TaskPlanning__Group__0 ) ) )
            // InternalPlanning.g:67:2: ( ( rule__TaskPlanning__Group__0 ) )
            {
            // InternalPlanning.g:67:2: ( ( rule__TaskPlanning__Group__0 ) )
            // InternalPlanning.g:68:3: ( rule__TaskPlanning__Group__0 )
            {
             before(grammarAccess.getTaskPlanningAccess().getGroup()); 
            // InternalPlanning.g:69:3: ( rule__TaskPlanning__Group__0 )
            // InternalPlanning.g:69:4: rule__TaskPlanning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskPlanningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskPlanning"


    // $ANTLR start "entryRuleOwner"
    // InternalPlanning.g:78:1: entryRuleOwner : ruleOwner EOF ;
    public final void entryRuleOwner() throws RecognitionException {
        try {
            // InternalPlanning.g:79:1: ( ruleOwner EOF )
            // InternalPlanning.g:80:1: ruleOwner EOF
            {
             before(grammarAccess.getOwnerRule()); 
            pushFollow(FOLLOW_1);
            ruleOwner();

            state._fsp--;

             after(grammarAccess.getOwnerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwner"


    // $ANTLR start "ruleOwner"
    // InternalPlanning.g:87:1: ruleOwner : ( ( rule__Owner__NameAssignment ) ) ;
    public final void ruleOwner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:91:2: ( ( ( rule__Owner__NameAssignment ) ) )
            // InternalPlanning.g:92:2: ( ( rule__Owner__NameAssignment ) )
            {
            // InternalPlanning.g:92:2: ( ( rule__Owner__NameAssignment ) )
            // InternalPlanning.g:93:3: ( rule__Owner__NameAssignment )
            {
             before(grammarAccess.getOwnerAccess().getNameAssignment()); 
            // InternalPlanning.g:94:3: ( rule__Owner__NameAssignment )
            // InternalPlanning.g:94:4: rule__Owner__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Owner__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOwnerAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwner"


    // $ANTLR start "entryRuleProject"
    // InternalPlanning.g:103:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalPlanning.g:104:1: ( ruleProject EOF )
            // InternalPlanning.g:105:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalPlanning.g:112:1: ruleProject : ( ( rule__Project__NameAssignment ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:116:2: ( ( ( rule__Project__NameAssignment ) ) )
            // InternalPlanning.g:117:2: ( ( rule__Project__NameAssignment ) )
            {
            // InternalPlanning.g:117:2: ( ( rule__Project__NameAssignment ) )
            // InternalPlanning.g:118:3: ( rule__Project__NameAssignment )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment()); 
            // InternalPlanning.g:119:3: ( rule__Project__NameAssignment )
            // InternalPlanning.g:119:4: rule__Project__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTasks"
    // InternalPlanning.g:128:1: entryRuleTasks : ruleTasks EOF ;
    public final void entryRuleTasks() throws RecognitionException {
        try {
            // InternalPlanning.g:129:1: ( ruleTasks EOF )
            // InternalPlanning.g:130:1: ruleTasks EOF
            {
             before(grammarAccess.getTasksRule()); 
            pushFollow(FOLLOW_1);
            ruleTasks();

            state._fsp--;

             after(grammarAccess.getTasksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTasks"


    // $ANTLR start "ruleTasks"
    // InternalPlanning.g:137:1: ruleTasks : ( ( rule__Tasks__Group__0 ) ) ;
    public final void ruleTasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:141:2: ( ( ( rule__Tasks__Group__0 ) ) )
            // InternalPlanning.g:142:2: ( ( rule__Tasks__Group__0 ) )
            {
            // InternalPlanning.g:142:2: ( ( rule__Tasks__Group__0 ) )
            // InternalPlanning.g:143:3: ( rule__Tasks__Group__0 )
            {
             before(grammarAccess.getTasksAccess().getGroup()); 
            // InternalPlanning.g:144:3: ( rule__Tasks__Group__0 )
            // InternalPlanning.g:144:4: rule__Tasks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTasks"


    // $ANTLR start "entryRulePoints"
    // InternalPlanning.g:153:1: entryRulePoints : rulePoints EOF ;
    public final void entryRulePoints() throws RecognitionException {
        try {
            // InternalPlanning.g:154:1: ( rulePoints EOF )
            // InternalPlanning.g:155:1: rulePoints EOF
            {
             before(grammarAccess.getPointsRule()); 
            pushFollow(FOLLOW_1);
            rulePoints();

            state._fsp--;

             after(grammarAccess.getPointsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoints"


    // $ANTLR start "rulePoints"
    // InternalPlanning.g:162:1: rulePoints : ( ( rule__Points__ValueAssignment ) ) ;
    public final void rulePoints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:166:2: ( ( ( rule__Points__ValueAssignment ) ) )
            // InternalPlanning.g:167:2: ( ( rule__Points__ValueAssignment ) )
            {
            // InternalPlanning.g:167:2: ( ( rule__Points__ValueAssignment ) )
            // InternalPlanning.g:168:3: ( rule__Points__ValueAssignment )
            {
             before(grammarAccess.getPointsAccess().getValueAssignment()); 
            // InternalPlanning.g:169:3: ( rule__Points__ValueAssignment )
            // InternalPlanning.g:169:4: rule__Points__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Points__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPointsAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoints"


    // $ANTLR start "entryRuleTaskType"
    // InternalPlanning.g:178:1: entryRuleTaskType : ruleTaskType EOF ;
    public final void entryRuleTaskType() throws RecognitionException {
        try {
            // InternalPlanning.g:179:1: ( ruleTaskType EOF )
            // InternalPlanning.g:180:1: ruleTaskType EOF
            {
             before(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskType();

            state._fsp--;

             after(grammarAccess.getTaskTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskType"


    // $ANTLR start "ruleTaskType"
    // InternalPlanning.g:187:1: ruleTaskType : ( ( rule__TaskType__Alternatives ) ) ;
    public final void ruleTaskType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:191:2: ( ( ( rule__TaskType__Alternatives ) ) )
            // InternalPlanning.g:192:2: ( ( rule__TaskType__Alternatives ) )
            {
            // InternalPlanning.g:192:2: ( ( rule__TaskType__Alternatives ) )
            // InternalPlanning.g:193:3: ( rule__TaskType__Alternatives )
            {
             before(grammarAccess.getTaskTypeAccess().getAlternatives()); 
            // InternalPlanning.g:194:3: ( rule__TaskType__Alternatives )
            // InternalPlanning.g:194:4: rule__TaskType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskType"


    // $ANTLR start "entryRuleFeatureTask"
    // InternalPlanning.g:203:1: entryRuleFeatureTask : ruleFeatureTask EOF ;
    public final void entryRuleFeatureTask() throws RecognitionException {
        try {
            // InternalPlanning.g:204:1: ( ruleFeatureTask EOF )
            // InternalPlanning.g:205:1: ruleFeatureTask EOF
            {
             before(grammarAccess.getFeatureTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureTask();

            state._fsp--;

             after(grammarAccess.getFeatureTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureTask"


    // $ANTLR start "ruleFeatureTask"
    // InternalPlanning.g:212:1: ruleFeatureTask : ( ( rule__FeatureTask__Group__0 ) ) ;
    public final void ruleFeatureTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:216:2: ( ( ( rule__FeatureTask__Group__0 ) ) )
            // InternalPlanning.g:217:2: ( ( rule__FeatureTask__Group__0 ) )
            {
            // InternalPlanning.g:217:2: ( ( rule__FeatureTask__Group__0 ) )
            // InternalPlanning.g:218:3: ( rule__FeatureTask__Group__0 )
            {
             before(grammarAccess.getFeatureTaskAccess().getGroup()); 
            // InternalPlanning.g:219:3: ( rule__FeatureTask__Group__0 )
            // InternalPlanning.g:219:4: rule__FeatureTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureTask"


    // $ANTLR start "entryRuleBugTask"
    // InternalPlanning.g:228:1: entryRuleBugTask : ruleBugTask EOF ;
    public final void entryRuleBugTask() throws RecognitionException {
        try {
            // InternalPlanning.g:229:1: ( ruleBugTask EOF )
            // InternalPlanning.g:230:1: ruleBugTask EOF
            {
             before(grammarAccess.getBugTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleBugTask();

            state._fsp--;

             after(grammarAccess.getBugTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBugTask"


    // $ANTLR start "ruleBugTask"
    // InternalPlanning.g:237:1: ruleBugTask : ( ( rule__BugTask__Group__0 ) ) ;
    public final void ruleBugTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:241:2: ( ( ( rule__BugTask__Group__0 ) ) )
            // InternalPlanning.g:242:2: ( ( rule__BugTask__Group__0 ) )
            {
            // InternalPlanning.g:242:2: ( ( rule__BugTask__Group__0 ) )
            // InternalPlanning.g:243:3: ( rule__BugTask__Group__0 )
            {
             before(grammarAccess.getBugTaskAccess().getGroup()); 
            // InternalPlanning.g:244:3: ( rule__BugTask__Group__0 )
            // InternalPlanning.g:244:4: rule__BugTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BugTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBugTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBugTask"


    // $ANTLR start "entryRuleAnalyseTask"
    // InternalPlanning.g:253:1: entryRuleAnalyseTask : ruleAnalyseTask EOF ;
    public final void entryRuleAnalyseTask() throws RecognitionException {
        try {
            // InternalPlanning.g:254:1: ( ruleAnalyseTask EOF )
            // InternalPlanning.g:255:1: ruleAnalyseTask EOF
            {
             before(grammarAccess.getAnalyseTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAnalyseTask();

            state._fsp--;

             after(grammarAccess.getAnalyseTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnalyseTask"


    // $ANTLR start "ruleAnalyseTask"
    // InternalPlanning.g:262:1: ruleAnalyseTask : ( ( rule__AnalyseTask__Group__0 ) ) ;
    public final void ruleAnalyseTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:266:2: ( ( ( rule__AnalyseTask__Group__0 ) ) )
            // InternalPlanning.g:267:2: ( ( rule__AnalyseTask__Group__0 ) )
            {
            // InternalPlanning.g:267:2: ( ( rule__AnalyseTask__Group__0 ) )
            // InternalPlanning.g:268:3: ( rule__AnalyseTask__Group__0 )
            {
             before(grammarAccess.getAnalyseTaskAccess().getGroup()); 
            // InternalPlanning.g:269:3: ( rule__AnalyseTask__Group__0 )
            // InternalPlanning.g:269:4: rule__AnalyseTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnalyseTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnalyseTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnalyseTask"


    // $ANTLR start "entryRuleTestTask"
    // InternalPlanning.g:278:1: entryRuleTestTask : ruleTestTask EOF ;
    public final void entryRuleTestTask() throws RecognitionException {
        try {
            // InternalPlanning.g:279:1: ( ruleTestTask EOF )
            // InternalPlanning.g:280:1: ruleTestTask EOF
            {
             before(grammarAccess.getTestTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTestTask();

            state._fsp--;

             after(grammarAccess.getTestTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestTask"


    // $ANTLR start "ruleTestTask"
    // InternalPlanning.g:287:1: ruleTestTask : ( ( rule__TestTask__Group__0 ) ) ;
    public final void ruleTestTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:291:2: ( ( ( rule__TestTask__Group__0 ) ) )
            // InternalPlanning.g:292:2: ( ( rule__TestTask__Group__0 ) )
            {
            // InternalPlanning.g:292:2: ( ( rule__TestTask__Group__0 ) )
            // InternalPlanning.g:293:3: ( rule__TestTask__Group__0 )
            {
             before(grammarAccess.getTestTaskAccess().getGroup()); 
            // InternalPlanning.g:294:3: ( rule__TestTask__Group__0 )
            // InternalPlanning.g:294:4: rule__TestTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestTask"


    // $ANTLR start "entryRuleDocumentTask"
    // InternalPlanning.g:303:1: entryRuleDocumentTask : ruleDocumentTask EOF ;
    public final void entryRuleDocumentTask() throws RecognitionException {
        try {
            // InternalPlanning.g:304:1: ( ruleDocumentTask EOF )
            // InternalPlanning.g:305:1: ruleDocumentTask EOF
            {
             before(grammarAccess.getDocumentTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentTask();

            state._fsp--;

             after(grammarAccess.getDocumentTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentTask"


    // $ANTLR start "ruleDocumentTask"
    // InternalPlanning.g:312:1: ruleDocumentTask : ( ( rule__DocumentTask__Group__0 ) ) ;
    public final void ruleDocumentTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:316:2: ( ( ( rule__DocumentTask__Group__0 ) ) )
            // InternalPlanning.g:317:2: ( ( rule__DocumentTask__Group__0 ) )
            {
            // InternalPlanning.g:317:2: ( ( rule__DocumentTask__Group__0 ) )
            // InternalPlanning.g:318:3: ( rule__DocumentTask__Group__0 )
            {
             before(grammarAccess.getDocumentTaskAccess().getGroup()); 
            // InternalPlanning.g:319:3: ( rule__DocumentTask__Group__0 )
            // InternalPlanning.g:319:4: rule__DocumentTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocumentTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentTask"


    // $ANTLR start "entryRuleDeployTask"
    // InternalPlanning.g:328:1: entryRuleDeployTask : ruleDeployTask EOF ;
    public final void entryRuleDeployTask() throws RecognitionException {
        try {
            // InternalPlanning.g:329:1: ( ruleDeployTask EOF )
            // InternalPlanning.g:330:1: ruleDeployTask EOF
            {
             before(grammarAccess.getDeployTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleDeployTask();

            state._fsp--;

             after(grammarAccess.getDeployTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeployTask"


    // $ANTLR start "ruleDeployTask"
    // InternalPlanning.g:337:1: ruleDeployTask : ( ( rule__DeployTask__Group__0 ) ) ;
    public final void ruleDeployTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:341:2: ( ( ( rule__DeployTask__Group__0 ) ) )
            // InternalPlanning.g:342:2: ( ( rule__DeployTask__Group__0 ) )
            {
            // InternalPlanning.g:342:2: ( ( rule__DeployTask__Group__0 ) )
            // InternalPlanning.g:343:3: ( rule__DeployTask__Group__0 )
            {
             before(grammarAccess.getDeployTaskAccess().getGroup()); 
            // InternalPlanning.g:344:3: ( rule__DeployTask__Group__0 )
            // InternalPlanning.g:344:4: rule__DeployTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeployTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeployTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeployTask"


    // $ANTLR start "ruleStatus"
    // InternalPlanning.g:353:1: ruleStatus : ( ( rule__Status__Alternatives ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:357:1: ( ( ( rule__Status__Alternatives ) ) )
            // InternalPlanning.g:358:2: ( ( rule__Status__Alternatives ) )
            {
            // InternalPlanning.g:358:2: ( ( rule__Status__Alternatives ) )
            // InternalPlanning.g:359:3: ( rule__Status__Alternatives )
            {
             before(grammarAccess.getStatusAccess().getAlternatives()); 
            // InternalPlanning.g:360:3: ( rule__Status__Alternatives )
            // InternalPlanning.g:360:4: rule__Status__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Status__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "rule__TaskType__Alternatives"
    // InternalPlanning.g:368:1: rule__TaskType__Alternatives : ( ( ruleFeatureTask ) | ( ruleBugTask ) | ( ruleAnalyseTask ) | ( ruleTestTask ) | ( ruleDocumentTask ) | ( ruleDeployTask ) );
    public final void rule__TaskType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:372:1: ( ( ruleFeatureTask ) | ( ruleBugTask ) | ( ruleAnalyseTask ) | ( ruleTestTask ) | ( ruleDocumentTask ) | ( ruleDeployTask ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPlanning.g:373:2: ( ruleFeatureTask )
                    {
                    // InternalPlanning.g:373:2: ( ruleFeatureTask )
                    // InternalPlanning.g:374:3: ruleFeatureTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getFeatureTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeatureTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getFeatureTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlanning.g:379:2: ( ruleBugTask )
                    {
                    // InternalPlanning.g:379:2: ( ruleBugTask )
                    // InternalPlanning.g:380:3: ruleBugTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getBugTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBugTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getBugTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPlanning.g:385:2: ( ruleAnalyseTask )
                    {
                    // InternalPlanning.g:385:2: ( ruleAnalyseTask )
                    // InternalPlanning.g:386:3: ruleAnalyseTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getAnalyseTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAnalyseTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getAnalyseTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPlanning.g:391:2: ( ruleTestTask )
                    {
                    // InternalPlanning.g:391:2: ( ruleTestTask )
                    // InternalPlanning.g:392:3: ruleTestTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getTestTaskParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTestTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getTestTaskParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPlanning.g:397:2: ( ruleDocumentTask )
                    {
                    // InternalPlanning.g:397:2: ( ruleDocumentTask )
                    // InternalPlanning.g:398:3: ruleDocumentTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getDocumentTaskParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDocumentTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getDocumentTaskParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPlanning.g:403:2: ( ruleDeployTask )
                    {
                    // InternalPlanning.g:403:2: ( ruleDeployTask )
                    // InternalPlanning.g:404:3: ruleDeployTask
                    {
                     before(grammarAccess.getTaskTypeAccess().getDeployTaskParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeployTask();

                    state._fsp--;

                     after(grammarAccess.getTaskTypeAccess().getDeployTaskParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskType__Alternatives"


    // $ANTLR start "rule__Status__Alternatives"
    // InternalPlanning.g:413:1: rule__Status__Alternatives : ( ( ( 'Stuck' ) ) | ( ( 'In Progress' ) ) | ( ( 'Done' ) ) | ( ( 'Waiting for review' ) ) );
    public final void rule__Status__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:417:1: ( ( ( 'Stuck' ) ) | ( ( 'In Progress' ) ) | ( ( 'Done' ) ) | ( ( 'Waiting for review' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPlanning.g:418:2: ( ( 'Stuck' ) )
                    {
                    // InternalPlanning.g:418:2: ( ( 'Stuck' ) )
                    // InternalPlanning.g:419:3: ( 'Stuck' )
                    {
                     before(grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0()); 
                    // InternalPlanning.g:420:3: ( 'Stuck' )
                    // InternalPlanning.g:420:4: 'Stuck'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlanning.g:424:2: ( ( 'In Progress' ) )
                    {
                    // InternalPlanning.g:424:2: ( ( 'In Progress' ) )
                    // InternalPlanning.g:425:3: ( 'In Progress' )
                    {
                     before(grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1()); 
                    // InternalPlanning.g:426:3: ( 'In Progress' )
                    // InternalPlanning.g:426:4: 'In Progress'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPlanning.g:430:2: ( ( 'Done' ) )
                    {
                    // InternalPlanning.g:430:2: ( ( 'Done' ) )
                    // InternalPlanning.g:431:3: ( 'Done' )
                    {
                     before(grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2()); 
                    // InternalPlanning.g:432:3: ( 'Done' )
                    // InternalPlanning.g:432:4: 'Done'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPlanning.g:436:2: ( ( 'Waiting for review' ) )
                    {
                    // InternalPlanning.g:436:2: ( ( 'Waiting for review' ) )
                    // InternalPlanning.g:437:3: ( 'Waiting for review' )
                    {
                     before(grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3()); 
                    // InternalPlanning.g:438:3: ( 'Waiting for review' )
                    // InternalPlanning.g:438:4: 'Waiting for review'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Status__Alternatives"


    // $ANTLR start "rule__TaskPlanning__Group__0"
    // InternalPlanning.g:446:1: rule__TaskPlanning__Group__0 : rule__TaskPlanning__Group__0__Impl rule__TaskPlanning__Group__1 ;
    public final void rule__TaskPlanning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:450:1: ( rule__TaskPlanning__Group__0__Impl rule__TaskPlanning__Group__1 )
            // InternalPlanning.g:451:2: rule__TaskPlanning__Group__0__Impl rule__TaskPlanning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TaskPlanning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__0"


    // $ANTLR start "rule__TaskPlanning__Group__0__Impl"
    // InternalPlanning.g:458:1: rule__TaskPlanning__Group__0__Impl : ( 'Team' ) ;
    public final void rule__TaskPlanning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:462:1: ( ( 'Team' ) )
            // InternalPlanning.g:463:1: ( 'Team' )
            {
            // InternalPlanning.g:463:1: ( 'Team' )
            // InternalPlanning.g:464:2: 'Team'
            {
             before(grammarAccess.getTaskPlanningAccess().getTeamKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskPlanningAccess().getTeamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__0__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__1"
    // InternalPlanning.g:473:1: rule__TaskPlanning__Group__1 : rule__TaskPlanning__Group__1__Impl rule__TaskPlanning__Group__2 ;
    public final void rule__TaskPlanning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:477:1: ( rule__TaskPlanning__Group__1__Impl rule__TaskPlanning__Group__2 )
            // InternalPlanning.g:478:2: rule__TaskPlanning__Group__1__Impl rule__TaskPlanning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TaskPlanning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__1"


    // $ANTLR start "rule__TaskPlanning__Group__1__Impl"
    // InternalPlanning.g:485:1: rule__TaskPlanning__Group__1__Impl : ( ( rule__TaskPlanning__NameAssignment_1 ) ) ;
    public final void rule__TaskPlanning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:489:1: ( ( ( rule__TaskPlanning__NameAssignment_1 ) ) )
            // InternalPlanning.g:490:1: ( ( rule__TaskPlanning__NameAssignment_1 ) )
            {
            // InternalPlanning.g:490:1: ( ( rule__TaskPlanning__NameAssignment_1 ) )
            // InternalPlanning.g:491:2: ( rule__TaskPlanning__NameAssignment_1 )
            {
             before(grammarAccess.getTaskPlanningAccess().getNameAssignment_1()); 
            // InternalPlanning.g:492:2: ( rule__TaskPlanning__NameAssignment_1 )
            // InternalPlanning.g:492:3: rule__TaskPlanning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskPlanning__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskPlanningAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__1__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__2"
    // InternalPlanning.g:500:1: rule__TaskPlanning__Group__2 : rule__TaskPlanning__Group__2__Impl rule__TaskPlanning__Group__3 ;
    public final void rule__TaskPlanning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:504:1: ( rule__TaskPlanning__Group__2__Impl rule__TaskPlanning__Group__3 )
            // InternalPlanning.g:505:2: rule__TaskPlanning__Group__2__Impl rule__TaskPlanning__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TaskPlanning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__2"


    // $ANTLR start "rule__TaskPlanning__Group__2__Impl"
    // InternalPlanning.g:512:1: rule__TaskPlanning__Group__2__Impl : ( 'Owners' ) ;
    public final void rule__TaskPlanning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:516:1: ( ( 'Owners' ) )
            // InternalPlanning.g:517:1: ( 'Owners' )
            {
            // InternalPlanning.g:517:1: ( 'Owners' )
            // InternalPlanning.g:518:2: 'Owners'
            {
             before(grammarAccess.getTaskPlanningAccess().getOwnersKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskPlanningAccess().getOwnersKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__2__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__3"
    // InternalPlanning.g:527:1: rule__TaskPlanning__Group__3 : rule__TaskPlanning__Group__3__Impl rule__TaskPlanning__Group__4 ;
    public final void rule__TaskPlanning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:531:1: ( rule__TaskPlanning__Group__3__Impl rule__TaskPlanning__Group__4 )
            // InternalPlanning.g:532:2: rule__TaskPlanning__Group__3__Impl rule__TaskPlanning__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TaskPlanning__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__3"


    // $ANTLR start "rule__TaskPlanning__Group__3__Impl"
    // InternalPlanning.g:539:1: rule__TaskPlanning__Group__3__Impl : ( ( ( rule__TaskPlanning__OwnersAssignment_3 ) ) ( ( rule__TaskPlanning__OwnersAssignment_3 )* ) ) ;
    public final void rule__TaskPlanning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:543:1: ( ( ( ( rule__TaskPlanning__OwnersAssignment_3 ) ) ( ( rule__TaskPlanning__OwnersAssignment_3 )* ) ) )
            // InternalPlanning.g:544:1: ( ( ( rule__TaskPlanning__OwnersAssignment_3 ) ) ( ( rule__TaskPlanning__OwnersAssignment_3 )* ) )
            {
            // InternalPlanning.g:544:1: ( ( ( rule__TaskPlanning__OwnersAssignment_3 ) ) ( ( rule__TaskPlanning__OwnersAssignment_3 )* ) )
            // InternalPlanning.g:545:2: ( ( rule__TaskPlanning__OwnersAssignment_3 ) ) ( ( rule__TaskPlanning__OwnersAssignment_3 )* )
            {
            // InternalPlanning.g:545:2: ( ( rule__TaskPlanning__OwnersAssignment_3 ) )
            // InternalPlanning.g:546:3: ( rule__TaskPlanning__OwnersAssignment_3 )
            {
             before(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); 
            // InternalPlanning.g:547:3: ( rule__TaskPlanning__OwnersAssignment_3 )
            // InternalPlanning.g:547:4: rule__TaskPlanning__OwnersAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__TaskPlanning__OwnersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); 

            }

            // InternalPlanning.g:550:2: ( ( rule__TaskPlanning__OwnersAssignment_3 )* )
            // InternalPlanning.g:551:3: ( rule__TaskPlanning__OwnersAssignment_3 )*
            {
             before(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); 
            // InternalPlanning.g:552:3: ( rule__TaskPlanning__OwnersAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlanning.g:552:4: rule__TaskPlanning__OwnersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TaskPlanning__OwnersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTaskPlanningAccess().getOwnersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__3__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__4"
    // InternalPlanning.g:561:1: rule__TaskPlanning__Group__4 : rule__TaskPlanning__Group__4__Impl rule__TaskPlanning__Group__5 ;
    public final void rule__TaskPlanning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:565:1: ( rule__TaskPlanning__Group__4__Impl rule__TaskPlanning__Group__5 )
            // InternalPlanning.g:566:2: rule__TaskPlanning__Group__4__Impl rule__TaskPlanning__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__TaskPlanning__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__4"


    // $ANTLR start "rule__TaskPlanning__Group__4__Impl"
    // InternalPlanning.g:573:1: rule__TaskPlanning__Group__4__Impl : ( 'Projects' ) ;
    public final void rule__TaskPlanning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:577:1: ( ( 'Projects' ) )
            // InternalPlanning.g:578:1: ( 'Projects' )
            {
            // InternalPlanning.g:578:1: ( 'Projects' )
            // InternalPlanning.g:579:2: 'Projects'
            {
             before(grammarAccess.getTaskPlanningAccess().getProjectsKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskPlanningAccess().getProjectsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__4__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__5"
    // InternalPlanning.g:588:1: rule__TaskPlanning__Group__5 : rule__TaskPlanning__Group__5__Impl rule__TaskPlanning__Group__6 ;
    public final void rule__TaskPlanning__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:592:1: ( rule__TaskPlanning__Group__5__Impl rule__TaskPlanning__Group__6 )
            // InternalPlanning.g:593:2: rule__TaskPlanning__Group__5__Impl rule__TaskPlanning__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__TaskPlanning__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__5"


    // $ANTLR start "rule__TaskPlanning__Group__5__Impl"
    // InternalPlanning.g:600:1: rule__TaskPlanning__Group__5__Impl : ( ( ( rule__TaskPlanning__ProjsAssignment_5 ) ) ( ( rule__TaskPlanning__ProjsAssignment_5 )* ) ) ;
    public final void rule__TaskPlanning__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:604:1: ( ( ( ( rule__TaskPlanning__ProjsAssignment_5 ) ) ( ( rule__TaskPlanning__ProjsAssignment_5 )* ) ) )
            // InternalPlanning.g:605:1: ( ( ( rule__TaskPlanning__ProjsAssignment_5 ) ) ( ( rule__TaskPlanning__ProjsAssignment_5 )* ) )
            {
            // InternalPlanning.g:605:1: ( ( ( rule__TaskPlanning__ProjsAssignment_5 ) ) ( ( rule__TaskPlanning__ProjsAssignment_5 )* ) )
            // InternalPlanning.g:606:2: ( ( rule__TaskPlanning__ProjsAssignment_5 ) ) ( ( rule__TaskPlanning__ProjsAssignment_5 )* )
            {
            // InternalPlanning.g:606:2: ( ( rule__TaskPlanning__ProjsAssignment_5 ) )
            // InternalPlanning.g:607:3: ( rule__TaskPlanning__ProjsAssignment_5 )
            {
             before(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); 
            // InternalPlanning.g:608:3: ( rule__TaskPlanning__ProjsAssignment_5 )
            // InternalPlanning.g:608:4: rule__TaskPlanning__ProjsAssignment_5
            {
            pushFollow(FOLLOW_6);
            rule__TaskPlanning__ProjsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); 

            }

            // InternalPlanning.g:611:2: ( ( rule__TaskPlanning__ProjsAssignment_5 )* )
            // InternalPlanning.g:612:3: ( rule__TaskPlanning__ProjsAssignment_5 )*
            {
             before(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); 
            // InternalPlanning.g:613:3: ( rule__TaskPlanning__ProjsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlanning.g:613:4: rule__TaskPlanning__ProjsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TaskPlanning__ProjsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTaskPlanningAccess().getProjsAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__5__Impl"


    // $ANTLR start "rule__TaskPlanning__Group__6"
    // InternalPlanning.g:622:1: rule__TaskPlanning__Group__6 : rule__TaskPlanning__Group__6__Impl ;
    public final void rule__TaskPlanning__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:626:1: ( rule__TaskPlanning__Group__6__Impl )
            // InternalPlanning.g:627:2: rule__TaskPlanning__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskPlanning__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__6"


    // $ANTLR start "rule__TaskPlanning__Group__6__Impl"
    // InternalPlanning.g:633:1: rule__TaskPlanning__Group__6__Impl : ( ( rule__TaskPlanning__TasksAssignment_6 )* ) ;
    public final void rule__TaskPlanning__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:637:1: ( ( ( rule__TaskPlanning__TasksAssignment_6 )* ) )
            // InternalPlanning.g:638:1: ( ( rule__TaskPlanning__TasksAssignment_6 )* )
            {
            // InternalPlanning.g:638:1: ( ( rule__TaskPlanning__TasksAssignment_6 )* )
            // InternalPlanning.g:639:2: ( rule__TaskPlanning__TasksAssignment_6 )*
            {
             before(grammarAccess.getTaskPlanningAccess().getTasksAssignment_6()); 
            // InternalPlanning.g:640:2: ( rule__TaskPlanning__TasksAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlanning.g:640:3: rule__TaskPlanning__TasksAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TaskPlanning__TasksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTaskPlanningAccess().getTasksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__Group__6__Impl"


    // $ANTLR start "rule__Tasks__Group__0"
    // InternalPlanning.g:649:1: rule__Tasks__Group__0 : rule__Tasks__Group__0__Impl rule__Tasks__Group__1 ;
    public final void rule__Tasks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:653:1: ( rule__Tasks__Group__0__Impl rule__Tasks__Group__1 )
            // InternalPlanning.g:654:2: rule__Tasks__Group__0__Impl rule__Tasks__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Tasks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__0"


    // $ANTLR start "rule__Tasks__Group__0__Impl"
    // InternalPlanning.g:661:1: rule__Tasks__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Tasks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:665:1: ( ( 'Task' ) )
            // InternalPlanning.g:666:1: ( 'Task' )
            {
            // InternalPlanning.g:666:1: ( 'Task' )
            // InternalPlanning.g:667:2: 'Task'
            {
             before(grammarAccess.getTasksAccess().getTaskKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__0__Impl"


    // $ANTLR start "rule__Tasks__Group__1"
    // InternalPlanning.g:676:1: rule__Tasks__Group__1 : rule__Tasks__Group__1__Impl rule__Tasks__Group__2 ;
    public final void rule__Tasks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:680:1: ( rule__Tasks__Group__1__Impl rule__Tasks__Group__2 )
            // InternalPlanning.g:681:2: rule__Tasks__Group__1__Impl rule__Tasks__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Tasks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__1"


    // $ANTLR start "rule__Tasks__Group__1__Impl"
    // InternalPlanning.g:688:1: rule__Tasks__Group__1__Impl : ( ( rule__Tasks__TaskTypeAssignment_1 ) ) ;
    public final void rule__Tasks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:692:1: ( ( ( rule__Tasks__TaskTypeAssignment_1 ) ) )
            // InternalPlanning.g:693:1: ( ( rule__Tasks__TaskTypeAssignment_1 ) )
            {
            // InternalPlanning.g:693:1: ( ( rule__Tasks__TaskTypeAssignment_1 ) )
            // InternalPlanning.g:694:2: ( rule__Tasks__TaskTypeAssignment_1 )
            {
             before(grammarAccess.getTasksAccess().getTaskTypeAssignment_1()); 
            // InternalPlanning.g:695:2: ( rule__Tasks__TaskTypeAssignment_1 )
            // InternalPlanning.g:695:3: rule__Tasks__TaskTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__TaskTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getTaskTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__1__Impl"


    // $ANTLR start "rule__Tasks__Group__2"
    // InternalPlanning.g:703:1: rule__Tasks__Group__2 : rule__Tasks__Group__2__Impl rule__Tasks__Group__3 ;
    public final void rule__Tasks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:707:1: ( rule__Tasks__Group__2__Impl rule__Tasks__Group__3 )
            // InternalPlanning.g:708:2: rule__Tasks__Group__2__Impl rule__Tasks__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Tasks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__2"


    // $ANTLR start "rule__Tasks__Group__2__Impl"
    // InternalPlanning.g:715:1: rule__Tasks__Group__2__Impl : ( 'owner' ) ;
    public final void rule__Tasks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:719:1: ( ( 'owner' ) )
            // InternalPlanning.g:720:1: ( 'owner' )
            {
            // InternalPlanning.g:720:1: ( 'owner' )
            // InternalPlanning.g:721:2: 'owner'
            {
             before(grammarAccess.getTasksAccess().getOwnerKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getOwnerKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__2__Impl"


    // $ANTLR start "rule__Tasks__Group__3"
    // InternalPlanning.g:730:1: rule__Tasks__Group__3 : rule__Tasks__Group__3__Impl rule__Tasks__Group__4 ;
    public final void rule__Tasks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:734:1: ( rule__Tasks__Group__3__Impl rule__Tasks__Group__4 )
            // InternalPlanning.g:735:2: rule__Tasks__Group__3__Impl rule__Tasks__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Tasks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__3"


    // $ANTLR start "rule__Tasks__Group__3__Impl"
    // InternalPlanning.g:742:1: rule__Tasks__Group__3__Impl : ( ( ( rule__Tasks__OwnerAssignment_3 ) ) ( ( rule__Tasks__OwnerAssignment_3 )* ) ) ;
    public final void rule__Tasks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:746:1: ( ( ( ( rule__Tasks__OwnerAssignment_3 ) ) ( ( rule__Tasks__OwnerAssignment_3 )* ) ) )
            // InternalPlanning.g:747:1: ( ( ( rule__Tasks__OwnerAssignment_3 ) ) ( ( rule__Tasks__OwnerAssignment_3 )* ) )
            {
            // InternalPlanning.g:747:1: ( ( ( rule__Tasks__OwnerAssignment_3 ) ) ( ( rule__Tasks__OwnerAssignment_3 )* ) )
            // InternalPlanning.g:748:2: ( ( rule__Tasks__OwnerAssignment_3 ) ) ( ( rule__Tasks__OwnerAssignment_3 )* )
            {
            // InternalPlanning.g:748:2: ( ( rule__Tasks__OwnerAssignment_3 ) )
            // InternalPlanning.g:749:3: ( rule__Tasks__OwnerAssignment_3 )
            {
             before(grammarAccess.getTasksAccess().getOwnerAssignment_3()); 
            // InternalPlanning.g:750:3: ( rule__Tasks__OwnerAssignment_3 )
            // InternalPlanning.g:750:4: rule__Tasks__OwnerAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Tasks__OwnerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getOwnerAssignment_3()); 

            }

            // InternalPlanning.g:753:2: ( ( rule__Tasks__OwnerAssignment_3 )* )
            // InternalPlanning.g:754:3: ( rule__Tasks__OwnerAssignment_3 )*
            {
             before(grammarAccess.getTasksAccess().getOwnerAssignment_3()); 
            // InternalPlanning.g:755:3: ( rule__Tasks__OwnerAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPlanning.g:755:4: rule__Tasks__OwnerAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Tasks__OwnerAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTasksAccess().getOwnerAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__3__Impl"


    // $ANTLR start "rule__Tasks__Group__4"
    // InternalPlanning.g:764:1: rule__Tasks__Group__4 : rule__Tasks__Group__4__Impl rule__Tasks__Group__5 ;
    public final void rule__Tasks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:768:1: ( rule__Tasks__Group__4__Impl rule__Tasks__Group__5 )
            // InternalPlanning.g:769:2: rule__Tasks__Group__4__Impl rule__Tasks__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Tasks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__4"


    // $ANTLR start "rule__Tasks__Group__4__Impl"
    // InternalPlanning.g:776:1: rule__Tasks__Group__4__Impl : ( 'priority' ) ;
    public final void rule__Tasks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:780:1: ( ( 'priority' ) )
            // InternalPlanning.g:781:1: ( 'priority' )
            {
            // InternalPlanning.g:781:1: ( 'priority' )
            // InternalPlanning.g:782:2: 'priority'
            {
             before(grammarAccess.getTasksAccess().getPriorityKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getPriorityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__4__Impl"


    // $ANTLR start "rule__Tasks__Group__5"
    // InternalPlanning.g:791:1: rule__Tasks__Group__5 : rule__Tasks__Group__5__Impl rule__Tasks__Group__6 ;
    public final void rule__Tasks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:795:1: ( rule__Tasks__Group__5__Impl rule__Tasks__Group__6 )
            // InternalPlanning.g:796:2: rule__Tasks__Group__5__Impl rule__Tasks__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Tasks__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__5"


    // $ANTLR start "rule__Tasks__Group__5__Impl"
    // InternalPlanning.g:803:1: rule__Tasks__Group__5__Impl : ( ( rule__Tasks__PriorityAssignment_5 ) ) ;
    public final void rule__Tasks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:807:1: ( ( ( rule__Tasks__PriorityAssignment_5 ) ) )
            // InternalPlanning.g:808:1: ( ( rule__Tasks__PriorityAssignment_5 ) )
            {
            // InternalPlanning.g:808:1: ( ( rule__Tasks__PriorityAssignment_5 ) )
            // InternalPlanning.g:809:2: ( rule__Tasks__PriorityAssignment_5 )
            {
             before(grammarAccess.getTasksAccess().getPriorityAssignment_5()); 
            // InternalPlanning.g:810:2: ( rule__Tasks__PriorityAssignment_5 )
            // InternalPlanning.g:810:3: rule__Tasks__PriorityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__PriorityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getPriorityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__5__Impl"


    // $ANTLR start "rule__Tasks__Group__6"
    // InternalPlanning.g:818:1: rule__Tasks__Group__6 : rule__Tasks__Group__6__Impl rule__Tasks__Group__7 ;
    public final void rule__Tasks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:822:1: ( rule__Tasks__Group__6__Impl rule__Tasks__Group__7 )
            // InternalPlanning.g:823:2: rule__Tasks__Group__6__Impl rule__Tasks__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Tasks__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__6"


    // $ANTLR start "rule__Tasks__Group__6__Impl"
    // InternalPlanning.g:830:1: rule__Tasks__Group__6__Impl : ( 'points' ) ;
    public final void rule__Tasks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:834:1: ( ( 'points' ) )
            // InternalPlanning.g:835:1: ( 'points' )
            {
            // InternalPlanning.g:835:1: ( 'points' )
            // InternalPlanning.g:836:2: 'points'
            {
             before(grammarAccess.getTasksAccess().getPointsKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getPointsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__6__Impl"


    // $ANTLR start "rule__Tasks__Group__7"
    // InternalPlanning.g:845:1: rule__Tasks__Group__7 : rule__Tasks__Group__7__Impl rule__Tasks__Group__8 ;
    public final void rule__Tasks__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:849:1: ( rule__Tasks__Group__7__Impl rule__Tasks__Group__8 )
            // InternalPlanning.g:850:2: rule__Tasks__Group__7__Impl rule__Tasks__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Tasks__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__7"


    // $ANTLR start "rule__Tasks__Group__7__Impl"
    // InternalPlanning.g:857:1: rule__Tasks__Group__7__Impl : ( ( rule__Tasks__PointsAssignment_7 ) ) ;
    public final void rule__Tasks__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:861:1: ( ( ( rule__Tasks__PointsAssignment_7 ) ) )
            // InternalPlanning.g:862:1: ( ( rule__Tasks__PointsAssignment_7 ) )
            {
            // InternalPlanning.g:862:1: ( ( rule__Tasks__PointsAssignment_7 ) )
            // InternalPlanning.g:863:2: ( rule__Tasks__PointsAssignment_7 )
            {
             before(grammarAccess.getTasksAccess().getPointsAssignment_7()); 
            // InternalPlanning.g:864:2: ( rule__Tasks__PointsAssignment_7 )
            // InternalPlanning.g:864:3: rule__Tasks__PointsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__PointsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getPointsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__7__Impl"


    // $ANTLR start "rule__Tasks__Group__8"
    // InternalPlanning.g:872:1: rule__Tasks__Group__8 : rule__Tasks__Group__8__Impl rule__Tasks__Group__9 ;
    public final void rule__Tasks__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:876:1: ( rule__Tasks__Group__8__Impl rule__Tasks__Group__9 )
            // InternalPlanning.g:877:2: rule__Tasks__Group__8__Impl rule__Tasks__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Tasks__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__8"


    // $ANTLR start "rule__Tasks__Group__8__Impl"
    // InternalPlanning.g:884:1: rule__Tasks__Group__8__Impl : ( 'status' ) ;
    public final void rule__Tasks__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:888:1: ( ( 'status' ) )
            // InternalPlanning.g:889:1: ( 'status' )
            {
            // InternalPlanning.g:889:1: ( 'status' )
            // InternalPlanning.g:890:2: 'status'
            {
             before(grammarAccess.getTasksAccess().getStatusKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getStatusKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__8__Impl"


    // $ANTLR start "rule__Tasks__Group__9"
    // InternalPlanning.g:899:1: rule__Tasks__Group__9 : rule__Tasks__Group__9__Impl rule__Tasks__Group__10 ;
    public final void rule__Tasks__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:903:1: ( rule__Tasks__Group__9__Impl rule__Tasks__Group__10 )
            // InternalPlanning.g:904:2: rule__Tasks__Group__9__Impl rule__Tasks__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Tasks__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__9"


    // $ANTLR start "rule__Tasks__Group__9__Impl"
    // InternalPlanning.g:911:1: rule__Tasks__Group__9__Impl : ( ( rule__Tasks__StatusAssignment_9 ) ) ;
    public final void rule__Tasks__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:915:1: ( ( ( rule__Tasks__StatusAssignment_9 ) ) )
            // InternalPlanning.g:916:1: ( ( rule__Tasks__StatusAssignment_9 ) )
            {
            // InternalPlanning.g:916:1: ( ( rule__Tasks__StatusAssignment_9 ) )
            // InternalPlanning.g:917:2: ( rule__Tasks__StatusAssignment_9 )
            {
             before(grammarAccess.getTasksAccess().getStatusAssignment_9()); 
            // InternalPlanning.g:918:2: ( rule__Tasks__StatusAssignment_9 )
            // InternalPlanning.g:918:3: rule__Tasks__StatusAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__StatusAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getStatusAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__9__Impl"


    // $ANTLR start "rule__Tasks__Group__10"
    // InternalPlanning.g:926:1: rule__Tasks__Group__10 : rule__Tasks__Group__10__Impl rule__Tasks__Group__11 ;
    public final void rule__Tasks__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:930:1: ( rule__Tasks__Group__10__Impl rule__Tasks__Group__11 )
            // InternalPlanning.g:931:2: rule__Tasks__Group__10__Impl rule__Tasks__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Tasks__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tasks__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__10"


    // $ANTLR start "rule__Tasks__Group__10__Impl"
    // InternalPlanning.g:938:1: rule__Tasks__Group__10__Impl : ( 'project' ) ;
    public final void rule__Tasks__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:942:1: ( ( 'project' ) )
            // InternalPlanning.g:943:1: ( 'project' )
            {
            // InternalPlanning.g:943:1: ( 'project' )
            // InternalPlanning.g:944:2: 'project'
            {
             before(grammarAccess.getTasksAccess().getProjectKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getProjectKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__10__Impl"


    // $ANTLR start "rule__Tasks__Group__11"
    // InternalPlanning.g:953:1: rule__Tasks__Group__11 : rule__Tasks__Group__11__Impl ;
    public final void rule__Tasks__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:957:1: ( rule__Tasks__Group__11__Impl )
            // InternalPlanning.g:958:2: rule__Tasks__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tasks__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__11"


    // $ANTLR start "rule__Tasks__Group__11__Impl"
    // InternalPlanning.g:964:1: rule__Tasks__Group__11__Impl : ( ( ( rule__Tasks__ProjAssignment_11 ) ) ( ( rule__Tasks__ProjAssignment_11 )* ) ) ;
    public final void rule__Tasks__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:968:1: ( ( ( ( rule__Tasks__ProjAssignment_11 ) ) ( ( rule__Tasks__ProjAssignment_11 )* ) ) )
            // InternalPlanning.g:969:1: ( ( ( rule__Tasks__ProjAssignment_11 ) ) ( ( rule__Tasks__ProjAssignment_11 )* ) )
            {
            // InternalPlanning.g:969:1: ( ( ( rule__Tasks__ProjAssignment_11 ) ) ( ( rule__Tasks__ProjAssignment_11 )* ) )
            // InternalPlanning.g:970:2: ( ( rule__Tasks__ProjAssignment_11 ) ) ( ( rule__Tasks__ProjAssignment_11 )* )
            {
            // InternalPlanning.g:970:2: ( ( rule__Tasks__ProjAssignment_11 ) )
            // InternalPlanning.g:971:3: ( rule__Tasks__ProjAssignment_11 )
            {
             before(grammarAccess.getTasksAccess().getProjAssignment_11()); 
            // InternalPlanning.g:972:3: ( rule__Tasks__ProjAssignment_11 )
            // InternalPlanning.g:972:4: rule__Tasks__ProjAssignment_11
            {
            pushFollow(FOLLOW_6);
            rule__Tasks__ProjAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getTasksAccess().getProjAssignment_11()); 

            }

            // InternalPlanning.g:975:2: ( ( rule__Tasks__ProjAssignment_11 )* )
            // InternalPlanning.g:976:3: ( rule__Tasks__ProjAssignment_11 )*
            {
             before(grammarAccess.getTasksAccess().getProjAssignment_11()); 
            // InternalPlanning.g:977:3: ( rule__Tasks__ProjAssignment_11 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPlanning.g:977:4: rule__Tasks__ProjAssignment_11
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Tasks__ProjAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTasksAccess().getProjAssignment_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__Group__11__Impl"


    // $ANTLR start "rule__FeatureTask__Group__0"
    // InternalPlanning.g:987:1: rule__FeatureTask__Group__0 : rule__FeatureTask__Group__0__Impl rule__FeatureTask__Group__1 ;
    public final void rule__FeatureTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:991:1: ( rule__FeatureTask__Group__0__Impl rule__FeatureTask__Group__1 )
            // InternalPlanning.g:992:2: rule__FeatureTask__Group__0__Impl rule__FeatureTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTask__Group__0"


    // $ANTLR start "rule__FeatureTask__Group__0__Impl"
    // InternalPlanning.g:999:1: rule__FeatureTask__Group__0__Impl : ( 'Feature' ) ;
    public final void rule__FeatureTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1003:1: ( ( 'Feature' ) )
            // InternalPlanning.g:1004:1: ( 'Feature' )
            {
            // InternalPlanning.g:1004:1: ( 'Feature' )
            // InternalPlanning.g:1005:2: 'Feature'
            {
             before(grammarAccess.getFeatureTaskAccess().getFeatureKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureTaskAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTask__Group__0__Impl"


    // $ANTLR start "rule__FeatureTask__Group__1"
    // InternalPlanning.g:1014:1: rule__FeatureTask__Group__1 : rule__FeatureTask__Group__1__Impl ;
    public final void rule__FeatureTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1018:1: ( rule__FeatureTask__Group__1__Impl )
            // InternalPlanning.g:1019:2: rule__FeatureTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTask__Group__1"


    // $ANTLR start "rule__FeatureTask__Group__1__Impl"
    // InternalPlanning.g:1025:1: rule__FeatureTask__Group__1__Impl : ( ( rule__FeatureTask__FeatAssignment_1 ) ) ;
    public final void rule__FeatureTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1029:1: ( ( ( rule__FeatureTask__FeatAssignment_1 ) ) )
            // InternalPlanning.g:1030:1: ( ( rule__FeatureTask__FeatAssignment_1 ) )
            {
            // InternalPlanning.g:1030:1: ( ( rule__FeatureTask__FeatAssignment_1 ) )
            // InternalPlanning.g:1031:2: ( rule__FeatureTask__FeatAssignment_1 )
            {
             before(grammarAccess.getFeatureTaskAccess().getFeatAssignment_1()); 
            // InternalPlanning.g:1032:2: ( rule__FeatureTask__FeatAssignment_1 )
            // InternalPlanning.g:1032:3: rule__FeatureTask__FeatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTask__FeatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTaskAccess().getFeatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTask__Group__1__Impl"


    // $ANTLR start "rule__BugTask__Group__0"
    // InternalPlanning.g:1041:1: rule__BugTask__Group__0 : rule__BugTask__Group__0__Impl rule__BugTask__Group__1 ;
    public final void rule__BugTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1045:1: ( rule__BugTask__Group__0__Impl rule__BugTask__Group__1 )
            // InternalPlanning.g:1046:2: rule__BugTask__Group__0__Impl rule__BugTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BugTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BugTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BugTask__Group__0"


    // $ANTLR start "rule__BugTask__Group__0__Impl"
    // InternalPlanning.g:1053:1: rule__BugTask__Group__0__Impl : ( 'Bug' ) ;
    public final void rule__BugTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1057:1: ( ( 'Bug' ) )
            // InternalPlanning.g:1058:1: ( 'Bug' )
            {
            // InternalPlanning.g:1058:1: ( 'Bug' )
            // InternalPlanning.g:1059:2: 'Bug'
            {
             before(grammarAccess.getBugTaskAccess().getBugKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBugTaskAccess().getBugKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BugTask__Group__0__Impl"


    // $ANTLR start "rule__BugTask__Group__1"
    // InternalPlanning.g:1068:1: rule__BugTask__Group__1 : rule__BugTask__Group__1__Impl ;
    public final void rule__BugTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1072:1: ( rule__BugTask__Group__1__Impl )
            // InternalPlanning.g:1073:2: rule__BugTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BugTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BugTask__Group__1"


    // $ANTLR start "rule__BugTask__Group__1__Impl"
    // InternalPlanning.g:1079:1: rule__BugTask__Group__1__Impl : ( ( rule__BugTask__BugAssignment_1 ) ) ;
    public final void rule__BugTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1083:1: ( ( ( rule__BugTask__BugAssignment_1 ) ) )
            // InternalPlanning.g:1084:1: ( ( rule__BugTask__BugAssignment_1 ) )
            {
            // InternalPlanning.g:1084:1: ( ( rule__BugTask__BugAssignment_1 ) )
            // InternalPlanning.g:1085:2: ( rule__BugTask__BugAssignment_1 )
            {
             before(grammarAccess.getBugTaskAccess().getBugAssignment_1()); 
            // InternalPlanning.g:1086:2: ( rule__BugTask__BugAssignment_1 )
            // InternalPlanning.g:1086:3: rule__BugTask__BugAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BugTask__BugAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBugTaskAccess().getBugAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BugTask__Group__1__Impl"


    // $ANTLR start "rule__AnalyseTask__Group__0"
    // InternalPlanning.g:1095:1: rule__AnalyseTask__Group__0 : rule__AnalyseTask__Group__0__Impl rule__AnalyseTask__Group__1 ;
    public final void rule__AnalyseTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1099:1: ( rule__AnalyseTask__Group__0__Impl rule__AnalyseTask__Group__1 )
            // InternalPlanning.g:1100:2: rule__AnalyseTask__Group__0__Impl rule__AnalyseTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AnalyseTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnalyseTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalyseTask__Group__0"


    // $ANTLR start "rule__AnalyseTask__Group__0__Impl"
    // InternalPlanning.g:1107:1: rule__AnalyseTask__Group__0__Impl : ( 'Analyse' ) ;
    public final void rule__AnalyseTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1111:1: ( ( 'Analyse' ) )
            // InternalPlanning.g:1112:1: ( 'Analyse' )
            {
            // InternalPlanning.g:1112:1: ( 'Analyse' )
            // InternalPlanning.g:1113:2: 'Analyse'
            {
             before(grammarAccess.getAnalyseTaskAccess().getAnalyseKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAnalyseTaskAccess().getAnalyseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalyseTask__Group__0__Impl"


    // $ANTLR start "rule__AnalyseTask__Group__1"
    // InternalPlanning.g:1122:1: rule__AnalyseTask__Group__1 : rule__AnalyseTask__Group__1__Impl ;
    public final void rule__AnalyseTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1126:1: ( rule__AnalyseTask__Group__1__Impl )
            // InternalPlanning.g:1127:2: rule__AnalyseTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnalyseTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalyseTask__Group__1"


    // $ANTLR start "rule__AnalyseTask__Group__1__Impl"
    // InternalPlanning.g:1133:1: rule__AnalyseTask__Group__1__Impl : ( ( rule__AnalyseTask__AnalyseAssignment_1 ) ) ;
    public final void rule__AnalyseTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1137:1: ( ( ( rule__AnalyseTask__AnalyseAssignment_1 ) ) )
            // InternalPlanning.g:1138:1: ( ( rule__AnalyseTask__AnalyseAssignment_1 ) )
            {
            // InternalPlanning.g:1138:1: ( ( rule__AnalyseTask__AnalyseAssignment_1 ) )
            // InternalPlanning.g:1139:2: ( rule__AnalyseTask__AnalyseAssignment_1 )
            {
             before(grammarAccess.getAnalyseTaskAccess().getAnalyseAssignment_1()); 
            // InternalPlanning.g:1140:2: ( rule__AnalyseTask__AnalyseAssignment_1 )
            // InternalPlanning.g:1140:3: rule__AnalyseTask__AnalyseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnalyseTask__AnalyseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnalyseTaskAccess().getAnalyseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalyseTask__Group__1__Impl"


    // $ANTLR start "rule__TestTask__Group__0"
    // InternalPlanning.g:1149:1: rule__TestTask__Group__0 : rule__TestTask__Group__0__Impl rule__TestTask__Group__1 ;
    public final void rule__TestTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1153:1: ( rule__TestTask__Group__0__Impl rule__TestTask__Group__1 )
            // InternalPlanning.g:1154:2: rule__TestTask__Group__0__Impl rule__TestTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TestTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestTask__Group__0"


    // $ANTLR start "rule__TestTask__Group__0__Impl"
    // InternalPlanning.g:1161:1: rule__TestTask__Group__0__Impl : ( 'Test' ) ;
    public final void rule__TestTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1165:1: ( ( 'Test' ) )
            // InternalPlanning.g:1166:1: ( 'Test' )
            {
            // InternalPlanning.g:1166:1: ( 'Test' )
            // InternalPlanning.g:1167:2: 'Test'
            {
             before(grammarAccess.getTestTaskAccess().getTestKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTestTaskAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestTask__Group__0__Impl"


    // $ANTLR start "rule__TestTask__Group__1"
    // InternalPlanning.g:1176:1: rule__TestTask__Group__1 : rule__TestTask__Group__1__Impl ;
    public final void rule__TestTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1180:1: ( rule__TestTask__Group__1__Impl )
            // InternalPlanning.g:1181:2: rule__TestTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestTask__Group__1"


    // $ANTLR start "rule__TestTask__Group__1__Impl"
    // InternalPlanning.g:1187:1: rule__TestTask__Group__1__Impl : ( ( rule__TestTask__TestAssignment_1 ) ) ;
    public final void rule__TestTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1191:1: ( ( ( rule__TestTask__TestAssignment_1 ) ) )
            // InternalPlanning.g:1192:1: ( ( rule__TestTask__TestAssignment_1 ) )
            {
            // InternalPlanning.g:1192:1: ( ( rule__TestTask__TestAssignment_1 ) )
            // InternalPlanning.g:1193:2: ( rule__TestTask__TestAssignment_1 )
            {
             before(grammarAccess.getTestTaskAccess().getTestAssignment_1()); 
            // InternalPlanning.g:1194:2: ( rule__TestTask__TestAssignment_1 )
            // InternalPlanning.g:1194:3: rule__TestTask__TestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TestTask__TestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestTaskAccess().getTestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestTask__Group__1__Impl"


    // $ANTLR start "rule__DocumentTask__Group__0"
    // InternalPlanning.g:1203:1: rule__DocumentTask__Group__0 : rule__DocumentTask__Group__0__Impl rule__DocumentTask__Group__1 ;
    public final void rule__DocumentTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1207:1: ( rule__DocumentTask__Group__0__Impl rule__DocumentTask__Group__1 )
            // InternalPlanning.g:1208:2: rule__DocumentTask__Group__0__Impl rule__DocumentTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DocumentTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTask__Group__0"


    // $ANTLR start "rule__DocumentTask__Group__0__Impl"
    // InternalPlanning.g:1215:1: rule__DocumentTask__Group__0__Impl : ( 'Document' ) ;
    public final void rule__DocumentTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1219:1: ( ( 'Document' ) )
            // InternalPlanning.g:1220:1: ( 'Document' )
            {
            // InternalPlanning.g:1220:1: ( 'Document' )
            // InternalPlanning.g:1221:2: 'Document'
            {
             before(grammarAccess.getDocumentTaskAccess().getDocumentKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDocumentTaskAccess().getDocumentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTask__Group__0__Impl"


    // $ANTLR start "rule__DocumentTask__Group__1"
    // InternalPlanning.g:1230:1: rule__DocumentTask__Group__1 : rule__DocumentTask__Group__1__Impl ;
    public final void rule__DocumentTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1234:1: ( rule__DocumentTask__Group__1__Impl )
            // InternalPlanning.g:1235:2: rule__DocumentTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTask__Group__1"


    // $ANTLR start "rule__DocumentTask__Group__1__Impl"
    // InternalPlanning.g:1241:1: rule__DocumentTask__Group__1__Impl : ( ( rule__DocumentTask__DocAssignment_1 ) ) ;
    public final void rule__DocumentTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1245:1: ( ( ( rule__DocumentTask__DocAssignment_1 ) ) )
            // InternalPlanning.g:1246:1: ( ( rule__DocumentTask__DocAssignment_1 ) )
            {
            // InternalPlanning.g:1246:1: ( ( rule__DocumentTask__DocAssignment_1 ) )
            // InternalPlanning.g:1247:2: ( rule__DocumentTask__DocAssignment_1 )
            {
             before(grammarAccess.getDocumentTaskAccess().getDocAssignment_1()); 
            // InternalPlanning.g:1248:2: ( rule__DocumentTask__DocAssignment_1 )
            // InternalPlanning.g:1248:3: rule__DocumentTask__DocAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DocumentTask__DocAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentTaskAccess().getDocAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTask__Group__1__Impl"


    // $ANTLR start "rule__DeployTask__Group__0"
    // InternalPlanning.g:1257:1: rule__DeployTask__Group__0 : rule__DeployTask__Group__0__Impl rule__DeployTask__Group__1 ;
    public final void rule__DeployTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1261:1: ( rule__DeployTask__Group__0__Impl rule__DeployTask__Group__1 )
            // InternalPlanning.g:1262:2: rule__DeployTask__Group__0__Impl rule__DeployTask__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DeployTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeployTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeployTask__Group__0"


    // $ANTLR start "rule__DeployTask__Group__0__Impl"
    // InternalPlanning.g:1269:1: rule__DeployTask__Group__0__Impl : ( 'Deploy' ) ;
    public final void rule__DeployTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1273:1: ( ( 'Deploy' ) )
            // InternalPlanning.g:1274:1: ( 'Deploy' )
            {
            // InternalPlanning.g:1274:1: ( 'Deploy' )
            // InternalPlanning.g:1275:2: 'Deploy'
            {
             before(grammarAccess.getDeployTaskAccess().getDeployKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeployTaskAccess().getDeployKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeployTask__Group__0__Impl"


    // $ANTLR start "rule__DeployTask__Group__1"
    // InternalPlanning.g:1284:1: rule__DeployTask__Group__1 : rule__DeployTask__Group__1__Impl ;
    public final void rule__DeployTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1288:1: ( rule__DeployTask__Group__1__Impl )
            // InternalPlanning.g:1289:2: rule__DeployTask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeployTask__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeployTask__Group__1"


    // $ANTLR start "rule__DeployTask__Group__1__Impl"
    // InternalPlanning.g:1295:1: rule__DeployTask__Group__1__Impl : ( ( rule__DeployTask__DeployAssignment_1 ) ) ;
    public final void rule__DeployTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1299:1: ( ( ( rule__DeployTask__DeployAssignment_1 ) ) )
            // InternalPlanning.g:1300:1: ( ( rule__DeployTask__DeployAssignment_1 ) )
            {
            // InternalPlanning.g:1300:1: ( ( rule__DeployTask__DeployAssignment_1 ) )
            // InternalPlanning.g:1301:2: ( rule__DeployTask__DeployAssignment_1 )
            {
             before(grammarAccess.getDeployTaskAccess().getDeployAssignment_1()); 
            // InternalPlanning.g:1302:2: ( rule__DeployTask__DeployAssignment_1 )
            // InternalPlanning.g:1302:3: rule__DeployTask__DeployAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeployTask__DeployAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeployTaskAccess().getDeployAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeployTask__Group__1__Impl"


    // $ANTLR start "rule__TaskPlanning__NameAssignment_1"
    // InternalPlanning.g:1311:1: rule__TaskPlanning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TaskPlanning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1315:1: ( ( RULE_ID ) )
            // InternalPlanning.g:1316:2: ( RULE_ID )
            {
            // InternalPlanning.g:1316:2: ( RULE_ID )
            // InternalPlanning.g:1317:3: RULE_ID
            {
             before(grammarAccess.getTaskPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskPlanningAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__NameAssignment_1"


    // $ANTLR start "rule__TaskPlanning__OwnersAssignment_3"
    // InternalPlanning.g:1326:1: rule__TaskPlanning__OwnersAssignment_3 : ( ruleOwner ) ;
    public final void rule__TaskPlanning__OwnersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1330:1: ( ( ruleOwner ) )
            // InternalPlanning.g:1331:2: ( ruleOwner )
            {
            // InternalPlanning.g:1331:2: ( ruleOwner )
            // InternalPlanning.g:1332:3: ruleOwner
            {
             before(grammarAccess.getTaskPlanningAccess().getOwnersOwnerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOwner();

            state._fsp--;

             after(grammarAccess.getTaskPlanningAccess().getOwnersOwnerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__OwnersAssignment_3"


    // $ANTLR start "rule__TaskPlanning__ProjsAssignment_5"
    // InternalPlanning.g:1341:1: rule__TaskPlanning__ProjsAssignment_5 : ( ruleProject ) ;
    public final void rule__TaskPlanning__ProjsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1345:1: ( ( ruleProject ) )
            // InternalPlanning.g:1346:2: ( ruleProject )
            {
            // InternalPlanning.g:1346:2: ( ruleProject )
            // InternalPlanning.g:1347:3: ruleProject
            {
             before(grammarAccess.getTaskPlanningAccess().getProjsProjectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getTaskPlanningAccess().getProjsProjectParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__ProjsAssignment_5"


    // $ANTLR start "rule__TaskPlanning__TasksAssignment_6"
    // InternalPlanning.g:1356:1: rule__TaskPlanning__TasksAssignment_6 : ( ruleTasks ) ;
    public final void rule__TaskPlanning__TasksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1360:1: ( ( ruleTasks ) )
            // InternalPlanning.g:1361:2: ( ruleTasks )
            {
            // InternalPlanning.g:1361:2: ( ruleTasks )
            // InternalPlanning.g:1362:3: ruleTasks
            {
             before(grammarAccess.getTaskPlanningAccess().getTasksTasksParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTasks();

            state._fsp--;

             after(grammarAccess.getTaskPlanningAccess().getTasksTasksParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskPlanning__TasksAssignment_6"


    // $ANTLR start "rule__Owner__NameAssignment"
    // InternalPlanning.g:1371:1: rule__Owner__NameAssignment : ( RULE_ID ) ;
    public final void rule__Owner__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1375:1: ( ( RULE_ID ) )
            // InternalPlanning.g:1376:2: ( RULE_ID )
            {
            // InternalPlanning.g:1376:2: ( RULE_ID )
            // InternalPlanning.g:1377:3: RULE_ID
            {
             before(grammarAccess.getOwnerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnerAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Owner__NameAssignment"


    // $ANTLR start "rule__Project__NameAssignment"
    // InternalPlanning.g:1386:1: rule__Project__NameAssignment : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1390:1: ( ( RULE_ID ) )
            // InternalPlanning.g:1391:2: ( RULE_ID )
            {
            // InternalPlanning.g:1391:2: ( RULE_ID )
            // InternalPlanning.g:1392:3: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment"


    // $ANTLR start "rule__Tasks__TaskTypeAssignment_1"
    // InternalPlanning.g:1401:1: rule__Tasks__TaskTypeAssignment_1 : ( ruleTaskType ) ;
    public final void rule__Tasks__TaskTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1405:1: ( ( ruleTaskType ) )
            // InternalPlanning.g:1406:2: ( ruleTaskType )
            {
            // InternalPlanning.g:1406:2: ( ruleTaskType )
            // InternalPlanning.g:1407:3: ruleTaskType
            {
             before(grammarAccess.getTasksAccess().getTaskTypeTaskTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskType();

            state._fsp--;

             after(grammarAccess.getTasksAccess().getTaskTypeTaskTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__TaskTypeAssignment_1"


    // $ANTLR start "rule__Tasks__OwnerAssignment_3"
    // InternalPlanning.g:1416:1: rule__Tasks__OwnerAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Tasks__OwnerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1420:1: ( ( ( RULE_ID ) ) )
            // InternalPlanning.g:1421:2: ( ( RULE_ID ) )
            {
            // InternalPlanning.g:1421:2: ( ( RULE_ID ) )
            // InternalPlanning.g:1422:3: ( RULE_ID )
            {
             before(grammarAccess.getTasksAccess().getOwnerOwnerCrossReference_3_0()); 
            // InternalPlanning.g:1423:3: ( RULE_ID )
            // InternalPlanning.g:1424:4: RULE_ID
            {
             before(grammarAccess.getTasksAccess().getOwnerOwnerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getOwnerOwnerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTasksAccess().getOwnerOwnerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__OwnerAssignment_3"


    // $ANTLR start "rule__Tasks__PriorityAssignment_5"
    // InternalPlanning.g:1435:1: rule__Tasks__PriorityAssignment_5 : ( RULE_INT ) ;
    public final void rule__Tasks__PriorityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1439:1: ( ( RULE_INT ) )
            // InternalPlanning.g:1440:2: ( RULE_INT )
            {
            // InternalPlanning.g:1440:2: ( RULE_INT )
            // InternalPlanning.g:1441:3: RULE_INT
            {
             before(grammarAccess.getTasksAccess().getPriorityINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getPriorityINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__PriorityAssignment_5"


    // $ANTLR start "rule__Tasks__PointsAssignment_7"
    // InternalPlanning.g:1450:1: rule__Tasks__PointsAssignment_7 : ( rulePoints ) ;
    public final void rule__Tasks__PointsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1454:1: ( ( rulePoints ) )
            // InternalPlanning.g:1455:2: ( rulePoints )
            {
            // InternalPlanning.g:1455:2: ( rulePoints )
            // InternalPlanning.g:1456:3: rulePoints
            {
             before(grammarAccess.getTasksAccess().getPointsPointsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePoints();

            state._fsp--;

             after(grammarAccess.getTasksAccess().getPointsPointsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__PointsAssignment_7"


    // $ANTLR start "rule__Tasks__StatusAssignment_9"
    // InternalPlanning.g:1465:1: rule__Tasks__StatusAssignment_9 : ( ruleStatus ) ;
    public final void rule__Tasks__StatusAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1469:1: ( ( ruleStatus ) )
            // InternalPlanning.g:1470:2: ( ruleStatus )
            {
            // InternalPlanning.g:1470:2: ( ruleStatus )
            // InternalPlanning.g:1471:3: ruleStatus
            {
             before(grammarAccess.getTasksAccess().getStatusStatusEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getTasksAccess().getStatusStatusEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__StatusAssignment_9"


    // $ANTLR start "rule__Tasks__ProjAssignment_11"
    // InternalPlanning.g:1480:1: rule__Tasks__ProjAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Tasks__ProjAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1484:1: ( ( ( RULE_ID ) ) )
            // InternalPlanning.g:1485:2: ( ( RULE_ID ) )
            {
            // InternalPlanning.g:1485:2: ( ( RULE_ID ) )
            // InternalPlanning.g:1486:3: ( RULE_ID )
            {
             before(grammarAccess.getTasksAccess().getProjProjectCrossReference_11_0()); 
            // InternalPlanning.g:1487:3: ( RULE_ID )
            // InternalPlanning.g:1488:4: RULE_ID
            {
             before(grammarAccess.getTasksAccess().getProjProjectIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTasksAccess().getProjProjectIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getTasksAccess().getProjProjectCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tasks__ProjAssignment_11"


    // $ANTLR start "rule__Points__ValueAssignment"
    // InternalPlanning.g:1499:1: rule__Points__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Points__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1503:1: ( ( RULE_INT ) )
            // InternalPlanning.g:1504:2: ( RULE_INT )
            {
            // InternalPlanning.g:1504:2: ( RULE_INT )
            // InternalPlanning.g:1505:3: RULE_INT
            {
             before(grammarAccess.getPointsAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointsAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points__ValueAssignment"


    // $ANTLR start "rule__FeatureTask__FeatAssignment_1"
    // InternalPlanning.g:1514:1: rule__FeatureTask__FeatAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FeatureTask__FeatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1518:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1519:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1519:2: ( RULE_STRING )
            // InternalPlanning.g:1520:3: RULE_STRING
            {
             before(grammarAccess.getFeatureTaskAccess().getFeatSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeatureTaskAccess().getFeatSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTask__FeatAssignment_1"


    // $ANTLR start "rule__BugTask__BugAssignment_1"
    // InternalPlanning.g:1529:1: rule__BugTask__BugAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BugTask__BugAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1533:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1534:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1534:2: ( RULE_STRING )
            // InternalPlanning.g:1535:3: RULE_STRING
            {
             before(grammarAccess.getBugTaskAccess().getBugSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBugTaskAccess().getBugSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BugTask__BugAssignment_1"


    // $ANTLR start "rule__AnalyseTask__AnalyseAssignment_1"
    // InternalPlanning.g:1544:1: rule__AnalyseTask__AnalyseAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AnalyseTask__AnalyseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1548:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1549:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1549:2: ( RULE_STRING )
            // InternalPlanning.g:1550:3: RULE_STRING
            {
             before(grammarAccess.getAnalyseTaskAccess().getAnalyseSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnalyseTaskAccess().getAnalyseSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnalyseTask__AnalyseAssignment_1"


    // $ANTLR start "rule__TestTask__TestAssignment_1"
    // InternalPlanning.g:1559:1: rule__TestTask__TestAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TestTask__TestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1563:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1564:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1564:2: ( RULE_STRING )
            // InternalPlanning.g:1565:3: RULE_STRING
            {
             before(grammarAccess.getTestTaskAccess().getTestSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestTaskAccess().getTestSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestTask__TestAssignment_1"


    // $ANTLR start "rule__DocumentTask__DocAssignment_1"
    // InternalPlanning.g:1574:1: rule__DocumentTask__DocAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DocumentTask__DocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1578:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1579:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1579:2: ( RULE_STRING )
            // InternalPlanning.g:1580:3: RULE_STRING
            {
             before(grammarAccess.getDocumentTaskAccess().getDocSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentTaskAccess().getDocSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentTask__DocAssignment_1"


    // $ANTLR start "rule__DeployTask__DeployAssignment_1"
    // InternalPlanning.g:1589:1: rule__DeployTask__DeployAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DeployTask__DeployAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlanning.g:1593:1: ( ( RULE_STRING ) )
            // InternalPlanning.g:1594:2: ( RULE_STRING )
            {
            // InternalPlanning.g:1594:2: ( RULE_STRING )
            // InternalPlanning.g:1595:3: RULE_STRING
            {
             before(grammarAccess.getDeployTaskAccess().getDeploySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeployTaskAccess().getDeploySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeployTask__DeployAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}