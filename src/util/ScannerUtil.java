package util;

import java.util.Scanner;

// 스캐너 클래스를 사용할때
// 좀 더 간편하게 사용할 수 있는 메소드들을 모아둔
// 클래스
public class ScannerUtil {
    // 출력에 사용할 메세지를 받아서
    // 예쁘게 출력해줄 메소드
    public static void printMessage(String message) {
        System.out.println(message);
        System.out.print("> ");
    }

    // 사용자로부터 입력에 사용할 스캐너와 입력에 필요한 메시지를 받아서
    // 정수 입력을 처리하여 리턴해주는 메소드
    public static int nextInt(Scanner scanner, String message) {
        printMessage(message);
        return scanner.nextInt();
        // scanner, string
    }

    // 사용자가 스캐너, 메시지, 최솟값, 최댓값을 보내면
    // 해당 범위의 정수를 리턴해주는 메소드
    public static int nextInt(Scanner scanner, String message, int min, int max) {
        //scanner string int int
        int temp = nextInt(scanner, message);
        while (!(temp >= min && temp <= max)) {
            System.out.println("범위를 벗어난 값입니다.");
            temp = nextInt(scanner, message);
        }
        //올바른 값이 들어있는 temp 를 리턴해 줌.
        return temp;
    }


}
