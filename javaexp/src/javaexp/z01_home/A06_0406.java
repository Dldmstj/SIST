package javaexp.z01_home;

public class A06_0406 {

	public static void main(String[] args) {
//		[1단계:개념] 1. http://localhost:8080/frontWeb/a01_start/a01_show.html를 브라우저를 통해 실행했다고 한다.
//		           위 url의 각 구성요소의 의미를 기술하세요
					/*
					  localhost => 현재 나의 pc
					  8080(포트번호) => 한 pc내에서 여러가지 서비스를 지원하고자 할 때
					  frontWeb/a01_start/a01_show.html => 파일의 물리적 경로
					  
					 */
//		[1단계:개념] 2. 문자를 강조하는 태그들의 각 기능을 간단한 예제를 통해 기술하세요.
		/*
			  <b> 텍스트 진하게 </b>
			  <strong> 강조 </strong>
			  <small> 텍스트를 한 단계 작게 </samll>
			  <i> 텍스트 기울이기 </i>
			  <del> 텍스트 중앙에 선 </del>
			  <ins> 텍스트에 밑줄 </ins>
		 */
		
//		[1단계:개념] 3. 특수문자를 처리하는 코드를 예제를 통해 기술해 보세요.
		/*
		 	&lt;안녕하세요&gt;		// 출력 형태: <안녕하세요>
		 	&quot;안녕하세요&#34;	// 출력 형태: "안녕하세요"
			&divide;	// 출력 형태 : ÷
			&radic; 	// 출력 형태 : √
			&amp;		// 출력 형태 : &
			&uarr;		// 출력 형태 : ↑
			&sum;		// 출력 형태 : ∑
			
		 */
		
//		[1단계:개념] 4. html에서 줄바꾸기와 공백에 대한 처리방식을 2가지가 있다. 
//			일단, 기본 코드로 처리되는 내용을 예제와 함께 설명하고, 두번째 방식에 대한 내용을 예제와 함께 기술하세요 
			/*
				1) <br> 태그와 &nbsp;
					<p>안녕하세요<br>재미있는&nbsp자바</p>
						==> 출력형태
								안녕하세요
								재미있는 자바
						// <br> 태그는 break line의 의미로 줄바꿈 처리를 하게 해줌
						 * &nbsp; 는 공백처리를 하게 해줌 (공백을 2칸 이상으로 처리하고 싶을 때)
				 
				2) <pre></pre> 태그
					<pre>
						안녕하세요
						재미있는     자바
					</pre>
						==> 출력형태
							안녕하세요
							재미있는     자바
						// <pre> 태그를 사용하면 줄바꿈과 공백을 입력해둔 기존의 형태와 동일하게 출력할 수 있다.
			*/
//		[1단계:코드] 5. html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 
//			위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 각 과목의 타이틀과 함께 웹화면에 출력되게 하세요.
		
			
//		[1단계:개념] 6. html에서 블럭태그와 인라인 태그의 차이점을 유형을 나열하고, 예제를 통해서 특징을 기술하세요.
			/*
			  1) 블럭 태그, 줄바꿈 포함. 행 단위로 추가 가능
			  	: <p> <h1> <div> <ul>
			  		// 항상 새 라인에서 시작하여 출력.
			  		 * 	양 옆에 다른 컨텐츠를 배치하지 않고 한 라인을 독점하여 사용한다.
			  		  <div>안녕안녕</div>
			  		  <div>하세요</div>
			  		  	=> 출력형태 : 안녕안녕
			  		  				하세요
			  2) 인라인 태그, 줄바꿈 포함하지 않음. 열 단위로만 추가 가능
			  	: <strong> <a> <img> <span>
			  		// 블럭 속에 삽입되어 블럭의 일부로 출력된다.
			  		 <span>감자</span>
			  		 <span>고구마</span>
			  		 <span>옥수수</span>
			  		 		=> 출력형태 : 감자 고구마 옥수수
			 */
//		[1단계:개념] 7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요.
			
			 	// 2차원 배열의 선언
			int [][] intArr;
				// 2차원 배열의 할당
			intArr = new int[2][2];		// 2개의 상위 차원과 그 상위차원에 종속된 하위 차원 2개를 할당함
			 
		
//		[1단계:코드] 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
//		           초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요.
			String [][] member = new String[2][3];	
				// 2명의 회원 배열과 각각 종속된 회원아이디, 회원명, 회원등급 배열
			member[0][0] = "hong01";	// 첫 번째 회원의 id
			member[0][1] = "홍길동";		// 회원명
			member[0][2] = "A";			// 회원등급
			member[1][0] = "kim02";		// 두 번째 회원의 id
			member[1][1] = "김길동";		// 회원명
			member[1][2] = "S";			// 회원등급
			System.out.println("회원ID\t회원이름\t회원등급");
			for(int idx=0; idx<member.length; idx++) {		// 회원 반복출력
				for(int jdx=0; jdx<member[0].length; jdx++) {	// 회원정보 반복출력
					System.out.print(member[idx][jdx] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		
//		[1단계:코드] 9. 반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
//		           1반 1번 @@ 점...
			System.out.println("반/번호\t점수");
			int [][] stdArr = new int[5][30];	// 5개의 반, 각각의 반에 30명의 학생을 할당
			for(int ban=0; ban<stdArr.length; ban++) {		// 반을 반복
				for(int std=0; std<stdArr[0].length; std++) {	// 학생을 반복
					stdArr[ban][std] = (int)(Math.random() * 101);
					System.out.println((ban+1) + "반 " + (std+1) +"번\t" + stdArr[ban][std]+"점");
				}
				System.out.println();
			}
		
//		[1단계:개념] 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  호출의 
//			각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요.

//			1) 객체의 선언, 객체를 사용하려면 초기화해야한다. 사용할 수도 호출할 수도 없는 상태.
			String str;		// 문자열	객체의 선언,
			int [] intArry; 	// 숫자형 배열의 선언	
			
			
//				2) 객체의 초기화, 객체를 호출하려면 객체를 생성해야 한다. 사용은 할 수 있지만 호출은 할 수 없다.
			str = null;		// 문자열 객체 str을 null값으로 초기화
			intArry = null;		// 숫자형 배열의 값을 null로 초기화

//				3) 객체 생성, heap영역에 데이터를 할당해둔 상태. 객체를 사용할 수도, 호출할 수 있다.
			str = new String("Hello");
			intArry = new int[3];
			
			
//				3) 객체 호출
			System.out.println(str);
			System.out.println(intArry[0]);
	}

}
