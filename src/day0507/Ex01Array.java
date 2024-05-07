package day0507;
// 배열(Array)
// 배열이란, 똑같은 종류의 데이터 타입을
// 한 번에 여러개씩 제어 할 수 있는 데이터 타입이다.

// 변수의 이름이 중요하지 않을 떄가 있음. -> 여러개에 한번에 처리할 때

// 배열의 경우, 우리가 다음과 같은 방법으로 선언과 초기화를 한다.
// 데이터타입[] 배열이름 = new 데이터타입[길이]
// 그리고, 배열 안에 각각의 요소(element)를 접근할 때에는
// 인덱스를 통해서 접근을 하게 된다.
// 인덱스란, 해당 배열에서 몇번째 요소인지를 가리키는
// 번호인데, 사람은 1번째으로 세지만
// 컴퓨터는 0번째 부터 세게 된다.
// 따라서, 인덱스의 최대 값은 해당 배열의 길이 - 1이 된다.
// 만약 유효하지 않은 인덱스를 접근하게 된다면,
// ArrayIndexOutOfBoundsException 이라는 에러가 발생하게 된다.

// 배열의 n 번째 인덱스에 있는 요소를 접근할때 (= 값을 저장하거나 호출할때) 에는
// 배열이름[n] 으로 접근하게 된다.

// String[] -> String 배열임

public class Ex01Array {
    public static void main(String[] args) {
        // int 배열의 길이를 저장할 int 변수
        int length = 4;
        // int 배열 intArray 를 선언하고, 길이는 4로 지정
        // 배열은 맨처음에 길이 지정을 해줘야함.
        // int 변수로도 길이를 지정해 줄 수 있음
        int[] intArray = new int[length];

        // 우리가 만든 배열의 0번째 요소에 새로운 값을 저장해보자
        intArray[2] = 20;

        // 기본형 데이터타입의 배열과, 참조형 데이터타입의 다른 점은
        // 기본형 데이터타입의 배열은 선언과 초기화가 되면
        // 모든 요소는 0으로 초기화 된다.
        // 참조형 데이터타입의 배열은 null 이라는 값으로 초기화가 된다.

        // 또한 배열의 인덱스는 우리가 변수를 넣어서 특정 요소를
        // 가리킬 수 있다.
        // 그렇다면 우리가 모든 요소의 값을 출력하고 싶다면,
        // 어떤방법을 쓰면 될까?

        // 배열의 모든 인덱스를 하나하나 찍어보자
//        int idx = 0;
//        System.out.println(intArray[idx]);
//        idx = 1;
//        System.out.println(intArray[idx]);
//        idx = 2;
//        System.out.println(intArray[idx]);
//        idx = 3;
//        System.out.println(intArray[idx]);

        // 3 = magicNumber 다

        // 배열의 길이는 해당 배열의 length 라는
        // 속성값으로 저장되어 있다.
        // 어떤 변수 혹은 값의 속성값 또는 메소드를 접근할 때에는
        // 변수.속성 or 변수.메소드로 접근하게 된다.
        // (.)도 하나의 연산자가 된다 번수혹은 값에 사용되면 변수 혹은 속성에 접근할때 쓰는 접근연산자라고 할 수있음
        // 따라서, 배열의 길이를 접근할 때에는
        // 배열이름.length 라고 접근을 하게 된다.

        //오류 없애기 방법
        //i <= intArray.length - 1
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // null
        // null 이란, 참조형 데이터타입이 가질 수 있는
        //특수한 상황으로써, stack 영역의 변수에는 주소값이 부여가 되었지만.
        //힙 영역에 해당 주소에는 초기화가 되지 않아
        //어떠한 값을 호출하거나 메소드를 불러올 수 없는 상황이다.
        //null 일 경우, 속성값을 호출하거나 메소드를 호출하려고 하면
        //무조건 NullPointerException 이 발생하게 된다.

        // String[] stringArray를 선언하고 크기를 3으로 초기화해보자
        String[] stringArray = new String[3];

        // 모든 요소를 출력해보자
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        // stringArray의 0번째 요소가 "abc"와 같은지 비교해보자
        stringArray[0].equals("abc");
    }
}
