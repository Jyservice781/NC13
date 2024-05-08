package day0508;
// 로또 번호 제작기
// 사용자로부터 게임 수를 입력 받아서
// 한번에 여러 게임을 할 수 있는 로또 번호 제작 프로그램을 작성하시오.
// 몇 게임 하시겠습니끼?
// > 5
// 1번째 게임
// 1, 수동 2. 자동
// > 1
// 1 번째 숫자를 입력해주세요...
// 2번째 게임
// 1. 수동 2. 자동
// > 2
// 3번쨰 게임.....
// 컴퓨터의 숫자:[...]
// 사용자의 1번쨰 게임 : [...] -> X개 맞음

import java.util.Scanner;
import java.util.Random;

public class Ex02Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 게임 하시겠습니까?\n");
        System.out.print("> ");

        // 유저가 선택한 게임
        int userChoice = scanner.nextInt();
        int gameChoice = userChoice;

        int[][] multiArray = new int[userChoice][2];

        // 무한 반복문으로 메뉴 설정 1. 자동 2. 수동
                while (true) {
                    // 사용자로부터 숫자 받기
                    if (gameChoice == 1) {
                        // 1 개의 게임만 돌림 - 수동 자동 선택
                        System.out.println("1. 수동 2. 자동\n" + "> ");
                        int gameNumber = 0;
                        if (gameNumber == 1) {
                            //수동으로 출력 게임
                            System.out.println("1번째 숫자를 입력해주세요");
                        } else {
                            //자동으로 출력게임
                            System.out.println("게임을 종료합니다");
                        }
                    } else if (gameChoice == 2) {
                        // 2개의 게임을 돌림 - 수동 자동 선택
                        System.out.println("1. 수동 2. 자동\n" + "> ");
                        if (userChoice == 1) {
                            //수동으로 출력 게임
                        } else {
                            //자동으로 출력게임
                        }
                    } else if (gameChoice == 3) {
                        // 3개의 게임을 돌림 - 수동 자동 선택
                        System.out.println("1. 수동 2. 자동\n" + "> ");
                        if (userChoice == 1) {
                            //수동으로 출력 게임
                        } else {
                            //자동으로 출력게임
                        }
                        break;
                    }

                    break;
                }

        // 한번에 여러 게임할 수 있도록 설정
        // 사용자의 1번쨰 게임 맞춘 수 출력할 변수


    }
}
