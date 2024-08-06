package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError) throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패!!");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
//        if(sendError) throw new NetworkClientExceptionV2("sendError", address + " 서버 데이터 전송 실패!!");
        if(sendError) throw new RuntimeException();
    }
    
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }

        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
