package day0510;
// 전역변수 (Global Variable)
// 전역변수란, 변수의 선언위치가 클래스의 최상단에 이루어져서
// 모든 메소드가 공통적으로 접근 가능한 변수를 전역 변수라고 한다.

// 전역 변수의 장점: 모든 메소드가 사용 가능하다.
// 전역 변수의 단점: 모든 메소드가 사용 가능하다.

// 따라서 현재 프로그래밍에서는 전역변수의 사용을 매우 비추천한다.
// 전역 변수의 경우, 우리가 정확하게 값을 트랙킹하기 어려워지기 때문이다.

// 그렇다면 전역 상수는....?
// 상수는 한 번 값이 저장되면 더이상 변경이 안되므로
// 다른 메소드가 사용한다고 해서 값을 변경할 수 는 없다.
// 따라서, 여러 메소드가 공통적으로 사용해야할 상수일 경우,
// 전역상수를 사용하는 것이 추천된다.

public class Ex02Global {
    // 전역 변수
    public static int number;
    // 전역 상수
    public static final int SIZE = 4;

    public static void main(String[] args){
        number = 20;
        System.out.println("number 의 현재값: " + number);
        increase();
        decrease();
        System.out.println("increase() 후 number: "+ number);
    }

    public static void increase(){
        number++;
    }

    public static void decrease(){
        number--;
    }
}
