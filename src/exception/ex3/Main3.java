package exception.ex3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        NetworkServiceV3 networkServiceV3 = new NetworkServiceV3();
        NetworkServiceV3_2 networkServiceV3 = new NetworkServiceV3_2();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;

            networkServiceV3.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
