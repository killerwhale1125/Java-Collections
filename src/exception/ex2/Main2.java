package exception.ex2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        NetworkServiceV2_1 networkServiceV2 = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkServiceV2 = new NetworkServiceV2_2();
        NetworkServiceV2_3 networkServiceV2 = new NetworkServiceV2_3();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;

            networkServiceV2.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
