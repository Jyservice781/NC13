package day0503;

import java.util.Scanner;

public class Star10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 수를 입력하세요");
        System.out.println("> ");

        int userNumber = scanner.nextInt();
        int height = 2 * userNumber - 1;
        int totalWidth = 2 * userNumber - 1;
        // 중간에 다이아몬드 모양으로 비어있는 형태
        // for 의 긴 형태로 출력 되야 함.
        for (int i = 1; i <= height; i++) {
            String stars = "";
//            i의 최솟값 == 1 , height 일때
            if (i == 1 || i == height) {
                for (int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
            } else {
                int spaceWidth = 0;
                int starWidth = 0;

                if (i < userNumber) {
                    //윗부분
                    int upperI = i - 1;
                    starWidth = userNumber - upperI;
                } else {
                    //아랫부분
                    int lowerI = i - userNumber + 1;
                    starWidth = lowerI;
                }

                spaceWidth = totalWidth - 2 * starWidth;


                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }//왼쪽 별
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }//가운데 별
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }// 오른쪽 별

            }

            System.out.println(stars);
        }

    }
}
