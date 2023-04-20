package javaexp.a08_relation.access;

import javaexp.a08_relation.access.story1.friendship.WoodCutter;

public class Hunter {
	void callWoodCutterInfo() {
		WoodCutter wc = new WoodCutter();	
		// default 생성자 (public)에 의해, 다른 패키지에서도 접근할 수 있다.
		
//		System.out.println("default 접근제어자: " + wc.hiddenDeer);
		// hiddenDeer 의 접근제어자는 default로 설정해두었기 때문에 다른 패키지에서 접근할 수 없다.
	}
}
/*
 access 패키지 내에 ourhome 패키지를 생성하고, Father, Mother, Brother class 생성
 Mine : default 접근제어자로 우리 가족여행계획을 변수로 설정 할당.
 unclehome 패키지 생성하고, Uncle class. Mine 클래스에 대한 우리가족여행계획 메소드가 가능한지 범위 확인. 
 */
 