/**
 * Created by localadmin on 1/20/17.
 */
public class DuplicatePackingSlipRule extends Rule{
    DuplicatePackingSlipRule(){
        super("DuplicatePacking rule");
    }


    public void doAction(){
        System.out.println("Duplicate Packaging Slip");
    }
}
