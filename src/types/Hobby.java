package types;

public class Hobby {
    private Writer writer;

    public Hobby(Writer writer){
        this.writer = writer;
    }

    public void method1(){
        System.out.println("예제 메소드 1번입니다.");
        writer.read();
        writer.write("조재영");
        System.out.println("예제 메소드 1번 끝\n");
    }

    public void method2(){
        System.out.println("예제 메소드 2번입니다.");
        writer.write("mr. 조");
        writer.write("mr. 조");
        System.out.println("예제 메소드 2번 끝\n");
    }

    public void method3(){
        System.out.println("예제 메소드 3번입니다.");
        writer.read();
        writer.read();
        System.out.println("예제 메소드 3번 끝\n");
    }
}
