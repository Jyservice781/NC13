package day0507;
// 로또 번호 제작기 ver 0.5
// 중복되지 않는 랜덤한 숫자 6개를 뽑아서
// 배열에 저장하는 프로그램

// 중복이란?
// 같은 값이 여러번 나오는 것
// = 어떠한 숫자가 다른 인덱스에서 나오는 경우

import java.util.Random;

public class Ex03Lotto02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];
        //int 의 6개의 갯수 크기를 미리 지정 호출함.

        // for 문의 경우, 내부의 초기화식이나, 변경식 같은 것을
        // 공백을 넣어 줄 수도 있다.
        // 단 이때에는, 무한 루프가 되지 않도록 break 또는 변화식을
        // 반드시 포함시켜주는 것이 중요하다.
        /*int i = 0;
        for (; i < numbers.length; i++) {
        조건식을 생략하게 되면 항상 true 값이 되기 때문에
        if(; i>= numbers.length; ){
          break;
         } -> 이런식으로 표현이 가능함.*/
        //조건식을 생략하는 경우에 (;) 새미콜론의 갯수는 2개로 동일하게 맞춰준다.

        //i for 문을 만들되, 변화식은 비어있는 i for 문을 만들어주자.
        //특정 조건에서만 i를 증가시킬것
        for (int i = 0; i < numbers.length; ) {
            //랜덤한 숫자를 뽑아서 int 변수 temp 에 저장해주자
            int temp = random.nextInt(45) + 1;

            //중복을 찾을때만 true 가 저장될 boolean 변수
            boolean isDuplicated = false;

            // j for 문을 만들어서, numbers 의 모든 요소와
            // temp 를 비교해보자
            for (int j = 0; j < numbers.length; j++) {
                //만약, numbers[j] 가 temp 와 같으면
                //isDuplicated 의 값을 true 로 변경해주자
                if (numbers[j] == temp) {
                    isDuplicated = true;
                }
            }

            if (!isDuplicated) {
                // isDuplicated != true;
                // temp 의 값이 중복이 아니므로
                // numbers[i]에 값을 저장하고
                // i를 1 증가 시킨다.
                numbers[i++] = temp;
            }
        }

        //결과값 출력
        for(int i = 0; i<numbers.length; i++){
            System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
        }

    }
}
