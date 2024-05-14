package types;
// IAnimal 인터페이스를 상속 받는
// Cat 클래스

public class Cat implements IAnimal {
    // 내가 메서드에 아무런 행동을 취하고 있지 않을때
    // 상속받는 자식 클래스에 오버라이드 해줘야함.
    @Override
    public void info(){
        System.out.println("고양이는 동물이다.");
    }

    @Override
    public void move(){
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void makeSound(){
        System.out.println("야옹.");
    }

}
