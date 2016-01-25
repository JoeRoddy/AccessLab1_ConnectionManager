package ConnectionManager;

import java.util.ArrayList;

public class ConnectionManager {
    private static ArrayList<Connection> connectionList = new ArrayList<Connection>();

    public static void add(int portArg,String ipArg){
        Connection connectionToAdd = new Connection(portArg,ipArg);
        connectionList.add(connectionToAdd);
    }

    public static void remove(int elementToRemove){
        if (connectionList.size()>1){
            connectionList.remove(elementToRemove);
        }
        else{
            connectionList.remove(elementToRemove);
            connectionList.add(elementToRemove, null);
        }
    }

    public static ArrayList<Connection> getList(){
        return connectionList;
    }

    public static void print(){
        for(int x=0;x<connectionList.size();x++){
            System.out.println("Port: "+connectionList.get(x).getPortNum());
            System.out.println("IP:   "+connectionList.get(x).getIpAddress());
        }
    }

}
