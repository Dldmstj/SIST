package javaexp.a10_exception;

public class A11_UserException {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 2 + 1);
		System.out.println("번호: " + num);
		
		try {
			if(num == 1) {
				throw new User02Exception();
			}
		}catch(User02Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("예외와 관계없이 실행되는 구문");
		}
		System.out.println("시스템 종료");
	}
}
//	ex) User02Exception으로 예외 클래스를 사용자정의선언하고, main에서 임의의수(Math.random()) 1-2가 발생할 때,
//		1이 나오면 예외 객체를 던져 처리되게 하세요.

class User02Exception extends Exception{
	User02Exception(){
		super("1이 나왔습니다![예외]");
	}

	@Override
	public String getMessage() {
		String eMsg = super.getMessage();
		return "사용자정의 예외발생: " + eMsg;
	}
	
}