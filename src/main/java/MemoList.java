import java.util.ArrayList;
import java.util.Scanner;

public class MemoList {
    ArrayList<Memo> memoList = new ArrayList(); // 메모리스트 입니다.
    void searchMemo(){

    }//메모찾기함수
    void inputMemo(){}//메모입력함수
    void showMemo(){}//메모출력함수(리스트 보여주기)
    void updateMemo(){} // 메모수정함수

    void deleteMemo(){} //메모삭제함수


    void deleteMemo() { //메모삭제함수
        int listindex;
        int password;


        do {
            System.out.println("삭제할 리스트 번호를 입력해 주세요.");
            Scanner scan = new Scanner(System.in);
            listindex = scan.nextInt() - 1;

            if (listindex > memoList.size()) {
                System.out.println("해당 리스트는 없습니다. 다시 입력해 주세요.");
            } else {
                do {
                    System.out.println("비밀번호를 입력해 주세요");
                    Scanner scanpw = new Scanner(System.in);
                    password = scanpw.nextInt();

                    if (password == 0/*메모리스트 인덱스번호의 패스워드*/){
                        memoList.remove(listindex);
                    }else{
                        System.out.println("패스워드를 재확인 해주세요.");
                    }
                }while (password == 0/*메모리스트 인덱스번호의 패스워드*/);
            }
        } while (listindex > memoList.size());
    }

}


//여러건의 메모 저장.
// 메모조회(Getter / Setter 존재)
// 작성최신순으로 메모 출력
// 1건의 글을 메모 리스트에 추가.
// 글수정삭제시 글번호를 넘겨받고, 리스트에서 글번호에 해당되는 글을 가져와 리턴함.
// 수정 & 삭제 메소드(삭제후 글번호 다시붙이기 필요)


