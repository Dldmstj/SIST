package javaexp.a08_relation.a01_pck;

import javaexp.a08_relation.a02_pck.Product;

public class Person {
	// 외부 패키지에 있는 public class인 경우 호출
	Product p01;
//	Man m01; 	// 외부 패키지의 public이 아닌 클래스는 호출할 수 없음.
	
	void call() {
		// static이고 public이어서 객체 생성 없이 바로 호출이 가능함
		System.out.println(Product.pCode);
//		System.out.println(Product.no); // static이지만 no public이 아니라 접근할 수 없음.
		
		// Product 클래스 객체 생성
		p01 = new Product();		// default 생성자
				// public이기 때문에 다른 패키지의 클래스에서도 생성 가능!
		
//		p01 = new Product("사과");	// 생성자가 public이 아니어서(default여서) 호출 안됨
		p01 = new Product(2500);	// 생성자가 public이어서 호출 됨
		p01 = new Product("사과",100);
		System.out.println(p01.name);	// name 접근 가능(public)
//		System.out.println(p01.age);	// 접근 불가 (default)
	}
}
//		a08_relation 패키지 하위에  a03_pck, a04_pck 생성. 각각의 하위에 Computer클래스 / public Mouse-KeyBoard(접근제어x) 생성