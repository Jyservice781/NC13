package day0507;

import java.util.Scanner;
import java.util.Random;

public class Ex05LottoT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0. Magic Number 해소를 위한 상수
        final int LENGTH = 6;
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 45;

        // 1. 컴퓨터 숫자를 저장할 int[]
        int[] computerNumbers = new int[LENGTH];

        //2. 사용자 숫자를 저장할 int[]
        int[] userNumbers = new int[LENGTH];

        //3. 컴퓨터 배열에 중복되지 않는 숫자 6개 저장
        for (int i = 0; i < computerNumbers.length; ) {
            // 1~45 사이의 랜덤한 숫자를 뽑는다.
            int randomNumber = random.nextInt(MAX_VALUE) + MIN_VALUE;

            // randomNumber 의 값이 computerNumbers 배열에
            // 이미 존재하면 true, 존재하지 않으면 false 가 저장되는
            // boolean 변수
            boolean isDuplicated = false;

            // 현재 배열에서 입력될 인덱스는 i 번째 이므로.
            // 우리가 중복인지 아닌지를 검사할 인덱스는 i 이전까지만
            // 검사하면 된다.
            // 따라서 j for 문의 조건식은 j < i 로 하면 된다.
            for (int j = 0; j < i; j++) {
                // 만약 randomNumber 의 현재 값이
                // computerNumbers 의 j 번째의 현재 값과 같으면
                // isDuplicated 의 값은 true 로 변경해준다.
                if (randomNumber == computerNumbers[j]) {
                    isDuplicated = true;
                }
            }

            // isDuplicated 에 false 가 저장되어 있으면
            // 해당 randomNumber 는 중복되지 않은 숫자이므로
            // computerNumbers 배열의 i 번째에 저장하고
            // i를 1 증가시켜준다.
            if (!isDuplicated) {
                computerNumbers[i] = randomNumber;
                i++;
            }
        }

        //4. computerNumbers 정렬

        // 정렬에서는 우리가 i 번쨰의 값과 i+1번 값을 비교하게 되므로
        // 0<->1, 1<->2, 2<->3, ,,,4<->5 까지만 검사 될 수 있도록
        // i 는 마지막 인덱스 -1 까지만 반복될 수 있도록 한다.
        for (int i = 0; i < computerNumbers.length - 1; i++) {
            // 만약 i 번째 요소의 값이 i + 1 번째 요소의 값보다 크면
            // 2개의 값을 교체해야한다. -> 정렬
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                // 현재 for 문이 반복할 내용이 끝나면 실행되는 코드는
                // for 문안의 i++ 가 된다.
                // 우리가 다시 배열의 0번 요소부터 검사하기 위해서는
                // i를 -1 로 초기화해야
                // i++이 실행되서 i의 값이 0이 될 수 있다.
                i = -1;
            }
        }

        //5. 사용자로부터 숫자를 입력받아서 배열에 저장하는 for 문
        for (int i = 0; i < userNumbers.length; ) {
            System.out.printf("%d번째 숫자를 입력해주세요.\n", i + 1);
            System.out.print("> ");

            int userNumber = scanner.nextInt();

            //사용자가 유효한 숫자를 입력하면 true,
            //유효하지 않은 경우 ( = 범위를 벗어나거나 중복인 경우)
            //false 가 저장이 되는 boolean 변수

            // 오류 날 수 있음) 1보다 작을 경우, 45보다 클경우, 중복일경우
            boolean isValid = true;

            // userNumber 가 올바른 범위가 아닐 경우
            // false 가 저장되게 한다.
            if (!(userNumber >= MIN_VALUE && userNumber <= MAX_VALUE)) {
                isValid = false;
            }

            // 입력된 숫자가 중복일 경우
            // isValid에 false가 저장되게 한다.
            for (int j = 0; j < i; j++) {
                if (userNumber == userNumbers[j]) {
                    isValid = false;
                }
            }

            // isValid 에 true 기 저장 되어 있을 경우
            // 사용자가 입력한 숫자가 유효한 범위이고. 중복되지 않은 숫자이므로
            // 배열에 추가해주고
            // false 가 저장되어 있을 경우,
            // 사용자가 잘못 입력 했으므로 각각에 맞추어 코드를 처리해준다.
            if (isValid) {
                userNumbers[i] = userNumber;
                //사용자가 입력한 변수를 넣어줌.
                i++;
            } else {
                //사용자가 잘못 입력함.
                System.out.println("유효하지 않은 숫자입니다.");
            }
        }

        //6. 사용자 숫자 배열을 정렬해준다.
        for (int i = 0; i < userNumbers.length - 1; i++) {
            if (userNumbers[i] > userNumbers[i + 1]) {
                int temp = userNumbers[i];
                userNumbers[i] = userNumbers[i + 1];
                userNumbers[i + 1] = temp;
                i = - 1;
            }
        }

        //7. 컴퓨터 숫자 배열 출력하기
        System.out.print("컴퓨터의 숫자 : [");
        for (int i = 0; i < computerNumbers.length; i++) {
            System.out.printf("%d", computerNumbers[i]);
            if (i != computerNumbers.length - 1) {
                //4번 인덱스 까지 , 가 출력될 수 있게 디자인 함.
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //8. 사용자의 숫자 배열 출력하기
        System.out.print("사용자의 숫자 : [");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("%d", userNumbers[i]);
            if (i != userNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 9. 사용자가 몇개를 맞췄는지 출력
        // 사용자가 맞춘 갯수를 저장할 int 변수
        int count = 0;
        for(int i = 0; i<userNumbers.length; i++){
            //i 반복문 안쪽의 j를 돌리고 i 도 완전히 끝나게 되면 count 가 증가
            for(int j = 0; j < computerNumbers.length; j++){
                if(userNumbers[i] == computerNumbers[j]){
                    count++;
                }
            }
        }

        System.out.println("총 맞은 갯수 : " + count);
    }
}
