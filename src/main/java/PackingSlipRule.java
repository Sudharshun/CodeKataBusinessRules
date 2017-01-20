/**
 * Created by localadmin on 1/20/17.
 */
public class PackingSlipRule extends Rule{
    PackingSlipRule(){
        super("Packing rule");
    }

    public void doAction(){
        System.out.println("Packing Slip");
    }
}
