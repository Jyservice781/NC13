package day0502;

// 사용자로부터 키와 몸무게를 입력 받아서
// 저체중, 정상체중, 과체중, 비만을 출력하는 프로그램을 작성하시오
// BMI 공식: 몸무게(kg) / 키(M) / 키(M)
// BMI에 따른 비만도
// 18.5 미만: 저체중
// 18.5 ~ 23: 정상체중
// 23 ~ 25: 과체중
// 25 이상: 비만

// 단, 기네스북에 따르면, 세상에서 가장 키가 컸던 사람은 2.72M였습니다.
// 세상에서 가장 몸무게가 무거웠던 사람은 565kg였습니다.
// 만약 사용자가 잘못된 값을 입력할 경우, 더이상의 진행없이
// "잘못된 값이 입력되어 프로그램이 종료됩니다" 가 출력된 후
// 프로그램이 종료될수 있도록 코드를 작성하시오
// 50분까지

import java.util.Scanner;

public class Ex05Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키를 입력받는다.
        System.out.print("키: ");
        double height = scanner.nextDouble();

        if (height < 2.72 && height > 0) {
            System.out.print("몸무게: ");
            double weight = scanner.nextDouble();

            if (weight < 565 && weight > 0) {
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

            } else {
                System.out.println("잘못된 입력");
            }


        } else {
            System.out.println("잘못된 입력");
        }
    }
}







