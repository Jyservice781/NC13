package day0501;
// Scanner
// 자바에서 각종 입력(키보드, 파일, 데이터 스트림)을 처리할 때 쓰이는
// 클래스이다.
// 우리가 키보드 입력을 받기 위해서는 스캐너를 우리 클래스로
// "수입"해야 한다.
// 기본형 데이터타입들과, 그 데이터타입들을 클래스화 시킨 "포장 클래스" 외의
// 모든 클래스는 사용할 때 반드시 "수입"을 해야 한다.

// 스캐너 클래스를 수입하는 방법은 다음과 같다.

import java.util.Scanner;

// 임포트는 import 패키지.패키지.클래스이름 의 형식으로 이루어진다.
public class Ex07Scanner {
    public static void main(String[] args) {
        // Scanner 클래스 변수의 선언과 초기화
        Scanner scanner = new Scanner(System.in);
        // 위의 new Scanner(System.in) 중 System.in은
        // 우리가 키보드 입력을 받을 것임을 지정해준 것이다.

        // 1. 정수 입력 받기
        // 우리가 키보드로부터 정수를 입력 받을 때에는
        // Scanner 클래스 변수에서 nextInt()를 실행시키면 된다.
        System.out.print("정수를 입력해주세요: ");
        int number = scanner.nextInt();

        // 우리가 실수를 입력받을때에는?
        // nextDouble()
        System.out.print("실수를 입력해주세요: ");
        double myDouble = scanner.nextDouble();

        // 우리가 String 입력을 받을 때에는?
        // nextLine()
        // 단, nextInt(), nextDouble() 등 숫자를 입력한 후에는
        // 반드시 nextLine()을 두번 적어야 정상적으로 작동한다.
        System.out.print("이름을 입력해주세요.");
        String name = scanner.nextLine();
        name = scanner.nextLine();

        System.out.println("사용자가 입력한 정수: " + number);
        System.out.println("사용자가 입력한 실수: " + myDouble);
        System.out.println("사용자의 이름: " + name);
    }
}







