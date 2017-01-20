/**
 * Created by localadmin on 1/20/17.
 */
public class Membership {
    String owner = "";
    String action = "";


    Membership(String owner){
        this.owner = owner;

    }

    public String getFor() {
        return owner;
    }

    public String getAction() {
        return action;
    }


    public void create(){
        this.action = "create";
    }

    public void upgrade(){
        this.action = "upgrade";
    }
}
