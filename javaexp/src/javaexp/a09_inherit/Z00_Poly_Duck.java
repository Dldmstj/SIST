package javaexp.a09_inherit;

public class Z00_Poly_Duck {

	public static void main(String[] args) {
		Duck d1 = new NomalDuck();
		d1.flying();
		Duck d2 = new Mallard();
		d2.flying();
	}
}
/*
ex) Duck 상위
		종류
		flying() 재정의
	NormalDuck
		집오리
		flying() 날지 못함
	Mallard
		청둥오리
		flying() 날아댕김
		
*/
class Duck{
	String kind;
	public Duck(String kind) {
		this.kind = kind;
	}
	public void flying() {
		System.out.println(kind+"가 비행을 시도합니다.");
	}
}

class NomalDuck extends Duck{
	public NomalDuck() {
		super("집오리");
	}
	@Override
	public void flying() {
		super.flying();
		System.out.println(kind+ "는 날 수 없습니다.");
	}
}

class Mallard extends Duck{
	public Mallard() {
		super("청둥오리");
	}
	@Override
	public void flying() {
		super.flying();
		System.out.println(kind+"가 날아다닙니다.");
	}
}