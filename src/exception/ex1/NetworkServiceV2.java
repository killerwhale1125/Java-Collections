package exception.ex1;


public class NetworkServiceV2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 networkClientV2 = new NetworkClientV2(address);
        networkClientV2.initError(data);

        networkClientV2.connect();
        networkClientV2.send(data);
        networkClientV2.disconnect();
    }
}
