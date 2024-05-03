package day0502;

// 사용자로부터 점수를 입력 받아서
// 90점 이상: A
// 80대: B
// 70대: C
// 60대: D
// 60미만: F
// 가 출력되는 프로그램을 작성하시오
// 쉬는시간 포함 45분까지

import java.util.Scanner;

public class Ex03LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
