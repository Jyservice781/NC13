package day0502;
// 사용자로부터 키와 몸무게를 입력 받아서
// 비만도를 출력하는 프로그램
// 단, 사용자가 잘못된 값을 입력할 경우
// 올바른 값이 입력될때까지 다시 입력을 받으시오.

import java.util.Scanner;

public class Ex10While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받을때, 사용자로부터 어떤 값을 입력해야하는지를
        // 알려주는 String 변수 message
        String message;

        // 사용자가 입력한 값을 임시로 보관할
        // double 변수 temp
        double temp;

        // 키 입력 받기
        message = "키를 M 단위로 입력해주세요.";

        System.out.println(message);
        System.out.print("> ");

        temp = scanner.nextDouble();

        // 잘못된 입력인지 체크하고
        // 잘못됬으면 다시 입력
        while (temp <= 0 || temp > 2.72) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double height = temp;

        // 몸무게 입력
        message = "몸무게를 KG 단위로 입력해주세요.";

        System.out.println(message);
        System.out.print("> ");

        temp = scanner.nextDouble();

        // 잘못된 입력인지 체크하고
        // 잘못됬으면 다시 입력
        while (temp <= 0 || temp > 565) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextDouble();
        }

        double weight = temp;

        double bmi = weight / height / height;

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
