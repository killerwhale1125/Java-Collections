package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkServiceV4 = new NetworkServiceV4();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;

            try {
                networkServiceV4.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메세지 ==");
        e.printStackTrace(System.out);

        // 필요 시 별도 처리 가능
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
