package exception.basic.check;

/**
 * Exception을 상속받으면 체크 예외
 */
public class MyCheckedException extends Exception {

    /**
     * 무슨 오류인지 부모에서 예외 메세지를 보관
     * ex ) MyCheckedException이라는 예외가 터지면 그 예외 메시지 정보를
     *      Exception 부모에 보관
     */
    public MyCheckedException(String message) {
        super(message);
    }


}
