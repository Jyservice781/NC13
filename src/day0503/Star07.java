package day0503;

import java.util.Scanner;
public class Star07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");

        System.out.println("출력할 숫자를 입력하시오");
        System.out.println("> ");
        int userNumber = scanner.nextInt();
        int height = userNumber;
        //피라미드를 두개 이어 붙인것과 같은가?
        int spaceWidth = 0;
        int starWidth = 0;
        String stars = "";

        for (int i = 1; i < height; i++){
            spaceWidth = height - i;
            starWidth = 2 * userNumber + 1;

            for(int j = 1; j <= spaceWidth; j++){
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++){
                stars += "*";
            }
            System.out.println(stars);
        }

        for(int i = 1; i <userNumber; i++){
            //공백 선언 문
            spaceWidth = height - i;
            starWidth = -2 * i + 2 * userNumber + 1;

            for(int j = 1; j <= spaceWidth - i; j++){
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++){
                stars += "*";
            }

            System.out.println(stars);
        }


//        for(int i=1; i<=5; i++){
//            for(int j=5-i; j>0; j--){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i*2-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=5; i++){
//            for(int j=0; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int j=(5-i)*2 -1; j>0; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
