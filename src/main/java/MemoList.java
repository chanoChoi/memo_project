import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MemoList { // 메모 넣고, 메모 찾고, 수정삭제하고...
    ArrayList<Memo> memoList = new ArrayList<>(); // 메모리스트 입니다.

    // MemoList의 생성자
    MemoList() {
    }

    //메모를 메모리스트에 입력하는 함수
    void inputMemo(Memo memo) {
        memo.index = memoList.size()+1; // 문제점 : memolist에서 메모 삭제하면, number가 안맞게된다. >> 해결책 : 어레이 리스트 자체의 인덱스를 쓸수 있나?
        memoList.add(memo);
    }


    //메모를 메모리스트에 입력하는 함수
    void inputMemo() {
        System.out.println("메모를 입력합니다.");
        System.out.println("남기고 싶은 내용을 입력해주세요.");
        Scanner memoContentScanner = new Scanner(System.in);
        String memoContentAnswer = memoContentScanner.nextLine();
        //memoContentAnswer 받은 내용을 memo.contents로 넣습니다.

        System.out.println("작성자명을 입력해주세요.");
        Scanner memoWriterScanner = new Scanner(System.in);
        String memoWriterAnswer = memoWriterScanner.nextLine();
        //memoWriterAnswer 받은 내용을 memo.writer로 넣습니다.

        System.out.println("비밀번호를 입력해주세요.");
        Scanner memoPasswordScanner = new Scanner(System.in);
        String memoPasswordAnswer = memoPasswordScanner.nextLine();
        //memoPasswordAnswer 받은 내용을 memo.password 로 넣습니다.

        Memo memo = new Memo(memoWriterAnswer, memoPasswordAnswer, memoContentAnswer); // Memo 객체 생성
        System.out.println("메모 입력이 완로되었습니다.");

        System.out.println("------------------------");
        System.out.println("작성자 :" + memo.writer);
        System.out.println("작성일시 :" + memo.date);
        System.out.println("내용 :" + memo.contents);
        System.out.println("------------------------");

        memoList.add(memo);

//            memoList.inputMemo(memo);
////        firstQuestion(); >> 여기는 for문으로 바꿔야 함. 무한반복 안돼
//


//    memo.index =memoList.size()+1; // 문제점 : memolist에서 메모 삭제하면, number가 안맞게된다. >> 해결책 : 어레이 리스트 자체의 인덱스를 쓸수 있나?
//        memoList.add(memo);

    }
    void showMemo() {
        for (Memo memo : memoList) {
            System.out.println(memo.getNumber() + ", " + memo.getWriter() + ", " + memo.getDate() + ", " + memo.getContents());
        }


    }//메모출력함수(리스트 보여주기)

    void updateMemo() {
    } // 메모수정함수

    void deleteMemo() {
        int listIndex; // deleteMemo()함수에서 사용하는 지역변수(스캔으로받는값)
        String password; // deleteMemo()함수에서 사용하는 지역변수(스캔으로받는값)
        String matchPasswordassword;


        do {
            System.out.println("삭제할 리스트 번호를 입력해 주세요.");
            Scanner scanIndex = new Scanner(System.in);
            listIndex = scanIndex.nextInt()-1; // 우리가 하고자 하는일 : 얘가 3 이면 >> (String) memolist[3].password
//            matchPasswordassword = memoList.get(listIndex).password; //우리가 지우고자하는 메모의 패스워드값임.

            //첫if : 메모리스트의 크기보다 큰 숫자를 입력하면 오류메세지
            if (listIndex > memoList.size()) {
                System.out.println("해당 리스트는 없습니다. 다시 입력해 주세요.");
            } else { // 메모리스트 크기 안의 숫자를 넣은경우 :
                do {
                    System.out.println("비밀번호를 입력해 주세요");
                    Scanner scanPw = new Scanner(System.in);
                    password = scanPw.nextLine(); // 비밀번호 scanner로 입력받음
                    matchPasswordassword = memoList.get(listIndex).password;

                    if (!Objects.equals(password, matchPasswordassword)) { // 입력받은 비밀번호가 해당 index메모의 비밀번호인지 확인.
                        System.out.println("패스워드를 재확인 해주세요.");//다르면 재확인 문구 출력
                        System.out.println("1.종료 2.패스워드 재입력");
                        Scanner scan = new Scanner(System.in);
                        int choice=scan.nextInt();
                        if(choice==1){
                            return;
                        }
                    } else {
                        memoList.remove(listIndex); // 패스워드 값이 같으면 삭제
                    }
                } while (!Objects.equals(password, matchPasswordassword));
            }
        } while (listIndex > memoList.size());
    }//deleteMemo() 끝


}



//여러건의 메모 저장.
// 메모조회(Getter / Setter 존재)
// 작성최신순으로 메모 출력
// 1건의 글을 메모 리스트에 추가.
// 글수정삭제시 글번호를 넘겨받고, 리스트에서 글번호에 해당되는 글을 가져와 리턴함.
// 수정 & 삭제 메소드(삭제후 글번호 다시붙이기 필요)


