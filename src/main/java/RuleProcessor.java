import java.util.ArrayList;
import java.util.List;

/**
 * Created by localadmin on 1/20/17.
 */
public class RuleProcessor {

    String[] actions;
    List<Rule> rulestoApply;
    ArrayList<String> listofActions;

    RuleProcessor() {
        this.listofActions = new ArrayList<String>();
        this.rulestoApply = new ArrayList<Rule>();

    }

    //If the payment is for a physical product, generate a packing slip for shipping.-Done

//If the payment is for a membership, activate that membership.-Done
//If the payment is an upgrade to a membership, apply the upgrade-Done
//If the payment is for a membership or upgrade, e-mail the owner and inform them of the activation/upgrade.-Done
//If the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip (the result of a court decision in 1997).
//If the payment is for a physical product or a book, generate a commission payment to the agent.


    public void process(Item item) {

        //PackingSlip-Physical Product
        rulestoApply.add(new PackingSlipRule());

        //If the payment is for a book, create a duplicate packing slip for the royalty department.-Done
        if (item.getItemType() == "Book") {
            rulestoApply.add(new DuplicatePackingSlipRule());
        }

        if (item.getItemType() == "Video") {
            rulestoApply.add(new AddFreeVideoRule());
        }

        //If the payment is for a physical product or a book, generate a commission payment to the agent.
        rulestoApply.add(new CommissionPaymentRule());
        processRules();
    }

    public void process(Membership membership) {

        rulestoApply.add(new ActivateMembershipRule());
        if (membership.getAction() == "upgrade") {
            rulestoApply.add(new UpgradeMembershipRule());
        }
        rulestoApply.add(new EmailRule());


        processRules();
    }

    private void processRules() {

        for (int i = 0; i < rulestoApply.size(); i++) {

            Rule ruleToRun = rulestoApply.get(i);
            listofActions.add(ruleToRun.getDescription());
            ruleToRun.doAction();
        }

    }


    public String[] getActionsTaken() {
        actions=new String[listofActions.size()];
        actions=listofActions.toArray(actions);
        return actions;
    }
}
