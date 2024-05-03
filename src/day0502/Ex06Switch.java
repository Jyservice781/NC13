package day0502;

// Switch 조건문
// Switch 조건문은 값이 명확하게 변화하는
// 변수 혹은 연산의 결과값을 선택하여
// 해당 값의 결과에 따라서 특정 코드를 실행시키도록
// 만들어주는 제어문이다.
public class Ex06Switch {
    public static void main(String[] args) {
        // switch 조건문에서 사용할 int 변수
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("그외입니다.");
        }

        // 나이에 따라서
        // 유치원, 초등학생, 중학생, 고등학생, 성인이 출력되는 프로그램을
        // Switch문으로 만들어보세요
    }
}








