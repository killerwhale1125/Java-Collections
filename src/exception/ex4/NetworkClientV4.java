package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError) throw new ConnectExceptionV4(address + " 서버 연결 실패!!", "connectError");
    }

    public void send(String data) {
        if(sendError) throw new SendExceptionV4("sendError", address + " 서버 데이터 전송 실패!!");
    }
    
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) connectError = true;
        if(data.contains("error2")) sendError = true;
    }
}
