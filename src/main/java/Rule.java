import java.util.LinkedList;

/**
 * Created by localadmin on 1/20/17.
 */
public class Rule {
    String description;
    public static LinkedList<Rule> rulesToApply= new LinkedList<Rule>();
    Order order;

//    Rule(String ruleDesc, Order order){
//        this.description = ruleDesc;
//        this.order = order;
//    }


    Rule(String ruleDesc){
        this.description = ruleDesc;
    }



        public String getDescription(){
        return this.description;
    }

    public void doAction(){
      //  Rule.rulesToApply.addFirst(new PaymentReceivedRule(order));
        System.out.println("Base Rule");
    }
}
