package util;

//배열을 다룰 때 도움이 될 메소드들을 모아둔 클래스
public class ArrayUtil {
    // 1. int[]
    // 1-A. 현재 배열의 길이를 리턴하는
    // size()
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
    public static int lastIndexOf(int[] array, int element) {
        for (int i = size(array) - 1; i >= 0; i--) {
            if (element == get(array, i)) {
                return i;
            }
        }
        return -1;
    }

    //1-F. 현재 배열에서 특정한 값이 존재하면 true,없으면 false가 나오는
    //contains()
    public static boolean contains(int[] array, int element) {
        return indexOf(array, element) != -1;
        //없으면  -1
    }

    // 1-G. 현재 배열에 맨 마지막에  새로운 요소를 추가하는
    // add()
    public static int[] add(int[] array, int element) {
        // int 배열과 추가의 대상인 element
        // array 보다 길이가 1이 더 큰 새로운 배열을 하나 만들어 준다.
        int[] temp = new int[size(array) + 1];
        //원본 배열인 array 의 값들을 temp 에 복사해온다.
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }

        // 새로운 요소인 element 를 temp 의 가장 마지막 칸에 저장한다.
        temp[size(temp) - 1] = element;

        //temp 를 리턴한다.
        return temp;
    }

    // 1-H. 현재 배열의 특정 인덱스에 새로운 값을 추가하는
    //    // add() - 중간에도 넣겠다.
    public static int[] add(int[] array, int index, int element) {
        // 만약 index가 불가능한 index일 경우.
        // 원본 array를 다시 리턴한다.
        if (index < 0 || index >= size(array)) {
            return array;
        }
        int[] temp = new int[0];
        // 동적 할당이 되기 때문에 0으로 해줘도 됨
        // 추가하면 늘어나기 때문에
        for (int i = 0; i < size(array) + 1; i++) {
            if (i < index) {
                temp = add(temp, get(array, i));
                // i 가 index 보다 작으면 array 의 값을 하나 받아오고
            } else if (i == index) {
                temp = add(temp, element);
                // i 가 index 랑 같을때 element 를 add
            } else {
                temp = add(temp, get(array, i - 1));
                // i 가 index 보다 많을 경우에는 줄어들게 한다.
            }
        }
        return temp;
    }

    // 값을 교체 - 원래 값을 어딘가에 사용할 수 있다
    // 1-I. 해당 배열에서 특정 인덱스의 값을 다른 값으로 교체하고
    // 원래 있던 값을 리턴하는
    // set()
    public static int set(int[] array, int index, int element) {
        int temp = get(array, index);
        array[index] = element;
        //array index 번의 칸에 element 를 넣어줌.
        //원래 있던 기존값인  temp 를 return 해준다.
        return temp;
    }

    // 1-J. 해당 배열의 특정 인덱스를 삭제하는
    // remove()
    public static int[] remove(int[] array, int index) {
        int[] temp = new int[0];
        // 0인 배열을 temp 에 저장해둠.

        for (int i = 0; i < size(array); i++) {
            //인덱스를 제외한 값들은 모두 저장
            if (i != index) {
                temp = add(temp, get(array, i));
                // index 랑 i 랑 같은때 false
            }
        }
        //출력함
        return temp;
    }

    // 1-K. 해당 배열의 특정엘리먼트가 있는 인덱스를 삭제하는
    // removeElement()
    // int 배열이기때문에 오버로딩이 안됨.
    public static int[] removeElement(int[] array, int element) {
        return remove(array, indexOf(array, element));
        //indexOf를 먼저 실행
    }

    public static int[] solting(int[] array) {
        for (int i = 0; i < size(array) - 1; i++) {
            //인덱스를 제외한 값들은 모두 저장
            if (get(array, i) > get(array, i + 1)) {
                int temp = get(array, i);
                array[i] = get(array, i + 1);
                array[i+1] = temp;
                i = -1;
            }
        }
        return array;

    }

}
