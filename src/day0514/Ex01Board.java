package day0514;


// 게시판 클래스와
// 게시판
// 어레이 리스트를 활용하여
// 게시판 프로그램을 작성하시오

import java.util.Scanner;
import java.util.ArrayList;

import util.ArrayUtil;
import util.ScannerUtil;

import types.Board;

public class Ex01Board {
    public static ArrayList<Board> list = new ArrayList<>();
    public static final Scanner SCANNER = new Scanner(System.in);
    public static int nextNum = 1;

    public static void main(String[] args) {
        showMenu();
    }

    // main menu
    public static void showMenu() {
        String message;
        message = "[  1. 입력 2. 게시판보기 3. 종료  ]";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                //입력 문구 출력
                insert();
            } else if (userChoice == 2) {
                // 게시판 보이기
                printList();
            } else if (userChoice == 3) {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }
    }

    //입력으로 출력하기
    //글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.
    public static void insert() {
        Board b = new Board();
        String message;
        // 글 번호
        b.num = nextNum++;

        // 닉네임
        message = "이름을 입력해주세요: ";
        b.id = ScannerUtil.nextLine(SCANNER, message);

        // 제목
        message = "제목을 입력해주세요: ";
        b.title = ScannerUtil.nextLine(SCANNER, message);

        // 내용
        message = "내용을 입력해주세요: ";
        b.content = ScannerUtil.nextLine(SCANNER, message);

        list.add(b);
    }

    // 게시판 보여주기 리스트
    public static void printList() {
        // 번호들만 차례대로 보여 줘야함.
        if (list.isEmpty()) {
            System.out.println("아직 입력한 내용이 없습니다.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Board b = list.get(i);
                System.out.printf(" %d. %s\n", b.num, b.id);
            }
        }
    }

    // 유효성 검사
    // validate
    public static boolean validate(int user){
        //true false
        // 0은 예외
        if(user == 0){
            return true;
        }
        Board b = new Board();
        b.num = user;
        return list.contains(b);
    }

    // printOne(){}
    public static void printOne(){
         Board b = new Board();
         b.printInfo();
    }

    //  게시판에서 속성 보기 값 처럼 안으로 들어 가 져야 함.ㅣ

    // 게시판 출력 보기

}
