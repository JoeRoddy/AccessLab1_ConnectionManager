package ConnectionManager;
class Connection {
    private int portNum;
    private String ipAddress;

    Connection(int port,String ip){
        this.portNum=port;
        this.ipAddress=ip;
    }
    public int getPortNum(){
        return portNum;
    }
    public String getIpAddress(){
        return ipAddress;
    }
}
