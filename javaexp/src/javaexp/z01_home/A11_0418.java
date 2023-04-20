package javaexp.z01_home;

public class A11_0418 {

	public static void main(String[] args) {

//		[1단계:개념] 1. 오늘 진행한 css 속성을 다른 예제와 함께 기술해보세요.
			/*
			  p{background-color:#E8D9FF; color:#8041D9; font-size:15px;}
}
			 */
		
//		[1단계:개념] 2. css 선언 선택자와 함께 선언한 형식을 구성요소별 내용을 예제와 함께 기술하세요
			/*
			  body{background-color:#E8D9FF; color:#8041D9; margin-left:30px; margin-right:30px;}
			  
			  body : 선택자
			  background-color(배경색) , color(글자색) , margin(공간) : 속성
			  #E8D9FF(색상코드번호), 30px(픽셀) : 속성값
			 */
		
//		[1단계:개념] 3. css 선언 형식(기본,외부,inline)을 예제를 만들고 설명하세요.
			/*
			 	1) 기본 : style 태그 내에 css 속성을 작성함.
				 	<style type="text/css">
				 			태그{속성:속성값; }
				 	</style>
			 		
			 	2) 외부 : css 파일을 외부에 만들어서 현재 파일에 불러오는 방법.
			 		- link 태그 이용
						<link href="파일명.css" type="text/css" rel="stylesheet" href="css파일 경로">
						
					- @import 이용
							@import:url(파일명.css)
							@import '파일명.css'
				
				3) inline : 해당 태그 옆에 css 속성을 작성함
						<태그 style="속성:속성값;">
					
		
			 */
		
		
//		[1단계:개념] 3. 선택자의 종류를 간단한 예제와 함께 기술하세요.
			/*
			  1) 태그 선택자 : 태그 이름이 선택자로 사용되는 경우
			  			선택자와 같은 이름의 모든 태그에 css style이 적용된다.
			  			형식 : h1{color:yellow;}
			  					
			  			
			  2) 다중 선택자 : 여러 개의 선택자에 의해, 선택된 태그들이 동일한 속성과 속성값으로 처리된다.
			  			형식 : h1, h2 {color:blue;}
			  				*{background-color:orange;}	 // 전체
			 */
		
//		[1단계:확인] 4. webapp하위에 a00_com폴드에 z03_style.css로 h1,h2의 배경색상,글자색을 지정하여,
//					현재폴드에서 적용되게 절대 경로로 처리하여 출력하세요.
			/*
			 # html 문서 #
			  <!DOCTYPE html>
				<html>
					<head>
						<meta charset="UTF-8">
						<title>Insert title here</title>
						<link type="text/css" rel ="stylesheet" href="/frontWeb/a00_com/z03_style.css">
						<style type="text/css">
						
						</style>
					</head>
					<body>
						<h1>안녕하세요.</h1>
						<h2>반갑습니다.</h2>
					</body>
				</html>
				
			 # css 문서 #
			 
				@charset "UTF-8";
				h1,h2{background-color:#E8D9FF; color:#8041D9; }

			 */
	}

}
//		[1단계:개념] 5. 1:다 관계의 필드기준 예제(필드만 선언, 메서드 처리x)를 만들어 보자
//				1:다 관계 : 하나의 객체 안에 여러 유형의 객체를 처리하는 것.
				/*
				 	class Student {
				 		int num;
				 		String name;
				 		int age;
				 	}
				 	class Ban {
				 		int bnum;	// 몇 반인지
				 		Student[] stdArr;	// 학생 클래스를 배열형태로 선언
				 	}
				 */

//		[1단계:개념] 6. 상속의 기본형식을 알고 접근제어자의 한계와 함께 예제를 만들어 보자.
			/*
			  	# 상속
			  		부모클래스의 필드와 메소드 등을 자식클래스에서 상속받아 사용할 수 있다.
			  	형식
			  		class Parents{
			  			String charac = "밝다";
			  			void readBook() { System.out.println("책을 읽다.");}
			  			private int age;
			  		}
			  		class Son extends Parents{	// 상위클래스인 Parents를 상속
			  			void callSuper(){
			  				System.out.println(charac);
			  				readBook();
			  				// 상위클래스를 상속받으면 상위클래스에서 선언된 필드와 메소드를 호출할 수 있다.
			  				age = 30; 
			  					// (x), private 접근제어자는 같은 클래스 내에서만 접근할 수 있기 때문에 상속관계여도 접근할 수 없다.
			  					 	접근하기 위해서는 상위 클래스에서 protected 접근제어자를 사용하거나,
			  					 	getter/setter 메소드 등을 선언하여 하위클래스에서 간접적으로 호출하여 접근할 수 있다.
			  				
			  			}
			  		}
			  	
			 */
