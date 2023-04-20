package javaexp.a09_inherit.vo;
// Mother charac(현명하다), cooking(요리를잘하다)
// Daughter 위 내용을 상속받아 추가 속성과 메서드를 처리하고
// main()에서 호출해보세요
public class Mother {
	String charac = "현명하다";
	
	private int money = 100000;
	
	void cooking() { System.out.println("요리잘하다");}
	
	void addMoney(int money) {
		this.money += money;
	}
	int getMoney() {
		return money;
	}
	
	// ex) Mother 클래스에 private로 변수선언
	// 		간접적으로 할당 및 호출하는 메서드를 정의해서 daughter클래스에서 호출+변경되게 하세요
}
