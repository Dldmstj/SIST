package javaexp.a07_classObject;

public class A01_BeginObj {
	public static void main(String[] args) {
		/*
		 # 객체 지향 프로그래밍
		 1. OOP : Object Oriented Programming
		 	- 부품 객체를 먼저 만들고 이것을 하나씩 조립해 완성된 프로그램을 만드는 기법
		 2. 객체란?
		 	1) 물리적으로 존재하는 것 - 자동차, 책, 사람
		 	2) 추상적인 것(회사,날짜) 중에서 자신의 속성과 동작을 가지는 모든 것
		 	3) 객체는 필드(속성)과 메소드(동작)으로 구성된 자바 객체로 모델링 가능한 것.
		 		- 현실세계
		 			사람
		 				- [속성] : 이름, 나이
		 				- [동작] : 웃다, 먹다, 말하다
		 			자바 세계
		 				- [필드] : 이름, 나이
		 				- [메서드] : 웃다, 먹다, 말하다
		 3. 객체의 상호 작용
		 	- 객체들은 서로 간의 기능(동작)을 이용해서 데이터를 주고 받고 기능을 처리한다.
		 		사람 객체 <-> 전자 계산기 객체
		 		물건 객체 <-> 쇼핑몰 객체
		 		
		 # 객체와 클래스
		 1. 현실세계 비유
		 	현실세계 : 설계도 -> 구체적인 사물/객체
		 	자바: 클래스 -> 객체
		 		ex) class Tower{} ==> Tower t1 = new Tower();
		 2. 클래스에서 객체를 생성하기 위한 필드와 메소드가 정의
		 3. 클래스부터 만들어진 객체를 해당 클래스 인스턴스(instance)
		 	instance: 참조 - heap영역의 주소를 참조해서 변수를 만들기 때문에 사용된다.
		 		ex) 하나의 클래스를 기준으로 여러 개의 객체가 생성
		 		Person p1 = new Person();
		 		Person p2 = new Person();
		 		Person p3 = new Person();
		 		p01, p02, p03 등 다른 주소로 객체가 생성된다.
		 		
		 4. 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있다.
		 	하나의 롯데타워 도면으로부터 서울, 부산, 제주에 실제 건물을 건축할 수 있다.
		 	아래 Book 클래스를 통해 b1, b2, b3의 여러 객체를 생성하여 이름을 할당
		 	
		 */
		// class를 통해서 만들어진 객체
		// class명 참조변수 = new class명();
		LotteTower seoul = new LotteTower();
		LotteTower busan = new LotteTower();
		LotteTower jeju = new LotteTower();
		// javaexp.a07_classObject.LotteTower@7c30a502
		// 패키지명.클래스명@16진수로heap영역의 주소값
		System.out.println(seoul);
		System.out.println(busan);
		System.out.println(jeju);
		
//		ex) Book class를 선언하고 b01, b02, b03 객체를 생성, 주소값을 확인하세요.
		Book b01 = new Book();
		Book b02 = new Book();
		Book b03 = new Book();
		
		System.out.println(b01);	// javaexp.a07_classObject.Book@3ac3fd8b
		System.out.println(b02);	// javaexp.a07_classObject.Book@5594a1b5
		System.out.println(b03);	// javaexp.a07_classObject.Book@6a5fc7f7
	}
}
// class 내에 class를 선언할 수는 있지만, public class는 1개, public class가 파일명.java로 사용되고,
// main()도 사용가능하다.
class LotteTower{}
class Book{}