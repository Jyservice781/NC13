package util;

//배열을 다룰 때 도움이 될 메소드들을 모아둔 클래스
public class ArrayUtil {
    // 1. int[]
    // 1-A. 현재 배열의 길이를 리턴하는 size()
    public static int size(int[] array) {
        return array.length;
    }

    // 1-B. 현재 배열이 아무것도 없으면 true 있으면 false 가 리턴되는
    // isEmpty()
    public static boolean isEmpty(int[] array) {
        return size(array) == 0; // 아무것도 없으면 0
    }

    // 1-C. 현재 배열의 특정 인덱스의 값을 리턴하는
    // get()
    public static int get(int[] array, int index) {
        return array[index];
    }

    // 1-D. 현재 배열에서 특정 값의 가장 먼저 등장하는 인덱스를 찾는
    // indexOf()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    // 양의정수로 가면 크기를 가늠할 수 없기 때문에 음의 정수를 사용한다.
    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < size(array); i++) {
            if (element == get(array, i)) {
                return i;
            }
        }

        return -1;
    }

    //1-E. 현재 배열에서 특정 값의 가장 마지막에 등장하는 인덱스를 찾는
    // lastIndexOf()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    public static int lastIndexOf(int[] array, int element){

    }
}
