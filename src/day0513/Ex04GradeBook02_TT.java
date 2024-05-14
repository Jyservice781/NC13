package day0513;

import types.Student;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04GradeBook02_TT {
    public static ArrayList<Student> list = new ArrayList<>();
    // ArrayList<타입> 이름 = new ArrayList<>();
    public static int nextId = 1;
    public static String message = "";

    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    // showMenu()
    public static void showMenu() {
       message = "1. 입력  2. 목록보기  3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                // 학생 입력 메소드 실행
                insert();
            } else if (userChoice == 2) {
                // 학생 목록 출력 메소드 실행
                printList();
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 입력 메소드 만들기
    // insert()
    public static void insert() {
        // 학생의 정보를 임시로 저장할 Student 객체
        Student s = new Student();
        //학생의 번호 입력하기
        s.id = nextId++;

        //학생의 이름 입력하기
        message = "학생의 이름을 입력해주세요.";
        s.name = ScannerUtil.nextLine(SCANNER, message);

        //학생의 국어 점수 입력하기
        message = "학생의 국어 점수를 입력해 주세요.";
        s.korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        //학생의 영어 점수 입력하기
        message = "학생의 영어 점수를 입력해 주세요.";
        s.english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        //학생의 수학 점수 입력하기
        message = "학생의 수학 점수를 입력해 주세요.";
        s.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        //학생이 list 에 추가될 수 있음.
        list.add(s);
    }

    // printList()
    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");
        } else {
            //출력코드 입력
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.printf("%d, %s\n", s.id, s.name);
            }
            message = "상세보기할 학생의 번호나 뒤로 가실려면 0을 입력해주세요";

            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (!validate(userChoice)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }
            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    // validate()
    // 유효성 검사로  validate 를 먼저 실행함.
    public static boolean validate(int id) {
        if (id == 0) {
            return true;
        }
        Student s = new Student();
        s.id = id;

        return list.contains(s);
    }

    // printOne()
    public static void printOne(int id) {
        Student s = selectOne(id);
        if (s == null) {
            System.out.println("잘못된 번호입니다.");
            System.out.println("학생 목록 출력으로 돌아갑니다.");
            printList();
        } else {
            s.printInfo();
            message = "1. 수정 2. 삭제 3. 뒤로 가기 ";
            int userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);

            if (userChoice == 1) {
                // 수정 메소드 실행
                update(id);
            } else if (userChoice == 2) {
                // 삭제 메소드 실행
                delete(id);
            } else if (userChoice == 3) {
                printList();
            }
        }
    }
    // update()
    public static void update(int id) {
        Student s = selectOne(id);
        message = "학생의 새로운 이름을 입력해주세요";
        s.name = ScannerUtil.nextLine(SCANNER,message);

        message = "학생의 새로운 국어 점수를 입력해주세요";
        s.korean = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 새로운 영어 점수를 입력해주세요";
        s.english = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        message = "학생의 새로운 수학 점수를 입력해주세요";
        s.math = ScannerUtil.nextInt(SCANNER, message, SCORE_MIN, SCORE_MAX);

        printOne(id);
    }
    // delete()
    public static void delete(int id){
        Student s = selectOne(id);
        message = "정말로 삭제하시겠습니까? Y/ N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        if(answer.equalsIgnoreCase("Y")){
            list.remove(s);
            printList();
        }else{
            printOne(id);
        }
    }

    // selectOne()
    // 리스트에서 몇 번째에 있는애인지 찾아서 Student 객체를 리턴할 수 있도록 할 것
    public static Student selectOne(int id) {
        Student s = new Student();
        s.id = id;

        int index = list.indexOf(s);

        if (index == -1) {
            return null;
        } else {
            return list.get(index);
        }
    }
}
