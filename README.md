
# memo_project
Spring A반 7조 메모장 프로젝트

< 1일차 메모장 프로젝트 >
< 필수사항 >
1. 입력 2. 목록보기 3. 수정 4. 삭제 5. 종료메뉴

1. 입력 : 이름, 비밀번호, 메모를 스캐너를 통해 입력. 1건의 글 생성 및 메모리스트에 저장

2. 수정 : 수정할 글 번호 입력받기 / 수정할 글의 비밀번호 입력받기 / 비밀번호 일치 : 글내용수정 / 일치하지않음: 일치하지않는단 메세지 출력

3. 삭제기능 : 삭제할 글 번호를 입력받는다.
			 삭제할 글이 존재하면 글을 삭제하고, 존재하지 않으면 존재하지 않는다는 메세지 출력.
			 삭제할 글의 비밀번호를 받고 비밀번호 일치 여부 판단
4. 메모 클레스(MemoVO, Memo)
		메모 한 건에 대한 정보를 가진 클래스
		메모는 글 번호, 작성자이름, 비밀번호, 게시글, 작성일(컴퓨터 시스템의 날짜와 시간을 자동저장)
		글 수정시 수정시간으로 시간이 변경된다.
5. 메모리스트 (MemoList)
		여러건의 메모를 저장하는 클래스이다.
		메모전체를 조회할 수 있다(Getter / Setter 존재)
		작성 최신 순으로 메모를 출력한다.
		1건의 글을 메모리스트에 추가할 수 있다.
		글의 수정 또는 삭제 시 글 번호를 넘겨 받고 리스트에서 글 번호에 해당하는  글 1건을 얻어와 리턴 시키는 메소드가 있다.
		해당되는 글 1건을 수정하는 메소드가 있다.
		글 1건을 삭제하는 메소드가 있다.
		글 삭제 후 글 번호를 다시 붙여준다.
		글이 삭제된 후 새 글이 입력될 때 idx가 기존 idx값에 이어서 1씩 증가할 수 있도록 count의 값을 수정한다.			
		
		< 역할 분담 >
		- 메모 입력기능 : 조운
		
		- 메모 삭제기능 : 이은지님
				
		- 메모 출력기능 : 남궁준님
		
		- 메모 수정기능 : 최찬호님		
				
		- 합치기 : 조운

