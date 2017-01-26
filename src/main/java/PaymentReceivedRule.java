/**
 * Created by localadmin on 1/26/17.
 */
public class PaymentReceivedRule extends Rule {

    Order order;

    PaymentReceivedRule(Order order){
      //  super("Payment Recieved Rule for"+order.getOrderName(),order);
        super("Payment Recieved Rule for"+order.getOrderName());
        this.order=order;
    }


    public void doAction(){


        if(this.order.isPaymentReceived()){
            Rule.rulesToApply.add(new CheckStockRule(order));

        }



    }

}
