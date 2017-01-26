/**
 * Created by localadmin on 1/26/17.
 */
public class CheckStockRule extends Rule {

    private Order order;



    CheckStockRule(Order order){
      //  super("Checking Stock  Rule for"+order.getOrderName(), order);
        super("Checking Stock  Rule for"+order.getOrderName());
        this.order=order;
    }


    public void doAction(){

        boolean inStock=false;
        //Some business Logic

        if(order.getOrderName()=="Item1"){
            inStock=true;
        }

        if(inStock){
            System.out.println(this.rulesToApply.size());
            //Rule.rulesToApply.add(new Rule("New Rule", new Order("item2", "web")));
            Rule.rulesToApply.add(new Rule("New Rule"));
        }



    }
}
