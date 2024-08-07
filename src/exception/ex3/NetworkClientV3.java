package exception.ex3;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if(connectError) throw new ConnectExceptionV3(address + " 서버 연결 실패!!", "connectError");
    }

    public void send(String data) throws SendExceptionV3 {
        if(sendError) throw new SendExceptionV3("sendError", address + " 서버 데이터 전송 실패!!");
    }
    
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) connectError = true;
        if(data.contains("error2")) sendError = true;
    }
}
