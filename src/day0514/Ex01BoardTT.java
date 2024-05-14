package day0514;

import types.Board;
import types.BoardTT;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01BoardTT {
    public static ArrayList<BoardTT> boardList = new ArrayList<>();
    public static int nextId = 1;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String message = "1. 입력 2. 목록 3. 종료";
        while (true) {
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다");
                break;
            }
        }
    }

    //
    public static void insert() {
        BoardTT b = new BoardTT();
        b.setId(nextId++);
        String message;

        message = "글의 제목을 입력해주세요";
        b.setTitle(ScannerUtil.nextLine(SCANNER, message));
        // String title = ScannerUtil.nextLine(SCANNER, message);
        // b.setTitle(title);


        message = "글의 작성자를 입력해주세요";
        b.setWriter(ScannerUtil.nextLine(SCANNER, message));

        message = "글의 내용을 입력해주세요";
        b.setContent(ScannerUtil.nextLine(SCANNER, message));

        boardList.add(b);
    }

    public static void printList() {
        if (boardList.isEmpty()) {
            System.out.println("아직 입력된 게시글이 존재하지 않습니다.");
        } else {
            /* for(int i = 0; i <boardList.size(); i++){
                BoardTT b = boardList.get(i);
                System.out.printf("%d. %s - %s\n", b.id, b.title, b.writer);
            } */
            // 위의 코드를 간략화 시키자.
            // forEach(){} - 향상된 for 문
            // boardList 에 있는 아이들을 하나씩 i 처럼 조절할 만한 세세한 조절이 불가능하다
            // size() 가 변하면 오류가 남 add 를 사용할 수 없다.
            // 크기가 고정되어 있는 상태에서 처음부터 끝까지 한바퀴 출력하기 용이함.
            // : 콜론은 반복 조건을 의미한다.

            for (BoardTT b : boardList) {
                System.out.printf("%d. %s - %s\n", b.getId(), b.getTitle(), b.getWriter());
            }

            String message = "상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            while (!validate(userChoice)) {
                System.out.println("잘못입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    public static boolean validate(int id) {
        if (id == 0) {
            return true;
        }
        /* BoardTT b = new BoardTT(id);
        return boardList.contains(b); */
        return boardList.contains(new BoardTT(id));
    }

    public static void printOne(int id) {
        BoardTT b = selectOne(id);
        b.printInfo();
        String message = "1. 수정 2. 삭제 3. 목록으로";
        int userChoice = ScannerUtil.nextInt(SCANNER, message,1,3);
        if(userChoice == 1){
           update(id);
        } else if (userChoice == 2) {
           delete(id);
        } else if (userChoice ==3) {
            printList();
        }
    }

    public static BoardTT selectOne(int id) {
        int index = boardList.indexOf(new BoardTT(id));

        if (index != -1) {
            return boardList.get(index);
        } else {
            return null;
        }
    }

    public static void update(int id){
        BoardTT b = selectOne(id);
        String message;
        message = " 새로운 제목을 입력해주세요";
        b.setTitle(ScannerUtil.nextLine(SCANNER,message));

        message= "새로운 내용을 입력해주세요";
        b.setContent(ScannerUtil.nextLine(SCANNER,message));
        printOne(id);
    }

    public static void delete(int id){
        String message = "정말로 삭제하시겠습니까? Y/N";
        String answer = ScannerUtil.nextLine(SCANNER, message);
        if(answer.equalsIgnoreCase("Y")){
            boardList.remove(new BoardTT(id));
        }else{
            printOne(id);
        }
    }

}
