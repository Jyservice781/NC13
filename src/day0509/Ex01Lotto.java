package day0509;
// 로또 번호 제작기
// ArrayUtil 을 사용한 버젼

import java.util.Random;
import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex01Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //컴퓨터의 숫자를 저장할 배열
        int[] computerNumbers = new int[0];

        //중복되지 않은 랜덤 숫자 6개를 computerNumbers 에 추가한다.
        while (ArrayUtil.size(computerNumbers) < 6) {
            //1~45까지의 랜덤한 숫자를 하나 뽑는다.
            int temp = random.nextInt(45) + 1;
            //만약 temp 가 computerNumbers 에 없으면 -> 중복 피하기
            //temp 를 computerNumbers 에 추가한다.
            if (!ArrayUtil.contains(computerNumbers, temp)) {
                computerNumbers = ArrayUtil.add(computerNumbers, temp);
            }
        }

        System.out.println("\n정렬후");
        sort(computerNumbers);
        for (int i = 0; i < ArrayUtil.size(computerNumbers); i++) {
            System.out.println(ArrayUtil.get(computerNumbers, i));
        }

        //숫자를 순서대로 정렬하기
        //인덱스 값, 정렬을 위한 temp 값
        //computerNumbers 를 가져와야 함.
        /*for (int i = 0; i < ArrayUtil.size(computerNumbers) - 1; i++) {
            if (ArrayUtil.get(computerNumbers, i) > ArrayUtil.get(computerNumbers, i + 1)) {
                //인덱스값을 초과함.
                int temp = ArrayUtil.get(computerNumbers, i);
                computerNumbers[i] = ArrayUtil.get(computerNumbers, i + 1);
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }*/
        //ArrayUtil.solting(computerNumbers);
        //출력만
        /*for (int i = 0; i < ArrayUtil.size(computerNumbers); i++) {
            System.out.println(ArrayUtil.get(computerNumbers, i));
        }*/

    }

    public static void sort(int[] array) {
        for (int i = 0; i < ArrayUtil.size(array) - 1; i++) {
            if (ArrayUtil.get(array, i) > ArrayUtil.get(array, i + 1)) {
                int temp = ArrayUtil.get(array, i);
                ArrayUtil.set(array, i, ArrayUtil.get(array, i + 1));
                ArrayUtil.set(array, i + 1, temp);
                i = -1;
            }
        }

    }
}
