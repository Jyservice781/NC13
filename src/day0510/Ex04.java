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
    //main

    // 메뉴판
    public static void menu() {
        String message = "1. 게시글작성 2. 게시판보기 3. 종료";

        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                // 문자 작성 프로그램 들어가기 메서드 -> textMenu
                textMenu();
            } else if (userChoice == 2) {
                // 게시판 보기
                menuList();
            } else if (userChoice == 3) {
                // 종료구문
                System.out.println("사용해주셔서감사합니다.");
                break;
            }
        }
    }
    //mainMenu

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

    //입력 메서드
    public static void menuList() {
        //게시판 출력하는 메서드
        // -> 게시글에 엑세스 하기 위한 루트 필요
        // -> 게시글에 목록들이 보여지고 몇번째 리스트에 들어가서 상세를 볼 것인지 필요
        for (int i = 0; i < number.length; i++) {
            String nameOutput = ArrayUtil.get(name,i);
            int id = ArrayUtil.get(number, i);

            System.out.printf("%d, %s\n", id, nameOutput);
        }
        String message = "상세보기할 학생의 번호나 뒤로 가시려면 0을 입력해주세요";
        int userChice = ScannerUtil.nextInt(SCANNER, message);

        while(!validate(userChice)){
            System.out.println("잘못입력하셨습니다.");
            userChice = ScannerUtil.nextInt(SCANNER, message);
        }

        if(userChice != 0){
            //userChoice 가 0 이 아닐때 ]
            //상세보기를 출력
            output(userChice);
        }
    }

    public static boolean validate(int value){
        if(value == 0){
            return true;
        }
        return ArrayUtil.contains(number, value);
    }

    //게시글 상세보기
    public static void output(int id){
        int index = ArrayUtil.indexOf(number, id);
        String userName = ArrayUtil.get(name, index);
        String userTitle = ArrayUtil.get(title, index);
        String userContent = ArrayUtil.get(content, index);

        System.out.println("====================================");
        System.out.println("작성자: " + userName);
        System.out.println("------------------------------------");
        System.out.println("게시글 제목: " + userTitle);
        System.out.println("게시글 내용: " + userContent);
        System.out.println("====================================");

        String message = "1. 수정 2. 삭제 3. 뒤로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message,1,3);

        if(userChoice == 1){
            // 수정
            update(id);
        }else if(userChoice == 2){
            // 삭제
            delete(id);
        } else if (userChoice == 3) {
            //뒤로
            menuList();
        }
    }

    public static void update(int id){
        int index = ArrayUtil.indexOf(number, id);
        String message;

        message = "별명을 다시 입력해주세요";
        String rename = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(name, index, rename);

        message = "글의 제목을 다시 입력해주세요";
        String reTitle = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(name, index, reTitle);

        message = "글의 내용을 다시 입력해주세요";
        String reContent = ScannerUtil.nextLine(SCANNER, message);
        ArrayUtil.set(name, index, reContent);
    }

    // -> 게시글을 선택하고 수정, 삭제하는 메서드가 필요함.
    public static void delete(int id) {
        //삭제 매서드 -> 한번 확인 문구  Y/N
        // 1. 삭제를 하고 리스트로 실행
        // 2. 삭제를 안하고 계속 진행
        int index = ArrayUtil.indexOf(number, id);
        String message = "정말로 삭제하시겠습니까 ? Y/ N";
        String answer = ScannerUtil.nextLine(SCANNER, message);

        if(answer.equalsIgnoreCase("Y")){
            number = ArrayUtil.remove(number, index);
            name = ArrayUtil.remove(name, index);
            title = ArrayUtil.remove(title, index);
            content = ArrayUtil.remove(content, index);

            menuList();
        }else{
            output(id);
        }

    }
//method 종료
}
