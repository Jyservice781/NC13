package day0510;
// 값에 의한 호출과 참조에 의한 호출

// 자바에서 파라미터로 값을 보내줄때
// 2 가지의 호출이 일어난다

// 값에 의한 호출: 기본형 데이터 타입일 경우, 해당 변수 혹은 값이 복사되서 보내진다.
//                즉, 보내진 값은 복사본이므로, 다른 메소드에서 해당 값을 변경을 하더라도
//                원본에는 변경이 가해지지 않는다.

// 참조에 의한 호출: 참조형 데이터 타입일 경우, 주소값이 보내진다.
//                 주소값이 보내졌디 때문에, 파라미터로 받은 메소드와 원본 모두 똑같은
//                 힙 영역의 공간을 보게 된다.
//                 따라서 다른 메소드가 변경을 가하면, 힙 영역의 공간에 변경이 가해지고
//                 원본도 마찬가지로 변경이 된다
//                 단, 해당 메소드가 다른 주소값을 부여하게 되면 변경이 되지 않는다.

// new 키워드 : 해당 참조형 변수에 새로운 주소값을 부여한다.


public class Ex01Call {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("callValue 전 값 : " + a);
        callValue(a);
        System.out.println("callValue 후 값 : " + a);
        int[] array = new int[4];
        System.out.println("callRef 전 array[0]: " + array[0]);
        callRef(array);
        System.out.println("callRef 후 array[0]: " + array[0]);

        array[0] = 100;
        alloc(array);
        System.out.println("alloc 후 array[0]:" + array[0]);
    }

    public static void callValue(int value){
        value++;
        System.out.println("callValue에서 value의 값:" + value);
    }

    public static void callRef(int[] array){
        array[0] = 20;
        System.out.println("array[0]:" + array[0]);
    }
    public static void alloc(int[] array){
        array = new int[5];
        //new 키워드 사용 -> 공간을 새로만들어서 값을 부여함.
        array[0] = 20;
        System.out.println("alloc.array[0]: "+ array[0]);
    }

}
