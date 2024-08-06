package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 networkClientV4 = new NetworkClientV4(address);
        networkClientV4.initError(data);

        try {
            networkClientV4.connect();
            networkClientV4.send(data);
            // 외부 자원을 반드시 반납해야한다
        } finally {
            networkClientV4.disconnect();
        }
    }
}
