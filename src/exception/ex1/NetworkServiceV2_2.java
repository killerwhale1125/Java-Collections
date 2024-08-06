package exception.ex1;


public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 networkClientV2 = new NetworkClientV2(address);
        networkClientV2.initError(data);

        String connectResult = networkClientV2.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        } else {
            String sendResult = networkClientV2.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }

        networkClientV2.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
