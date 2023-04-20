package javaexp.a07_classObject;

public class A12_StaticMember {

	public static void main(String[] args) {

		/*
		 
		  # 상수
		  	객체마다 한 번 할당되면 변경되지 않는 수를 상수라고 함.
		  	final 키워드 할당.
		  	1) 객체별 상수
		  		클래스 내에 선언한 상수로 객체별로 변경되지 않는 수
		  		class Person{
		  			final String name;
		  		}
		  		Person p1 = new Person();
		  		p1.name = "홍길동";
		  		p1.name = "김길동";	// (x)
		  		Person p2 = new Person();
		  		p2.name = "김길동"; 	// (o)
		  		
		  	2) 객체 공유 상수
		  		class Person{
		  			static final String KIND = "황인";
		  				// 일반적으로 static final 상수는 대문자로 사용한다.
		  		}
		  		Person p1 = new Person();
		  		p1.KIND = "흑인";	 // (x)
		  		p1.name = "백인"; // (x)
		  	
		  # static
		  	클래스 객체를 생성해서 사용하다보니,
		  	동일한 클래스를 통해 나온 객체들이 공유하는 메모리의 필요성으로 생성됨
		  # 객체가 서로 공유하고, 한 번 할당되면 변경할 수 없는 데이터를 설정하는 것을 static final 이라고 함.
		  
		  	static은 객체 공유 메모리이기에,
		  	변수로는 클래스명.static변수로 사용하고,
		  	메서드로는 클래스명.static메서드() 사용한다.
		  	ex) Math.random() 
		  		: api(내부사용자정의객체), Math 객체를 공유하여 사용하는 (공유필드를 가진)데이터를 리턴하는 메서드
		  
		 */
		
		System.out.println("객체 생성없이 사용하는 static final");
		// static 메서드 객체의 생성없이 호출할 수 있는 메서드이기 때문에
		// 객체생성이 필요한 일반 메서드는 포함할 수가 없다.
		System.out.println(Number01.NO4);
		System.out.println(Math.PI);
		
		Number01 n1 = new Number01(5,6);
		System.out.println(n1.no2);
		n1.no1 = 8;
		n1.no3 = 10;
//		n1.no2 = 9;		// final 상수로 이미 값을 할당했기 때문에 값을 변경할 수 없음.
		
		Number01 n2 = new Number01(5,6);
		System.out.println("n2 객체의 속성들");
		System.out.println(n2.no1);
		System.out.println(n2.no2);
		// 건축비용: 건물 자재 + 도면
		// static
		System.out.println(n2.no3);		
		// no3에서 10 출력됨. no3을 static으로 선언했기 때문에, no3이 계속 메모리에 띄워져 있는 상태.
//			인스턴스끼리 같은 메모리를 공유함.
//		n1.no2 = 9;		// final 상수로 이미 값을 할당했기 때문에 값을 변경할 수 없음.
		System.out.println();
		
		BankAccount acc01 = new BankAccount("홍길동",10000);
		BankAccount acc02 = new BankAccount("김길동",20000);
		BankAccount acc03 = new BankAccount("신길동",30000);
		
//		 객체가 공유하는 메모리를 사용하기에 객체 공유라기 보다는, 믈래스 변수로 사용된다.
//		믈래스명.변수명
//		BankAccount.totRes
		
		acc01.savingMoney(1000);
		acc01.savingMoney(1000);
		acc01.savingMoney(1000);
		acc02.savingMoney(1000);
		acc02.savingMoney(1000);
		acc03.savingMoney(1000);
		System.out.println("static 메소드"+ BankAccount.savingMoney2(1000));
		System.out.println("static 메소드"+ BankAccount.savingMoney2(1000));

		System.out.println("acc03에서 확인: " + acc03.totRes);
		
		
	}

}
class Number01{
	int no1;
	final int no2;
	static  int no3;
	static final int NO4 = 5;
	// 객체가 공유하는 데이터 중에 변경할 수 없는 데이터를 말함
	// 클래스 상수로 한 번 할당하면, 변경되지 않음
	// 		java에서는 static final을 상수로 사용하고, 대문자로 사용하여 구분한다.(가독성)
	
	
	Number01(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
}

// BankAccount 클래스를 통해 은행의 각 계좌별 정보는 new Account() 객체를 통해서
// 일반 변수나 메서드를 통해서 처리하고, 은행의 모든 계좌가 공유하는 정보(전체 계좌의 총계/계좌의 갯수)
// static 이라는 키워드를 통해서 선언하면 효과적으로 처리할 수 있다.
class BankAccount{
	String name;	// 계좌명
	int rest;		// 계좌별 총 잔액
	static int totRes;	// 모든 계좌의 총 합산
	
	public BankAccount(String name, int rest) {
		this.name = name;
		// 객체마다 가지고있는 변수
		this.rest = rest;
		System.out.println("# 계좌 개설 #");
		System.out.println(" 계좌명: " + name);
		System.out.println(" 잔액: " + rest);
		// 모든 객체가 공유하는 공유메모리 영역 == static
		// 계속 누적해서 저장됨.
		totRes += rest;
		System.out.println("모든 계좌의 총 합산: "+ totRes);
	}
	void savingMoney(int money) {
		this.rest+=money;	// 계좌별로 돈이 누적
		totRes+=money;		// 전체 계좌 총계 누적
		System.out.println("계좌:"+name);
		System.out.println("계좌 잔고:"+rest);
		System.out.println("모든 계좌 잔고:"+totRes);
	}
	// 객체의 생성 없이 static변수를 증가(변경)시키는 메서드가 필요할 때 -> static 메서드 선언
	// 객체 종속적인 변수는 사용할 수 없음.
	// static 메서드, static 변수를 수정하거나 변경할 때 활용하는 메서드.
	// 객체별로 사용하는 변수들을 이 메서드에서 사용하지 못 한다.
	// static 변수, static 메서드 객체의 공유 부분이기 때문에 즉, 객체 종속이 아니기 때문에
	// 일반적으로 객체를 생성하지 않고 바로 클래스명.static변수, 클래스명.static메서드() 로 사용이 가능하다.
	// ex) BankAccount.savingMoney2(30);
//			BankAccount.totRes
	
	/*
	  실무적으로 내장된 클래스를 사용하는 경우
	  	Math.random()
	  	Math.PI
	  	Math.floor()	// 내림
	  	Math.ceil()		// 올림
	  	에서 주로 사용된다.
	 */
	static int savingMoney2(int money) {
//		rest++; 		// 일반 변수는 에러가 발생함.
		totRes+=money;		// 전체 계좌 총계 누적
		System.out.println("은행 잔고:"+totRes);
		return totRes;
	}
	// 메서드에서 호출. static 메서드/일반메서드 호출
	// 1. static 메서드는 static 변수만 사용할 수 있다.
	// 2. static 메서드는 static 메서드만 호출하여 사용할 수 있다.
	// 3. 일반 메서드는 static변수, static 메서드를 호출할 수 있다.
	static void callMethod() {
		savingMoney2(1000);
	}
	void callMethod2() {
		callMethod();
		savingMoney(rest);
	}
	
}