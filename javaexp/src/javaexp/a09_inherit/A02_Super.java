package javaexp.a09_inherit;

public class A02_Super {
	public static void main(String[] args) {
		/*
		  
		 */
		Daughter d1 = new Daughter();
//		System.out.println(d1.charac);
//		System.out.println(d1.name);
		d1.call();
		System.out.println();
		
		Son s1 = new Son("ㅎㄱㄷ");
		s1.call();
	}
}

// ex) Father, Son 선언하고, 
//		1. 변수 동일선언		2. 생성자 상위에 매개변수 1개 선언 후, 하위에서 호출
//		3. 메서드 동일하게 선언하여, 상위에 구분처리.

class Father{
	String name;
	int age;
	
//	Father() {}
	Father(String name) {System.out.println("아버지 생성자 호출");}
	
	void call() {System.out.println("Father call() 호출");}
}

class Son extends Father{
	String name;
	int age;
	
//	Son() {}
	Son(String name) {super(name); System.out.println("아들 생성자 호출");}
	
	void call() {super.call(); System.out.println("Son Call() 호출");}
}


class Mother {
	String charac = "온화함";
	String name ="어머니";
	
	Mother(String name) { System.out.println("어머니 생성자"); }
	
	void call() {}
	
}

// 현재 클래스와 상위 클래스에 정의된 구성요소를 구분하여 호출할 때 사용된다.
class Daughter extends Mother {
	String name = "딸";
	
	Daughter() { super("상위"); System.out.println("딸 생성자"); }
		// super();   default로 컴파일시 상위 클래스가 호출된다.
		// 반드시 상위에 선언되 생성자를 호출해야 한다.
	Daughter(String name) {this();}
		// 위에 있는 Daughter 생성자를 호출
	
	// 메소드 오버라이딩 (다형성): 상위클래스에 있는 메서드에 편승. 똑같은 내용(매개변수)을 정의함.
	void call() {
		// 상위에 있는 메서드를 현재 메서드와 구분해서 호출할 때 super.
		super.call();
		System.out.println(name);
		System.out.println(charac);
		System.out.println("super: " + super.name);		// 상위 클래스를 가리킴
		System.out.println("super: " + super.charac);
	}
	
}