package day0503;

import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            //i = 0~5까지 줄교체
//            for (int j = 0; j < 5 - i; j++) {
//                // i= 1일때 5이고
//                // i가 2일때 4고
//                // i가 3일떄 3
//                // i 가 4일때 2
//                // i 가 5 일때 1
//                // j = 5 - i
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //선생님 풀이
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n출력할 줄 수를 입력해주세요");
        System.out.println("> ");
        int userNumber = scanner.nextInt();
        //출력할 총 줄의 숫자를 저장할 변수
        int height = userNumber;
        for(int i = 1; i<=height; i++){
            //해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";
            for(int j = i; j<= userNumber; j++){
                stars += "*";
            }
            System.out.println(stars);
        }

    }
}
