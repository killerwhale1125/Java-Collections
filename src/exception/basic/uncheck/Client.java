package exception.basic.uncheck;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
