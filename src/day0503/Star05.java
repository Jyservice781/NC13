package day0503;

import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n숫자를 입력하세요");
        System.out.print("> ");

        int userNumber = scanner.nextInt();
        int height = userNumber;
        //[선생님이랑]

        for (int i = 1; i <= height; i++) {
            String stars = "";
            //해당 줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = userNumber - i;

            //해당 줄의 별의 갯수를 저장할 int 변수
            // 별들이 있는 곳을 하나의 좌표계로 생각하여 방정식을 치환한다.
            int starWidth = 2 * i - 1;

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

//        int num = 1;

//        for (int i = num; i <= height; i++) {
//            //줄이 증가하면서 줄바꿈영역
//            String stars = "";
//
//            //공백 영역
//            for (int j = i; j <= userNumber; j++) {
//                stars += " ";
//            }
//
//            //별찍기 영역
//            for (int j = 1; j <= num; j++) {
//                stars += "*";
//            }
//            num = num + 2;
//
//            System.out.println(stars);
//        }
    }
}
