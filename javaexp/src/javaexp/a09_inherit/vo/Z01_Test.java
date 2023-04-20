package javaexp.a09_inherit.vo;

public class Z01_Test {
	public static void main(String[] args) {
		Son s1 = new Son();
		// 상속에 의해서 상위클래스가 가지고 있는 필드 가져다 쓸 수 있다.
		System.out.println(s1.shape);
		System.out.println(s1.workKind);
		s1.running();
		s1.playBaseBall();
		// Mother charac(현명하다), cooking(요리를잘하다)
		// Daughter 위 내용을 상속받아 추가 속성과 메서드를 처리하고
		// main()에서 호출해보세요
		System.out.println();
		
		Daughter d1 = new Daughter();
		System.out.println(d1.charac);
		System.out.println(d1.workKind);
		d1.cooking();
		d1.readBook();
		System.out.println();
		
		d1.giveMoney();
		d1.giveMoney();

	}
}
