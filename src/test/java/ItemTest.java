import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class ItemTest {

    @Test
    public void CreateItem_Initialize(){
        Item book = new Item("End of World","Book");
        Item video = new Item("Learning to Ski","Video");

        assertEquals("Book",book.getItemType());
        assertEquals("Video",video.getItemType());
        assertEquals("End of World",book.getItemName());
        assertEquals("Learning to Ski",video.getItemName());
    }


    @Test
    public void CreateMembership_Initialize(){
        Membership creater = new Membership("Myself");
        creater.create();
        assertEquals("Myself",creater.getFor());
        assertEquals("create",creater.getAction());

        creater.upgrade();
        assertEquals("upgrade",creater.getAction());

    }
}


//Description




//Membership : upgrade(), activate() , prop name
//
//
//Membership(name,this.action)