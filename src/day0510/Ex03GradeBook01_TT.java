package day0510;

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex03GradeBook01_TT {
    // 각종 정보를 담을 배열
    public static int[] idArray = new int[0];
    public static String[] nameArray = new String[0];
    public static int[] koreanArray = new int[0];
    public static int[] englishArray = new int[0];
    public static int[] mathArray = new int[0];
    //다음 입력될 학생의 번호를 저장한 전역 변수
    public static int nextId = 1;

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
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    //입력 메소드 만들기
    public static void insert() {
        //학생 입력 "번호, 이름, 국어, 영어, 수학 " 입력받기
        String message;

        idArray = ArrayUtil.add(idArray, nextId++);
        //학생의 번호가 1씩 늘어나게 된다++
        //이름
        message = "이름을 입력해주세요 : ";
        nameArray = ArrayUtil.add(nameArray, ScannerUtil.nextLine(SCANNER, message));
        // 국어
        message = "국어점수를 입력해주세요";
        koreanArray = ArrayUtil.add(koreanArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));
        //영어
        message = "영어 점수를 입력해주세요";
        englishArray = ArrayUtil.add(englishArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));
        //수학
        message = "수학 점수를 입력해주세요";
        mathArray = ArrayUtil.add(mathArray, ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX));
    }

    // 학생 정보 출력 메소드 만들기 -> 게시판 처럼 만들어 주고 싶음.
    // 수정, 삭제도 가능하도록 만들어 줄것임.
    public static void printList() {
        //지금까지 적힌 학생들의 정보를 출력
        for (int i = 0; i < idArray.length; i++) {
            String name = ArrayUtil.get(nameArray, i);
            int id = ArrayUtil.get(idArray, i);

            System.out.printf("%d. %s\n", id, name);
        }

        String message = "상세보기할 학생의 번호나 뒤로 가실려면 0을 입력해주세요.";
        int userChoice = ScannerUtil.nextInt(SCANNER, message);
        while (!validate(userChoice)) {
            System.out.println("잘못 입력하셨습니다.");
            userChoice = ScannerUtil.nextInt(SCANNER, message);
        }

        //0이거나 true 가 나왔다
        if (userChoice != 0) {
            //학생 개별 보기 메서드 호출
            //어떤 학생이 가져왔는지를 보기 위함
            printOne(userChoice);
        }
    }
    // 목록 보기에서 사용자가 입력한 값이
    // 유효한 값인지 체크하여
    // 유효하면 true, 유효하지 않으면 false 가 리턴되는 멧서드

    public static boolean validate(int value) {
    /*    if (value == 0) {
            return false;
        } else if () {
            return true;
        }*///if elseif 에 현혹되버림..;
        //0이거나 학생 배열 번호 값이거나
        if (value == 0) {
            return true;
        }
        return ArrayUtil.contains(idArray, value);
        //contains => 현재 배열에서 특정한 값이 존재하면 true,없으면 false가 나오는 방식임.
    }

    public static void printOne(int id) {
        //id 값을 토대로 index 를 가져와야함.
        int index = ArrayUtil.indexOf(idArray, id);
        String name = ArrayUtil.get(nameArray, index);
        int korean = ArrayUtil.get(koreanArray, index);
        int english = ArrayUtil.get(englishArray, index);
        int math = ArrayUtil.get(mathArray, index);

        int sum = korean + english + math;
        double average = (double) sum / SUBJECT_SIZE;
        //매직넘버 3이 있을 경우 되도록이면 상수화를 취해서 어떤 값인지 보기 편하도록 변경한다.

        System.out.println("=========================================");
        System.out.println(name + "학생의 정보");
        System.out.println("-----------------------------------------");
        System.out.printf("번호 : %2d번 이름: %s\n", id, name);
        System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
        System.out.println("=========================================");

        String message = "1. 수정 2. 삭제 3. 뒤로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

        if (userChoice == 1) {
            // 학생 수정 메소드 실행
            update(id);
            printOne(id);
        } else if (userChoice == 2) {
            // 학생 삭제 메소드 실행
            delete(id);
        } else if (userChoice == 3) {
            // 뒤로가기 메소드 실행
            // 뒤로 가기를 하면 메뉴가 뜸
            // 학생 리스트를 보는 것을 다시 실행시켜준다
            printList();
        }
    }

    public static void update(int id) {
        //이름 국어 영어 수학 점수를 업데이트할 것
        int index = ArrayUtil.indexOf(idArray, id);
        String message;

        message = "학생의 이름을 다시 입력해주세요.";
        String name = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(nameArray, index, name);

        message = "학생의 국어 점수를 다시 입력해주세요.";
        int korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(koreanArray, index, korean);

        message = "학생의 영어 점수를 다시 입력해주세요.";
        int english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(englishArray, index, english);

        message = "학생의 수학 점수를 다시 입력해주세요.";
        int math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);
        ArrayUtil.set(mathArray, index, math);
    }

    public static void delete(int id) {
        int index = ArrayUtil.indexOf(idArray, id);
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        // 스트링 값 비교를 할때 대소문자 없이 같으면, true 다르면 false 를 확인하고 싶다면?
        // equalsIgnoreCase
        if (answer.equalsIgnoreCase("Y")) {
            // 사용자가 동의했으므로 삭제
            idArray = ArrayUtil.remove(idArray, index);
            nameArray = ArrayUtil.remove(nameArray, index);
            koreanArray = ArrayUtil.remove(koreanArray, index);
            englishArray = ArrayUtil.remove(englishArray, index);
            mathArray = ArrayUtil.remove(mathArray, index);

            // 삭제가 진행된 후에는 리스트를 보여주어야 함.
            printList();
        } else {
            // 상세보기를 다시 실행시켜준다.
            printOne(id);
        }
        //Y ->  삭제 진행
        //N ->  개별 진행으로 진행
    }
    // 클래스 마지막줄
}