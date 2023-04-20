package javaexp.a08_relation.access.ourhome;
/*
access 패키지 내에 ourhome 패키지를 생성하고, Father, Mother, Brother class 생성
Mine : default 접근제어자로 우리 가족여행계획을 변수로 설정 할당.
unclehome 패키지 생성하고, Uncle class. Mine 클래스에 대한 우리가족여행계획 메소드가 가능한지 범위 확인. 
*/
public class Mine {
	// private로 Mine의 개인 비밀을 할당하고, 같은패키지/다른패키지 접근여부를 확인
	
	String plan ="우리가족 여행계획";
	private String mySecret = "비밀~";
	
	void callMySecret() {
		Mine me = new Mine();
		System.out.println("private접근: " + me.mySecret);
	}
}
