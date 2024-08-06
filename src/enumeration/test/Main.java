package enumeration.test;

import enumeration.ref3.Grade;

public class Main {
    public static void main(String[] args) {
        for (AuthGrade value : AuthGrade.values()) {
            System.out.println("grade=" + value + ", level=" + value.getDescription() + ", 설명=" + value.getDescription());
        }
    }
}
