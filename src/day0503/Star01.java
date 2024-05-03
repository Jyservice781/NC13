package day0503;

import java.util.Scanner;

public class Star01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Q1.
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//        //Q2.
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("*");
//        }
        //Q3. 블로그글 참조
//        for (int i = 0; i < 5; i++) {
//            //i 는 1씩 증가하면서 5번 줄교체되고
//            for (int j = 0; j < i+1; j++) {
//                // i + 1만큼 별을 찍는다.
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        System.out.println("\n출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            //j for 문은 해당 부분에 어떤 내용이 들어 갈지를 담당한다.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
