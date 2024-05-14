package types;
// 게시판 클래스 만들기
// 필요한것
// 글 번호, 작성자 닉네임, 제목, 내용이 들어가야 합니다.
// num, id, title, content
public class Board {
    public int num;
    public String id;
    public String title;
    public String content;
    // 입력 키워드
    public Board (){
        num = 0;
        id = "";
        title= "";
        content= "";
    }

    // 출력 키워드
    public void printInfo(){
        System.out.println("================================================");
        System.out.print("번호: "+ num + "닉네임: "+ id);
        System.out.println("------------------------------------------------");
        System.out.print("제목: \n" + title);
        System.out.println("내용: " + content);
        System.out.println("================================================");
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Board){
            Board b = (Board) obj;
            return num == b.num;
        }
        return false;
    }
}
