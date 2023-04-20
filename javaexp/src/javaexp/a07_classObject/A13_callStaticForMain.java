package javaexp.a07_classObject;

public class A13_callStaticForMain {

	int num01;
	static int num02;
	void call() {
		System.out.println("일반 메서드!");
	}
	static void call2() {
		System.out.println("static 메서드!");
	}
	
	public static void main(String[] args) {
		A13_callStaticForMain m = new A13_callStaticForMain();
		m.num01 = 25;
		m.call();

		A13_callStaticForMain.num02 = 30;		// main()를 포함하는 클래스이기에 바로 할당이 가능.
		call2();		// static 메서드이고 현재 클래스 안에 있기 때문에 바로 호출 가능함.
		
		num02 = 40;
	}

}
