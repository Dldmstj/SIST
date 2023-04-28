package javaexp.a10_exception;

public class A10_UserException {

	public static void main(String[] args) {
		/*
		 	# 사용자정의 예외 처리
		 	1. 개발자가 직접적으로 사용할 예외 처리클래스를 선언하여
		 	2. 필요한 경우 조건문이나 프로세스 처리 라인에 의해 throw new 사용자 정의 클래스()형태로 예외를 처리하는 것을 말한다.
		 	3. 기본형식
		 		class 클래스명 extends Exception{
		 			// 생성자 선언
		 			// super("문자열데이터") : 상위 문자열을 입력받는 생성자를 호출하여 데이터를 전송하면
		 			public String getMssage() {
		 					// 재정의하는 메서드(옵션)
		 				super.getMessage()	: super에 입력된 내용을 가져온다.
		 			}
		 			// 기타 추가할 메서드 선언
		 		}
		 		main()
		 		추가할 메서드..
		 		try{
		 			if 조건문
		 				new 사용자정의클래스()
		 		}catch(사용자정의클래스 e1){
		 			e1.getMessage();	// 예외처리 내용
		 		}
		  */
		System.out.println("# 사용자정의 예외 시작 #");
		try {
			for(int cnt=1; cnt<=10; cnt++) {
				System.out.println("번호: " + cnt);
				if(cnt==5) {
					throw new User01Exception(cnt+"번에서 예외 발생");
				}
			}
		}catch(User01Exception e) {
			System.out.println("# 예외발생 #");
			System.out.println(e.getMessage());
			e.call01();
		}finally {
			System.out.println("예외와 관계없이 수행되는 구문");
		}
		System.out.println("시스템 종료");
	}

}


class User01Exception extends Exception{
	User01Exception(String errMsg){
		super("사용자정의 에러: " + errMsg);		// 상위 생성자 중 매개변수가 문자열로 된 생성자 호출
		// 하위 생성자는 반드시 상위에 있는 생선자를 호출해야 한다.
	}
	@Override
	public String getMessage() {
		String msg = super.getMessage();
		System.out.println("예외내용: " + msg);
		return "재정의된 메서드 호출: " + msg;
	}
	// 추가 기능 메서드 처리
	public void call01() {
		System.out.println("내가 만든 예외처리 객체");
	}
}