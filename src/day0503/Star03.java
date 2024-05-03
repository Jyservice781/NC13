package day0503;

import java.util.Scanner;

public class Star03 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            //i는 줄바꿈만 담당한다.
//            //k for문이 공백을 담당한다.
//            for(int k = 0; k < 5 - i; k++){
//                System.out.print(" ");
//            }
//
//            //별을담당
//            for (int j = 0; j < i + 1; j++) {
//                //j 를 왼쪽 정렬 시킨다.
//                // i 가 1일때 j 가 뒤쪽에서 1
//                //i 가 2일때 j 가 뒤쪽에서 2
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //선생님이랑풀이
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n출력할 줄 수를 입력해주세요");
        System.out.println("> ");

        int userNumber = scanner.nextInt();
        int height = userNumber;

        for (int i = 1; i <= height; i++) {
            String stars = "";

            //공백을 담당하는 j for 문
            for (int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }

            //별을 담당하는 j for 문
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }


            System.out.println(stars);
        }
    }
}
