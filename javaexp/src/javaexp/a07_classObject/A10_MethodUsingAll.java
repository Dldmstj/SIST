package javaexp.a07_classObject;

public class A10_MethodUsingAll {

	public static void main(String[] args) {

		/*
		 # 메서드의 입력처리, 로직처리, 리턴값을 다하는 경우
		 1. 외부의 데이터를 받아서 (매개변수로 데이터 처리)
		 2.로직처리(아래 내용 전부 또는 일부를 처리하고)
		 	1) 저장
		 	2) 출력
		 	3)반복문/조건문 처리
		 3. 최종결과 데이터를 return값으로 전달하여, 메서드가 호출되는 곳에서 처리하는 경우를 말함.
		 */
		ShoppingMall sm = new ShoppingMall();
		String ret = sm.login("himan", "7777");
		System.out.println("결과1: " +ret);
		System.out.println("결과2: " +sm.login("higirl", "8888"));
				// isAdult(나이를 입력) 	성인/미성년자는 18세 기준으로 리턴하게 처리하세요.
		System.out.println();
		
		String ret2 = sm.isAdult(18);
		System.out.println("결과 1: "+ sm.isAdult(8));
		System.out.println("결과 2: "+ ret2);
	}

}
class ShoppingMall{
	
	String isAdult(int age) {
		String result = "미성년자";
		if(age >= 18) {
			result = "성인";
		}
		return result;
	}
	
	// 입력 id, pass
	String login(String id, String pass) {
		String result="로그인 실패";
		// 로직처리: 아이디와 패스워드가 맞을때만 로그인 성공
		if(id.equals("himan")&&pass.equals("7777")) {
			result="로그인 성공";
		}
		//결과 리턴
		return result;
	}
}