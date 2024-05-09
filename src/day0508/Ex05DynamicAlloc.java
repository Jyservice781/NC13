package day0508;

import util.ArrayUtil;

// 배열의 동적 할당(DynamicAllocation)
// 현재까지 배운 배열의 최대 단점 : 크기가 고정되어 있다.
// 이렇게 크기를 처음부터 지정하고 만드는 배열을
// 우리는 정적 할당(Static Allocation)
// 하지만 우리가 크기가 자유로운 배열을 만들 경우, 해당 배열을
// 동적 할당이 되는 배열이라고 한다.
// 하지만, 진정한 동적 할당이 되기 위해서는
// 우리가 직접 주소값을 컨트롤 하여 이어 붙이거나 없애거나를 해야하지만
// 자바에서는 주소값을 직접적으로 컨트롤 할 수 없으므로
// 우리는 유사 동적 할당을 하게 될 것이다.
// 자바와 같은 3세대 언어에서는 어려움
public class Ex05DynamicAlloc {
    public static void main(String[] args) {

        System.out.println("1. int[]");
        System.out.println("A. size()");
        int[] array = new int[4];
        System.out.println("ArrayUtil.size(array): " + ArrayUtil.size(array));
        //현재 배열이 아무것도 없으면 true 있으면 false 가 리턴되는
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("B. isEmpty()");
        System.out.println("ArrayUtil.isEmpty(array): " + ArrayUtil.isEmpty(array));
        array[1] = 30;
        array[3] = 30;
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("C. get()");
        //현재 인덱스의 특정 인덱스의 값을 리턴함.
        System.out.println("ArrayUtil.get(array, 1): " + ArrayUtil.get(array, 1));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("D. indexOf()");
        //현재 배열에서 특정 값의 인덱스를 찾는
        System.out.println("ArrayUtil.indexOf(array, 30) : " + ArrayUtil.indexOf(array, 30));
        System.out.println("ArrayUtil.indexOf(array, 20): " + ArrayUtil.indexOf(array, 20));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("E.lastIndexOf()");
        System.out.println("ArrayUtil.lastIndexOf(array, 30): " + ArrayUtil.lastIndexOf(array, 30));
        System.out.println("ArrayUtil.lastIndexOf(array, 20): " + ArrayUtil.lastIndexOf(array, 20));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("F. contains()");
        System.out.println("ArrayUtil.contains(array, 30): " + ArrayUtil.contains(array, 30));
        System.out.println("ArrayUtil.contains(array, 20): " + ArrayUtil.contains(array, 20));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("G. add()");
        System.out.println("add() 전 ArrayUtil.size(array): " + ArrayUtil.size(array));
        array = ArrayUtil.add(array, 10);
        //크기가 고정이 안되어있는 배열을 만들게 됨.
        System.out.println("add() 후 ArrayUtil.size(array): " + ArrayUtil.size(array));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("H. add()");
        System.out.println("add() 전  ArrayUtil.get(array,2): " + ArrayUtil.get(array, 2));
        array = ArrayUtil.add(array, 2, 340);
        System.out.println("add() 후  ArrayUtil.get(array,2): " + ArrayUtil.get(array, 2));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("I. set()");
        System.out.println("set() 전 ArrayUtil.get(array, 2): " + ArrayUtil.get(array, 2));
        int origin = ArrayUtil.set(array, 2, 50);
        System.out.println("set() 후 ArrayUtil.get(array, 2): " + ArrayUtil.get(array, 2));
        System.out.println("set() 후 원래값: " + origin);
        //보관을 하지 않으려면 int origin 을 하지 않아도 됨.
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("J. remove()");
        System.out.println("remove() 전 ArrayUtil.size(array): " + ArrayUtil.size(array));
        System.out.println("remove() 전 ArrayUtil.get(array, 2): " + ArrayUtil.get(array, 2));
        array = ArrayUtil.remove(array, 2);
        System.out.println("remove() 후 ArrayUtil.size(array): " + ArrayUtil.size(array));
        System.out.println("remove() 후 ArrayUtil.get(array, 2): " + ArrayUtil.get(array, 2));
        System.out.println();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("K. removeElement()");
        array[2] = 890;
        System.out.println("removeElement() 전 contains(890): " + ArrayUtil.contains(array, 890));
        array = ArrayUtil.removeElement(array,890);
        System.out.println("removeElement() 후 contains(890): " + ArrayUtil.contains(array, 890));
    }
}
