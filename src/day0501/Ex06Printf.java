package day0501;

// printf의 다양한 형식
// 우리가 필요에 따라서는 printf를 사용해서
// 우리가 원하는 내용을 콘솔에 지정한 형식으로 출력이 가능하다.
// 단, 우리가 웹 프로그래밍에 들어가게 되면
// 더이상 출력하는 곳이 콘솔이 아니기 때문에
// 사용되지 않는다.
public class Ex06Printf {
    public static void main(String[] args) {
        // 정수 출력에 사용할 int 변수
        int number = 15;
        // 1. 10진법 정수(Decimal)
        System.out.println("=============================");
        System.out.println("1. 10진법 정수");
        System.out.println("-----------------------------");
        // A. 10진법 정수를 그대로 출력해라
        System.out.printf("1-A. [%d]\n", number);
        // B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("1-B. [%5d]\n", number);
        // C. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("1-C. [%-5d]\n", number);
        // D. 10진법 정수를 오른쪽 정렬 5자리로 출력하되,
        //    왼쪽 빈 자리는 0으로 채워라
        System.out.printf("1-D. [%05d]\n", number);
        System.out.println("=============================");
        System.out.println();
        System.out.println("=============================");
        // 2. 실수(float)
        // 실수 출력에 사용할 double 변수
        double myDouble = 3.141592;
        System.out.println("2. 실수");
        System.out.println("-----------------------------");
        // A. 실수를 그대로 출력해라
        System.out.printf("2-A. [%f]\n", myDouble);
        // B. 실수를 오른쪽 정렬 10자리로 출력해라
        System.out.printf("2-B. [%10f]\n", myDouble);
        // C. 실수를 왼쪽 정렬 10자리로 출력해라
        System.out.printf("2-C. [%-10f]\n", myDouble);
        // D. 실수를 오른쪽 정렬 10자리로 출력하되
        //    왼쪽 빈 자리는 0으로 채워라
        System.out.printf("2-D. [%010f]\n", myDouble);
        // E. 실수를 소숫점 2번째 자리까지 출력해라
        System.out.printf("2-E. [%.2f]\n", myDouble);
        System.out.println("=============================");
        System.out.println();
        System.out.println("=============================");
        System.out.println("3. 스트링(String)");
        System.out.println("-----------------------------");
        // A. String을 그대로 출력해라
        System.out.printf("3-A. [%s]\n", "abcdEFGH");
        // B. String을 모두 대문자로 출력해라
        System.out.printf("3-B. [%S]\n", "abcdEFGH");
        // C. String을 오른쪽 정렬 10자리로 출력해라
        System.out.printf("3-C. [%10s]\n", "abcdEFGH");
        // D. String을 왼쪽 정렬 10자리로 출력해라
        System.out.printf("3-D. [%-10s]\n", "abcdEFGH");
        // 단, 왼쪽 빈 자리를 0으로 채워라는
        // 0도 문자이기 때문에 불가능하다.
        System.out.println("=============================");
        // 만약 printf로 여러개의 형식을 맞추어 출력해야한다면?
        System.out.printf("%2d %03d %08d\n", 1, 2, 3);

        // 여러분들이 자유롭게 변수를 만들어서
        // 다음과 같은 형식으로 출력이 되는 코드를 작성해보세요.
        // 결과물:
        // 이름: ### 나이: 0##세
        // 국어: 0##점 영어: 0##점 수학: 0##점
        // 총점: 0##점 평균: 0##.##점

        // 출력에 사용할 변수들
        // 이름
        String name = "조재영";
        // 나이
        int age = 18;
        // 국어
        int korean = 90;
        // 영어
        int english = 90;
        // 수학
        int math = 91;
        // 총점
        int sum = korean + english + math;
        // 평균
        double average = (double)sum / 3;

        System.out.printf("이름: %s 나이: %03d세\n", name, age);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

    }
}















