package myself;

// 키가 120cm 미만인 아이들의 탑승 불가 멘트
// 삼항 연산자로 만들기
import java.util.Scanner;
public class Chap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("어린이의 키를 입력해주세요");
        System.out.println("> ");
        int height = scanner.nextInt();

        String message = (height >= 120) ? "키가 " + height + "cm 이므로 탑승할 수 있습니다": "키가 " + height + "cm 이므로 탑승 불가합니다.";
        System.out.println(message);
    }
}
