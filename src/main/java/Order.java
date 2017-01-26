/**
 * Created by localadmin on 1/26/17.
 */
public class Order {
    private String orderType;
    private String orderName;

    public boolean isPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(boolean paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    private boolean paymentReceived;

    public Order(String orderName, String orderType) {
        if(orderType == "credit") {
            setPaymentReceived(true);
        }
        this.orderType = orderType;
        this.orderName = orderName;
    }


    public String getOrderType() {
        return this.orderType;
    }

    public String getOrderName() {
        return this.orderName;
    }
}
