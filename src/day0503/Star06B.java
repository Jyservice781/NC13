package day0503;

import java.util.Scanner;

public class Star06B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 수를 입력해주세요");
        System.out.println("> ");
        int userNumber = scanner.nextInt();
        int height = userNumber;

        for (int i = height; i >= 1; i--) {
            String stars = "";
            //해당 줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = userNumber - i;

            //해당 줄의 별의 갯수를 저장할 int 변수
            // 별들이 있는 곳을 하나의 좌표계로 생각하여 방정식을 치환한다.
            int starWidth = 2 * i - 1;
            //(2*a - b)

            //공백 담당 for
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            //별 담당for
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";

            }

            System.out.println(stars);

        }
    }
}
