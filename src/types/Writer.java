package types;

public class Writer {
    private int number;
    private String author;

    public Writer(int number, String author){
        this.number = number;
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void write(String name) {
        System.out.println(name + "가 글을 씁니다.");
    }

    public void read() {
        System.out.println("저는 지금까지 좋아하는 작가인" + author + "의 글을" + number + "번 읽었어요");
    }
}
