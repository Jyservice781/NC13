package day0503;
// 1. 1부터 100까지의 소수를 구하는 프로그램
// 소수란?
// 1과 자기자신으로 나눠지는 수
// = 약수가 2개인 숫자

// 약수란?
// A를 B로 나눴을떄 나눠 떨어지면
// B는 A의 약수이다.
// = A를 B로 나눴을때 나머지가 0과 같으면
//B는 A 의 약수이다.


public class Ex01PrimeNumber {
    public static void main(String[] args) {
        // i for 문에서 i 는 소수인지 아닌지를 검사할 숫자가 된다.
        // 그렇다면 i의 시작값은? i = 1
        // i 의 반복 조건식은? i <= 100
        for (int i = 1; i <= 100; i++) {
            // i의 약수의 객수를 저장할 int 변수
            int count = 0;

            // j for 문의 j는 i 의 약수인지 아닌지를 검사할 숫자가 된다.
            // 그렇다면 j의 시작값은?  j = 1
            // j의 반복 조건식은? j <= i

            for (int j = 1; j <= i; j++) {
                // j for 문이 반복되는 동안
                // i 나누기 j의 나머지가 0 과 같으면
                // j 는 i 의 약수이므로,
                // count 를 1 증가시킨다.
                if (i % j == 0) {
                    count++;
                }
                //j for 문으로 i 의 약수의 갯수를 알수 있다 .
            }

            if (count == 2) {
                System.out.println(i + "은 소수입니다.");
            }
        }


    }
}
