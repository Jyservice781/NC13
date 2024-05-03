package day0503;

import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            //줄바꿈 담당
//            //공백담당
//            for(int k = 0; k <= i - 1; k++){
//                System.out.print(" ");
//            }
//            //별 담당
//            for(int j = 3; j >= i - 1 ; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("출력할 수를 입력해주세요");
        System.out.print("> ");

        int userNumber = scanner.nextInt();
        int height = userNumber;

        for (int i = 1; i <= height; i++) {
            String stars = "";
            //공백 담당
            //첫번째 줄 -1
            for (int j = 1; j <= i - 1 ; j++) {
                stars += " ";
            }

            //별찍기 담당
            for (int j = i; j <= userNumber; j++){
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}
