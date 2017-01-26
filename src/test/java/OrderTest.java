import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
public class OrderTest {

    @Test
    public void CreateWebOrder_Initialize(){
        Order webOrder = new Order("Item1", "web");
        assertEquals("web",webOrder.getOrderType());
        assertEquals("Item1",webOrder.getOrderName());

//        Order webOrder = new Order("Item1", "web");
//        assertEquals("web",webOrder.getOrderType());
//        assertEquals("Item1",webOrder.getOrderName());

    }





}


//
////Web order
//--> Payment to arrive
//
////Credit card order
//        -> Check stock- already done
//        -> Ship
//
//--.> Check stock and proceed to ship, delay processing
//
//// Receive checkj for exiusting order
//--> Check stocks , dlay processing
//
//// Anytime before shipping Cancel order
//
////
//
//Order
//Payment
//
//Check Stock
//Ship
