package day0507;
// 학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
// 예쁘게 출력하는 프로그램을 작성하시오.
// 단, 한번에 5명의 정보를 모두 다 입력하는 것이 아니라
// 메뉴를 만들어서 /while 메뉴 (1. 입력 2. 출력 3. 종료)
// 입력 메뉴를 통해 들어갔을 때
// 한명의 정보만 입력을 하되, 만약 5명의 정보를 모두 다 입력했을 경우 / 더이상 입력하실 수 없습니다.
// 더 이상 입력이 안되게 만드시고
// 출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오.

// 심화: 만약 5명을 모두 다 입력했을 경우, 새로운 입력 시
// 가장 먼저 입력된 정보를 없애고 현재 정보가 들어갈 수 있도록 코드를 작성하시오

import java.util.Scanner;

public class Ex06GradeBook {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("1.입력 2.출력 3.종료\n");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            int length = 5;
            int[] currentStudent = new int[length];
            int count = 0;

            if(userChoice == 1){
                //1. 번 선택시 번호 이름 국어 영어 수학 점수 입력 받기
               for(int i = 0; i < currentStudent.length; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print("번호: ");
                        int number = scanner.nextInt();

                        System.out.print("이름: ");
                        String name = scanner.nextLine();
                        name = scanner.nextLine();

                        System.out.print("국어: ");
                        int korean = scanner.nextInt();

                        System.out.print("영어: ");
                        int english = scanner.nextInt();

                        System.out.print("수학: ");
                        int math = scanner.nextInt();

                        System.out.println(" :" + number + ", " + name + ", " + korean + ", " + english + ", " + math);
                        count++;
                    }
                    currentStudent[i] = count;
               }
               System.out.println("더이상 입력하실 수 없습니다.");

            }else if(userChoice == 2){
                //2. 현재 입력된 학생들만 출력



            }else{
                //userChoice == 3
                //종료
                System.out.println("이용해 주셔서 감사합니다 ^^");
                break;
            }
        }

    }
}
