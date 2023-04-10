package javaexp.a07_classObject;

public class A06_ConstrOverloading {

	public static void main(String[] args) {
		
		//  1. 클래스에서 선언된 생성자 중 하나를 선택해서 객체를 생성할 수 있다.
		Person2 p1 = new Person2();
		System.out.println(p1.name + ":" + p1.age); 	// 이름, 나이
		Person2 p2 = new Person2("홍길동");
		System.out.println(p2.name + ":" + p2.age);
		Person2 p3 = new Person2(25);
		System.out.println(p3.name + ":" + p3.age);
		
		Product2 prd1 = new Product2("감자");
		Product2 prd2 = new Product2("감자",2000);
		Product2 prd3 = new Product2(3000,"감자");

	}

}
/**
 # 생성자 오버로딩
 1. 생성자는 기본적으로 default 생성자로부터 여러 생성자를 클래스 내에서 오버로딩 규칙에 의해 여러 개를 선언할 수 있다.
 */
class Person2{
	String name;
	int age;
	Person2() {
		System.out.println("매개변수가 없는 생성자");
	}
	// 오버로딩 규칙 1: 매개변수 갯수가 다르다.
	Person2(String name) {
		this.name = name;
		System.out.println("이름을 초기화하는 생성자: " + name);
	}
	// 오버로딩 규칙 2: 매개변수의 데이터 유형이 다르다.
	Person2(int age) {
		this.age = age;
		System.out.println("나이를 초기화하는 생성자 " + age);
	}
	// 오버로딩 규칙 3: 매개변수의 타입에 따른 순서가 다르다.
	Person2(String name, int age) {
		System.out.println("매개변수 타입 순서 변경1");
		System.out.println("이름: "+ name);
		System.out.println("나이: " + age);
	}
	Person2(int age, String name) {
		System.out.println("매개변수 타입 순서 변경2");
		System.out.println("나이: " + age);
		System.out.println("이름: "+ name);
	}
}

//		ex) 클래스에 물건명, 가격을 필드로 선언하고, 생성자1 : 물건명 할당 / 생성자2: 물건,가격 / 생성자3: 가격, 물건

class Product2{
	String pname;
	int pPrice;
	
	Product2(String pname) {
		this.pname = pname;
		System.out.println("물건명 할당 생성자");
	}
	Product2(String pname, int pPrice) {
		// this(name); 현재 선언된 생성자 중에 매개변수가 문자열로 선언된 것을 호출
		this.pname = pname;
		this.pPrice = pPrice;
		System.out.println("물건명과 가격 할당");
	}
	Product2(int pPrice, String pname) {
		this.pPrice = pPrice;
		this.pname = pname;
		System.out.println("가격과 물건명 할당");
	}
	
}