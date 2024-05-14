package types;

public class BoardTT {
    private int id;
    private String title;
    private String writer;
    private String content;

    // 필드 캡슐화에 따른
    // getter/ setter 만들기
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getWriter(){
        return writer;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    // id 를 파라미터로 받아 새로운 객체에 초기화하는 생성자
    public BoardTT(int id) {
        this.id = id;
    }

    // 파라미터가 없는 기본 생성자
    public BoardTT() {

    }

    // equals()
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o instanceof BoardTT) {
            BoardTT b = (BoardTT) o;
            return id == b.id;
        }
        return false;
    }

    public void printInfo() {
        System.out.println("====================================");
        System.out.println("번호: " + id);
        System.out.println("제목: " + title);
        System.out.println("작성자: " + writer);
        System.out.println("------------------------------------");
        System.out.println("내용: " + content);
        System.out.println("====================================");
    }
}
