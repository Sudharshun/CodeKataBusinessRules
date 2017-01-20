import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by localadmin on 1/20/17.
 */
public class PaymentProcessingTest {

    @Test
    public void CreatePP_Initialize() {
        System.out.println("********************CreatePP_Initialize**********************");
        Item book = new Item("End of World", "Book");

        RuleProcessor processor = new RuleProcessor();
        processor.process(book);
        String[] actionsTaken = processor.getActionsTaken();
        assertEquals("Packing rule", actionsTaken[0]);
        assertEquals("DuplicatePacking rule", actionsTaken[1]);
        assertEquals("Commission Payment rule", actionsTaken[2]);
        System.out.println("******************************************");
        System.out.println();

    }

    @Test
    public void CreatePP_Video() {
        System.out.println("*****************CreatePP_Video*************************");

        Item video = new Item("Learning to Ski", "Video");

        RuleProcessor processor = new RuleProcessor();
        processor.process(video);
        String[] actionsTaken = processor.getActionsTaken();
        assertEquals("Packing rule", actionsTaken[0]);
        assertEquals("Add Free Video rule", actionsTaken[1]);
        assertEquals("Commission Payment rule", actionsTaken[2]);
        System.out.println("*******************************************");
    }

    @Test
    public void CreatePP_membership() {
        System.out.println("*****************CreatePP_membership*************************");

        Membership membership = new Membership("Newbie");
        membership.create();
        RuleProcessor processor = new RuleProcessor();
        processor.process(membership);
        String[] actionsTaken = processor.getActionsTaken();
        assertEquals("Activate Membership rule", actionsTaken[0]);
        assertEquals("Email rule", actionsTaken[1]);
        System.out.println("******************************************");
    }

    @Test
    public void CreatePP_membershipUpgrade() {
        System.out.println("*******************CreatePP_membershipUpgrade**********************");

        Membership membership = new Membership("Upgrade");
        membership.create();
        membership.upgrade();
        RuleProcessor processor = new RuleProcessor();
        processor.process(membership);
        String[] actionsTaken = processor.getActionsTaken();
        assertEquals("Activate Membership rule", actionsTaken[0]);
        assertEquals("Upgrade Membership rule", actionsTaken[1]);
        assertEquals("Email rule", actionsTaken[2]);
        System.out.println("******************************************");
    }
}
