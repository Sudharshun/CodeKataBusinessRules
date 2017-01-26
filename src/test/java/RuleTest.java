import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

//If the payment is for a physical product, generate a packing slip for shipping.-Done
//If the payment is for a book, create a duplicate packing slip for the royalty department.-Done
//If the payment is for a membership, activate that membership.-Done
//If the payment is an upgrade to a membership, apply the upgrade-Done
//If the payment is for a membership or upgrade, e-mail the owner and inform them of the activation/upgrade.-Done
//If the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip (the result of a court decision in 1997).
//If the payment is for a physical product or a book, generate a commission payment to the agent.

public class RuleTest {
    @Test
    public void createRule_Initialize() {
        //Rule rule = new Rule("rule description", new Order("item1", "check"));
        Rule rule = new Rule("rule description");
        assertEquals("rule description",rule.getDescription());
    }

    @Test
    public void PaymentdoAction_Test() {
        Order order = new Order("order 1", "credit");
        PaymentReceivedRule rule = new PaymentReceivedRule(order);
        rule.doAction();

        assertEquals(1,Rule.rulesToApply.size());

    }

  @Test
    public void PaymentStockdoAction_Test() {
        Order order = new Order("Item1", "credit");

      PaymentReceivedRule rule1 = new PaymentReceivedRule(order);

      Rule.rulesToApply.addFirst(rule1);


      for(int i=0; i< Rule.rulesToApply.size(); i++) {
          Rule.rulesToApply.get(i).doAction();
          System.out.println("Done with "+i);
      }


      assertEquals(3,Rule.rulesToApply.size());

    }



}