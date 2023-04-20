package javaexp.a08_relation.a03_pck;

import javaexp.a08_relation.a04_pck.Mouse;

public class Computer {

	Mouse m01;
	Mouse m02;
	
void call() {
	
	// Mouse 클래스 객체 생성
			m01 = new Mouse(100);
//			m02 = new Mouse("hello");	
				// Mouse 클래스에서 String을 매개변수로 받는 생성자는 default로 선언했기 때문에 타 패키지에서 호출할 수 없다.
}
	
//	KeyBoard kb1 = new KeyBoard();

//	ex) Mouse에 생성자를 2개(생성자 오버로딩규칙) public/default 으로 선언, call()에서 객체 생성 여부를 확인
}
