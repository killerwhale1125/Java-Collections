package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 networkClientV2 = new NetworkClientV2(address);
        networkClientV2.initError(data);

        try {
            networkClientV2.connect();
            networkClientV2.send(data);
            // 외부 자원을 반드시 반납해야한다

        } catch (NetworkClientExceptionV2 e) {
            // 메세지는 Throwable에 저장된 메세지를 가져옴
            System.out.println("오류 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        } finally {
            networkClientV2.disconnect();
        }
    }
}
