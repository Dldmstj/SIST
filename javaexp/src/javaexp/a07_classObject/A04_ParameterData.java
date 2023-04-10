package javaexp.a07_classObject;

public class A04_ParameterData {
	// 생성자, 메서드
	// static : 객체 생성 없이 사용 키워드
	// void: 리턴값 없이 사용 메서드
	static void call(int num1) {
		System.out.println("매개변수로 온 숫자: " + num1);	// 매개변수 1개
		
	}
	static void call(String str) {
		System.out.println("매개변수로 온 숫자: " + str);	// 매개변수 1개, 다른 데이터타입
		
	}
	static void call(int num1, int num2) {		// overloading, 매개변수 2개
		System.out.println("매개변수로 온 숫자: " + num1);
		System.out.println("매개변수로 온 숫자2: " + num2);
		
	}
	static void call(String str, int num) {		// overloading, 매개변수 2개, 데이터타입 다름
		System.out.println("매개변수로 온 숫자: " + str);
		System.out.println("매개변수로 온 숫자2: " + num);
		
	}
	static void call(int num, String str) {		// overloading, 매개변수 2개, 순서 다름
		System.out.println("매개변수로 온 숫자: " + num);
		System.out.println("매개변수로 온 숫자2: " + str);
		
	}
	static void call(int num1, int num2, int num3) {		// overloading, 매개변수 3개
		System.out.println("매개변수로 온 숫자: " + num1);
		System.out.println("매개변수로 온 숫자2: " + num2);
		System.out.println("매개변수로 온 숫자3: " + num3);
		
	}
	
	static void call02(double num2) {
		System.out.println("매개변수로 온 숫자2: " + num2);
	}
	static void call03(String name, int age) {
		System.out.println(" # 두 개의 매개변수로 온 함수 # ");
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
//		call("사과"); X
//		int num1 = "사과";
		/*
		 # 매개변수 처리
		 1. 매개변수 생성자와 메소드에서 사용되는 데이터 전달 기능을 수행하는 변수이다
//		 2. 매개변수의 유형에 따라 데이터를 전달할 수 있다.
// 			 매개변수는 순서, 타입, 유형에 맞게 전달
		 3. 매개변수는 순서, 타입, 개수에 맞게 전달해야 함
		 
		 # 생성자, 메서드의 overloading  (!주의! overriding과 구분)
		 	0. 궁극적인 원인
		 		호출하는 곳에서 다르게 호출이 가능하느냐 여부에 따른 것.
		 		어느 함수를 호출하는지 구분할 수 있느냐의 여부
		 	1. 동일한 이름으로 정의 가능한 경우를 말함.
		 		1) 매개변수의 갯수가 다르면 선언이 가능하다.
		 		2) 매개변수의 갯수가 같아도 데이터타입이 다르면 선언이 가능하다.
		 		3) 매개변수의 갯수와 데이터타입이 같아도, 순서가 다르면 선언이 가능하다.
		 
		 
		 */
		
		call(10);		// 매개변수가 1개인 call함수
		call("hello");
		call(10,20);		// 매개변수가 2개인 call함수
		call(10,20,30);		// 매개변수가 3개인 call함수
	}

}
