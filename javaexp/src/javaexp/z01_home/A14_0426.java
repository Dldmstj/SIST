package javaexp.z01_home;

import java.io.IOException;
import java.util.Scanner;

public class A14_0426 {
//	[1단계:조원] 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요)
//	      1) 예외 처리를 왜 하는지 알고 있나요?
	/*
	 	프로그램 실행 도중에 발생하는 에러는 프로그램의 신뢰성에 영향을 미치기 때문에 이를 효과적으로 대응하기 위해 에러처리를 한다.
	 */
//	      2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지?
	/*
			  1단계 기본 형식 
			  		try{}catch(Exception e){}
			  2단계 계층적 처리 
			  		try{}catch(Exception e){}catch(Exception e){}..finally{}
			  3단계 예외의 위임 void 메소드() 
			  		throws 예외1, 예외2{}, try-catch
			  4단계 사용자 정의 예외 처리
					class 사용자정의예외클래스 extends Exception{ super("예외메시지"); }
	 */
//	      3) args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요.
	void call01() throws ArrayIndexOutOfBoundsException{
		System.out.println("# args값을 입력하지 않았을 때 처리되는 예외 #");
	}
//	      4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
//					Scanner sc = new Scanner(System.in);
//					System.out.print("아이디를 입력하세요(8자리 이상 ~16자리 미만): ");
//					try {
//							String id = sc.nextLine();
//							if(id.length() < 8 || id.length() >=16) {
//								throw new IdException();
//						}
//					}catch(IdException e) {
//						System.out.println(e.getMessage());
//					}finally {
//						System.out.println("// 예외처리와 관계없이 실행되는 구문 //");
//					}
//					System.out.println("# 프로그램 종료 #");
//				
//					System.out.println();
	
//	[1단계:개념] 2. css 문자열 관련 속성을 예제와 함께 기술하세요
	/*
	  	1) font-family : 글꼴 관련 속성
	  		ex) font-family:'맑은고딕';	font-family: 'Times New Roman', Times, serif;
		2) font-style : 글자 모양, 기울임이나 특정한 형태로 처리
			ex) font:italic bold
		3) font-size :  문자의 크기, 절대 속성값, 상대 속성값으로 지정
			ex) font-size: 1.5em;  font-size: large;  font-size: 40px;
		4) font-weight : 문자의 굵기
			ex) font-weight: bord; font-weight: light; 
	 */
	
//	[1단계:개념] 3. css box 모델의 단계별 속성을 설명하세요
	/*
	    1) 가장 내부: 컨텐츠라고 함(주로 문자나 이미지, 기타 포함되는 요소를 지칭)
        2) 패딩(padding) : 테두리선을 나타내는 border와의 사이 간격을 설정하는 요소
        3) 테두리(border) : padding 외부에 외곽선으로 직선이나 점선 혹은 이미지로 테두리를 그릴 수 있는 경계선
        4) 여백(magin) : 박스의 맨 바깥 영역으로 테두리(border)와 외부 다른 요소들과의 간격을 지정할 때 활용
	 */
	
//	[1단계:개념] 4. css border의 위치관련 속성, 굵기, 종류관련 개별적 속성과 전체 설정 처리를 기술하세요
	/*
		 1. border의 위치에 따른 굵기
	                border-(위치) : left(왼쪽), right(오른쪽), top(위), bottom(아래)
	     2. border의 유형에 따른 옵션
	                border-style: dotted(.점선), solid(선), double(두 줄), dashed(- 점선)
		 div.box{
	            height: 200px; width: 200px; margin: 10px; border: 1px solid pink;
	            background-color: mistyrose; text-align: center;
	     }
	 * */
	
//	[1단계:확인] 5. css box 모델의 모서리 둥글기 속성을 이용하여, 버튼1, 버튼2를 span으로 만들어 보세요.
		/*
		  # css #
		   span{
		   		background-color: mistyrose; 
		   		border:solid 1px palevioletred; width: 300px; padding: 20px; 
		   }
		  # body #
		   	<span style="border-radius:  0px 30px 20px;">버튼 1</span>
    		<span style="border-radius: 10px 20px 30px 40px;">버튼 2</span>
		 */
	
//	[1단계:확인] 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요.
	static void callException01() throws IOException {		
		// 해당 메서드를 호출하는 곳에서 처리하기위해 예외를 위임
		System.out.println("# 문자를 한 개 입력하세요 # (메서드1)");
		System.out.println("입력한 문자: " +(char)System.in.read());
	}
	static void callException02() throws ClassNotFoundException{	
		// 예외를 위임2
		System.out.println("메서드1");
	Class.forName("aa.bb.cc");
	}
	
	
	public static void main(String[] args) {
		try {
			callException01();
			callException02();
			// 위임된 예외를 처리
		} catch (IOException e) {
			System.out.println("IOException 발생: " + e.getMessage());
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 발생: " + e.getMessage());
		}finally {
			System.out.println("// 예외처리와 관계없이 실행되는 구문 //");
		}
		System.out.println("# 프로그램 종료 #");
		
		System.out.println();
		
		
//	      1- 4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요(8자리 이상 ~16자리 미만): ");
		try {
				String id = sc.nextLine();
				if(id.length() < 8 || id.length() >=16) {
					throw new IdException();
			}
		}catch(IdException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("// 예외처리와 관계없이 실행되는 구문 //");
		}
		System.out.println("# 프로그램 종료 #");

		System.out.println();
		
//	[1단계:확인] 7. 1~10까지 출력할 때, 짝수인 경우에 사용자 정의 예외가 처리되게 하세요.
/*
  # 예외처리 반복문
  1. 반복문 안에서 처리
  		for(){
  			try{
  				if(){}
  			}catch(){}
  		}
  	해당 조건이 나왔을 때, 예외 catch블럭이 수행되고, 다시 다음 반복 step을 수행처리한다.
 */
		for(int cnt=1; cnt<=10; cnt++) {
			try {
				System.out.print(cnt + " ");
				if(cnt % 2 == 0) {
					throw new HolJjackException();
				}
			}catch(HolJjackException e) {
			System.out.println(e.getMessage());
			}finally {
//				System.out.println("// 예외처리와 관계없이 실행되는 구문 //");
			}
		}
		
		try {
			for(int cnt=1; cnt<=10; cnt++) {
				System.out.print(cnt + " ");
				if(cnt % 2 == 0) {
					throw new HolJjackException();
				}
			}
		}catch(HolJjackException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("// 예외처리와 관계없이 실행되는 구문 //");
		}
		System.out.println("# 프로그램 종료 #");
			
	}
}


class HolJjackException extends Exception{
	HolJjackException() {
		super("짝수는 예외처리됩니다.");
	}

	@Override
	public String getMessage() {
		String eMsg = super.getMessage();
		return "짝수 예외 발생: " + eMsg;
	}
	
}
class IdException extends Exception{
	IdException() {
		super("아이디를 8자 이상, 16자 미만으로 입력해주세요");
	}
	@Override
	public String getMessage() {
		String eMsg = super.getMessage();
		return ": "+ eMsg;
	}
	
}

