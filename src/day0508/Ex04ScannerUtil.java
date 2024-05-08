package day0508;

import java.util.Scanner;

import util.ScannerUtil;

//우리가 입력할 때 도움을 줄
// ScannerUtil 을 직접 체험해볼 클래스
public class Ex04ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ScannerUtil 을 안쓸경우
        //사용자로부터 숫자 3개를 입력받아보자
        System.out.println("0~10사이의 숫자를 입력해주세요");
        System.out.print(">  ");
        int number = scanner.nextInt();
        while(!(number >= 0 && number <=10)){
            System.out.println("잘못입력하셨습니다.");
            System.out.println("0~10 사이의 숫자를 입력해주세요");
            System.out.println("> ");
            number = scanner.nextInt();
        }
        System.out.println("사용자가 입력한 숫자: " + number);


        // ScannerUtil 을 쓸 경우
        // 단, 외부 패키지에 있는 클래스를 호출하려면 반드시 import 해주어야 한다.
        number = ScannerUtil.nextInt(scanner, "0~10 사이의 숫자를 입력해주세요.", 0, 10);


    }
}
