package day0503;

import java.util.Scanner;

public class Star06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 수를 입력해주세요");
        System.out.println("> ");

        int userNumber = scanner.nextInt();
        int height = userNumber;
        //홀수값을 주기위한 변수 설정

        for (int i = 1; i <= height; i++) {
            //별을 찍기 위한 메서드 설정
            String stars = "";

            int spaceWidth = i - 1;
            int starWidth = - 2 * i + 2 * userNumber + 1;

            //공백을 담당하는 for문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            //별을 담당하는 for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            //줄 바꿈 메서드
            System.out.println(stars);

        }

    }
}
