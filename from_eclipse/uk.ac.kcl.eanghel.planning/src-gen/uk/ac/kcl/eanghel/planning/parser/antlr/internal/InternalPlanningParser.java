package uk.ac.kcl.eanghel.planning.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.eanghel.planning.services.PlanningGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanningParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Team'", "'Owners'", "'Projects'", "'Task'", "'owner'", "'priority'", "'points'", "'status'", "'project'", "'Feature'", "'Bug'", "'Analyse'", "'Test'", "'Document'", "'Deploy'", "'Stuck'", "'In Progress'", "'Done'", "'Waiting for review'"
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

        public InternalPlanningParser(TokenStream input, PlanningGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TaskPlanning";
       	}

       	@Override
       	protected PlanningGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTaskPlanning"
    // InternalPlanning.g:65:1: entryRuleTaskPlanning returns [EObject current=null] : iv_ruleTaskPlanning= ruleTaskPlanning EOF ;
    public final EObject entryRuleTaskPlanning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskPlanning = null;


        try {
            // InternalPlanning.g:65:53: (iv_ruleTaskPlanning= ruleTaskPlanning EOF )
            // InternalPlanning.g:66:2: iv_ruleTaskPlanning= ruleTaskPlanning EOF
            {
             newCompositeNode(grammarAccess.getTaskPlanningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskPlanning=ruleTaskPlanning();

            state._fsp--;

             current =iv_ruleTaskPlanning; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskPlanning"


    // $ANTLR start "ruleTaskPlanning"
    // InternalPlanning.g:72:1: ruleTaskPlanning returns [EObject current=null] : (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Owners' ( (lv_owners_3_0= ruleOwner ) )+ otherlv_4= 'Projects' ( (lv_projs_5_0= ruleProject ) )+ ( (lv_tasks_6_0= ruleTasks ) )* ) ;
    public final EObject ruleTaskPlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_owners_3_0 = null;

        EObject lv_projs_5_0 = null;

        EObject lv_tasks_6_0 = null;



        	enterRule();

        try {
            // InternalPlanning.g:78:2: ( (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Owners' ( (lv_owners_3_0= ruleOwner ) )+ otherlv_4= 'Projects' ( (lv_projs_5_0= ruleProject ) )+ ( (lv_tasks_6_0= ruleTasks ) )* ) )
            // InternalPlanning.g:79:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Owners' ( (lv_owners_3_0= ruleOwner ) )+ otherlv_4= 'Projects' ( (lv_projs_5_0= ruleProject ) )+ ( (lv_tasks_6_0= ruleTasks ) )* )
            {
            // InternalPlanning.g:79:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Owners' ( (lv_owners_3_0= ruleOwner ) )+ otherlv_4= 'Projects' ( (lv_projs_5_0= ruleProject ) )+ ( (lv_tasks_6_0= ruleTasks ) )* )
            // InternalPlanning.g:80:3: otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Owners' ( (lv_owners_3_0= ruleOwner ) )+ otherlv_4= 'Projects' ( (lv_projs_5_0= ruleProject ) )+ ( (lv_tasks_6_0= ruleTasks ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskPlanningAccess().getTeamKeyword_0());
            		
            // InternalPlanning.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlanning.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlanning.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPlanning.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskPlanningAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskPlanningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskPlanningAccess().getOwnersKeyword_2());
            		
            // InternalPlanning.g:106:3: ( (lv_owners_3_0= ruleOwner ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlanning.g:107:4: (lv_owners_3_0= ruleOwner )
            	    {
            	    // InternalPlanning.g:107:4: (lv_owners_3_0= ruleOwner )
            	    // InternalPlanning.g:108:5: lv_owners_3_0= ruleOwner
            	    {

            	    					newCompositeNode(grammarAccess.getTaskPlanningAccess().getOwnersOwnerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_owners_3_0=ruleOwner();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskPlanningRule());
            	    					}
            	    					add(
            	    						current,
            	    						"owners",
            	    						lv_owners_3_0,
            	    						"uk.ac.kcl.eanghel.planning.Planning.Owner");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskPlanningAccess().getProjectsKeyword_4());
            		
            // InternalPlanning.g:129:3: ( (lv_projs_5_0= ruleProject ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPlanning.g:130:4: (lv_projs_5_0= ruleProject )
            	    {
            	    // InternalPlanning.g:130:4: (lv_projs_5_0= ruleProject )
            	    // InternalPlanning.g:131:5: lv_projs_5_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getTaskPlanningAccess().getProjsProjectParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_projs_5_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskPlanningRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projs",
            	    						lv_projs_5_0,
            	    						"uk.ac.kcl.eanghel.planning.Planning.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalPlanning.g:148:3: ( (lv_tasks_6_0= ruleTasks ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlanning.g:149:4: (lv_tasks_6_0= ruleTasks )
            	    {
            	    // InternalPlanning.g:149:4: (lv_tasks_6_0= ruleTasks )
            	    // InternalPlanning.g:150:5: lv_tasks_6_0= ruleTasks
            	    {

            	    					newCompositeNode(grammarAccess.getTaskPlanningAccess().getTasksTasksParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_6_0=ruleTasks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskPlanningRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_6_0,
            	    						"uk.ac.kcl.eanghel.planning.Planning.Tasks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskPlanning"


    // $ANTLR start "entryRuleOwner"
    // InternalPlanning.g:171:1: entryRuleOwner returns [EObject current=null] : iv_ruleOwner= ruleOwner EOF ;
    public final EObject entryRuleOwner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwner = null;


        try {
            // InternalPlanning.g:171:46: (iv_ruleOwner= ruleOwner EOF )
            // InternalPlanning.g:172:2: iv_ruleOwner= ruleOwner EOF
            {
             newCompositeNode(grammarAccess.getOwnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwner=ruleOwner();

            state._fsp--;

             current =iv_ruleOwner; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwner"


    // $ANTLR start "ruleOwner"
    // InternalPlanning.g:178:1: ruleOwner returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOwner() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:184:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPlanning.g:185:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPlanning.g:185:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPlanning.g:186:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPlanning.g:186:3: (lv_name_0_0= RULE_ID )
            // InternalPlanning.g:187:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getOwnerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOwnerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwner"


    // $ANTLR start "entryRuleProject"
    // InternalPlanning.g:206:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalPlanning.g:206:48: (iv_ruleProject= ruleProject EOF )
            // InternalPlanning.g:207:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalPlanning.g:213:1: ruleProject returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:219:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPlanning.g:220:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPlanning.g:220:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPlanning.g:221:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPlanning.g:221:3: (lv_name_0_0= RULE_ID )
            // InternalPlanning.g:222:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProjectRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTasks"
    // InternalPlanning.g:241:1: entryRuleTasks returns [EObject current=null] : iv_ruleTasks= ruleTasks EOF ;
    public final EObject entryRuleTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasks = null;


        try {
            // InternalPlanning.g:241:46: (iv_ruleTasks= ruleTasks EOF )
            // InternalPlanning.g:242:2: iv_ruleTasks= ruleTasks EOF
            {
             newCompositeNode(grammarAccess.getTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTasks=ruleTasks();

            state._fsp--;

             current =iv_ruleTasks; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTasks"


    // $ANTLR start "ruleTasks"
    // InternalPlanning.g:248:1: ruleTasks returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_taskType_1_0= ruleTaskType ) ) otherlv_2= 'owner' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) otherlv_6= 'points' ( (lv_points_7_0= rulePoints ) ) otherlv_8= 'status' ( (lv_status_9_0= ruleStatus ) ) otherlv_10= 'project' ( (otherlv_11= RULE_ID ) )+ ) ;
    public final EObject ruleTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_priority_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_taskType_1_0 = null;

        EObject lv_points_7_0 = null;

        Enumerator lv_status_9_0 = null;



        	enterRule();

        try {
            // InternalPlanning.g:254:2: ( (otherlv_0= 'Task' ( (lv_taskType_1_0= ruleTaskType ) ) otherlv_2= 'owner' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) otherlv_6= 'points' ( (lv_points_7_0= rulePoints ) ) otherlv_8= 'status' ( (lv_status_9_0= ruleStatus ) ) otherlv_10= 'project' ( (otherlv_11= RULE_ID ) )+ ) )
            // InternalPlanning.g:255:2: (otherlv_0= 'Task' ( (lv_taskType_1_0= ruleTaskType ) ) otherlv_2= 'owner' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) otherlv_6= 'points' ( (lv_points_7_0= rulePoints ) ) otherlv_8= 'status' ( (lv_status_9_0= ruleStatus ) ) otherlv_10= 'project' ( (otherlv_11= RULE_ID ) )+ )
            {
            // InternalPlanning.g:255:2: (otherlv_0= 'Task' ( (lv_taskType_1_0= ruleTaskType ) ) otherlv_2= 'owner' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) otherlv_6= 'points' ( (lv_points_7_0= rulePoints ) ) otherlv_8= 'status' ( (lv_status_9_0= ruleStatus ) ) otherlv_10= 'project' ( (otherlv_11= RULE_ID ) )+ )
            // InternalPlanning.g:256:3: otherlv_0= 'Task' ( (lv_taskType_1_0= ruleTaskType ) ) otherlv_2= 'owner' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority' ( (lv_priority_5_0= RULE_INT ) ) otherlv_6= 'points' ( (lv_points_7_0= rulePoints ) ) otherlv_8= 'status' ( (lv_status_9_0= ruleStatus ) ) otherlv_10= 'project' ( (otherlv_11= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTasksAccess().getTaskKeyword_0());
            		
            // InternalPlanning.g:260:3: ( (lv_taskType_1_0= ruleTaskType ) )
            // InternalPlanning.g:261:4: (lv_taskType_1_0= ruleTaskType )
            {
            // InternalPlanning.g:261:4: (lv_taskType_1_0= ruleTaskType )
            // InternalPlanning.g:262:5: lv_taskType_1_0= ruleTaskType
            {

            					newCompositeNode(grammarAccess.getTasksAccess().getTaskTypeTaskTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_taskType_1_0=ruleTaskType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTasksRule());
            					}
            					set(
            						current,
            						"taskType",
            						lv_taskType_1_0,
            						"uk.ac.kcl.eanghel.planning.Planning.TaskType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTasksAccess().getOwnerKeyword_2());
            		
            // InternalPlanning.g:283:3: ( (otherlv_3= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlanning.g:284:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPlanning.g:284:4: (otherlv_3= RULE_ID )
            	    // InternalPlanning.g:285:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTasksRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTasksAccess().getOwnerOwnerCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTasksAccess().getPriorityKeyword_4());
            		
            // InternalPlanning.g:300:3: ( (lv_priority_5_0= RULE_INT ) )
            // InternalPlanning.g:301:4: (lv_priority_5_0= RULE_INT )
            {
            // InternalPlanning.g:301:4: (lv_priority_5_0= RULE_INT )
            // InternalPlanning.g:302:5: lv_priority_5_0= RULE_INT
            {
            lv_priority_5_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_priority_5_0, grammarAccess.getTasksAccess().getPriorityINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTasksRule());
            					}
            					setWithLastConsumed(
            						current,
            						"priority",
            						lv_priority_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTasksAccess().getPointsKeyword_6());
            		
            // InternalPlanning.g:322:3: ( (lv_points_7_0= rulePoints ) )
            // InternalPlanning.g:323:4: (lv_points_7_0= rulePoints )
            {
            // InternalPlanning.g:323:4: (lv_points_7_0= rulePoints )
            // InternalPlanning.g:324:5: lv_points_7_0= rulePoints
            {

            					newCompositeNode(grammarAccess.getTasksAccess().getPointsPointsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_points_7_0=rulePoints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTasksRule());
            					}
            					set(
            						current,
            						"points",
            						lv_points_7_0,
            						"uk.ac.kcl.eanghel.planning.Planning.Points");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getTasksAccess().getStatusKeyword_8());
            		
            // InternalPlanning.g:345:3: ( (lv_status_9_0= ruleStatus ) )
            // InternalPlanning.g:346:4: (lv_status_9_0= ruleStatus )
            {
            // InternalPlanning.g:346:4: (lv_status_9_0= ruleStatus )
            // InternalPlanning.g:347:5: lv_status_9_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTasksAccess().getStatusStatusEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_15);
            lv_status_9_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTasksRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_9_0,
            						"uk.ac.kcl.eanghel.planning.Planning.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getTasksAccess().getProjectKeyword_10());
            		
            // InternalPlanning.g:368:3: ( (otherlv_11= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlanning.g:369:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalPlanning.g:369:4: (otherlv_11= RULE_ID )
            	    // InternalPlanning.g:370:5: otherlv_11= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTasksRule());
            	    					}
            	    				
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(otherlv_11, grammarAccess.getTasksAccess().getProjProjectCrossReference_11_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTasks"


    // $ANTLR start "entryRulePoints"
    // InternalPlanning.g:385:1: entryRulePoints returns [EObject current=null] : iv_rulePoints= rulePoints EOF ;
    public final EObject entryRulePoints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoints = null;


        try {
            // InternalPlanning.g:385:47: (iv_rulePoints= rulePoints EOF )
            // InternalPlanning.g:386:2: iv_rulePoints= rulePoints EOF
            {
             newCompositeNode(grammarAccess.getPointsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoints=rulePoints();

            state._fsp--;

             current =iv_rulePoints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoints"


    // $ANTLR start "rulePoints"
    // InternalPlanning.g:392:1: rulePoints returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject rulePoints() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:398:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalPlanning.g:399:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalPlanning.g:399:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalPlanning.g:400:3: (lv_value_0_0= RULE_INT )
            {
            // InternalPlanning.g:400:3: (lv_value_0_0= RULE_INT )
            // InternalPlanning.g:401:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getPointsAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPointsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoints"


    // $ANTLR start "entryRuleTaskType"
    // InternalPlanning.g:420:1: entryRuleTaskType returns [EObject current=null] : iv_ruleTaskType= ruleTaskType EOF ;
    public final EObject entryRuleTaskType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskType = null;


        try {
            // InternalPlanning.g:420:49: (iv_ruleTaskType= ruleTaskType EOF )
            // InternalPlanning.g:421:2: iv_ruleTaskType= ruleTaskType EOF
            {
             newCompositeNode(grammarAccess.getTaskTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskType=ruleTaskType();

            state._fsp--;

             current =iv_ruleTaskType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskType"


    // $ANTLR start "ruleTaskType"
    // InternalPlanning.g:427:1: ruleTaskType returns [EObject current=null] : (this_FeatureTask_0= ruleFeatureTask | this_BugTask_1= ruleBugTask | this_AnalyseTask_2= ruleAnalyseTask | this_TestTask_3= ruleTestTask | this_DocumentTask_4= ruleDocumentTask | this_DeployTask_5= ruleDeployTask ) ;
    public final EObject ruleTaskType() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureTask_0 = null;

        EObject this_BugTask_1 = null;

        EObject this_AnalyseTask_2 = null;

        EObject this_TestTask_3 = null;

        EObject this_DocumentTask_4 = null;

        EObject this_DeployTask_5 = null;



        	enterRule();

        try {
            // InternalPlanning.g:433:2: ( (this_FeatureTask_0= ruleFeatureTask | this_BugTask_1= ruleBugTask | this_AnalyseTask_2= ruleAnalyseTask | this_TestTask_3= ruleTestTask | this_DocumentTask_4= ruleDocumentTask | this_DeployTask_5= ruleDeployTask ) )
            // InternalPlanning.g:434:2: (this_FeatureTask_0= ruleFeatureTask | this_BugTask_1= ruleBugTask | this_AnalyseTask_2= ruleAnalyseTask | this_TestTask_3= ruleTestTask | this_DocumentTask_4= ruleDocumentTask | this_DeployTask_5= ruleDeployTask )
            {
            // InternalPlanning.g:434:2: (this_FeatureTask_0= ruleFeatureTask | this_BugTask_1= ruleBugTask | this_AnalyseTask_2= ruleAnalyseTask | this_TestTask_3= ruleTestTask | this_DocumentTask_4= ruleDocumentTask | this_DeployTask_5= ruleDeployTask )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPlanning.g:435:3: this_FeatureTask_0= ruleFeatureTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getFeatureTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FeatureTask_0=ruleFeatureTask();

                    state._fsp--;


                    			current = this_FeatureTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlanning.g:444:3: this_BugTask_1= ruleBugTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getBugTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BugTask_1=ruleBugTask();

                    state._fsp--;


                    			current = this_BugTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPlanning.g:453:3: this_AnalyseTask_2= ruleAnalyseTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getAnalyseTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalyseTask_2=ruleAnalyseTask();

                    state._fsp--;


                    			current = this_AnalyseTask_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPlanning.g:462:3: this_TestTask_3= ruleTestTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getTestTaskParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestTask_3=ruleTestTask();

                    state._fsp--;


                    			current = this_TestTask_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPlanning.g:471:3: this_DocumentTask_4= ruleDocumentTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getDocumentTaskParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentTask_4=ruleDocumentTask();

                    state._fsp--;


                    			current = this_DocumentTask_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPlanning.g:480:3: this_DeployTask_5= ruleDeployTask
                    {

                    			newCompositeNode(grammarAccess.getTaskTypeAccess().getDeployTaskParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeployTask_5=ruleDeployTask();

                    state._fsp--;


                    			current = this_DeployTask_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskType"


    // $ANTLR start "entryRuleFeatureTask"
    // InternalPlanning.g:492:1: entryRuleFeatureTask returns [EObject current=null] : iv_ruleFeatureTask= ruleFeatureTask EOF ;
    public final EObject entryRuleFeatureTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTask = null;


        try {
            // InternalPlanning.g:492:52: (iv_ruleFeatureTask= ruleFeatureTask EOF )
            // InternalPlanning.g:493:2: iv_ruleFeatureTask= ruleFeatureTask EOF
            {
             newCompositeNode(grammarAccess.getFeatureTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureTask=ruleFeatureTask();

            state._fsp--;

             current =iv_ruleFeatureTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureTask"


    // $ANTLR start "ruleFeatureTask"
    // InternalPlanning.g:499:1: ruleFeatureTask returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_feat_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFeatureTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_feat_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:505:2: ( (otherlv_0= 'Feature' ( (lv_feat_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:506:2: (otherlv_0= 'Feature' ( (lv_feat_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:506:2: (otherlv_0= 'Feature' ( (lv_feat_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:507:3: otherlv_0= 'Feature' ( (lv_feat_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureTaskAccess().getFeatureKeyword_0());
            		
            // InternalPlanning.g:511:3: ( (lv_feat_1_0= RULE_STRING ) )
            // InternalPlanning.g:512:4: (lv_feat_1_0= RULE_STRING )
            {
            // InternalPlanning.g:512:4: (lv_feat_1_0= RULE_STRING )
            // InternalPlanning.g:513:5: lv_feat_1_0= RULE_STRING
            {
            lv_feat_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_feat_1_0, grammarAccess.getFeatureTaskAccess().getFeatSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feat",
            						lv_feat_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureTask"


    // $ANTLR start "entryRuleBugTask"
    // InternalPlanning.g:533:1: entryRuleBugTask returns [EObject current=null] : iv_ruleBugTask= ruleBugTask EOF ;
    public final EObject entryRuleBugTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBugTask = null;


        try {
            // InternalPlanning.g:533:48: (iv_ruleBugTask= ruleBugTask EOF )
            // InternalPlanning.g:534:2: iv_ruleBugTask= ruleBugTask EOF
            {
             newCompositeNode(grammarAccess.getBugTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBugTask=ruleBugTask();

            state._fsp--;

             current =iv_ruleBugTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBugTask"


    // $ANTLR start "ruleBugTask"
    // InternalPlanning.g:540:1: ruleBugTask returns [EObject current=null] : (otherlv_0= 'Bug' ( (lv_bug_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBugTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bug_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:546:2: ( (otherlv_0= 'Bug' ( (lv_bug_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:547:2: (otherlv_0= 'Bug' ( (lv_bug_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:547:2: (otherlv_0= 'Bug' ( (lv_bug_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:548:3: otherlv_0= 'Bug' ( (lv_bug_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBugTaskAccess().getBugKeyword_0());
            		
            // InternalPlanning.g:552:3: ( (lv_bug_1_0= RULE_STRING ) )
            // InternalPlanning.g:553:4: (lv_bug_1_0= RULE_STRING )
            {
            // InternalPlanning.g:553:4: (lv_bug_1_0= RULE_STRING )
            // InternalPlanning.g:554:5: lv_bug_1_0= RULE_STRING
            {
            lv_bug_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_bug_1_0, grammarAccess.getBugTaskAccess().getBugSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBugTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bug",
            						lv_bug_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBugTask"


    // $ANTLR start "entryRuleAnalyseTask"
    // InternalPlanning.g:574:1: entryRuleAnalyseTask returns [EObject current=null] : iv_ruleAnalyseTask= ruleAnalyseTask EOF ;
    public final EObject entryRuleAnalyseTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyseTask = null;


        try {
            // InternalPlanning.g:574:52: (iv_ruleAnalyseTask= ruleAnalyseTask EOF )
            // InternalPlanning.g:575:2: iv_ruleAnalyseTask= ruleAnalyseTask EOF
            {
             newCompositeNode(grammarAccess.getAnalyseTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyseTask=ruleAnalyseTask();

            state._fsp--;

             current =iv_ruleAnalyseTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyseTask"


    // $ANTLR start "ruleAnalyseTask"
    // InternalPlanning.g:581:1: ruleAnalyseTask returns [EObject current=null] : (otherlv_0= 'Analyse' ( (lv_analyse_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnalyseTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_analyse_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:587:2: ( (otherlv_0= 'Analyse' ( (lv_analyse_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:588:2: (otherlv_0= 'Analyse' ( (lv_analyse_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:588:2: (otherlv_0= 'Analyse' ( (lv_analyse_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:589:3: otherlv_0= 'Analyse' ( (lv_analyse_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyseTaskAccess().getAnalyseKeyword_0());
            		
            // InternalPlanning.g:593:3: ( (lv_analyse_1_0= RULE_STRING ) )
            // InternalPlanning.g:594:4: (lv_analyse_1_0= RULE_STRING )
            {
            // InternalPlanning.g:594:4: (lv_analyse_1_0= RULE_STRING )
            // InternalPlanning.g:595:5: lv_analyse_1_0= RULE_STRING
            {
            lv_analyse_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_analyse_1_0, grammarAccess.getAnalyseTaskAccess().getAnalyseSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalyseTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"analyse",
            						lv_analyse_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyseTask"


    // $ANTLR start "entryRuleTestTask"
    // InternalPlanning.g:615:1: entryRuleTestTask returns [EObject current=null] : iv_ruleTestTask= ruleTestTask EOF ;
    public final EObject entryRuleTestTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestTask = null;


        try {
            // InternalPlanning.g:615:49: (iv_ruleTestTask= ruleTestTask EOF )
            // InternalPlanning.g:616:2: iv_ruleTestTask= ruleTestTask EOF
            {
             newCompositeNode(grammarAccess.getTestTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestTask=ruleTestTask();

            state._fsp--;

             current =iv_ruleTestTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestTask"


    // $ANTLR start "ruleTestTask"
    // InternalPlanning.g:622:1: ruleTestTask returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_test_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTestTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_test_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:628:2: ( (otherlv_0= 'Test' ( (lv_test_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:629:2: (otherlv_0= 'Test' ( (lv_test_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:629:2: (otherlv_0= 'Test' ( (lv_test_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:630:3: otherlv_0= 'Test' ( (lv_test_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTestTaskAccess().getTestKeyword_0());
            		
            // InternalPlanning.g:634:3: ( (lv_test_1_0= RULE_STRING ) )
            // InternalPlanning.g:635:4: (lv_test_1_0= RULE_STRING )
            {
            // InternalPlanning.g:635:4: (lv_test_1_0= RULE_STRING )
            // InternalPlanning.g:636:5: lv_test_1_0= RULE_STRING
            {
            lv_test_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_test_1_0, grammarAccess.getTestTaskAccess().getTestSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"test",
            						lv_test_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestTask"


    // $ANTLR start "entryRuleDocumentTask"
    // InternalPlanning.g:656:1: entryRuleDocumentTask returns [EObject current=null] : iv_ruleDocumentTask= ruleDocumentTask EOF ;
    public final EObject entryRuleDocumentTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTask = null;


        try {
            // InternalPlanning.g:656:53: (iv_ruleDocumentTask= ruleDocumentTask EOF )
            // InternalPlanning.g:657:2: iv_ruleDocumentTask= ruleDocumentTask EOF
            {
             newCompositeNode(grammarAccess.getDocumentTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentTask=ruleDocumentTask();

            state._fsp--;

             current =iv_ruleDocumentTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentTask"


    // $ANTLR start "ruleDocumentTask"
    // InternalPlanning.g:663:1: ruleDocumentTask returns [EObject current=null] : (otherlv_0= 'Document' ( (lv_doc_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDocumentTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_doc_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:669:2: ( (otherlv_0= 'Document' ( (lv_doc_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:670:2: (otherlv_0= 'Document' ( (lv_doc_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:670:2: (otherlv_0= 'Document' ( (lv_doc_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:671:3: otherlv_0= 'Document' ( (lv_doc_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentTaskAccess().getDocumentKeyword_0());
            		
            // InternalPlanning.g:675:3: ( (lv_doc_1_0= RULE_STRING ) )
            // InternalPlanning.g:676:4: (lv_doc_1_0= RULE_STRING )
            {
            // InternalPlanning.g:676:4: (lv_doc_1_0= RULE_STRING )
            // InternalPlanning.g:677:5: lv_doc_1_0= RULE_STRING
            {
            lv_doc_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_doc_1_0, grammarAccess.getDocumentTaskAccess().getDocSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"doc",
            						lv_doc_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentTask"


    // $ANTLR start "entryRuleDeployTask"
    // InternalPlanning.g:697:1: entryRuleDeployTask returns [EObject current=null] : iv_ruleDeployTask= ruleDeployTask EOF ;
    public final EObject entryRuleDeployTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployTask = null;


        try {
            // InternalPlanning.g:697:51: (iv_ruleDeployTask= ruleDeployTask EOF )
            // InternalPlanning.g:698:2: iv_ruleDeployTask= ruleDeployTask EOF
            {
             newCompositeNode(grammarAccess.getDeployTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployTask=ruleDeployTask();

            state._fsp--;

             current =iv_ruleDeployTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeployTask"


    // $ANTLR start "ruleDeployTask"
    // InternalPlanning.g:704:1: ruleDeployTask returns [EObject current=null] : (otherlv_0= 'Deploy' ( (lv_deploy_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeployTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_deploy_1_0=null;


        	enterRule();

        try {
            // InternalPlanning.g:710:2: ( (otherlv_0= 'Deploy' ( (lv_deploy_1_0= RULE_STRING ) ) ) )
            // InternalPlanning.g:711:2: (otherlv_0= 'Deploy' ( (lv_deploy_1_0= RULE_STRING ) ) )
            {
            // InternalPlanning.g:711:2: (otherlv_0= 'Deploy' ( (lv_deploy_1_0= RULE_STRING ) ) )
            // InternalPlanning.g:712:3: otherlv_0= 'Deploy' ( (lv_deploy_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDeployTaskAccess().getDeployKeyword_0());
            		
            // InternalPlanning.g:716:3: ( (lv_deploy_1_0= RULE_STRING ) )
            // InternalPlanning.g:717:4: (lv_deploy_1_0= RULE_STRING )
            {
            // InternalPlanning.g:717:4: (lv_deploy_1_0= RULE_STRING )
            // InternalPlanning.g:718:5: lv_deploy_1_0= RULE_STRING
            {
            lv_deploy_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_deploy_1_0, grammarAccess.getDeployTaskAccess().getDeploySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeployTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"deploy",
            						lv_deploy_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeployTask"


    // $ANTLR start "ruleStatus"
    // InternalPlanning.g:738:1: ruleStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'Stuck' ) | (enumLiteral_1= 'In Progress' ) | (enumLiteral_2= 'Done' ) | (enumLiteral_3= 'Waiting for review' ) ) ;
    public final Enumerator ruleStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPlanning.g:744:2: ( ( (enumLiteral_0= 'Stuck' ) | (enumLiteral_1= 'In Progress' ) | (enumLiteral_2= 'Done' ) | (enumLiteral_3= 'Waiting for review' ) ) )
            // InternalPlanning.g:745:2: ( (enumLiteral_0= 'Stuck' ) | (enumLiteral_1= 'In Progress' ) | (enumLiteral_2= 'Done' ) | (enumLiteral_3= 'Waiting for review' ) )
            {
            // InternalPlanning.g:745:2: ( (enumLiteral_0= 'Stuck' ) | (enumLiteral_1= 'In Progress' ) | (enumLiteral_2= 'Done' ) | (enumLiteral_3= 'Waiting for review' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPlanning.g:746:3: (enumLiteral_0= 'Stuck' )
                    {
                    // InternalPlanning.g:746:3: (enumLiteral_0= 'Stuck' )
                    // InternalPlanning.g:747:4: enumLiteral_0= 'Stuck'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatusAccess().getSTUCKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPlanning.g:754:3: (enumLiteral_1= 'In Progress' )
                    {
                    // InternalPlanning.g:754:3: (enumLiteral_1= 'In Progress' )
                    // InternalPlanning.g:755:4: enumLiteral_1= 'In Progress'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatusAccess().getPROGRESSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPlanning.g:762:3: (enumLiteral_2= 'Done' )
                    {
                    // InternalPlanning.g:762:3: (enumLiteral_2= 'Done' )
                    // InternalPlanning.g:763:4: enumLiteral_2= 'Done'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatusAccess().getDONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPlanning.g:770:3: (enumLiteral_3= 'Waiting for review' )
                    {
                    // InternalPlanning.g:770:3: (enumLiteral_3= 'Waiting for review' )
                    // InternalPlanning.g:771:4: enumLiteral_3= 'Waiting for review'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStatusAccess().getREVIEWEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});

}