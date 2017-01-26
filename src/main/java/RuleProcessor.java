import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by localadmin on 1/20/17.
 */
public class RuleProcessor {

    String[] actions;
    LinkedList<Rule> rulestoApply;
    ArrayList<String> listofActions;

    RuleProcessor() {
        this.listofActions = new ArrayList<String>();
        this.rulestoApply = new LinkedList<Rule>();

    }


    public void process(Order order) {


        //If the payment is for a book, create a duplicate packing slip for the royalty department.-Done
        if (order.getOrderType() == "web") {

        }

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
