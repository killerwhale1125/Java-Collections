package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 networkClientV3 = new NetworkClientV3(address);
        networkClientV3.initError(data);

        try {
            networkClientV3.connect();
            networkClientV3.send(data);
            // 외부 자원을 반드시 반납해야한다
        } catch (ConnectExceptionV3 e) {
            System.out.println("연결 오류 주소 : " + e.getAddress() + " 메세지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("전송 오류 데이터 : " + e.getSendData() + " 메세지 : " + e.getMessage());
        } finally {
            networkClientV3.disconnect();
        }
    }
}
