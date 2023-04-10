package javaexp.a07_classObject;

public class A03_Constructor {

	public static void main(String[] args) {
		/*
		  # 생성자
		  1. 객체를 생성할 때, 클래스명과 동일한 함수를 생성자라고 한다.
		  2. 주요기능
		  	1) 객체를 생성할 때 사용된다.
		  		new 생성자();
		  	2) 필드를 초기화할 때 사용된다.
		  		class에서 선언된 필드값에 데이터를 할당하여 초기값을 설정할 필요가 있을 때 사용
		  		new Baby("귀염아기");, new Person("홍길동", 25, 3);
		  		new Product("사과", 3000,2);
		  		
		  3. 형태
		  	1) 기본 생성자
		  		클래스를 선언할 때, 생성자를 선언하지 않으면 내부적으로 클래스명() {}을 가지고 있기에,
		  		해당 생성자를 호출하여 사용한다. 즉, 컴파일러가 컴파일하면서 기본 생성자를 자동으로 추가한다.
		  		new 클래스명()
		  	2) 기본 생성자의 삭제
		  		기본 생성자는 사용자 정의 생성자를 선언하는 순간, 사라진다.
		  		즉, 컴파일 시, 자동으로 추가하지 않는다.
		  	3) 추가 선언하는 생성자
		  		- 생성자는 기본 생성자와 같이 매개변수가 없는 생성자를 선언하고, 추가 코드를 처리할 수 있다.
		  		- 매개변수를 통해 필드값을 초기화하는 생성자를 선언할 수 있다.
		  			클래스명(String name, int age, String loc) {
		  			// this.name : 필드로 선언할 name
		  			// name : 매개변수에 의해 전달되는 데이터 name
		  			this.name = name;
		  			this.age = age;
		  			this loc = loc;
		 */	
		// 클래스명을 기준으로 객체를 사용할 준비;
		Person p01;
		p01 = new Person();
		Product prod01 = new Product();
//		System.out.println(prod01);
		
//		ex1) Computer 클래스 선언하고 default 생성자 호출
		Computer com = new Computer();
		
//		ex2) Mouse 클래스 선언하고 매개변수가 없는 생성자 선언
//			마우스 객체 생성이라고 출력, 호출
		Mouse mouse = new Mouse();
		System.out.println(mouse.company);
		System.out.println(mouse.price);
		
	}

}
class Mouse{
	// 객체 속에 있는 field는 모두가 default 초기화가 된 상황. 따로 default데이터로 초기화할 필요가 없다.
	// 추가된 데이터로 할당만 하면 됨.
	String company;	// 초기화를 하지 않았지만 0값이 출력됨.
	int price;		// 초기화를 하지 않았지만 0값이 출력됨.
	Mouse() {
		company = "회사입력 안됨";
		price = -1;
//		this.company = company;
		System.out.println("마우스객체생성");}
}
class Computer {	/* 선언된 게 없으면 컴파일러가 자동으로 Computer(){} Computer 생성자를 추가 */ }
class Person{
	// 생성자가 아무것도 선언되지 않았을 때
	// 컴파일시 자동으로 추가해서 생성
	
}
class Product{
	// 매개변수가 없는 생성자를 선언
	Product() {
		System.out.println("물건객체 생성자 호출");
	}
}
