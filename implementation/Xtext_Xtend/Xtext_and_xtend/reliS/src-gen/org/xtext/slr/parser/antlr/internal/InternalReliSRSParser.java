package org.xtext.slr.parser.antlr.internal;

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
import org.xtext.slr.services.ReliSRSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReliSRSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "'Participants:'", "'Phase:'", "'Classification:'", "'{'", "'Participant:'", "'Role:'", "'}'", "'question:'", "'response:'", "'result:'", "'DecisionPerUser:'", "'StatisticsOnExclusionCriteria:'", "'ConflictResolution:'", "'Result:'", "'D_User:'", "'D_Included:'", "'D_Excluded:'", "'D_InConfclict:'", "'S_Criteria:'", "'S_Nombre:'", "'S_Pourcentage:'", "'.'", "'C_Decision:'", "'C_Nombre:'", "'R_Total:'", "'R_Decision:'", "'R_Paper:'", "'R_Pourcentage:'", "'Resolved included'", "'Resolved excluded'", "'Pending conflicts'", "'Included'", "'Excluded'", "'In conflict'", "'In review'", "'Pending'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalReliSRSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReliSRSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReliSRSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReliSRS.g"; }



     	private ReliSRSGrammarAccess grammarAccess;

        public InternalReliSRSParser(TokenStream input, ReliSRSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ReliSRSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalReliSRS.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReliSRS.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalReliSRS.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalReliSRS.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ProjectName:' ( (lv_projectName_1_0= ruleProjectName ) ) (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) ) (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )* (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_projectName_1_0 = null;

        EObject lv_participants_3_0 = null;

        EObject lv_phase_5_0 = null;

        EObject lv_classification_7_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:78:2: ( (otherlv_0= 'ProjectName:' ( (lv_projectName_1_0= ruleProjectName ) ) (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) ) (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )* (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) ) ) )
            // InternalReliSRS.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_projectName_1_0= ruleProjectName ) ) (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) ) (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )* (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) ) )
            {
            // InternalReliSRS.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_projectName_1_0= ruleProjectName ) ) (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) ) (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )* (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) ) )
            // InternalReliSRS.g:80:3: otherlv_0= 'ProjectName:' ( (lv_projectName_1_0= ruleProjectName ) ) (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) ) (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )* (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getProjectNameKeyword_0());
            		
            // InternalReliSRS.g:84:3: ( (lv_projectName_1_0= ruleProjectName ) )
            // InternalReliSRS.g:85:4: (lv_projectName_1_0= ruleProjectName )
            {
            // InternalReliSRS.g:85:4: (lv_projectName_1_0= ruleProjectName )
            // InternalReliSRS.g:86:5: lv_projectName_1_0= ruleProjectName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProjectNameProjectNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_projectName_1_0=ruleProjectName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"projectName",
            						lv_projectName_1_0,
            						"org.xtext.slr.ReliSRS.ProjectName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReliSRS.g:103:3: (otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) ) )
            // InternalReliSRS.g:104:4: otherlv_2= 'Participants:' ( (lv_participants_3_0= ruleParticipants ) )
            {
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getParticipantsKeyword_2_0());
            			
            // InternalReliSRS.g:108:4: ( (lv_participants_3_0= ruleParticipants ) )
            // InternalReliSRS.g:109:5: (lv_participants_3_0= ruleParticipants )
            {
            // InternalReliSRS.g:109:5: (lv_participants_3_0= ruleParticipants )
            // InternalReliSRS.g:110:6: lv_participants_3_0= ruleParticipants
            {

            						newCompositeNode(grammarAccess.getModelAccess().getParticipantsParticipantsParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_participants_3_0=ruleParticipants();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getModelRule());
            						}
            						set(
            							current,
            							"participants",
            							lv_participants_3_0,
            							"org.xtext.slr.ReliSRS.Participants");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalReliSRS.g:128:3: (otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )* )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalReliSRS.g:129:4: otherlv_4= 'Phase:' ( (lv_phase_5_0= rulePhases ) )*
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPhaseKeyword_3_0());
            	    			
            	    // InternalReliSRS.g:133:4: ( (lv_phase_5_0= rulePhases ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==RULE_ID) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:134:5: (lv_phase_5_0= rulePhases )
            	    	    {
            	    	    // InternalReliSRS.g:134:5: (lv_phase_5_0= rulePhases )
            	    	    // InternalReliSRS.g:135:6: lv_phase_5_0= rulePhases
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getPhasePhasesParserRuleCall_3_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_phase_5_0=rulePhases();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"phase",
            	    	    							lv_phase_5_0,
            	    	    							"org.xtext.slr.ReliSRS.Phases");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalReliSRS.g:153:3: (otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) ) )
            // InternalReliSRS.g:154:4: otherlv_6= 'Classification:' ( (lv_classification_7_0= ruleClassification ) )
            {
            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getClassificationKeyword_4_0());
            			
            // InternalReliSRS.g:158:4: ( (lv_classification_7_0= ruleClassification ) )
            // InternalReliSRS.g:159:5: (lv_classification_7_0= ruleClassification )
            {
            // InternalReliSRS.g:159:5: (lv_classification_7_0= ruleClassification )
            // InternalReliSRS.g:160:6: lv_classification_7_0= ruleClassification
            {

            						newCompositeNode(grammarAccess.getModelAccess().getClassificationClassificationParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_classification_7_0=ruleClassification();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getModelRule());
            						}
            						set(
            							current,
            							"classification",
            							lv_classification_7_0,
            							"org.xtext.slr.ReliSRS.Classification");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProjectName"
    // InternalReliSRS.g:182:1: entryRuleProjectName returns [String current=null] : iv_ruleProjectName= ruleProjectName EOF ;
    public final String entryRuleProjectName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProjectName = null;


        try {
            // InternalReliSRS.g:182:51: (iv_ruleProjectName= ruleProjectName EOF )
            // InternalReliSRS.g:183:2: iv_ruleProjectName= ruleProjectName EOF
            {
             newCompositeNode(grammarAccess.getProjectNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectName=ruleProjectName();

            state._fsp--;

             current =iv_ruleProjectName.getText(); 
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
    // $ANTLR end "entryRuleProjectName"


    // $ANTLR start "ruleProjectName"
    // InternalReliSRS.g:189:1: ruleProjectName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleProjectName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:195:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:196:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getProjectNameAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleProjectName"


    // $ANTLR start "entryRuleParticipants"
    // InternalReliSRS.g:209:1: entryRuleParticipants returns [EObject current=null] : iv_ruleParticipants= ruleParticipants EOF ;
    public final EObject entryRuleParticipants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipants = null;


        try {
            // InternalReliSRS.g:209:53: (iv_ruleParticipants= ruleParticipants EOF )
            // InternalReliSRS.g:210:2: iv_ruleParticipants= ruleParticipants EOF
            {
             newCompositeNode(grammarAccess.getParticipantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipants=ruleParticipants();

            state._fsp--;

             current =iv_ruleParticipants; 
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
    // $ANTLR end "entryRuleParticipants"


    // $ANTLR start "ruleParticipants"
    // InternalReliSRS.g:216:1: ruleParticipants returns [EObject current=null] : ( () (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )* ) ;
    public final EObject ruleParticipants() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_participant_3_0 = null;

        AntlrDatatypeRuleToken lv_role_5_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:222:2: ( ( () (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )* ) )
            // InternalReliSRS.g:223:2: ( () (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )* )
            {
            // InternalReliSRS.g:223:2: ( () (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )* )
            // InternalReliSRS.g:224:3: () (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )*
            {
            // InternalReliSRS.g:224:3: ()
            // InternalReliSRS.g:225:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParticipantsAccess().getParticipantsAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:231:3: (otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalReliSRS.g:232:4: otherlv_1= '{' otherlv_2= 'Participant:' ( (lv_participant_3_0= ruleParticipant ) )* otherlv_4= 'Role:' ( (lv_role_5_0= ruleRole ) )* otherlv_6= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParticipantsAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParticipantsAccess().getParticipantKeyword_1_1());
            	    			
            	    // InternalReliSRS.g:240:4: ( (lv_participant_3_0= ruleParticipant ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:241:5: (lv_participant_3_0= ruleParticipant )
            	    	    {
            	    	    // InternalReliSRS.g:241:5: (lv_participant_3_0= ruleParticipant )
            	    	    // InternalReliSRS.g:242:6: lv_participant_3_0= ruleParticipant
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getParticipantsAccess().getParticipantParticipantParserRuleCall_1_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_participant_3_0=ruleParticipant();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getParticipantsRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"participant",
            	    	    							lv_participant_3_0,
            	    	    							"org.xtext.slr.ReliSRS.Participant");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParticipantsAccess().getRoleKeyword_1_3());
            	    			
            	    // InternalReliSRS.g:263:4: ( (lv_role_5_0= ruleRole ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:264:5: (lv_role_5_0= ruleRole )
            	    	    {
            	    	    // InternalReliSRS.g:264:5: (lv_role_5_0= ruleRole )
            	    	    // InternalReliSRS.g:265:6: lv_role_5_0= ruleRole
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getParticipantsAccess().getRoleRoleParserRuleCall_1_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_role_5_0=ruleRole();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getParticipantsRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"role",
            	    	    							lv_role_5_0,
            	    	    							"org.xtext.slr.ReliSRS.Role");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getParticipantsAccess().getRightCurlyBracketKeyword_1_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleParticipants"


    // $ANTLR start "entryRuleParticipant"
    // InternalReliSRS.g:291:1: entryRuleParticipant returns [String current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final String entryRuleParticipant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParticipant = null;


        try {
            // InternalReliSRS.g:291:51: (iv_ruleParticipant= ruleParticipant EOF )
            // InternalReliSRS.g:292:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant.getText(); 
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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // InternalReliSRS.g:298:1: ruleParticipant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleParticipant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:304:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:305:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getParticipantAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleRole"
    // InternalReliSRS.g:318:1: entryRuleRole returns [String current=null] : iv_ruleRole= ruleRole EOF ;
    public final String entryRuleRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRole = null;


        try {
            // InternalReliSRS.g:318:44: (iv_ruleRole= ruleRole EOF )
            // InternalReliSRS.g:319:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole.getText(); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalReliSRS.g:325:1: ruleRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:331:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:332:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getRoleAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleClassification"
    // InternalReliSRS.g:345:1: entryRuleClassification returns [EObject current=null] : iv_ruleClassification= ruleClassification EOF ;
    public final EObject entryRuleClassification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassification = null;


        try {
            // InternalReliSRS.g:345:55: (iv_ruleClassification= ruleClassification EOF )
            // InternalReliSRS.g:346:2: iv_ruleClassification= ruleClassification EOF
            {
             newCompositeNode(grammarAccess.getClassificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassification=ruleClassification();

            state._fsp--;

             current =iv_ruleClassification; 
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
    // $ANTLR end "entryRuleClassification"


    // $ANTLR start "ruleClassification"
    // InternalReliSRS.g:352:1: ruleClassification returns [EObject current=null] : ( () (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )* ) ;
    public final EObject ruleClassification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_question_3_0 = null;

        AntlrDatatypeRuleToken lv_response_6_0 = null;

        AntlrDatatypeRuleToken lv_resultat_8_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:358:2: ( ( () (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )* ) )
            // InternalReliSRS.g:359:2: ( () (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )* )
            {
            // InternalReliSRS.g:359:2: ( () (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )* )
            // InternalReliSRS.g:360:3: () (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )*
            {
            // InternalReliSRS.g:360:3: ()
            // InternalReliSRS.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassificationAccess().getClassificationAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:367:3: (otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalReliSRS.g:368:4: otherlv_1= '{' otherlv_2= 'question:' ( (lv_question_3_0= ruleQuestion ) ) (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )* otherlv_10= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getClassificationAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getClassificationAccess().getQuestionKeyword_1_1());
            	    			
            	    // InternalReliSRS.g:376:4: ( (lv_question_3_0= ruleQuestion ) )
            	    // InternalReliSRS.g:377:5: (lv_question_3_0= ruleQuestion )
            	    {
            	    // InternalReliSRS.g:377:5: (lv_question_3_0= ruleQuestion )
            	    // InternalReliSRS.g:378:6: lv_question_3_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getClassificationAccess().getQuestionQuestionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_question_3_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClassificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"question",
            	    							lv_question_3_0,
            	    							"org.xtext.slr.ReliSRS.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalReliSRS.g:395:4: (otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==15) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:396:5: otherlv_4= '{' otherlv_5= 'response:' ( (lv_response_6_0= ruleResponse ) ) otherlv_7= 'result:' ( (lv_resultat_8_0= ruleResultat ) ) otherlv_9= '}'
            	    	    {
            	    	    otherlv_4=(Token)match(input,15,FOLLOW_15); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getClassificationAccess().getLeftCurlyBracketKeyword_1_3_0());
            	    	    				
            	    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getClassificationAccess().getResponseKeyword_1_3_1());
            	    	    				
            	    	    // InternalReliSRS.g:404:5: ( (lv_response_6_0= ruleResponse ) )
            	    	    // InternalReliSRS.g:405:6: (lv_response_6_0= ruleResponse )
            	    	    {
            	    	    // InternalReliSRS.g:405:6: (lv_response_6_0= ruleResponse )
            	    	    // InternalReliSRS.g:406:7: lv_response_6_0= ruleResponse
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getClassificationAccess().getResponseResponseParserRuleCall_1_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_response_6_0=ruleResponse();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getClassificationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"response",
            	    	    								lv_response_6_0,
            	    	    								"org.xtext.slr.ReliSRS.Response");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    otherlv_7=(Token)match(input,21,FOLLOW_17); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getClassificationAccess().getResultKeyword_1_3_3());
            	    	    				
            	    	    // InternalReliSRS.g:427:5: ( (lv_resultat_8_0= ruleResultat ) )
            	    	    // InternalReliSRS.g:428:6: (lv_resultat_8_0= ruleResultat )
            	    	    {
            	    	    // InternalReliSRS.g:428:6: (lv_resultat_8_0= ruleResultat )
            	    	    // InternalReliSRS.g:429:7: lv_resultat_8_0= ruleResultat
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getClassificationAccess().getResultatResultatParserRuleCall_1_3_4_0());
            	    	    						
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_resultat_8_0=ruleResultat();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getClassificationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"resultat",
            	    	    								lv_resultat_8_0,
            	    	    								"org.xtext.slr.ReliSRS.Resultat");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }

            	    	    otherlv_9=(Token)match(input,18,FOLLOW_14); 

            	    	    					newLeafNode(otherlv_9, grammarAccess.getClassificationAccess().getRightCurlyBracketKeyword_1_3_5());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_10, grammarAccess.getClassificationAccess().getRightCurlyBracketKeyword_1_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleClassification"


    // $ANTLR start "entryRuleQuestion"
    // InternalReliSRS.g:460:1: entryRuleQuestion returns [String current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final String entryRuleQuestion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuestion = null;


        try {
            // InternalReliSRS.g:460:48: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalReliSRS.g:461:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion.getText(); 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalReliSRS.g:467:1: ruleQuestion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleQuestion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:473:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:474:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getQuestionAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleResponse"
    // InternalReliSRS.g:487:1: entryRuleResponse returns [String current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final String entryRuleResponse() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResponse = null;


        try {
            // InternalReliSRS.g:487:48: (iv_ruleResponse= ruleResponse EOF )
            // InternalReliSRS.g:488:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse.getText(); 
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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalReliSRS.g:494:1: ruleResponse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleResponse() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:500:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:501:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getResponseAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleResultat"
    // InternalReliSRS.g:514:1: entryRuleResultat returns [String current=null] : iv_ruleResultat= ruleResultat EOF ;
    public final String entryRuleResultat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResultat = null;


        try {
            // InternalReliSRS.g:514:48: (iv_ruleResultat= ruleResultat EOF )
            // InternalReliSRS.g:515:2: iv_ruleResultat= ruleResultat EOF
            {
             newCompositeNode(grammarAccess.getResultatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultat=ruleResultat();

            state._fsp--;

             current =iv_ruleResultat.getText(); 
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
    // $ANTLR end "entryRuleResultat"


    // $ANTLR start "ruleResultat"
    // InternalReliSRS.g:521:1: ruleResultat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleResultat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:527:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:528:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getResultatAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleResultat"


    // $ANTLR start "entryRulePhases"
    // InternalReliSRS.g:541:1: entryRulePhases returns [EObject current=null] : iv_rulePhases= rulePhases EOF ;
    public final EObject entryRulePhases() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhases = null;


        try {
            // InternalReliSRS.g:541:47: (iv_rulePhases= rulePhases EOF )
            // InternalReliSRS.g:542:2: iv_rulePhases= rulePhases EOF
            {
             newCompositeNode(grammarAccess.getPhasesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhases=rulePhases();

            state._fsp--;

             current =iv_rulePhases; 
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
    // $ANTLR end "entryRulePhases"


    // $ANTLR start "rulePhases"
    // InternalReliSRS.g:548:1: rulePhases returns [EObject current=null] : ( () ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) ) ) ;
    public final EObject rulePhases() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_phaseName_1_0 = null;

        EObject lv_decisionPerUser_4_0 = null;

        EObject lv_statisticsOnExclusionCriteria_6_0 = null;

        EObject lv_conflictResolution_8_0 = null;

        EObject lv_result_10_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:554:2: ( ( () ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) ) ) )
            // InternalReliSRS.g:555:2: ( () ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) ) )
            {
            // InternalReliSRS.g:555:2: ( () ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) ) )
            // InternalReliSRS.g:556:3: () ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) )
            {
            // InternalReliSRS.g:556:3: ()
            // InternalReliSRS.g:557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhasesAccess().getPhasesAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:563:3: ( ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' ) )
            // InternalReliSRS.g:564:4: ( (lv_phaseName_1_0= rulePhaseName ) ) (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' )
            {
            // InternalReliSRS.g:564:4: ( (lv_phaseName_1_0= rulePhaseName ) )
            // InternalReliSRS.g:565:5: (lv_phaseName_1_0= rulePhaseName )
            {
            // InternalReliSRS.g:565:5: (lv_phaseName_1_0= rulePhaseName )
            // InternalReliSRS.g:566:6: lv_phaseName_1_0= rulePhaseName
            {

            						newCompositeNode(grammarAccess.getPhasesAccess().getPhaseNamePhaseNameParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_phaseName_1_0=rulePhaseName();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPhasesRule());
            						}
            						set(
            							current,
            							"phaseName",
            							lv_phaseName_1_0,
            							"org.xtext.slr.ReliSRS.PhaseName");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalReliSRS.g:583:4: (otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}' )
            // InternalReliSRS.g:584:5: otherlv_2= '{' (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) ) (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) ) (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) ) (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) ) otherlv_11= '}'
            {
            otherlv_2=(Token)match(input,15,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getPhasesAccess().getLeftCurlyBracketKeyword_1_1_0());
            				
            // InternalReliSRS.g:588:5: (otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) ) )
            // InternalReliSRS.g:589:6: otherlv_3= 'DecisionPerUser:' ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_20); 

            						newLeafNode(otherlv_3, grammarAccess.getPhasesAccess().getDecisionPerUserKeyword_1_1_1_0());
            					
            // InternalReliSRS.g:593:6: ( (lv_decisionPerUser_4_0= ruleDecisionPerUser ) )
            // InternalReliSRS.g:594:7: (lv_decisionPerUser_4_0= ruleDecisionPerUser )
            {
            // InternalReliSRS.g:594:7: (lv_decisionPerUser_4_0= ruleDecisionPerUser )
            // InternalReliSRS.g:595:8: lv_decisionPerUser_4_0= ruleDecisionPerUser
            {

            								newCompositeNode(grammarAccess.getPhasesAccess().getDecisionPerUserDecisionPerUserParserRuleCall_1_1_1_1_0());
            							
            pushFollow(FOLLOW_21);
            lv_decisionPerUser_4_0=ruleDecisionPerUser();

            state._fsp--;


            								if (current==null) {
            									current = createModelElementForParent(grammarAccess.getPhasesRule());
            								}
            								set(
            									current,
            									"decisionPerUser",
            									lv_decisionPerUser_4_0,
            									"org.xtext.slr.ReliSRS.DecisionPerUser");
            								afterParserOrEnumRuleCall();
            							

            }


            }


            }

            // InternalReliSRS.g:613:5: (otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) ) )
            // InternalReliSRS.g:614:6: otherlv_5= 'StatisticsOnExclusionCriteria:' ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) )
            {
            otherlv_5=(Token)match(input,23,FOLLOW_22); 

            						newLeafNode(otherlv_5, grammarAccess.getPhasesAccess().getStatisticsOnExclusionCriteriaKeyword_1_1_2_0());
            					
            // InternalReliSRS.g:618:6: ( (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria ) )
            // InternalReliSRS.g:619:7: (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria )
            {
            // InternalReliSRS.g:619:7: (lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria )
            // InternalReliSRS.g:620:8: lv_statisticsOnExclusionCriteria_6_0= ruleStatisticsOnExclusionCriteria
            {

            								newCompositeNode(grammarAccess.getPhasesAccess().getStatisticsOnExclusionCriteriaStatisticsOnExclusionCriteriaParserRuleCall_1_1_2_1_0());
            							
            pushFollow(FOLLOW_23);
            lv_statisticsOnExclusionCriteria_6_0=ruleStatisticsOnExclusionCriteria();

            state._fsp--;


            								if (current==null) {
            									current = createModelElementForParent(grammarAccess.getPhasesRule());
            								}
            								set(
            									current,
            									"statisticsOnExclusionCriteria",
            									lv_statisticsOnExclusionCriteria_6_0,
            									"org.xtext.slr.ReliSRS.StatisticsOnExclusionCriteria");
            								afterParserOrEnumRuleCall();
            							

            }


            }


            }

            // InternalReliSRS.g:638:5: (otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) ) )
            // InternalReliSRS.g:639:6: otherlv_7= 'ConflictResolution:' ( (lv_conflictResolution_8_0= ruleConflictResolution ) )
            {
            otherlv_7=(Token)match(input,24,FOLLOW_24); 

            						newLeafNode(otherlv_7, grammarAccess.getPhasesAccess().getConflictResolutionKeyword_1_1_3_0());
            					
            // InternalReliSRS.g:643:6: ( (lv_conflictResolution_8_0= ruleConflictResolution ) )
            // InternalReliSRS.g:644:7: (lv_conflictResolution_8_0= ruleConflictResolution )
            {
            // InternalReliSRS.g:644:7: (lv_conflictResolution_8_0= ruleConflictResolution )
            // InternalReliSRS.g:645:8: lv_conflictResolution_8_0= ruleConflictResolution
            {

            								newCompositeNode(grammarAccess.getPhasesAccess().getConflictResolutionConflictResolutionParserRuleCall_1_1_3_1_0());
            							
            pushFollow(FOLLOW_25);
            lv_conflictResolution_8_0=ruleConflictResolution();

            state._fsp--;


            								if (current==null) {
            									current = createModelElementForParent(grammarAccess.getPhasesRule());
            								}
            								set(
            									current,
            									"conflictResolution",
            									lv_conflictResolution_8_0,
            									"org.xtext.slr.ReliSRS.ConflictResolution");
            								afterParserOrEnumRuleCall();
            							

            }


            }


            }

            // InternalReliSRS.g:663:5: (otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) ) )
            // InternalReliSRS.g:664:6: otherlv_9= 'Result:' ( (lv_result_10_0= ruleResult ) )
            {
            otherlv_9=(Token)match(input,25,FOLLOW_26); 

            						newLeafNode(otherlv_9, grammarAccess.getPhasesAccess().getResultKeyword_1_1_4_0());
            					
            // InternalReliSRS.g:668:6: ( (lv_result_10_0= ruleResult ) )
            // InternalReliSRS.g:669:7: (lv_result_10_0= ruleResult )
            {
            // InternalReliSRS.g:669:7: (lv_result_10_0= ruleResult )
            // InternalReliSRS.g:670:8: lv_result_10_0= ruleResult
            {

            								newCompositeNode(grammarAccess.getPhasesAccess().getResultResultParserRuleCall_1_1_4_1_0());
            							
            pushFollow(FOLLOW_18);
            lv_result_10_0=ruleResult();

            state._fsp--;


            								if (current==null) {
            									current = createModelElementForParent(grammarAccess.getPhasesRule());
            								}
            								set(
            									current,
            									"result",
            									lv_result_10_0,
            									"org.xtext.slr.ReliSRS.Result");
            								afterParserOrEnumRuleCall();
            							

            }


            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            					newLeafNode(otherlv_11, grammarAccess.getPhasesAccess().getRightCurlyBracketKeyword_1_1_5());
            				

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
    // $ANTLR end "rulePhases"


    // $ANTLR start "entryRulePhaseName"
    // InternalReliSRS.g:698:1: entryRulePhaseName returns [String current=null] : iv_rulePhaseName= rulePhaseName EOF ;
    public final String entryRulePhaseName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhaseName = null;


        try {
            // InternalReliSRS.g:698:49: (iv_rulePhaseName= rulePhaseName EOF )
            // InternalReliSRS.g:699:2: iv_rulePhaseName= rulePhaseName EOF
            {
             newCompositeNode(grammarAccess.getPhaseNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhaseName=rulePhaseName();

            state._fsp--;

             current =iv_rulePhaseName.getText(); 
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
    // $ANTLR end "entryRulePhaseName"


    // $ANTLR start "rulePhaseName"
    // InternalReliSRS.g:705:1: rulePhaseName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken rulePhaseName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:711:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:712:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getPhaseNameAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "rulePhaseName"


    // $ANTLR start "entryRuleDecisionPerUser"
    // InternalReliSRS.g:725:1: entryRuleDecisionPerUser returns [EObject current=null] : iv_ruleDecisionPerUser= ruleDecisionPerUser EOF ;
    public final EObject entryRuleDecisionPerUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionPerUser = null;


        try {
            // InternalReliSRS.g:725:56: (iv_ruleDecisionPerUser= ruleDecisionPerUser EOF )
            // InternalReliSRS.g:726:2: iv_ruleDecisionPerUser= ruleDecisionPerUser EOF
            {
             newCompositeNode(grammarAccess.getDecisionPerUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionPerUser=ruleDecisionPerUser();

            state._fsp--;

             current =iv_ruleDecisionPerUser; 
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
    // $ANTLR end "entryRuleDecisionPerUser"


    // $ANTLR start "ruleDecisionPerUser"
    // InternalReliSRS.g:732:1: ruleDecisionPerUser returns [EObject current=null] : ( () (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )* ) ;
    public final EObject ruleDecisionPerUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_dUser_3_0 = null;

        AntlrDatatypeRuleToken lv_dIncluded_5_0 = null;

        AntlrDatatypeRuleToken lv_dExcluded_7_0 = null;

        AntlrDatatypeRuleToken lv_dInConflict_9_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:738:2: ( ( () (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )* ) )
            // InternalReliSRS.g:739:2: ( () (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )* )
            {
            // InternalReliSRS.g:739:2: ( () (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )* )
            // InternalReliSRS.g:740:3: () (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )*
            {
            // InternalReliSRS.g:740:3: ()
            // InternalReliSRS.g:741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionPerUserAccess().getDecisionPerUserAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:747:3: (otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReliSRS.g:748:4: otherlv_1= '{' otherlv_2= 'D_User:' ( (lv_dUser_3_0= ruleDUser ) )* otherlv_4= 'D_Included:' ( (lv_dIncluded_5_0= ruleDIncluded ) )* otherlv_6= 'D_Excluded:' ( (lv_dExcluded_7_0= ruleDExcluded ) )* otherlv_8= 'D_InConfclict:' ( (lv_dInConflict_9_0= ruleDInConflict ) )* otherlv_10= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDecisionPerUserAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,26,FOLLOW_28); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDecisionPerUserAccess().getD_UserKeyword_1_1());
            	    			
            	    // InternalReliSRS.g:756:4: ( (lv_dUser_3_0= ruleDUser ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:757:5: (lv_dUser_3_0= ruleDUser )
            	    	    {
            	    	    // InternalReliSRS.g:757:5: (lv_dUser_3_0= ruleDUser )
            	    	    // InternalReliSRS.g:758:6: lv_dUser_3_0= ruleDUser
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDecisionPerUserAccess().getDUserDUserParserRuleCall_1_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_28);
            	    	    lv_dUser_3_0=ruleDUser();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDecisionPerUserRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"dUser",
            	    	    							lv_dUser_3_0,
            	    	    							"org.xtext.slr.ReliSRS.DUser");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,27,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDecisionPerUserAccess().getD_IncludedKeyword_1_3());
            	    			
            	    // InternalReliSRS.g:779:4: ( (lv_dIncluded_5_0= ruleDIncluded ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_INT) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:780:5: (lv_dIncluded_5_0= ruleDIncluded )
            	    	    {
            	    	    // InternalReliSRS.g:780:5: (lv_dIncluded_5_0= ruleDIncluded )
            	    	    // InternalReliSRS.g:781:6: lv_dIncluded_5_0= ruleDIncluded
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDecisionPerUserAccess().getDIncludedDIncludedParserRuleCall_1_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_dIncluded_5_0=ruleDIncluded();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDecisionPerUserRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"dIncluded",
            	    	    							lv_dIncluded_5_0,
            	    	    							"org.xtext.slr.ReliSRS.DIncluded");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,28,FOLLOW_30); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDecisionPerUserAccess().getD_ExcludedKeyword_1_5());
            	    			
            	    // InternalReliSRS.g:802:4: ( (lv_dExcluded_7_0= ruleDExcluded ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_INT) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:803:5: (lv_dExcluded_7_0= ruleDExcluded )
            	    	    {
            	    	    // InternalReliSRS.g:803:5: (lv_dExcluded_7_0= ruleDExcluded )
            	    	    // InternalReliSRS.g:804:6: lv_dExcluded_7_0= ruleDExcluded
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDecisionPerUserAccess().getDExcludedDExcludedParserRuleCall_1_6_0());
            	    	    					
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_dExcluded_7_0=ruleDExcluded();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDecisionPerUserRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"dExcluded",
            	    	    							lv_dExcluded_7_0,
            	    	    							"org.xtext.slr.ReliSRS.DExcluded");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,29,FOLLOW_31); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDecisionPerUserAccess().getD_InConfclictKeyword_1_7());
            	    			
            	    // InternalReliSRS.g:825:4: ( (lv_dInConflict_9_0= ruleDInConflict ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_INT) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:826:5: (lv_dInConflict_9_0= ruleDInConflict )
            	    	    {
            	    	    // InternalReliSRS.g:826:5: (lv_dInConflict_9_0= ruleDInConflict )
            	    	    // InternalReliSRS.g:827:6: lv_dInConflict_9_0= ruleDInConflict
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDecisionPerUserAccess().getDInConflictDInConflictParserRuleCall_1_8_0());
            	    	    					
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_dInConflict_9_0=ruleDInConflict();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDecisionPerUserRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"dInConflict",
            	    	    							lv_dInConflict_9_0,
            	    	    							"org.xtext.slr.ReliSRS.DInConflict");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_10, grammarAccess.getDecisionPerUserAccess().getRightCurlyBracketKeyword_1_9());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleDecisionPerUser"


    // $ANTLR start "entryRuleDUser"
    // InternalReliSRS.g:853:1: entryRuleDUser returns [String current=null] : iv_ruleDUser= ruleDUser EOF ;
    public final String entryRuleDUser() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDUser = null;


        try {
            // InternalReliSRS.g:853:45: (iv_ruleDUser= ruleDUser EOF )
            // InternalReliSRS.g:854:2: iv_ruleDUser= ruleDUser EOF
            {
             newCompositeNode(grammarAccess.getDUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDUser=ruleDUser();

            state._fsp--;

             current =iv_ruleDUser.getText(); 
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
    // $ANTLR end "entryRuleDUser"


    // $ANTLR start "ruleDUser"
    // InternalReliSRS.g:860:1: ruleDUser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleDUser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:866:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:867:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getDUserAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDUser"


    // $ANTLR start "entryRuleDIncluded"
    // InternalReliSRS.g:880:1: entryRuleDIncluded returns [String current=null] : iv_ruleDIncluded= ruleDIncluded EOF ;
    public final String entryRuleDIncluded() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIncluded = null;


        try {
            // InternalReliSRS.g:880:49: (iv_ruleDIncluded= ruleDIncluded EOF )
            // InternalReliSRS.g:881:2: iv_ruleDIncluded= ruleDIncluded EOF
            {
             newCompositeNode(grammarAccess.getDIncludedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDIncluded=ruleDIncluded();

            state._fsp--;

             current =iv_ruleDIncluded.getText(); 
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
    // $ANTLR end "entryRuleDIncluded"


    // $ANTLR start "ruleDIncluded"
    // InternalReliSRS.g:887:1: ruleDIncluded returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleDIncluded() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:893:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:894:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getDIncludedAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDIncluded"


    // $ANTLR start "entryRuleDExcluded"
    // InternalReliSRS.g:907:1: entryRuleDExcluded returns [String current=null] : iv_ruleDExcluded= ruleDExcluded EOF ;
    public final String entryRuleDExcluded() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDExcluded = null;


        try {
            // InternalReliSRS.g:907:49: (iv_ruleDExcluded= ruleDExcluded EOF )
            // InternalReliSRS.g:908:2: iv_ruleDExcluded= ruleDExcluded EOF
            {
             newCompositeNode(grammarAccess.getDExcludedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDExcluded=ruleDExcluded();

            state._fsp--;

             current =iv_ruleDExcluded.getText(); 
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
    // $ANTLR end "entryRuleDExcluded"


    // $ANTLR start "ruleDExcluded"
    // InternalReliSRS.g:914:1: ruleDExcluded returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleDExcluded() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:920:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:921:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getDExcludedAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDExcluded"


    // $ANTLR start "entryRuleDInConflict"
    // InternalReliSRS.g:934:1: entryRuleDInConflict returns [String current=null] : iv_ruleDInConflict= ruleDInConflict EOF ;
    public final String entryRuleDInConflict() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDInConflict = null;


        try {
            // InternalReliSRS.g:934:51: (iv_ruleDInConflict= ruleDInConflict EOF )
            // InternalReliSRS.g:935:2: iv_ruleDInConflict= ruleDInConflict EOF
            {
             newCompositeNode(grammarAccess.getDInConflictRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDInConflict=ruleDInConflict();

            state._fsp--;

             current =iv_ruleDInConflict.getText(); 
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
    // $ANTLR end "entryRuleDInConflict"


    // $ANTLR start "ruleDInConflict"
    // InternalReliSRS.g:941:1: ruleDInConflict returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleDInConflict() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:947:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:948:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getDInConflictAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleDInConflict"


    // $ANTLR start "entryRuleStatisticsOnExclusionCriteria"
    // InternalReliSRS.g:961:1: entryRuleStatisticsOnExclusionCriteria returns [EObject current=null] : iv_ruleStatisticsOnExclusionCriteria= ruleStatisticsOnExclusionCriteria EOF ;
    public final EObject entryRuleStatisticsOnExclusionCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticsOnExclusionCriteria = null;


        try {
            // InternalReliSRS.g:961:70: (iv_ruleStatisticsOnExclusionCriteria= ruleStatisticsOnExclusionCriteria EOF )
            // InternalReliSRS.g:962:2: iv_ruleStatisticsOnExclusionCriteria= ruleStatisticsOnExclusionCriteria EOF
            {
             newCompositeNode(grammarAccess.getStatisticsOnExclusionCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatisticsOnExclusionCriteria=ruleStatisticsOnExclusionCriteria();

            state._fsp--;

             current =iv_ruleStatisticsOnExclusionCriteria; 
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
    // $ANTLR end "entryRuleStatisticsOnExclusionCriteria"


    // $ANTLR start "ruleStatisticsOnExclusionCriteria"
    // InternalReliSRS.g:968:1: ruleStatisticsOnExclusionCriteria returns [EObject current=null] : ( () (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )* ) ;
    public final EObject ruleStatisticsOnExclusionCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_sCriteria_3_0 = null;

        AntlrDatatypeRuleToken lv_sNombre_5_0 = null;

        AntlrDatatypeRuleToken lv_sPourcentage_7_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:974:2: ( ( () (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )* ) )
            // InternalReliSRS.g:975:2: ( () (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )* )
            {
            // InternalReliSRS.g:975:2: ( () (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )* )
            // InternalReliSRS.g:976:3: () (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )*
            {
            // InternalReliSRS.g:976:3: ()
            // InternalReliSRS.g:977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatisticsOnExclusionCriteriaAccess().getStatisticsOnExclusionCriteriaAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:983:3: (otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalReliSRS.g:984:4: otherlv_1= '{' otherlv_2= 'S_Criteria:' ( (lv_sCriteria_3_0= ruleSCriteria ) )* otherlv_4= 'S_Nombre:' ( (lv_sNombre_5_0= ruleSNombre ) )* otherlv_6= 'S_Pourcentage:' ( (lv_sPourcentage_7_0= ruleSPourcentage ) )* otherlv_8= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_32); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatisticsOnExclusionCriteriaAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,30,FOLLOW_33); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStatisticsOnExclusionCriteriaAccess().getS_CriteriaKeyword_1_1());
            	    			
            	    // InternalReliSRS.g:992:4: ( (lv_sCriteria_3_0= ruleSCriteria ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==RULE_ID) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:993:5: (lv_sCriteria_3_0= ruleSCriteria )
            	    	    {
            	    	    // InternalReliSRS.g:993:5: (lv_sCriteria_3_0= ruleSCriteria )
            	    	    // InternalReliSRS.g:994:6: lv_sCriteria_3_0= ruleSCriteria
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getStatisticsOnExclusionCriteriaAccess().getSCriteriaSCriteriaParserRuleCall_1_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_33);
            	    	    lv_sCriteria_3_0=ruleSCriteria();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getStatisticsOnExclusionCriteriaRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"sCriteria",
            	    	    							lv_sCriteria_3_0,
            	    	    							"org.xtext.slr.ReliSRS.SCriteria");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,31,FOLLOW_34); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStatisticsOnExclusionCriteriaAccess().getS_NombreKeyword_1_3());
            	    			
            	    // InternalReliSRS.g:1015:4: ( (lv_sNombre_5_0= ruleSNombre ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_INT) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1016:5: (lv_sNombre_5_0= ruleSNombre )
            	    	    {
            	    	    // InternalReliSRS.g:1016:5: (lv_sNombre_5_0= ruleSNombre )
            	    	    // InternalReliSRS.g:1017:6: lv_sNombre_5_0= ruleSNombre
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getStatisticsOnExclusionCriteriaAccess().getSNombreSNombreParserRuleCall_1_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_34);
            	    	    lv_sNombre_5_0=ruleSNombre();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getStatisticsOnExclusionCriteriaRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"sNombre",
            	    	    							lv_sNombre_5_0,
            	    	    							"org.xtext.slr.ReliSRS.SNombre");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,32,FOLLOW_35); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStatisticsOnExclusionCriteriaAccess().getS_PourcentageKeyword_1_5());
            	    			
            	    // InternalReliSRS.g:1038:4: ( (lv_sPourcentage_7_0= ruleSPourcentage ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_INT||LA15_0==33) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1039:5: (lv_sPourcentage_7_0= ruleSPourcentage )
            	    	    {
            	    	    // InternalReliSRS.g:1039:5: (lv_sPourcentage_7_0= ruleSPourcentage )
            	    	    // InternalReliSRS.g:1040:6: lv_sPourcentage_7_0= ruleSPourcentage
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getStatisticsOnExclusionCriteriaAccess().getSPourcentageSPourcentageParserRuleCall_1_6_0());
            	    	    					
            	    	    pushFollow(FOLLOW_35);
            	    	    lv_sPourcentage_7_0=ruleSPourcentage();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getStatisticsOnExclusionCriteriaRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"sPourcentage",
            	    	    							lv_sPourcentage_7_0,
            	    	    							"org.xtext.slr.ReliSRS.SPourcentage");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_8, grammarAccess.getStatisticsOnExclusionCriteriaAccess().getRightCurlyBracketKeyword_1_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleStatisticsOnExclusionCriteria"


    // $ANTLR start "entryRuleSCriteria"
    // InternalReliSRS.g:1066:1: entryRuleSCriteria returns [String current=null] : iv_ruleSCriteria= ruleSCriteria EOF ;
    public final String entryRuleSCriteria() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCriteria = null;


        try {
            // InternalReliSRS.g:1066:49: (iv_ruleSCriteria= ruleSCriteria EOF )
            // InternalReliSRS.g:1067:2: iv_ruleSCriteria= ruleSCriteria EOF
            {
             newCompositeNode(grammarAccess.getSCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCriteria=ruleSCriteria();

            state._fsp--;

             current =iv_ruleSCriteria.getText(); 
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
    // $ANTLR end "entryRuleSCriteria"


    // $ANTLR start "ruleSCriteria"
    // InternalReliSRS.g:1073:1: ruleSCriteria returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_CHAINE_0= ruleCHAINE ;
    public final AntlrDatatypeRuleToken ruleSCriteria() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHAINE_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1079:2: (this_CHAINE_0= ruleCHAINE )
            // InternalReliSRS.g:1080:2: this_CHAINE_0= ruleCHAINE
            {

            		newCompositeNode(grammarAccess.getSCriteriaAccess().getCHAINEParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_CHAINE_0=ruleCHAINE();

            state._fsp--;


            		current.merge(this_CHAINE_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleSCriteria"


    // $ANTLR start "entryRuleSNombre"
    // InternalReliSRS.g:1093:1: entryRuleSNombre returns [String current=null] : iv_ruleSNombre= ruleSNombre EOF ;
    public final String entryRuleSNombre() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSNombre = null;


        try {
            // InternalReliSRS.g:1093:47: (iv_ruleSNombre= ruleSNombre EOF )
            // InternalReliSRS.g:1094:2: iv_ruleSNombre= ruleSNombre EOF
            {
             newCompositeNode(grammarAccess.getSNombreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSNombre=ruleSNombre();

            state._fsp--;

             current =iv_ruleSNombre.getText(); 
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
    // $ANTLR end "entryRuleSNombre"


    // $ANTLR start "ruleSNombre"
    // InternalReliSRS.g:1100:1: ruleSNombre returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleSNombre() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1106:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:1107:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getSNombreAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleSNombre"


    // $ANTLR start "entryRuleSPourcentage"
    // InternalReliSRS.g:1120:1: entryRuleSPourcentage returns [String current=null] : iv_ruleSPourcentage= ruleSPourcentage EOF ;
    public final String entryRuleSPourcentage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSPourcentage = null;


        try {
            // InternalReliSRS.g:1120:52: (iv_ruleSPourcentage= ruleSPourcentage EOF )
            // InternalReliSRS.g:1121:2: iv_ruleSPourcentage= ruleSPourcentage EOF
            {
             newCompositeNode(grammarAccess.getSPourcentageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSPourcentage=ruleSPourcentage();

            state._fsp--;

             current =iv_ruleSPourcentage.getText(); 
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
    // $ANTLR end "entryRuleSPourcentage"


    // $ANTLR start "ruleSPourcentage"
    // InternalReliSRS.g:1127:1: ruleSPourcentage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleSPourcentage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1133:2: ( ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* ) )
            // InternalReliSRS.g:1134:2: ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* )
            {
            // InternalReliSRS.g:1134:2: ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* )
            // InternalReliSRS.g:1135:3: (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )*
            {
            // InternalReliSRS.g:1135:3: (this_INT_0= RULE_INT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReliSRS.g:1136:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getSPourcentageAccess().getINTTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_37); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSPourcentageAccess().getFullStopKeyword_1());
            		
            // InternalReliSRS.g:1149:3: (this_INT_2= RULE_INT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalReliSRS.g:1150:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getSPourcentageAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleSPourcentage"


    // $ANTLR start "entryRuleConflictResolution"
    // InternalReliSRS.g:1162:1: entryRuleConflictResolution returns [EObject current=null] : iv_ruleConflictResolution= ruleConflictResolution EOF ;
    public final EObject entryRuleConflictResolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictResolution = null;


        try {
            // InternalReliSRS.g:1162:59: (iv_ruleConflictResolution= ruleConflictResolution EOF )
            // InternalReliSRS.g:1163:2: iv_ruleConflictResolution= ruleConflictResolution EOF
            {
             newCompositeNode(grammarAccess.getConflictResolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConflictResolution=ruleConflictResolution();

            state._fsp--;

             current =iv_ruleConflictResolution; 
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
    // $ANTLR end "entryRuleConflictResolution"


    // $ANTLR start "ruleConflictResolution"
    // InternalReliSRS.g:1169:1: ruleConflictResolution returns [EObject current=null] : ( () (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )* ) ;
    public final EObject ruleConflictResolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_cDecision_3_0 = null;

        AntlrDatatypeRuleToken lv_cNombre_5_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1175:2: ( ( () (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )* ) )
            // InternalReliSRS.g:1176:2: ( () (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )* )
            {
            // InternalReliSRS.g:1176:2: ( () (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )* )
            // InternalReliSRS.g:1177:3: () (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )*
            {
            // InternalReliSRS.g:1177:3: ()
            // InternalReliSRS.g:1178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConflictResolutionAccess().getConflictResolutionAction_0(),
            					current);
            			

            }

            // InternalReliSRS.g:1184:3: (otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReliSRS.g:1185:4: otherlv_1= '{' otherlv_2= 'C_Decision:' ( (lv_cDecision_3_0= ruleCDecision ) )* otherlv_4= 'C_Nombre:' ( (lv_cNombre_5_0= ruleCNombre ) )* otherlv_6= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_38); 

            	    				newLeafNode(otherlv_1, grammarAccess.getConflictResolutionAccess().getLeftCurlyBracketKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,34,FOLLOW_39); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConflictResolutionAccess().getC_DecisionKeyword_1_1());
            	    			
            	    // InternalReliSRS.g:1193:4: ( (lv_cDecision_3_0= ruleCDecision ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( ((LA19_0>=40 && LA19_0<=42)) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1194:5: (lv_cDecision_3_0= ruleCDecision )
            	    	    {
            	    	    // InternalReliSRS.g:1194:5: (lv_cDecision_3_0= ruleCDecision )
            	    	    // InternalReliSRS.g:1195:6: lv_cDecision_3_0= ruleCDecision
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getConflictResolutionAccess().getCDecisionCDecisionEnumRuleCall_1_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_39);
            	    	    lv_cDecision_3_0=ruleCDecision();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getConflictResolutionRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"cDecision",
            	    	    							lv_cDecision_3_0,
            	    	    							"org.xtext.slr.ReliSRS.CDecision");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,35,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConflictResolutionAccess().getC_NombreKeyword_1_3());
            	    			
            	    // InternalReliSRS.g:1216:4: ( (lv_cNombre_5_0= ruleCNombre ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==RULE_INT) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1217:5: (lv_cNombre_5_0= ruleCNombre )
            	    	    {
            	    	    // InternalReliSRS.g:1217:5: (lv_cNombre_5_0= ruleCNombre )
            	    	    // InternalReliSRS.g:1218:6: lv_cNombre_5_0= ruleCNombre
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getConflictResolutionAccess().getCNombreCNombreParserRuleCall_1_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_cNombre_5_0=ruleCNombre();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getConflictResolutionRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"cNombre",
            	    	    							lv_cNombre_5_0,
            	    	    							"org.xtext.slr.ReliSRS.CNombre");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConflictResolutionAccess().getRightCurlyBracketKeyword_1_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleConflictResolution"


    // $ANTLR start "entryRuleCNombre"
    // InternalReliSRS.g:1244:1: entryRuleCNombre returns [String current=null] : iv_ruleCNombre= ruleCNombre EOF ;
    public final String entryRuleCNombre() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCNombre = null;


        try {
            // InternalReliSRS.g:1244:47: (iv_ruleCNombre= ruleCNombre EOF )
            // InternalReliSRS.g:1245:2: iv_ruleCNombre= ruleCNombre EOF
            {
             newCompositeNode(grammarAccess.getCNombreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCNombre=ruleCNombre();

            state._fsp--;

             current =iv_ruleCNombre.getText(); 
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
    // $ANTLR end "entryRuleCNombre"


    // $ANTLR start "ruleCNombre"
    // InternalReliSRS.g:1251:1: ruleCNombre returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleCNombre() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1257:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:1258:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getCNombreAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCNombre"


    // $ANTLR start "entryRuleResult"
    // InternalReliSRS.g:1271:1: entryRuleResult returns [EObject current=null] : iv_ruleResult= ruleResult EOF ;
    public final EObject entryRuleResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResult = null;


        try {
            // InternalReliSRS.g:1271:47: (iv_ruleResult= ruleResult EOF )
            // InternalReliSRS.g:1272:2: iv_ruleResult= ruleResult EOF
            {
             newCompositeNode(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;

             current =iv_ruleResult; 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalReliSRS.g:1278:1: ruleResult returns [EObject current=null] : ( () otherlv_1= 'R_Total:' ( (lv_rTotal_2_0= ruleRTotal ) ) (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )* ) ;
    public final EObject ruleResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_rTotal_2_0 = null;

        Enumerator lv_rDecision_5_0 = null;

        AntlrDatatypeRuleToken lv_rPaper_7_0 = null;

        AntlrDatatypeRuleToken lv_rPourcentage_9_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1284:2: ( ( () otherlv_1= 'R_Total:' ( (lv_rTotal_2_0= ruleRTotal ) ) (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )* ) )
            // InternalReliSRS.g:1285:2: ( () otherlv_1= 'R_Total:' ( (lv_rTotal_2_0= ruleRTotal ) ) (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )* )
            {
            // InternalReliSRS.g:1285:2: ( () otherlv_1= 'R_Total:' ( (lv_rTotal_2_0= ruleRTotal ) ) (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )* )
            // InternalReliSRS.g:1286:3: () otherlv_1= 'R_Total:' ( (lv_rTotal_2_0= ruleRTotal ) ) (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )*
            {
            // InternalReliSRS.g:1286:3: ()
            // InternalReliSRS.g:1287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResultAccess().getResultAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getResultAccess().getR_TotalKeyword_1());
            		
            // InternalReliSRS.g:1297:3: ( (lv_rTotal_2_0= ruleRTotal ) )
            // InternalReliSRS.g:1298:4: (lv_rTotal_2_0= ruleRTotal )
            {
            // InternalReliSRS.g:1298:4: (lv_rTotal_2_0= ruleRTotal )
            // InternalReliSRS.g:1299:5: lv_rTotal_2_0= ruleRTotal
            {

            					newCompositeNode(grammarAccess.getResultAccess().getRTotalRTotalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_rTotal_2_0=ruleRTotal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultRule());
            					}
            					set(
            						current,
            						"rTotal",
            						lv_rTotal_2_0,
            						"org.xtext.slr.ReliSRS.RTotal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReliSRS.g:1316:3: (otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalReliSRS.g:1317:4: otherlv_3= '{' otherlv_4= 'R_Decision:' ( (lv_rDecision_5_0= ruleRDecision ) )* otherlv_6= 'R_Paper:' ( (lv_rPaper_7_0= ruleRPaper ) )* otherlv_8= 'R_Pourcentage:' ( (lv_rPourcentage_9_0= ruleRPourcentage ) )* otherlv_10= '}'
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_40); 

            	    				newLeafNode(otherlv_3, grammarAccess.getResultAccess().getLeftCurlyBracketKeyword_3_0());
            	    			
            	    otherlv_4=(Token)match(input,37,FOLLOW_41); 

            	    				newLeafNode(otherlv_4, grammarAccess.getResultAccess().getR_DecisionKeyword_3_1());
            	    			
            	    // InternalReliSRS.g:1325:4: ( (lv_rDecision_5_0= ruleRDecision ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( ((LA22_0>=43 && LA22_0<=47)) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1326:5: (lv_rDecision_5_0= ruleRDecision )
            	    	    {
            	    	    // InternalReliSRS.g:1326:5: (lv_rDecision_5_0= ruleRDecision )
            	    	    // InternalReliSRS.g:1327:6: lv_rDecision_5_0= ruleRDecision
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getResultAccess().getRDecisionRDecisionEnumRuleCall_3_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_41);
            	    	    lv_rDecision_5_0=ruleRDecision();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getResultRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rDecision",
            	    	    							lv_rDecision_5_0,
            	    	    							"org.xtext.slr.ReliSRS.RDecision");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,38,FOLLOW_42); 

            	    				newLeafNode(otherlv_6, grammarAccess.getResultAccess().getR_PaperKeyword_3_3());
            	    			
            	    // InternalReliSRS.g:1348:4: ( (lv_rPaper_7_0= ruleRPaper ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_INT) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1349:5: (lv_rPaper_7_0= ruleRPaper )
            	    	    {
            	    	    // InternalReliSRS.g:1349:5: (lv_rPaper_7_0= ruleRPaper )
            	    	    // InternalReliSRS.g:1350:6: lv_rPaper_7_0= ruleRPaper
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getResultAccess().getRPaperRPaperParserRuleCall_3_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_rPaper_7_0=ruleRPaper();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getResultRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rPaper",
            	    	    							lv_rPaper_7_0,
            	    	    							"org.xtext.slr.ReliSRS.RPaper");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,39,FOLLOW_35); 

            	    				newLeafNode(otherlv_8, grammarAccess.getResultAccess().getR_PourcentageKeyword_3_5());
            	    			
            	    // InternalReliSRS.g:1371:4: ( (lv_rPourcentage_9_0= ruleRPourcentage ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==RULE_INT||LA24_0==33) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalReliSRS.g:1372:5: (lv_rPourcentage_9_0= ruleRPourcentage )
            	    	    {
            	    	    // InternalReliSRS.g:1372:5: (lv_rPourcentage_9_0= ruleRPourcentage )
            	    	    // InternalReliSRS.g:1373:6: lv_rPourcentage_9_0= ruleRPourcentage
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getResultAccess().getRPourcentageRPourcentageParserRuleCall_3_6_0());
            	    	    					
            	    	    pushFollow(FOLLOW_35);
            	    	    lv_rPourcentage_9_0=ruleRPourcentage();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getResultRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rPourcentage",
            	    	    							lv_rPourcentage_9_0,
            	    	    							"org.xtext.slr.ReliSRS.RPourcentage");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_10, grammarAccess.getResultAccess().getRightCurlyBracketKeyword_3_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleRTotal"
    // InternalReliSRS.g:1399:1: entryRuleRTotal returns [String current=null] : iv_ruleRTotal= ruleRTotal EOF ;
    public final String entryRuleRTotal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRTotal = null;


        try {
            // InternalReliSRS.g:1399:46: (iv_ruleRTotal= ruleRTotal EOF )
            // InternalReliSRS.g:1400:2: iv_ruleRTotal= ruleRTotal EOF
            {
             newCompositeNode(grammarAccess.getRTotalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTotal=ruleRTotal();

            state._fsp--;

             current =iv_ruleRTotal.getText(); 
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
    // $ANTLR end "entryRuleRTotal"


    // $ANTLR start "ruleRTotal"
    // InternalReliSRS.g:1406:1: ruleRTotal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleRTotal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1412:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:1413:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getRTotalAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRTotal"


    // $ANTLR start "entryRuleRPaper"
    // InternalReliSRS.g:1426:1: entryRuleRPaper returns [String current=null] : iv_ruleRPaper= ruleRPaper EOF ;
    public final String entryRuleRPaper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRPaper = null;


        try {
            // InternalReliSRS.g:1426:46: (iv_ruleRPaper= ruleRPaper EOF )
            // InternalReliSRS.g:1427:2: iv_ruleRPaper= ruleRPaper EOF
            {
             newCompositeNode(grammarAccess.getRPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRPaper=ruleRPaper();

            state._fsp--;

             current =iv_ruleRPaper.getText(); 
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
    // $ANTLR end "entryRuleRPaper"


    // $ANTLR start "ruleRPaper"
    // InternalReliSRS.g:1433:1: ruleRPaper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ENTIER_0= ruleENTIER ;
    public final AntlrDatatypeRuleToken ruleRPaper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ENTIER_0 = null;



        	enterRule();

        try {
            // InternalReliSRS.g:1439:2: (this_ENTIER_0= ruleENTIER )
            // InternalReliSRS.g:1440:2: this_ENTIER_0= ruleENTIER
            {

            		newCompositeNode(grammarAccess.getRPaperAccess().getENTIERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ENTIER_0=ruleENTIER();

            state._fsp--;


            		current.merge(this_ENTIER_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRPaper"


    // $ANTLR start "entryRuleRPourcentage"
    // InternalReliSRS.g:1453:1: entryRuleRPourcentage returns [String current=null] : iv_ruleRPourcentage= ruleRPourcentage EOF ;
    public final String entryRuleRPourcentage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRPourcentage = null;


        try {
            // InternalReliSRS.g:1453:52: (iv_ruleRPourcentage= ruleRPourcentage EOF )
            // InternalReliSRS.g:1454:2: iv_ruleRPourcentage= ruleRPourcentage EOF
            {
             newCompositeNode(grammarAccess.getRPourcentageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRPourcentage=ruleRPourcentage();

            state._fsp--;

             current =iv_ruleRPourcentage.getText(); 
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
    // $ANTLR end "entryRuleRPourcentage"


    // $ANTLR start "ruleRPourcentage"
    // InternalReliSRS.g:1460:1: ruleRPourcentage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleRPourcentage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1466:2: ( ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* ) )
            // InternalReliSRS.g:1467:2: ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* )
            {
            // InternalReliSRS.g:1467:2: ( (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )* )
            // InternalReliSRS.g:1468:3: (this_INT_0= RULE_INT )* kw= '.' (this_INT_2= RULE_INT )*
            {
            // InternalReliSRS.g:1468:3: (this_INT_0= RULE_INT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_INT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalReliSRS.g:1469:4: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    				current.merge(this_INT_0);
            	    			

            	    				newLeafNode(this_INT_0, grammarAccess.getRPourcentageAccess().getINTTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_37); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRPourcentageAccess().getFullStopKeyword_1());
            		
            // InternalReliSRS.g:1482:3: (this_INT_2= RULE_INT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_INT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalReliSRS.g:1483:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getRPourcentageAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleRPourcentage"


    // $ANTLR start "entryRuleENTIER"
    // InternalReliSRS.g:1495:1: entryRuleENTIER returns [String current=null] : iv_ruleENTIER= ruleENTIER EOF ;
    public final String entryRuleENTIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTIER = null;


        try {
            // InternalReliSRS.g:1495:46: (iv_ruleENTIER= ruleENTIER EOF )
            // InternalReliSRS.g:1496:2: iv_ruleENTIER= ruleENTIER EOF
            {
             newCompositeNode(grammarAccess.getENTIERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENTIER=ruleENTIER();

            state._fsp--;

             current =iv_ruleENTIER.getText(); 
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
    // $ANTLR end "entryRuleENTIER"


    // $ANTLR start "ruleENTIER"
    // InternalReliSRS.g:1502:1: ruleENTIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleENTIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1508:2: ( (this_INT_0= RULE_INT )+ )
            // InternalReliSRS.g:1509:2: (this_INT_0= RULE_INT )+
            {
            // InternalReliSRS.g:1509:2: (this_INT_0= RULE_INT )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_INT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalReliSRS.g:1510:3: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    			current.merge(this_INT_0);
            	    		

            	    			newLeafNode(this_INT_0, grammarAccess.getENTIERAccess().getINTTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


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
    // $ANTLR end "ruleENTIER"


    // $ANTLR start "entryRuleCHAINE"
    // InternalReliSRS.g:1521:1: entryRuleCHAINE returns [String current=null] : iv_ruleCHAINE= ruleCHAINE EOF ;
    public final String entryRuleCHAINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAINE = null;


        try {
            // InternalReliSRS.g:1521:46: (iv_ruleCHAINE= ruleCHAINE EOF )
            // InternalReliSRS.g:1522:2: iv_ruleCHAINE= ruleCHAINE EOF
            {
             newCompositeNode(grammarAccess.getCHAINERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHAINE=ruleCHAINE();

            state._fsp--;

             current =iv_ruleCHAINE.getText(); 
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
    // $ANTLR end "entryRuleCHAINE"


    // $ANTLR start "ruleCHAINE"
    // InternalReliSRS.g:1528:1: ruleCHAINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleCHAINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1534:2: ( (this_ID_0= RULE_ID )+ )
            // InternalReliSRS.g:1535:2: (this_ID_0= RULE_ID )+
            {
            // InternalReliSRS.g:1535:2: (this_ID_0= RULE_ID )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalReliSRS.g:1536:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getCHAINEAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


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
    // $ANTLR end "ruleCHAINE"


    // $ANTLR start "ruleCDecision"
    // InternalReliSRS.g:1547:1: ruleCDecision returns [Enumerator current=null] : ( (enumLiteral_0= 'Resolved included' ) | (enumLiteral_1= 'Resolved excluded' ) | (enumLiteral_2= 'Pending conflicts' ) ) ;
    public final Enumerator ruleCDecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1553:2: ( ( (enumLiteral_0= 'Resolved included' ) | (enumLiteral_1= 'Resolved excluded' ) | (enumLiteral_2= 'Pending conflicts' ) ) )
            // InternalReliSRS.g:1554:2: ( (enumLiteral_0= 'Resolved included' ) | (enumLiteral_1= 'Resolved excluded' ) | (enumLiteral_2= 'Pending conflicts' ) )
            {
            // InternalReliSRS.g:1554:2: ( (enumLiteral_0= 'Resolved included' ) | (enumLiteral_1= 'Resolved excluded' ) | (enumLiteral_2= 'Pending conflicts' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt30=1;
                }
                break;
            case 41:
                {
                alt30=2;
                }
                break;
            case 42:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalReliSRS.g:1555:3: (enumLiteral_0= 'Resolved included' )
                    {
                    // InternalReliSRS.g:1555:3: (enumLiteral_0= 'Resolved included' )
                    // InternalReliSRS.g:1556:4: enumLiteral_0= 'Resolved included'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getCDecisionAccess().getCresolvedIncludedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCDecisionAccess().getCresolvedIncludedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReliSRS.g:1563:3: (enumLiteral_1= 'Resolved excluded' )
                    {
                    // InternalReliSRS.g:1563:3: (enumLiteral_1= 'Resolved excluded' )
                    // InternalReliSRS.g:1564:4: enumLiteral_1= 'Resolved excluded'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCDecisionAccess().getCresolvedExcludedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCDecisionAccess().getCresolvedExcludedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReliSRS.g:1571:3: (enumLiteral_2= 'Pending conflicts' )
                    {
                    // InternalReliSRS.g:1571:3: (enumLiteral_2= 'Pending conflicts' )
                    // InternalReliSRS.g:1572:4: enumLiteral_2= 'Pending conflicts'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCDecisionAccess().getCpendingConflictEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCDecisionAccess().getCpendingConflictEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCDecision"


    // $ANTLR start "ruleRDecision"
    // InternalReliSRS.g:1582:1: ruleRDecision returns [Enumerator current=null] : ( (enumLiteral_0= 'Included' ) | (enumLiteral_1= 'Excluded' ) | (enumLiteral_2= 'In conflict' ) | (enumLiteral_3= 'In review' ) | (enumLiteral_4= 'Pending' ) ) ;
    public final Enumerator ruleRDecision() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalReliSRS.g:1588:2: ( ( (enumLiteral_0= 'Included' ) | (enumLiteral_1= 'Excluded' ) | (enumLiteral_2= 'In conflict' ) | (enumLiteral_3= 'In review' ) | (enumLiteral_4= 'Pending' ) ) )
            // InternalReliSRS.g:1589:2: ( (enumLiteral_0= 'Included' ) | (enumLiteral_1= 'Excluded' ) | (enumLiteral_2= 'In conflict' ) | (enumLiteral_3= 'In review' ) | (enumLiteral_4= 'Pending' ) )
            {
            // InternalReliSRS.g:1589:2: ( (enumLiteral_0= 'Included' ) | (enumLiteral_1= 'Excluded' ) | (enumLiteral_2= 'In conflict' ) | (enumLiteral_3= 'In review' ) | (enumLiteral_4= 'Pending' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt31=1;
                }
                break;
            case 44:
                {
                alt31=2;
                }
                break;
            case 45:
                {
                alt31=3;
                }
                break;
            case 46:
                {
                alt31=4;
                }
                break;
            case 47:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalReliSRS.g:1590:3: (enumLiteral_0= 'Included' )
                    {
                    // InternalReliSRS.g:1590:3: (enumLiteral_0= 'Included' )
                    // InternalReliSRS.g:1591:4: enumLiteral_0= 'Included'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getRDecisionAccess().getRIncludedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRDecisionAccess().getRIncludedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReliSRS.g:1598:3: (enumLiteral_1= 'Excluded' )
                    {
                    // InternalReliSRS.g:1598:3: (enumLiteral_1= 'Excluded' )
                    // InternalReliSRS.g:1599:4: enumLiteral_1= 'Excluded'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getRDecisionAccess().getRExcludedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRDecisionAccess().getRExcludedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReliSRS.g:1606:3: (enumLiteral_2= 'In conflict' )
                    {
                    // InternalReliSRS.g:1606:3: (enumLiteral_2= 'In conflict' )
                    // InternalReliSRS.g:1607:4: enumLiteral_2= 'In conflict'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRDecisionAccess().getRInConflictEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRDecisionAccess().getRInConflictEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalReliSRS.g:1614:3: (enumLiteral_3= 'In review' )
                    {
                    // InternalReliSRS.g:1614:3: (enumLiteral_3= 'In review' )
                    // InternalReliSRS.g:1615:4: enumLiteral_3= 'In review'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRDecisionAccess().getRInReviewEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRDecisionAccess().getRInReviewEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalReliSRS.g:1622:3: (enumLiteral_4= 'Pending' )
                    {
                    // InternalReliSRS.g:1622:3: (enumLiteral_4= 'Pending' )
                    // InternalReliSRS.g:1623:4: enumLiteral_4= 'Pending'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRDecisionAccess().getRPendingEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRDecisionAccess().getRPendingEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleRDecision"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200040010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000070800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000F84000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000022L});

}