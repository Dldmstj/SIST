package javaexp.a11_api;

public class A07_Math {

	public static void main(String[] args) {
		/*
		  # Math 클래스
		  1. 주로 데이터의 기능적인 처리를 할 때 활용된다.
		  	올림, 내림, 반올림, 임의의 수, 그 외 수학적인 데이터 처리를 위해 지원되는 static 클래스 이다.
		  	객체생성 없이 사용하는 클래스.
		 */
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.abs(-5): " + Math.abs(-5));
		System.out.println("Math.abs(5): " + Math.abs(5));
		System.out.println("(올림)Math.ceil(5.2): " + Math.ceil(5.2));		// 올림
		System.out.println("(내림)Math.floor(5.2): " + Math.floor(5.2));		// 내림
		System.out.println("(반올림)Math.round(4.5): " + Math.round(4.5));	// 반올림
		System.out.println("Math.max(4,9): " + Math.max(4,9));
		System.out.println("Math.min(5,3): " + Math.min(5,3));
		
//		ex)
		int num1 = (int)(Math.random()*9+1);
		int num2 = (int)(Math.random()*9+1);
		
		System.out.println("임의의 수1: " + num1);
		System.out.println("임의의 수2: " + num2);
		System.out.println("최대값: " + Math.max(num1, num2));
		System.out.println("최소값: " + Math.min(num1, num2));
	}

}
