import java.util.ArrayList;

public class MemoList {
    static ArrayList<Memo> memoList = new ArrayList(); // 메모리스트 입니다.
    //테스트존
    static void testinput(){
        Memo testmemo1 = new Memo("테스트1","1234","이게맞나 으앙");
        Memo testmemo2 = new Memo("테스트2","1234","졸려요");
        Memo testmemo3 = new Memo("테스트3","1234","만든거 테스트 하기도 힘듬");

        memoList.add(testmemo1);
        memoList.add(testmemo2);
        memoList.add(testmemo3);
    }

    void inputMemo(){}//메모입력함수

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
