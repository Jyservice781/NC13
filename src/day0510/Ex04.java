package day0510;
// 구조체(Struct)
// 2세대 언어용임

//게시판 프로그램을 작성하시오
//게시글에는
//글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex04 {
    //전역 변수로 해서 불러오기
    public static int[] number = new int[0];
    public static String[] name = new String[0];
    public static String[] title = new String[0];
    public static String[] content = new String[0];
    public static int nextIdx = 1;

    //전역 상수도 필요할까?
    public static final Scanner SCANNER = new Scanner(System.in);

    //메인
    public static void main(String[] args) {
        // 프로그램 시스템 들어가야함.
        menu();
    }

    // 메뉴판
    public static void menu() {
        String message = "1. 작성 2. 수정/추가 3. 삭제 4. 종료";

        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                // 문자 작성 프로그램 들어가기 메서드 -> textMenu
                textMenu();
            } else if (userChoice == 2) {
                // 작성된 문자 수정 메서드 -> conform
                String form = "";
                conform(form);
            } else if (userChoice == 3) {
                // 작성된 문자 삭제 메서드 -> delete
                delete();
            } else if (userChoice == 4) {
                // 종료구문
                System.out.println("사용해주셔서감사합니다.");
                break;
            }
        }
    }

    public static void textMenu() {
        //글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.

        String message;
        //번호를 랜덤 값으로 가져와야함.순서대로 123 -> 번호
        number = ArrayUtil.add(number, nextIdx++);

        message = "별명을 입력해 주세요: ";//-> 이름
        //해당 문자의 메시지를 사용자가 입력하는 값 그대로 입력받아와야함.
        name = ArrayUtil.add(name, ScannerUtil.nextLine(SCANNER, message));

        message = "글의 제목을 입력해주세요.";//-> 제목
        title = ArrayUtil.add(title, ScannerUtil.nextLine(SCANNER, message));

        message = "글의 내용을 입력해주세요.";//-> 내용
        content = ArrayUtil.add(content, ScannerUtil.nextLine(SCANNER, message));

    }

    public static void conform(String form) {
        // 수정 매서드 첨삭 가능
        // 번호에 맞는 사람을 수정 첨가 해주어야 하기 때문에 이렇게 변경할 수 있겠음.
        String message;
        while (true) {
            message = "1. 수정  2. 삭제";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                // 수정 해주기 indexOf
                message = "수정할 내용을 입력해주세요";
                String text = ArrayUtil.add(text, ScannerUtil.nextLine(SCANNER, message));


            } else if (userChoice == 2) {
                // remove

            }

        }
    }

    public static void delete() {
        //삭제 매서드 -> 한번 확인 문구  Y/N
        // 1. 삭제를 하고 리스트로 실행
        // 2. 삭제를 안하고 계속 진행
    }


//method 종료
}
