package day0514;
// 상속(Inherit)
// 부모가 자식이 상속을 해주는 이유 :
// 자식이 부모가 가진 재산을 그대로 쓰게 하려고

// 프로그래밍에서 상속을 하는 이유:
// 똑같다.
// -> 부모클래스가 가진 필드 혹은 메소드를 자식 클래스가 그대로 쓰게 하려고

// 클래스 상속을 하는 방법
// 부모 클래스를 만들고
// 자식 클래스에서 상속을 할 때
// public class 자식클래스이름 extends 부모클래스이름
// 이라고 적어주면 상속이 이뤄진다.

// 단, 인터페이스 상속은 부모 클래스의 코드를 그대로 쓰기 위함이 아니라
// 우리가 다형성이라는 성격을 부여하기 위함이기 때문에 지금은 다루지 않는다.

// 다형성(Polymorphism)
// 多形性
// 다양한 형태를 가지는 성질
// 다형성은 우리가 부모 클래스 객체가 들어갈 자리에
// 자식 클래스가 그대로 들어갈 수 있는 것을 뜻한다.
// 예를 들어서
// equals 메소드의 경우 파라미터에 java.lang.Object 가 있기 때문에
// Object 클래스 뿐만 아니라
// 해당 Object 클래스를 상속 받는 모든 클래스 객체가 파라미터로 들어갈 수 있다.

// 또한, 부모 클래스 객체를 자식 클래스의 생성자로 초기화하는 것도
// 이러한 폴리몰피즘 덕분에 가능한 것이다.

// animal() 이 생성이 되서 힙 영역에 생성이 되서

import types.*;

public class Ex03Inherit {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.info();
        a.move();
        a.makeSound();

        System.out.println("------------------------------");

        Dog d = new Dog();
        d.info();
        d.move();
        d.makeSound();

        Animal animal = new Dog();
        animal.makeSound();

        System.out.println("===============================");
        System.out.println("인터페이스 상속");
        System.out.println("-------------------------------");

        IAnimal random = new Cat();
        random.info();
        random.move();
        random.makeSound();

        System.out.println("-------------------------------");
        IAnimal randomAnimal = new Cow();
        randomAnimal.info();
        randomAnimal.move();
        randomAnimal.makeSound();

    }
}
