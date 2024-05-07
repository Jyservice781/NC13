package day0507;
//로또 번호 제작기 ver 1.1
//사용자로부터 1~45 숫자 6개를 입력받아서
//scanner
//컴퓨터의 당첨 숫자와 비교하여
// if
//맞춘 갯수를 출력하는 프로그램을 작성하시오
//System.out.println
//for／while
//단, 사용자가 잘못된 숫자를 입력하면 올바른 숫자가 입력될때까지
//입력을 받으시오

import java.util.Scanner;
import java.util.Random;

public class Ex05Lotto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //사용자로부터 1 ~ 45까지의 숫자 중 6개를 입력 받음.
        System.out.print("1~45까지의 숫자중 6개를 입력하시오");
        System.out.print("> ");
        int user = scanner.nextInt();
        int[] userNum = new int[6];
        int[] numbers = new int[6];

        //사용자 넘버 가져옴.
        for (int i = 0; i <  userNum.length; ) {
            int temp = random.nextInt(45) + 1;

            boolean isDuplicated = false;

            for (int j = 0; j <  userNum.length; j++) {
                if (userNum[j] == temp) {
                    isDuplicated = true;

                }
            }
            if (!isDuplicated) {
                userNum[i++] = temp;
            }

        }
        for (int i = 0; i <  userNum.length - 1; i++) {
            if ( userNum[i] >  userNum[i + 1]) {
                int temp =  userNum[i];
                userNum[i] =  userNum[i + 1];
                userNum[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i <  userNum.length; i++) {
            System.out.printf("numbers[%d] : %d\n", i,  userNum[i]);
        }


        //여기서부터 컴퓨터의 랜덤 값이 됨.
        for (int i = 0; i < numbers.length; ) {
            int temp = random.nextInt(45) + 1;

            boolean isDuplicated = false;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == temp) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                numbers[i++] = temp;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
        }
    }
}
