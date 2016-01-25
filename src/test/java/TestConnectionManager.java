import ConnectionManager.ConnectionManager;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;


public class TestConnectionManager {

    @Test
    public void tester(){
        // testing add() @ getList() methods
        ConnectionManager.add(1234,"50.73.209.91");
        assertNotNull("Test failed, Connection not added.", ConnectionManager.getList());
        System.out.println("Test passed. .add() && .getList() working as intended.");
        // testing remove() method
        ConnectionManager.remove(0);
        assertNull("Test failed, remove() did not eliminate object element.",(ConnectionManager.getList()).get(0));
        System.out.println("remove() test passed.  First element is null.");

    }

}
