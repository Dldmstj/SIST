package javaexp.a09_inherit;

public class A01_Basic {

	public static void main(String[] args) {
		/*
  		# 객체에 있어서 super와 this의 사용
  		1. this 클래스 안에서 객체를 지칭할 때, 이 객체가 가지고 있는 구성요소를 호출할 때 주로 사용.
  		 	1) this.필드 : 지역변수와 구분하여 
  		 				class의 전체 전역변수에 사용되는 변수를 호출해서 할당/사용할 때 사용.
  		 				ex) public void setName(String name) {
  		 						this.name = name;
  		 						int age = 25;	// 지역변수(내부에서 사용하는 지역변수는 반드시 초기화)
  		 					}
  		 					매개변수는 일반적으로 지역변수이다. 또한 해당 메서드 안에서 데이터 유형으로 선언하여
  		 					처리되는 변수 또한 지역변수이다. 이 지역변수가 전역변수와 동일하게 선언되었을 때,
  		 					그 구분을 위해 사용하는 것이 this.
  			2) this(), this(25), this("홍길동",25) :  생성자가 overloading으로 여러 개 선언되어 있을 때,
  						다른 생성자를 호출해서 데이터를 할당할 때, 사용된다.
  				- 호출시, 반드시 생성자 선언 첫 라인에서 호출해야 한다.
  	ex) Product 클래스 선언하고, 기본생성자~ 매개변수 3개 생성자를 선언. 필드값 물건명, 가격, 갯수 호출하게 하세요.
  			Product() {
  				System.out.println("매개변수 없음");
  			}
  			Product(String name){
  				this();		// 상위에 선언한 매개변수 없는 생성자 호출
  				System.out.println("매개변수 1개");
  				this();	// (x), 반드시 첫 라인에 호출
  			}
  					
  		2. 상속관계에 있어서 this, super의 활용
  			1) 필드, 생성자, 메서드에서 다 활용된다.
  			2) 현재 클래스와 상위 클래스에 정의된 구성요소를 구분하여 호출할 때 사용된다.
  					this.현재 클래스가 갖고있는 멤버 지칭
  					super.상위 클래스가 갖고있는 멤버 지칭
  					ex)
  					class Father(){
  						String name="홍판서";
  					}
  					class Son extends Father{
  						String name ="홍길동";	// 필드 재정의
  					}
  					
  			3) 상위 선언된 메서드와 동일한 이름/매개변수를 동일하게 선언, 사용이 가능한데, 메서드 overriding일 때:
		  				상위 클래스 메서드 : super.메서드()
		  				하위 클래스 메서드 : this.메서드()
		  				일반적으로 지역변수와 구분해서 호출할 필요가 없을 때에는 this를 생략해도 무방하다.
		  	4) 상속관계 하위에 생성자는 반드시 상위에 생성자 중 하나를 호출하여야 한다.
		  		- 일반적으로는 default 생성자를 호출
		  		- 상위에 default를 사용하지 않을 때, 반드시 추가 선언 필요
		  		
		  		ex)
		  		class Mother{
		  			Mother(String name){}	// 생성자 선언하면 default 생성자 사라짐
		  		}
		  		class Daughter extends Mother{
		  				// public Daughter() { super(){}; }
		  				// default 생성자가 컴파일시 자동으로 생성됨
		  				// 상위 클래스에 생성자가 선언되어 있으면 반드시 호출해야 함.
		  		}
		  # 주의
		  1. import할 때, 동일한 이름의 클래스이지만 다른 패키지의 경우 해당 기능이 동일하더라도 1:1관계나 상속관계에서 에러가 발생하는 경우가 많다.
		  		ex) 보통 다른 패키지의 동일한 이름의 클래스를 잘못 import하여 기능이 처리되지 않는 경우가 많다.
		  			상속관계, 외부 클래스의 기능 메서드 사용관계 등에 주로 발생한다. 구조가 완전히 같더라도 해당 객체에 지정된 패키지와
		  			동일한 클래스가 아니면, 다른 객체를 호출하거나 처리할 때 에러가 발생한다.
		  				compile 에러/ runtime에러 등
	 */
	Person p1 = new Person("홍길동");
}

}
class Product {
//  	ex) Product 클래스 선언하고, 기본생성자~ 매개변수 3개 생성자를 선언. 필드값 물건명, 가격, 갯수 호출하게 하세요.

	String pname;
	int price;
	int cnt;
	
	public Product(){
		System.out.println("객체 호출 " + this);
	}
	
	public Product(String pname) {
		this();
		this.pname = pname;
		System.out.println("매개변수 0개인 생성자 호출, name 할당" + pname);
	}
	
	public Product(String pname, int price) {
		this(pname);
		this.price = price;
		System.out.println("매개변수 1개인 생성자 호출, price 할당" + price);
	}
	
	public Product(String pname, int price, int cnt) {
		this(pname,price);
		this.cnt = cnt;
		System.out.println("매개변수 2개인 생성자 호출, cnt 할당" + cnt);
	}
}


//this()로 정의된 생성자 호출
class Person{
	String name;
	int age;
	String loc;
	
	public Person() {
		System.out.println("객체생성 " + this);
	}
	
	public Person(String name) {
		this();		// 현재 클래스에서 오버로딩 된 메서드 중에 매개변수가 없는 생성자를 호출하겠다!
		this.name = name;
		System.out.println("매개변수 0개");
	}
	
	public Person(String name, int age) {
		this(name);		// 현재 클래스에서 오버로딩 된 메서드 중에 한 개인 생성자를 호출하겠다!
		this.age = age;
		System.out.println("매개변수 1개");
	}
	
	public Person(String name, int age, String loc) {
		this(name,age);		// 현재 클래스에서 오버로딩 된 메서드 중에 두 개인 생성자를 호출하겠다!
		this.loc = loc;
		System.out.println("매개변수 2개");
	}


}

class Team{
	String tname;
	String win;	// 승	
	String tie; // 무승부
	String defeat; // 패
	int odds;	// 승률
	
	public Team() {}
	
	public Team(String tname) {
		this();
		this.tname = tname;
	}

	public Team(String tname, String win) {
		this(tname);
		this.win = win;
	}

	public Team(String tname, String win, String tie) {
		this(tname,win);
		this.tie = tie;
	}

	public Team(String tname, String win, String tie, String defeat) {
		this(tname,win,tie);
		this.defeat = defeat;
	}

	public Team(String tname, String win, String tie, String defeat, int odds) {
		this(tname,win,tie,defeat);
		this.odds = odds;
	}
	
	
}
