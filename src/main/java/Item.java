/**
 * Created by localadmin on 1/20/17.
 */
public class Item {
    String name = "";
    String type= "";
    Item(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getItemName() {
        return name;
    }

    public String getItemType() {
        return type;
    }
}
