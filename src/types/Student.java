package types;

// 우리가 구조체를 흉내낸
// Student 클래스
// 해당 클래스 안에는
// Student 클래스 변수가 어떤 데이터를 다룰 것인지만
// 적어주게 된다.
// 다섯가지의 정보를 저장하거나 정보를 호출할 수 있다.


// + Student 구조체에서 클래스로 업그레이드
// 우리가 위에 만들어둔 필드
// + 학생 클래스 변수가 실행해야할 메소드들을 적어주게 된다.

public class Student {
    public int id;
    public String name;
    public int korean;
    public int english;
    public int math;

    public final int SUBJECT_SIZE = 3;

    // 해당 클래스 변수가 실행시킬 수 있는 메소드
    // 파라미터가 없음
    // 개별 학생의 총점을 따로 계산해야하기 때문

    // 해당 클래스 변수의 저장된 값을 토대로
    // 총점을 계산하는 메소드
    public int calculateSum() {
        return korean + english + math;
    }

    // 해당 클래스 변수의 저장된 값을 토대로
    // 평균을 계산하는 메소드
    public double calculateAverage() {
        return (double) calculateSum() / SUBJECT_SIZE;
    }

    // 해당 클래스 변수의 값을
    // 예쁘게 출력해주는 메소드
    public void printInfo() {
        System.out.printf("번호: %2d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", calculateSum(), calculateAverage());
    }

    // 파라미터가 있는 생성자
    // 생성자의 경우, 리턴타입을 따로 적지않고
    // 메소드의 이름은 무조건 클래스의 이름과 통일시켜준다.
    // 파라미터의 값을 안쪽에서 계속해서 실행해도 동일하게 출력됨.
    public Student(int id, String name, int korean, int english, int math) {
        // 만약 메소드에서 파라미터의 이름과
        // 필드의 이름이 같을 시에
        // 해당 이름을 적으면 무조건 파라미터의 이름이 우선시됨.
        // 만약 이러한 경우에 우리가 필드를 지칭하고 싶다면.
        // 필드의 앞에 (this.) 을 붙여주면
        // 해당 클래스 변수의 라는 의미가 되어
        // 필드가 지정이 된다.

        // 이 생성자를 실행시키는 객체의 id 안에
        // 파라미터 id 의 현재 값을 저장해라.
        this.id = id;

    }

    // 파라미터가 없는 생성자
    // 내가 초기화를 따로 해주지 않거나 값을 입력 해주지 않으면
    // 기본적으로 출력되는 값임
    public Student() {
        id = -1;
        name = "입력안됨";
        korean = -1;
        english = -1;
        math = -1;
    }

    // equals() 재정의 하기
    // 우리가 부모 클래스의 메소드를 재정의 할 때에는 반드시
    // 부모 클래스가 적은 메소드의 선언식을 그대로 받아 적어야 한다.
    // 따라서 equals() 메소드는
    // public boolean equals(Object obj) 라고 적어야 한다.

    @Override // -> 해당 메소드 선언이 부모 메소드의 선언과 다르면 에러
    public boolean equals(Object obj) {
        // 만약 자기 자신과 비교하는 경우, 즉 주소값이 같으면 return true 해라
        if (this == obj) {
            //주소값이 같으니까 트루
            return true;
        }

        // 만약 파라미터로 들어온 obj 가 Student 클래스의 객체가 맞으면
        // 코드를 실행해라
        // 어떠한 클래스 객체가 특정 클래스 객체인지 확인할때에는?
        // instanceof 라는 키워드를 사용하게 된다.
        if (obj instanceof Student) {
            Student s = (Student) obj;
            // 강제적 형 변환
            return id == s.id;
            // id 값은 학생 하나에게 부여되는 고유한 번호임
        }
        return false;
    }
}


