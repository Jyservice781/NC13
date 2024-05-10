package day0510;

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

// 전역 변수와 상수를 사용한
// 학생 성적 관리 프로그램
public class Ex03GradeBook01 {
    // 각종 정보를 담을 배열
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];

    //전역 상수
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;


    //main
    public static void main(String[] args) {
        showMenu();
    }

    //메뉴를 보여주는 메소드
    public static void showMenu() {
        String message = "1. 학생입력 2. 전체 출력 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                //학생 입력 메소드 호출
                insert();
            } else if (userChoice == 2) {
                // 전체 출력 메소드 호출
                output();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    //입력 메소드 만들기
    public static void insert(){
        //학생 입력 "번호, 이름, 국어, 영어, 수학 " 입력받기
        String message = "번호를 입력해주세요 : ";
        int id = ScannerUtil.nextInt(SCANNER ,message, SCORE_MIN, SCORE_MAX);
        //이름
        message = "이름을 입력해주세요 : ";
        String name = ScannerUtil.nextLine(SCANNER, message);
        // 국어
        message = "국어점수를 입력해주세요";
        int korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
        //영어
        message = "영어 점수를 입력해주세요";
        int english = ScannerUtil.nextInt(SCANNER,message ,SCORE_MIN, SCORE_MAX);
        //수학
        message = "수학 점수를 입력해주세요";
        int math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        // 점수를 변수에 담아서 저장해줌 동적 메소드를 사용할 것임.
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
    }

    // 출력 메소드 만들기
    public static void output(){
        //지금까지 적힌 학생들의 정보를 출력
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
    }

}
