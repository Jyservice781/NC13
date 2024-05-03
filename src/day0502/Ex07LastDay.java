package day0502;
// 사용자로부터 월을 입력받으면
// 해당 월의 마지막 날이 몇일인지 보여주는 프로그램

import java.util.Scanner;

public class Ex07LastDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월: ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("28일");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }
}









