package day0507;
// 로또번호 제작기 ver 1.0
// 중복되지 않는 숫자 6개를 정렬하여 보여주는 프로그램
// 숫자를 순서대로 출력해줌.

import java.util.Random;

public class Ex04Lotto03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];

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

        //numbers 정렬하기
        //우리가 i for 문을 사용하여 i 번째 인덱스의 값과
        //i+1번쨰 인덱스의 값을 비교할 것이므로
        //i for 문의 반복조건식은 numbers.length - 1이 되어야 한다.
        // 4<->5까지 비교하고 i for 문이 종료가 된다.

        /* int a 와 b 에 5와 7을 넣고.
        // 2개의 값을 바꿔보세요
        int a = 5, b = 7;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;//7
        b = temp;//7 값의 교체가 아니라 복사가 이루어짐. 중간다리 역할 temp 필요

        System.out.println("a: " + a);
        System.out.println("b: " + b);*/

        for (int i = 0; i < numbers.length - 1; i++) {
            // numbers 의 i 번째와 i+1번쨰를 비교하여
            // i 번째가 더 크면 실행되는 if 문을 만들어준다.
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                // i for 문의 내부 코드가 전부 실행되고 낫서
                // 실행되는 코드는 for 문의 i++ 이기 때문에
                // i 를 -1로 초기화 해야
                // i++이 실행, i = 0으로 변화된다.
                i = -1; // i 의 0번째 인덱스도 검사를 하기 위한 과정임.
            }
        }

        //결과값 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
        }
    }
}
