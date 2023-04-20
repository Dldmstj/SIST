package javaexp.z01_home;

public class A08_0411 {

	public static void main(String[] args) {
//		[1단계:개념] 1. ul과 ol의 차이점을 기본예제를 통해서 기술하세요
			/*
			  1) ol
			  		odered list, 순서가 있는 리스트
			  		<h3>라면 끓이는 순서</h3>
			  		<ol>
						<li>물을 끓인다</li>
						<li>라면과 스프를 넣는다</li>
						<li>파를 썰어 넣는다</li>
						<li>5분 후에 먹는다</li>
					</ol>
			  		
			  2) ul
			  		unordered list, 순서가 없는 리스트
			  		<h3>장바구니</h3>
			  		<ul>
			  			<li>라면</li>
			  			<li>대파</li>
			  			<li>계란</li>
			  		</ul>
			 */
//		[1단계:개념] 2. 중첩태그 코드란 무엇인지 형식과 예제를 기술하세요.
		
			/*
			 # 이중 태그 사용
		 		1. 상위태그 하위태그
		 		2. 계층적으로 선언하여 두가지 기능이 다 처리되게 한다.
		 		
		 		<ul>
					 <li>제주도</li>
					 <li>괌</li>
					 <li>다낭</li>
		 		</ul>
			 */
		
//		[1단계:개념] 3. ul과 ol의 속성을 기술하고, 속성값이 적용된 예제를 만들어 보세요.
			/*
			  <ol type ="1" start="2">	// 아라비아 숫자로 2부터 순서매김
			  
			  <ul type ="square">		// ■
			  
			 */
		
//		[1단계:확인] 4. ul/ol을 중첩적으로 사용하여, 학년 반별 학생명단을 리스트하세요
			/*
			   <ol type="1">
				  	<li>학년</li>
				  		<ol type="1">
				  			<li>반</li>
				  				<ul type="circle">
				  					<li>짱구</li>
				  					<li>훈이</li>
				  				</ul>
				  			<li>반</li>
				  				<ul type="circle">
				  					<li>맹구</li>
				  					<li>철수</li>
				  				</ul>
				  		</ol>
				  		<li>학년</li>
				  		<ol type="1">
				  			<li>반</li>
				  				<ul type="circle">
				  					<li>유리</li>
				  				</ul>
				  		</ol>
				  </ol> 
			 */
		
//		[1단계:개념] 5. table의 계층별 구성요소의 의미를 기본 예제를 통해서 기술하세요..
			/*
			  <thead> :	table header.
			  <tbody> : table body.
			  		- <tr> : table row. 테이블의 행단위.
			  			- <th> : table head. 테이블 행의 타이틀.
			  		- <td> : table data. 테이블의 열단위.
			  <tfoot> : table footer.
			  
			 */
//		[1단계:확인] 6. table의 전체 계층 구조로 회원 현황을 만드세요
//		      순차번호, 아이디 회원명 권한 포인트
		
			/*
			 	<h3>2X5 회원정보 테이블</h3>
		 		<table border>
		 			<thead>
		 				<tr>
		 					<th>순차번호</th><th>아이디</th><th>회원명</th><th>권한</th><th>포인트</th>
		 				</tr>
		 			</thead>
		 			<tbody>
			 			<tr>
			 				<td>1</td><td>jjang09</td><td>짱구</td><td>관리자</td><td>5000</td>
			 			</tr>
			 			<tr>
			 				<td>2</td><td>mang09</td><td>맹구</td><td>고객</td><td>0</td>
			 			</tr>
			 			<tr>
			 				<td>3</td><td>chulS00</td><td>철수</td><td>고객</td><td>10000</td>
			 			</tr>
		 			</tbody>
		 		</table>
		 		
			 */
		
//		[1단계:개념] 7. 매서드의 구성요소와 해당 구성요소의 특징을 기본 예제를 만들어서 설명하세요.
			/*
			  	메서드의 구성요소
			  		리턴유형 메소드명(매개변수1, 매개변수2, ...){
		  			프로세스 처리
		  				return 실제 리턴할 데이터;
		  			}

		  			ex) int hap(int num1, int num2) {
		  					this.num1 = num1;
		  					this.num2 = num2;
		  					int tot = this.num1 +  this.num2;
		  					return tot;
		  				}
			 */
//		[1단계:확인] 8. 메서드의 리턴유형을 정수,실수,문자열,boolean을 선언하여 실제 데이터를 리턴하고, 메인메서드에서 호출하세요
				
					RetExp ret1 = new RetExp(100);
					RetExp ret2 = new RetExp(3.14);
					RetExp ret3 = new RetExp("hello");
					RetExp ret4 = new RetExp(true);
					
					System.out.println("정수형 리턴: " + ret1.getNumInt1());
					System.out.println("실수형 리턴: " + ret2.getNumDouble1());
					System.out.println("문자열 리턴: " + ret3.getStr1());
					System.out.println("boolean 리턴: " + ret4.getBoo1());
					System.out.println();
					
//		[1단계:확인] 9. Product88이라는 클래스를 선언하고, 생성자를 통해 물건명, 가격, 갯수를 초기화하게 했다.
//		      이 때, 메서드1 물건명 리턴, 메서드2 가격리턴, 메서드3는 가격과갯수를 연산한 총계를 리턴하게
//		      선언하고 해당 메서드를 호출하여 리턴값을 확인하세요.
					Product88 prd = new Product88("감자", 500, 11);
					System.out.println("물건명: " + prd.getPname());
					System.out.println("갯수: " + prd.getCnt() + "개");
					System.out.println("개당 가격: " + prd.getPrice() + "원");
					System.out.println("총 가격: " + prd.getPriceNCnt() + "원");
					System.out.println();
					
//		[1단계:확인] 10. BBPlayer라는 클래스를 선언하고, 생성자를 통해 필드값 이름, 팀명, 타석, 안타를 초기화하게 하고,
//		      메서드1에서는 이름과 팀명을 리턴, 메서드2에서는 타율(안타/타석)을 리턴하여 호출되게 하여
//		      메인메서드를 통해서 출력하세요.
					BBPlayer bp1 = new BBPlayer("이정후", "키움", 553, 193);
					BBPlayer bp2 = new BBPlayer("피렐라", "삼성", 561, 192);
					BBPlayer bp3 = new BBPlayer("박건우", "엔씨", 408, 137);
					System.out.println("선수이름/소속팀\t\t타율");
					System.out.println(bp1.getNameNTeam() + "\t\t" + bp1.hitPoint());
					System.out.println(bp2.getNameNTeam() + "\t\t" + bp2.hitPoint());
					System.out.println(bp3.getNameNTeam() + "\t\t" + bp3.hitPoint());
	}

}

class BBPlayer{
	String name;
	String tname;
	int totHit;
	int hitCnt;
	
	public BBPlayer(String name, String tname, int totHit, int hitCnt) {
		this.name = name;
		this.tname = tname;
		this.totHit = totHit;
		this.hitCnt = hitCnt;
	}
	
	public double hitPoint() {
		double hitPoint = (double)hitCnt / totHit; 
		return hitPoint;
	}


	public String getNameNTeam() {
		return name +"/"+ tname;
	}
	
	
}

class Product88 {
	String pname;
	int price;
	int cnt;
	
	public Product88(String pname, int price, int cnt) {
		this.pname = pname;
		this.price = price;
		this.cnt = cnt;
	}

	public String getPname() {
		return pname;
	}

	public int getCnt() {
		return cnt;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPriceNCnt() {
		int totPrice = price * cnt;
		return totPrice;
	}
	
	
}

class RetExp{
	int numInt1;
	double numDouble1;
	String str1;
	boolean boo1;
	
	public RetExp(int numInt1) {
		this.numInt1 = numInt1;
	}
	public RetExp(double numDouble1) {
		this.numDouble1 = numDouble1;
	}
	public RetExp(String str1) {
		this.str1 = str1;
	}
	public RetExp(boolean boo1) {
		this.boo1 = boo1;
	}
	
	public int getNumInt1() {
		return numInt1;
	}
	public double getNumDouble1() {
		return numDouble1;
	}
	public String getStr1() {
		return str1;
	}
	public boolean getBoo1() {
		return boo1;
	}
}