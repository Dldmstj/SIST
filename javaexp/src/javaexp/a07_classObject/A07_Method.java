package javaexp.a07_classObject;

public class A07_Method {

	public static void main(String[] args) {
		
		/*
		  # class의 구성요소 메소드
		  1. 메소드는 class에서 구성된 구성요소로서 객체가 가지고 있는 기능적인 역할을 하는 함수이다.
		  2. 특정한 기능을 처리하고 결과값을 리턴하는 기능이 있고 이것이 객체(class)에 종속되는 경우, 메서드라고 한다.
		  3. 메서드는 매개변수로 데이터를 받아서, 전역변수에 저장하기도 하고ㅡ 전역변수의 데이터와 관계에 있는 로직을 처리하여
		  	최종적으로 원하는 데이터를 리턴해주는 것이라 할 수 있다.
		  	1) 매개변수 입력
		  	2) 저장 처리(전역변수)
		  	3) 로직 처리 : 전역변수/지역변수의 데이터를 확인해서 조건/반복문을 통해 원하는 결과를 처리
		  	4) 화면 출력
		  	5) 결과값 호출한 곳에 리턴 처리
		  4. 메소드의 선언
		  	1) 메소드의 기본 형식
		  		리턴유형 메소드명(매개변수1, 매개변수2, ...){
		  			프로세스 처리
		  			return 실제 리턴할 데이터;
		  		}
		  	2) 구성요소
		  		리턴유형: 이 메서드를 통해서 처리하는 결과값을 리턴하는데, 메서드 선언의 가장 밑 부분에 실제 리턴할 데이터의 유형을 선언하는 것을 말한다.
		  			리턴하지 않을 경우는 void를 선언한다.
		  		ex) int ret01(){
		  				return 25;
		  			}
		  			double ret02() {
		  				return 25.17;
		  			}
		  			void ret03() {
		  			
		  			}
		  		메서드명(매개변수..)
		  			매개변수는 외부에서 입력한 데이터를 받아서, 이 기능 메서드의 지역변수로 활용하여 사용한다.
		  			메서드명과 매개변수의 선언기준은 외부에서 호출할 때 식별할 수 있는지 여부에 따른다.
		  			즉, 메서드 오버로딩 규칙이 적용된다.
		  		프로세스 처리
		  			매개변수를 받아서 전역변수에 할당하거나, 특정 조건 처리/반복처리를 하는 등, 여러가지 해당 기능을 통해
		  			처리할 로직을 포함하는 기능을 한다.
		  		최종 리턴값
		  			처음에 선언한 리턴 유형에 맞는 최종 리턴값을 해당 메서드를 통해서 처리할 수 있다.
		  			단, return XXX 형식으로 선언하지 않을 경우도 있는데, 이 때는 반드시 return 유형을 void라고 선언해야 한다.
		 */
		Calculator cal = new Calculator();
		int ret01 = cal.plus(30, 25);
		System.out.println("최종 리턴값 1: "+ ret01);
		
		MRExp mr = new MRExp();
		
/*		System.out.println(mr.retStr01());
		String calRet = mr.retStr01();
		System.out.println(calRet);
		
		System.out.println(mr.retInt01());		// 그냥 출력
		int reInt = mr.retInt01();
		System.out.println(reInt);			// 변수에 할당하고 출력
*/
		MRExp m = new MRExp("홍길동",25);
		int age = m.getAge();
		System.out.println(age);
		
		System.out.println();
		MRExp2 mr2 = new MRExp2("sh1n","jjang9");
		System.out.println("id 리턴: " + mr2.getId());
		System.out.println("pw 리턴: " + mr2.getPw());
		System.out.println("id/pw 리턴: " + mr2.getIdPw());
	}

}

// class MRExp2 를 선언하고 필드로 회원id, pw. 생성자로 초기화시키고,
// 메서드 getId, getPw, getIdPw -> id와 pw를 @@@/@@@ 형식으로 받아오기

class MRExp2{
	String id;
	String pw;
	
	public MRExp2() {}
	
	public MRExp2(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	// 전역변수에 있는 id값을 가져오는 메서드
	public String getId() {
		return id;
	}
	
	// 전역변수에 있는 pw값을 가져오는 메서드
	public String getPw() {
		return pw;
	}
	
	// 전역변수에 있는 id+pw값을 아래 형식으로 가져오는 메서드
	public String getIdPw() {
		return id + " / " + pw;
	}
	
	
	
	
}


// 나이를 return하는 메서드를 만들고, main에 호출하여 출력하세요
class MRExp{
	String name;
	int age;
	
	public MRExp() {}
	
	public MRExp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
		
	public int getAge() {
		return age;
	}

	String getName() {
//		return this.name;	
		return name;		// 여기서의 name은 전역변수의 name을 의미.
	}
	
	/*
	// 문자열 리턴
	String retStr01() {
		return "홍길동(리턴값)";
		
	}
	
	int retInt01() {
		return 100;
	}
	// 정수 100 을 리턴할 메서드를 정의하고, 위 메인 메서드에서 바로 출력하는 것과, 변수에 넣고 호출하는 것을 만드세요
	
	*/
}

class Calculator{
	int num1;
	int num2;
	
	public Calculator() {}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int plus(int num1, int num2) {
		// 전역변수에 할당
		this.num1 = num1;
		this.num2 = num2;
		// 덧셈 결과를 tot 지역변수에 할당
		int tot = this.num1 + this.num2;
		// 합산한 결과값을 return 처리해서, 이 메서드를 호출한 곳에 전달.
		return tot;
	}

	
}

		