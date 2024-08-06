package exception.ex0;

public class NetworkServiceV1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 networkClientV1 = new NetworkClientV1(address);

        networkClientV1.connect();
        networkClientV1.send(data);
        networkClientV1.disconnect();
    }
}
