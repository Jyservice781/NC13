package day0513;

// 학생 5명을 관리하는 프로그램을 작성하시오 (= 정적할당 배열을 사용하시오)
// 단, 학생정보를 수정/ 삭제할 필요없이
// 5명 까지만 입력 가능하고 출력은 입력된 학생들만 출력되는 프로그램으로
// 만드시오.

import java.util.Scanner;

import util.ArrayUtil;

public class Ex03GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[5];
        String[] nameArray = new String[5];
        int[] koreanArray = new int[5];
        int[] englishArray = new int[5];
        int[] mathArray = new int[5];
        int idx = 0;
        final int SUBJECT_SUM = 3;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.println("> ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                // 입력을 받을 거임.for 문을 이용하여 6명의 입력을 할것
                // j for 문을 이용해서 학생들의 입력을 받을 것
                if (idx < idArray.length) {
                    System.out.print("번호 >");
                    idArray[idx] = scanner.nextInt();

                    System.out.print("이름 >");
                    scanner.nextLine();
                    nameArray[idx] = scanner.nextLine();


                    System.out.print("국어 >");
                    koreanArray[idx] = scanner.nextInt();

                    System.out.print("영어 >");
                    englishArray[idx] = scanner.nextInt();

                    System.out.print("수학 >");
                    mathArray[idx] = scanner.nextInt();

                    idx++;
                } else {
                    System.out.println("5명을 초과했습니다.");
                }


            } else if (userChoice == 2) {
                for (int i = 0; i < 5; i++) {
                    int id = ArrayUtil.get(idArray, i);
                    String name = ArrayUtil.get(nameArray, i);
                    int korean = ArrayUtil.get(koreanArray, i);
                    int english = ArrayUtil.get(englishArray, i);
                    int math = ArrayUtil.get(mathArray, i);
                    int sum = korean + english + math;
                    double average = (double) sum / SUBJECT_SUM;
                    System.out.printf("번호 : %2d번 이름: %s\n", id, name);
                    System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", korean, english, math);
                    System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                }


            } else if (userChoice == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }


    }
}
