package day0501;
// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 점수 순으로 입력을 받아서
// 다음과 같은 형식으로 출력되는 프로그램을 작성하시오
// 출력형식:
// 번호: 0#번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점
// 4시 55분까지

import java.util.Scanner;

public class Ex08Gradebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 번호를 입력을 받는다.
        System.out.print("번호: ");
        int bunho = scanner.nextInt();

        // 2. 이름을 입력을 받는다.
        System.out.print("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        // 3. 국어점수 입력을 받는다.
        System.out.print("국어: ");
        int korean = scanner.nextInt();

        // 4. 영어점수 입력을 받는다.
        System.out.print("영어: ");
        int english = scanner.nextInt();

        // 5. 수학점수 입력을 받는다.
        System.out.print("수학: ");
        int math = scanner.nextInt();

        // 6. 총점을 계산한다.
        int sum = korean + english + math;

        // 7. 평균을 계산한다.
        double average = sum / 3.0;

        // 8. 번호, 이름을 출력한다.
        System.out.printf("번호: %02d번 이름: %s\n", bunho, name);

        // 9. 국영수 점수를 출력한다.
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);

        // 10. 총점 평균을 출력한다.
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
    }
}









