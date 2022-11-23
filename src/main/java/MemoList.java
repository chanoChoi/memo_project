import java.util.ArrayList;

public class MemoList {
    ArrayList<Memo> memoList = new ArrayList(); // 메모리스트 입니다.

    void inputMemo(){
        System.out.println("안녕하세요? 저는 inputMemo 메소드입니다");
    }//메모입력함수

    //메모찾기함수 (-1 이면 해당메모 없음)
    int searchMemo(String searchText){
        int searchMemoIndex = memoList.indexOf(searchText);
        if(searchMemoIndex<=-1){
            System.out.println("그런 메모는 없습니다!");
            // 다시 선택 화면으로 돌아가게?
        } return searchMemoIndex; // q번호를 보내야하는데..?

    }

    void showMemo(){}//메모출력함수(리스트 보여주기)
    void updateMemo(){} // 메모수정함수
    void deleteMemo(){} //메모삭제함수

    //여러건의 메모 저장.
    // 메모조회(Getter / Setter 존재)
    // 작성최신순으로 메모 출력
    // 1건의 글을 메모 리스트에 추가.
    // 글수정삭제시 글번호를 넘겨받고, 리스트에서 글번호에 해당되는 글을 가져와 리턴함.
    // 수정 & 삭제 메소드(삭제후 글번호 다시붙이기 필요)

}
