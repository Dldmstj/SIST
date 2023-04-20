package javaexp.a09_inherit.vo;

public class Daughter extends Mother {
	String workKind = "요리사";
	void readBook(){System.out.println("책을 읽다.");}
	
	void callTalent() {
		cooking();	// 상속받은 메서드라 바로 호출할 수 있다.
	}
	
	void giveMoney() {
		addMoney(10000);
		System.out.println(getMoney());
	}
}
