package day0513;
//ArrayList를 사용하여
// 학생 관리 프로그램을 작성하시오
// 수정/ 삭제도 가능해야함.
// 메소드 분리의 경우 가능할 경우 하시오
// 전역변수는
// public static ArrayList<Student> list = new ArrayList<>();
// public static int nextInt = 1;
// 2가지를 만들어서 사용하시고
// 필요에 따라서는 다양한 전역 상수를 직접 만들어서
// 코딩하시면 됩니다
// 4시 30분까지

import java.util.Scanner;
import java.util.ArrayList;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex04GradeBook02 {
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];
    public static int nextInt = 1;
    public static int index = 0;
    public static String message;

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;


    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            message = ("1. 입력 2. 출력 3. 종료");
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if (userChoice == 1) {
                // 입력 메서드
                insert();
            } else if (userChoice == 2) {
                // 출력 메서드
                printList();
            } else if (userChoice == 3) {
                // 종료 문구
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }

        }
    }

    //입력 메서드 쓰기
    public static void insert() {
        idArray = ArrayUtil.add(idArray, nextInt++);

        message = "이름을 입력해주세요";
        nameArray = ArrayUtil.add(nameArray, ScannerUtil.nextLine(SCANNER, message));

        message = "국어점수를 입력해주세요";
        koreanArray = ArrayUtil.add(koreanArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "영어점수를 입력해주세요";
        englishArray = ArrayUtil.add(englishArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));

        message = "수학점수를 입력해주세요";
        mathArray = ArrayUtil.add(mathArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));
    }

    //출력 메서드
    public static void printList() {
        for (int i = 0; i < idArray.length; i++) {
                String name = ArrayUtil.get(nameArray, i);
                int id = ArrayUtil.get(idArray, i);
                System.out.printf("%d. %s\n", id, name);
        }

        message = "상세보기 할 학생의 번호나 0번을 입력하십시오";
        int userChoice = ScannerUtil.nextInt(SCANNER, message);

        printOne(userChoice);
    }

    // validate 문 사용해야함. why?

    public static void printOne(int id) {

        int index = ArrayUtil.indexOf(idArray, id);
        String name = ArrayUtil.get(nameArray, index);
        int korean = ArrayUtil.get(koreanArray, index);
        int english = ArrayUtil.get(englishArray, index);
        int math = ArrayUtil.get(mathArray, index);
        int sum = korean + english + math;
        double average = (double) sum / SUBJECT_SIZE;

        System.out.println("=========================================");
        System.out.println(name + "학생의 정보");
        System.out.println("-----------------------------------------");
        System.out.printf("번호 : %2d번 이름: %s\n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
        System.out.println("=========================================");

        //출력 끝나고 다시 물어봐야함.
  /*      message = "1. 수정 2, 삭제 3, 뒤로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message);
        if (userChoice == 1) {
            // 수정 문구
            //
        } else if (userChoice = 2) {
            //삭제 문구
            //delete();
        } else if (userChoice == 3) {
            printList();
        }*/
    }



}
