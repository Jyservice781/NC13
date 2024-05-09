package day0509;
//학생 관리 프로그램

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex02Teacher {
    public static void main(String[] args) {
        //입력을 처리할 Scanner 클래스 변수
        Scanner scanner = new Scanner(System.in);
        int[] idArray = new int[0];
        // 이름 배열
        String[] nameArray = new String[0];
        // 국어 점수 배열
        int[] koreanArray = new int[0];
        // 영어 점수 배열
        int[] englishArray = new int[0];
        // 수학 점수 배열
        int[] mathArray = new int[0];

        //입력 가능한 최소 점수
        final int MIN_SCORE = 0;

        // 입력 가능한 최대 점수
        final int MAX_SCORE = 100;

        while (true) {
            String menuMessage = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, menuMessage);

            if (userChoice == 1) {
                // 입력 코드 구현
                // 번호 입력 받기
                String message = "학생의 번호를 입력해주세요.";
                int id = ScannerUtil.nextInt(scanner, message);

                //이름입력 받기
                message = "학생의 이름을 입력해주세요";
                String name = ScannerUtil.nextLine(scanner, message);

                //국어 점수 입력 받기
                message = "학생의 국어 점수를 입력해주세요";
                int korean = ScannerUtil.nextInt(scanner, message, MIN_SCORE, MAX_SCORE);

                //영어 점수 입력 받기
                message = "학생의 영어 점수를 입력해주세요";
                int english = ScannerUtil.nextInt(scanner, message, MIN_SCORE, MAX_SCORE);

                //수학 점수
                message = "학생의 수학 점수를 입력해주세요";
                int math = ScannerUtil.nextInt(scanner, message, MIN_SCORE, MAX_SCORE);

                //입력값을 배열에 추가
                //번호 추가
                idArray = ArrayUtil.add(idArray, id);
                //이름 추가
                nameArray = ArrayUtil.add(nameArray, name);
                //국어 추가
                koreanArray = ArrayUtil.add(koreanArray, korean);
                //영어 추가
                englishArray = ArrayUtil.add(englishArray, english);
                //수학 추가
                mathArray = ArrayUtil.add(mathArray, math);

            } else if (userChoice == 2) {
                // 출력코드 구현
                for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                    int id = ArrayUtil.get(idArray, i );
                    String name = ArrayUtil.get(nameArray, i);
                    int korean = ArrayUtil.get(koreanArray, i);
                    int english = ArrayUtil.get(englishArray, i);
                    int math = ArrayUtil.get(mathArray, i);
                    int sum = korean + english + math;
                    double average = (double) sum/3;
                    System.out.printf("번호 : %2d번 이름: %s\n", id, name);
                    System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", korean, english, math);
                    System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                }
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다 ");
                break;
            }
        }


    }
}
