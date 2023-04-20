package javaexp.z01_home;

public class A13_0420 {
//	[1단계:조별] 1. 다형성을 대한 내용에 대하여 정리해보자.
//	      1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
//	      2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
//	      3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
//	      삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
//	[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
//	[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
//	[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
//	[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
//	[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
//	[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.

	public static void main(String[] args) {
//		[1단계:조별] 1. 다형성을 대한 내용에 대하여 정리해보자.
//		    1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
			/*
				공통 멤버를 가진 상위클래스를 상속받은 하위클래스에서,
				기능적 분리를 하는 메서드를 상위클래스에 정의된 이름과 매개변수를 동일하게 정의하여 다양한 기능을 처리한다.
				여러 하위객체를 통해 다양한 기능을 처리하여 재사용성을 높인다.

			 */
		
//		    2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
			/*
			  	1) 상위클래스
			  		필드선언, 생성자선언, 메서드 선언
			  	2) 하위클래스
			  		생성자 오버라이딩, 메서드 오버라이딩
			 */
		
//		    3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
//		    삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
				Polygon poly01 = new Triangle();
				poly01.drawing();
				
				Polygon poly02 = new Rectangle();
				poly02.drawing();
				
				Polygon poly03 = new Pentagon();
				poly03.drawing();

		
//		[1단계:개념] 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
			/*
			  1) 자식 선택자
			  		- 선택자는 '>' 기호로 조합된다.
					- 해당 부모를 가진 자식 요소객체에 적용된다.
				ex) 부모 > 자식 {속성:속성값;}
					div > stront{color; dodgerble}
					
			  2) 자손 선택자
			  		- 계층 레벨의 바로 밑을 포함, 밑에 여러 계층레벨이 있더라도 적용된다.
			  	ex) 상위 하위{속성:속성값;}
					상위 하위{background-clolor : yellow;}
			 */
		
//		[1단계:개념] 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
			/*
			# 속성 선택자
				html태그의 속성에 대해 값이 일치하는 태그를 스타일로 적용한다.
				 태그명 속성 = 속성값 ( class="", id="" )
			 1) 선택자[속성=속성값]
                   ex) input[name=myId] {color:blue;}
                       input태그이고, 해당 태그의 속성인 name이 myId이면 글자 색상을 파랑으로 처리
             2) [속성=속성값]
                   ex) [align=center] {border:3px solid green;}
                       선택자에 상관 없이 align속성이 center로 설정된 경우에, 기재된 border의 속성을 지정한다.
             3) [속성]
                   ex) [type] {background-color: orange;}
						해당 속성에 전부 background-color를 주황색으로 적용
			 */
//		[1단계:확인] 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
			/*
			 <!DOCTYPE html>
				<html>
					<head>
						<meta charset="UTF-8">
						<title>Insert title here</title>
						<style type="text/css">
						input[type=text]{background-color: #FFD9EC;}
				        [type=password]{background-color: navy; color: #FFFFFF}
				        [name=myName]{background-color: blue;}
				        [value]{background-color: #FFD9EC; border: 3px solid red;}
						</style>
					</head>
					<body>
						<form>
							<table border>
								<tr>
									<th>이름</th>
									<td><input type="text" name="myName" placeholder="이름"/></td>
								</tr>
								<tr>
									<th>닉네임</th>
									<td><input type="text" name="myNick" placeholder="닉네임"/></td>
								</tr>
								<tr>
									<th>아이디</th>
									<td><input type="text" name="myId" placeholder="아이디"/></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td><input type="password" name="myPw" placeholder="비밀번호"/></td>
								</tr>
								<tr>
									<td colspan="2" align= center><input type="submit" value="등록"/></td>
								</tr>
							</table>
						</form>
					</body>
				</html>
			 */
//		[1단계:확인] 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
			/*
			  	1) 마우스
		            :hover  - 마우스의 커서가 해당 요소 객체 위에 위치해있을 때.
		            		 ex) td:hover{background-color: orange;}
		            :active - 마우스로 클릭하여 누르고 있는 상태에서 적용할 스타일 지정
		            		 ex) tr:active{font-size: 30px;}
		            		 
		        2) 폼 하위 요소객체
		            :focus  - 폼 요소가 키보드나 마우스 클릭으로 포커스를 위치시켰을 때 적용할 스타일을 지정
		                ex) 아이디[    ]
		                    패스워드[   ]
		                    input:focus{background-color:yellow;}
		                    입력하기 위해 커서를 위치시켰을 때, 배경색상을 노란색으로 변경. 커서를 다른 곳으로 이동하면 배경색상 적용이 사라진다.
		                    
		        3) 링크
		            :link   - 링크된 글자나 이미지가 아직 클릭을 통한 방문이 이뤄지지 않았을 때 적용할 스타일
		            :visited    - 링크된 글자나 요소 객체가 클릭 및 방문 후, 다시 현재페이지를 열었을 때 방문한 링크인 것을 구분하기 위한 css 적용
		            		ex)  a:visited{color:green;} 링크를 방문했을 때 글자색상을 초록색으로 처리
		            		
		        4) 블럭형 태그에 적용(주의: inline형 태그에는 적용되지 않는다.)
		            :first-letter  - p, div등과 같은 문자를 포함하고 있는 블럭형 태그의 첫 글자에 스타일을 적용하는 것
		            :first-line    - p, div등과 같은 문자를 포함하고 있는 블럭형 태그의 첫 라인에 적용할 스타일을 지정할 때 사용
		            
		        5) 구조처리 - 반복적으로 처리되는 태그에 대하여 구조적으로 반복적인 css적용이 필요할 때 사용됨
		                    ex) 짝수번째 라인, 홀수번째 요소객체, 3개단위 데이터에 css적용 등
		            :nth-child(even|odd) - 해당 반복적인 태그의 순서 기준으로 짝수 또는 홀수인 것에 대한 적용을 할 때 사용
		            :nth-child(1) - 첫번째 자식 태그에 스타일 적용
		            :nth-child(3n+1) - 반복되는 해당 요소 객체의 자식태그가 3개 단위로 스타일을 적용하는 것. 3개 단위마다 첫번째 것에 대한 선택자 지칭
			 */
		
//		[1단계:개념] 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
			/*
			  class 제빵{
			  		String 종류;	// 필드
			  		public 제빵(String 종류){		// 생성자
			  			this.종류 = 종류;
			  			System.out.println();
			  		}
			  		void 반죽하다() {		// 메서드
			  			System.out.println(종류+"를 만들려고 합니다.");
			  		}
			  }
			  
			 */
		
//		[1단계:개념] 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요.
			/*
				class 단팥빵 extends 제빵{
					public 단팥빵(){		// 상위 생성자
			  			super("단팥빵");
			  		}
			  		void 반죽하다() {		// 상위 메서드 재정의
			  			super.반죽하다();
			  			System.out.println(종류+" 반죽 완성");
			  		}
				}
			 */
	}

}

class Polygon {
	   private String kind;

	   public Polygon(String kind) {
	      this.kind = kind;
	   }
	   public void drawing() {
	      System.out.println(kind+"모양으로..");
	   }
	}
class Triangle extends Polygon{

	   public Triangle() {
	      super("삼각형");
	   }
	   @Override
	   public void drawing() {
	      super.drawing();
	      System.out.println("나초를 그렸다...!");
	   }
	}

class Rectangle extends Polygon{

	   public Rectangle() {
	      super("사각형");
	   }
	   @Override
	   public void drawing() {
	      super.drawing();
	      System.out.println("맥북을 그렸다..!");
	   }
	}
class Pentagon extends Polygon{
	   public Pentagon() {
	      super("오각형");
	   }
	   @Override
	   public void drawing() {
	      super.drawing();
	      System.out.println("미국 교도소 펜타곤을 그렸다...");
	   }
}