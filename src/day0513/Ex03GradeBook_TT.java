package day0513;

import java.util.Scanner;

import util.ScannerUtil;
import types.Student;
// 동적 할당 함수 만들기

public class Ex03GradeBook_TT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 학생의 정보를 저장할 Student[]
        Student[] students = new Student[5];
        // 다음 입력할 index 를 저장한 nextIndex;
        int nextIndex = 0;
        while (true) {
            String message = "1. 입력 2. 출력 3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                if (nextIndex < 5) {
                    message = "학생의 번호를 입력해주세요";
                    int id = ScannerUtil.nextInt(scanner, message);
                    message = "학생의 이름을 입력해주세요";
                    String name = ScannerUtil.nextLine(scanner, message);
                    message = "학생의 국어 점수를 입력해주세요";
                    int korean = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 영어 점수를 입력해주세요";
                    int english = ScannerUtil.nextInt(scanner, message, 0, 100);
                    message = "학생의 수학 점수를 입력해주세요";
                    int math = ScannerUtil.nextInt(scanner, message, 0, 100);

                    students[nextIndex] = new Student();
                    students[nextIndex].id = id;
                    students[nextIndex].name = name;
                    students[nextIndex].korean = korean;
                    students[nextIndex].english = english;
                    students[nextIndex].math = math;

                    nextIndex++;
                } else {
                    System.out.println("더이상 입력하실 수 없습니다.");
                }
            } else if (userChoice == 2) {
                if (nextIndex > 0) {
                    for (int i = 0; i < nextIndex; i++) {
                        students[i].printInfo();
                    }
                } else {
                    System.out.println("아직 입력 된 학생이 존재하지 않습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }


}
