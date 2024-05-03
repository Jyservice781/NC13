package day0503;

import java.util.Scanner;

public class Star09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 수를 입력해주세요");
        System.out.println("> ");
        int userNumber = scanner.nextInt();

        //1.
        for (int i = 1; i <= userNumber; i++) {
            String stars = "";
            int spaceWidth = userNumber - i;
            int starWidth = 2 * i - 1;

            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
//            System.out.println(stars);
        }

        for (int i = userNumber - 1; i >= 1; i--) {
            String stars = "";
            int spaceWidth = userNumber - i;
            int starWidth = 2 * i - 1;

            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
//            System.out.println(stars);
        }

        //2.
        int height = 2 * userNumber - 1;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            int spaceWidth = 0;
            int starWidth = 0;

            if (i < userNumber) {
                //윗부분
                //12345 번째 줄 부분 윗부분을 담당
                spaceWidth = userNumber - i;
                starWidth = 2 * i - 1;

            } else {
                //아랫부분
                // 6789번째 줄부분을 담당
                int lowerI = 2*userNumber - i;
                spaceWidth = userNumber - lowerI;
                starWidth = 2 * lowerI -1;
            }

            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }


    }
}
