package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A01_StacraftWorld {

	public static void main(String[] args) {
		// 추상 클래스는 혼자 객체를 생성하지 못한다.
		// 추상 클래스의 목적이 하위 클래스의 공통기능 선언과 다형성(메서드 재정의를 통해) 이기 때문에
		// 추상 클래스는 다형성을 처리할 메서드를 강제성 있게 처리할 목적이므로,
		// 실제 클래스가 필요없도록 한다.
//		Larba lb = new Larba("Dron","빨강");  에러발생
		Larba lb100 = new Dron("파랑");	// 추상 = 하위실제();
		lb100.move();		// 사용할 공통 내용
		lb100.getUnit(); 	// 상속해서 사용할 공통 내용
		lb100.attack(); 	// 상속해서 사용할 다형성 처리 내용, 재정의가 강제하고 있다.
		
		/*
		  # 추상클래스의 목적
		  	1) 기능적인 통일성을 가진 상위 클래스를 상속받게 하기 위해
		  		- 기능적 통일성
		  			공통 필드/메서드 : 그대로 재활용
		  		- 이름은 같지만 다양한 기능을 처리하는 메서드를 강제화 ★
		  # 추상클래스를 통한 실제클래스 만들기
		  	abstract class Larba{
		  		공통필드: 유닉 종류, 색상
		  		공통생성자: 매개변수1개 - 하위에서 반드시 호출
		  		공통메서드: 유닛의 이동
		  		abstract 재정의메서드: 공격방법
		  	}
		  	class Dron extends Larba{
		  		Dron(String color){
		  			super("드론",color);
		  		}
		  		// 위에 있는 abstract를 재정의하지 않으면 컴파일 에러
		  	}
		  # 추상클래스를 통한 다형성 처리히기
		 */
		ArrayList<Larba> myUnits = new ArrayList<Larba>();
		myUnits.add(new Dron("빨간"));
		myUnits.add(new Zerggling("파란"));
		myUnits.add(new Zerggling("노란"));
		myUnits.add(new Hydralisk("하얀"));
		System.out.println("사용할 유닉들");
		for(Larba lb: myUnits) {
			lb.move();
			lb.attack();
		}
	}

}
abstract class Larba{		
		// 추상메서드가 하나라도 있으면 추상클래스가 됨. 객체 생성할 수 없다!! 다형성에 의해 상속받은 하위객체가 할당할 때만 생성 (Larba lar1 = new Dron();)
	private String kind;
	private String color;
	
	public Larba(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	public String getUnit() {
		return color +"색 " + kind;
	}
	// 공통메서드
	public void move() {	// 필요에 의해 재정의 가능
		System.out.println(color + "색 " +kind + "가 이동합니다.");
	}
	public abstract void attack();	// 추상클래스의 추상메서드. 상속받을 하위클래스에서 "반드시" 재정의해야함
}

class Dron extends Larba{

	public Dron(String color) {
		super("Dron", color);
	}
	@Override
	public void attack() {	// 추상클래스인 Larba클래스를 상속받을 때 반드시 재정의해야하는 메서드
		System.out.println(getUnit() + "채집 유닉이라 공격할 수 없습니다.");
		System.out.println(getUnit() + "이 공격력 5로 공격합니다.");
	}
}
class Zerggling extends Larba{
	
	public Zerggling(String color) {
		super("Zerggling", color);
	}
	@Override
	public void attack() {
		System.out.println("초기 공격유닉. " + getUnit() + "이 공격력 5로 빠르게 공격합니다.");
	}
}
class Hydralisk extends Larba{

	public Hydralisk(String color) {
		super("Hydralisk", color);
	}

	@Override
	public void attack() {
		System.out.println(getUnit()+"은 중대형 공격유닉으로, 공격력 15로 원거리 공격.");
	}

	@Override
	public void move() {		// 필요에 의한 재정의
		super.move();
		System.out.println("속도 업그레이드시 빠르게 이동합니다.");
	}
	
}