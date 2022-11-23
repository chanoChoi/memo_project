import java.util.Scanner;

public class Main {// 일종의 프론트

    public static void main(String[] args) {
        System.out.println(" A반 7조 코새싹의 메모장에 오신 것을 환영합니다!");
        firstQuestion();

    } // main 메소드

    // 첫 대화창 메소드
    public static void firstQuestion() {
        System.out.println("1. 메모 입력하기");
        System.out.println("2. 메모장 열기");
        System.out.println("3. 나가기");
        System.out.println("무엇을 할까요?");

        Scanner firstScanner = new Scanner(System.in);
        int firstAnswer = firstScanner.nextInt();

        if (firstAnswer == 1) {
            inputQuestion();
        } else if (firstAnswer == 2) {
            memoListQuestion();
        } else if (firstAnswer == 3) {
            System.out.println("안녕히가세요!");
            System.exit(0);

        } else {
            System.out.println("잘못 입력하셨습니다.");
            firstQuestion();
        }

    }//firstQuestion()끝

    // 1.메모 입력하기 의 대화창
    public static void inputQuestion() {
        System.out.println("메모를 입력합니다.");
        System.out.println("남기고 싶은 내용을 입력해주세요.");
        Scanner memoContentScanner = new Scanner(System.in);
        String memoContentAnswer = memoContentScanner.nextLine();
        //memoContentAnswer 받은 내용을 memo.contents로 넣습니다.

        System.out.println("작성자명을 입력해주세요.");
        Scanner memoWriterScanner = new Scanner(System.in);
        String memoWriterAnswer = memoWriterScanner. nextLine();
        //memoWriterAnswer 받은 내용을 memo.writer로 넣습니다.

        System.out.println("비밀번호를 입력해주세요.");
        Scanner memoPasswordScanner = new Scanner(System.in);
        String memoPasswordAnswer = memoPasswordScanner.nextLine();
        //memoPasswordAnswer 받은 내용을 memo.password 로 넣습니다.

        System.out.println("메모 입력이 완로되었습니다.");
        Memo memo = new Memo(memoWriterAnswer, memoPasswordAnswer, memoContentAnswer); // Memo 객체 생성

        System.out.println("------------------------");
        System.out.println("작성자 :" + memo.writer);
        System.out.println("작성일시 :" + memo.date);
        System.out.println("내용 :" + memo.contents);
        System.out.println("------------------------");

        MemoList memoList = new MemoList(); // MemoList 객체 생성
        memoList.inputMemo(memo);
        firstQuestion();
    }

    // 2. 메모장 열기 의 대화창
    public static void memoListQuestion() {
        System.out.println("무엇을 할까요?");
        System.out.println("1. 메모장 내용 보기"); // 메모 내용 프린트
        System.out.println("2. 메모 수정하기"); // 메모 수정 메소드 불러오기
        System.out.println("3. 메모 삭제하기"); // 메모 삭제 메소드 불러오기
        System.out.println("4. 돌아가기"); // firstQuestion() 으로 복귀
        Scanner memoListScanner = new Scanner(System.in);
        int memoListAnswer = memoListScanner.nextInt();

        if(memoListAnswer == 1){

            // 메모장 내용 출력

        } else if(memoListAnswer == 2){
            // 메모장 내용 수정

        } else if(memoListAnswer == 3){
            // 메모장 내용 삭제


        }else if(memoListAnswer ==4){
            // 돌아가기
            System.out.println("메인메뉴로 돌아갑니다.");
            firstQuestion();

        }else { System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
            memoListQuestion();

        }

    } // memoListQuestion()의 끝


}
