package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

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
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        }
        finally {
            networkClientV3.disconnect();
        }
    }
}
