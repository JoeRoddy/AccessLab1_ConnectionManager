package ConnectionManager;
import static ConnectionManager.ConnectionManager.*;

/**
 * Created by Joe on 1/22/16.
 */
public class App {
    public static void main(String[] args) {
        add(1000,"12.12.212312.3");
        add(1234,"111.11.11111.2");
        print();
        remove(0);
        System.out.println("List after .remove()'ing first element");
        print();
    }
}



