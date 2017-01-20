import org.junit.Test;

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
        Rule rule = new Rule("rule description");
        assertEquals("rule description",rule.getDescription());
    }

    @Test
    public void createPackingRule_Initialize() {
        Rule rule = new PackingSlipRule();
        assertEquals("Packing rule",rule.getDescription());
    }


    @Test
    public void createDuplicatePackingRule_Initialize() {
        Rule rule = new DuplicatePackingSlipRule();
        assertEquals("DuplicatePacking rule",rule.getDescription());
    }

    @Test
    public void createActivateMembershipRule_Initialize() {
        Rule rule = new ActivateMembershipRule();
        assertEquals("Activate Membership rule",rule.getDescription());
    }


    @Test
    public void createUpgradeMembershipRule_Initialize() {
        Rule rule = new UpgradeMembershipRule();
        assertEquals("Upgrade Membership rule",rule.getDescription());
    }

    @Test
    public void createEmailRule_Initialize() {
        Rule rule = new EmailRule();
        assertEquals("Email rule",rule.getDescription());
    }

    @Test
    public void createAddFreeVideoRule_Initialize() {
        Rule rule = new AddFreeVideoRule();
        assertEquals("Add Free Video rule",rule.getDescription());
    }


    @Test
    public void createCommissionPaymentRule_Initialize() {
        Rule rule = new CommissionPaymentRule();
        assertEquals("Commission Payment rule",rule.getDescription());
    }

}