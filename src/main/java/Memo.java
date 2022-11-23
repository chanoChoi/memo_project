import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memo {
    int index; // 메모글번호
    String writer; //메모작성자명
    String password; //메모비번
    String date; //메모작성일(시스템날짜)
    String contents; //메모내용


    Memo(String writer, String password, String contents){ // (작성자명, 비밀번호, 메모내용)
        //생성자에서 바로 받는 인자(writer,password,contents)
        this.writer = writer;
        this.password =password;
        this.contents = contents;

        //생성자에서 받지 않는 인자(index,date)
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm");
        this.date = time.format(formatter);

        this.index = 0; // 리스트에서 n번째여야함. >> 얘를 메모리스트에서 넣어줄 수 있나..?

    } // 생성자 끝


    // Memo 객체의 내용값을 뱉어주는 함수들
    public int getNumber(){
        return this.index;
    }//getNumber 끝

    public String getWriter(){
        return this.writer;
    }//getWriter끝

    public String getPassword(){
        return this.password;
    }//getPassword 끝

    public String getDate(){
        return this.date;
    }//getDate 끝

    public String getContents(){
        return this.contents;
    }//getContents 끝

    //메모리스트가 찾아낸 특정 메모를 삭제메소드, 수정 메소드
    //메모 한건의 정보 갖고있음.
    // 메모 : 글번호 + 작성자명 + 비번 + 게시글 + 작성일(시스템날짜시간)
    // 글 수정하면 수정시간으로 변경.
}
