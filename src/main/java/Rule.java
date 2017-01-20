/**
 * Created by localadmin on 1/20/17.
 */
public class Rule {
    String description;

    Rule(String ruleDesc){
        this.description = ruleDesc;
    }

    public String getDescription(){
        return this.description;
    }

    public void doAction(){
        System.out.println("Base Rule");
    }
}
