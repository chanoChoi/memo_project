import java.util.Scanner;

public class Main {// 일종의 프론트

    public static void main(String[] args) {
        // 메모리스트를 여기서 호출!
        MemoList memoList = new MemoList(); // MemoList의 객체를 여기서 생성해야, 모두가 공유할 수 있어!
        System.out.println(" A반 7조 코새싹의 메모장에 오신 것을 환영합니다!");
        firstQuestion(memoList);

    } // main 메소드

    // 첫 대화창 메소드
    public static void firstQuestion(MemoList memoList) {
        while(true){
            System.out.println("1. 메모 입력하기");
            System.out.println("2. 메모장 열기");
            System.out.println("3. 나가기");
            System.out.println("무엇을 할까요?");

            Scanner firstScanner = new Scanner(System.in); // 첫 대화창 대답변수
            int firstAnswer = firstScanner.nextInt(); // 대답 받는변수

            switch(firstAnswer){
                case 1:
                        inputQuestion(memoList);
                        break;
                case 2:
                        memoListQuestion(memoList);
                        break;
                case 3:
                    System.out.println("안녕히가세요!");
                    System.exit(0);


            } //switch의 끝
        }//while의 끝


//
//
//
////// 여기 완전 공사중!!!!!/////////////////////////////
//
//        if (firstAnswer == 1) {
//            inputQuestion(memoList);
//        } else if (firstAnswer == 2) {
//            memoListQuestion(memoList);
//        } else if (firstAnswer == 3) {
//            System.out.println("안녕히가세요!");
//            System.exit(0);
//
//        } else {
//            System.out.println("잘못 입력하셨습니다.");
////            firstQuestion(); >> for 문으로 수정하자. 의지 안좋아.
//        }// if문 끝
////// 여기 완전 공사중!!!!!/////////////////////////////


    }//firstQuestion()끝

    // 1.메모 입력하기 의 대화창
    public static void inputQuestion(MemoList memoList) {
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

        memoList.inputMemo(memo);
//        firstQuestion(); >> 여기는 for문으로 바꿔야 함. 무한반복 안돼
    }

    // 2. 메모장 열기 의 대화창
    public static void memoListQuestion(MemoList memoList) {
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
