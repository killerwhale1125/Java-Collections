package exception.basic.uncheck;

/**
 * RuntimeException을 상속받게 된다면 언체크 예외
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
