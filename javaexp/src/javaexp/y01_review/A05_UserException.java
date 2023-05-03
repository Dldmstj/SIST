package javaexp.y01_review;

import java.util.Scanner;

public class A05_UserException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("아이디를 입력하세요 (8~16자) : ");
				String id = sc.nextLine();
				int len = id.length();
				if(len<8 || len>16) {
					throw new InputIdExcep(id);
					// 유효하지 않을 때 예외 throw
				}
				// 유효할 때, 하단 내용 처리 및 break를 통해 반복문 벗어남
				System.out.println("입력한 id: " + id);
				break;
			}catch(InputIdExcep e) {
				// 예외 내용
				System.out.println(e.getMessage());
			}
		}
		System.out.println("등록 완료");
	}
/*
  # 사용자 정의 예외 클래스 선언 및 사용
  1. 예외처리 기본 형식
  	try{
  		if(조건문){
  			throw new 사용자정의예외();
  		}
  	}catch(사용자정의예외){
  		참조.메서드()
  	}
  2. 위 내용을 처리하기 위해 사용자정의예외를 선언한다.
  	class 사용자정의예외 extends Exception{
  		생성자(){}
  		재정의메서드(){}
  	}
  3. 활용
  	1) 사용자 정의 예외는 일반적으로 api에서 지원되는 예외와 더불어 특정한 경우에 에외를 던져 해당 정의된 예외 클래스에서
  		만들어지는 객체로 처리하는 경우를 말한다.
  	2) 사용자 정의 예외 처리 예시
  		- 아이디 패스워드에 입력 유효성 처리
  		- 회원 가입 아이디 입력 유효성 처리
  		- 특정한 입력값에 대한 유효성 처리(범위값을 넘길 때)
  4. 처리 순서
  	1) 필요로 하는 내용을 요구사항 정의서에 명확히 정리
  	2) 사용자 정의 클래스에서 처리가 필요한 메시지, 기능 내용을 구분해서 정리
  	3) 사용자 정의 예외 클래스 정의
  	4) 해당 내용이 처리될 조건 및 프로세스 정리
  	5) try{}catch{} 문 예외처리 및 사용자 정의 예외 객체 생성
  	
  5. 사용 예제
  	- 회원 가입 아이디 입력 유효성(8~16)범위 내에서 입력처리
  		범위에 맞지 않을 때, 다시 입력하도록 처리.
  	- 메시지: 입력한 아이디의 글자는 @@자 입니다. 아이디는 8~16자 사이 입력 가능합니다.
  		기능 내용: getMessage()로 위 메시지 내용 재정의
  	- 위 내용 기반 예외 클래스 정의
  	- 해당 내용이 처리될 조건 및 프로세스 정리
  		Scanner로 입력시 글자가 8~16자가 아닐 때 예외 throw
 */
}
class InputIdExcep extends Exception{

	public InputIdExcep(String message) {
		super("입력한 글자 수는 " +message.length()+ "자 입니다.");
	}
	@Override
	public String getMessage() {
		return "[입력 오류]: " + super.getMessage() +"\n" + "아이디는 8~16자 사이로 입력 가능합니다.";
	}
	
}