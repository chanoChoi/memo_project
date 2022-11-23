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
        while (true) {
            System.out.println("1. 메모 입력하기");
            System.out.println("2. 메모장 열기");
            System.out.println("3. 나가기");
            System.out.println("무엇을 할까요?");

            Scanner firstScanner = new Scanner(System.in); // 첫 대화창 대답변수
            int firstAnswer = firstScanner.nextInt(); // 대답 받는변수

            switch (firstAnswer) {
                case 1:
                    memoList.inputMemo();
                    break;
                case 2:
                    memoListQuestion(memoList);
                    break;
                case 3:
                    System.out.println("안녕히가세요!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다, 다시 입력해주세요!");
                    break;

            } //switch의 끝
        }//while의 끝
    }//firstQuestion()끝




    // 2. 메모장 열기 의 대화창
    public static void memoListQuestion(MemoList memoList) {

        while (true) {
            System.out.println("무엇을 할까요?");
            System.out.println("1. 메모장 내용 보기"); // 메모 내용 프린트
            System.out.println("2. 메모 수정하기"); // 메모 수정 메소드 불러오기
            System.out.println("3. 메모 삭제하기"); // 메모 삭제 메소드 불러오기
            System.out.println("4. 돌아가기"); // firstQuestion() 으로 복귀
            Scanner memoListScanner = new Scanner(System.in);
            int memoListAnswer = memoListScanner.nextInt();

            switch (memoListAnswer) {
                case 1:
                    System.out.println("showMemo() 동작확인합니다!");
                    memoList.showMemo();
                    break;
                case 2:
                    memoList.updateMemo();
                    System.out.println("updateMemo()는 아직 없어요");
                    break;
                case 3:
                    System.out.println("deleteMemo() 동작 확인합니다!");
                    memoList.deleteMemo();
                    break;
                case 4:
                    System.out.println("돌아갑니다.");
                    firstQuestion(memoList);
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
                    break;
            }//switch 끝


        }//while문 끝


    } // memoListQuestion()의 끝


}
