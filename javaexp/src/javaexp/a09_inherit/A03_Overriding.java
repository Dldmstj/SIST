package javaexp.a09_inherit;

public class A03_Overriding {
	public static void main(String[] args) {
		/*
		  # 메소드 재정의(overriding)
		  1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수)으로 다시 자식 클래스에서 정의하는 것을 말한다.
		  2. 목적
		   	1) 최종 목적은 상속관계에서 상위 클래스를 기반으로 상속받은 여러 클래스가 다양한 형태로 변화하는 것을 
		   		다형성이라고 할 수 있다.
		   3. 기본 형식
		   		class 상위 { void 기능메서드(); }
		   		class 하위 extends 상위 { void 기능메서드(); }
		   			// 상위와 동일한 메서드 정의
		   			// 주의) 	1. 매개변수의 유형/갯수가 달라지면 오버로딩이 된다. 메서드명과 매개변수 유형/갯수도 동일할 때가 오버라이딩.
		   			  		2. 상위에서 선언한 내용과 하위마다 기능적 차별성이 있어야 한다.
		   			  		3. 하위 객체에서 재정의하는 메서드는 상위 객체와 접근제어자가 같거나 더 넓어져야 한다.
		   						ex) 상위 default -> 하위 default/protected/public
		   			 
		 */
		HyunDae com1 = new HyunDae();
		com1.earnMoney();
		Samsung com2 = new Samsung();
		com2.earnMoney();
		Cj com3 = new Cj();
		com3.earnMoney();
		
		System.out.println();
		
//		Police p1 = new Police();	
		
	}
}

/*
 	상위 Worker	:	kind 직업종류
 					working() 일하는 내용
 	하위 Police		상위 생성자 호출 및 메서드 재정의
 		Programmer	
 */


class Worker{
	String kind;
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(kind + "가 일을 한다.");
	}
}
class Police extends Worker{

	public Police(String kind) {
		super("경찰");
	}
	public void working() {
		System.out.println("");
		super.working();
	}
	// 상위 working과 구분하기 위해, super.오버라이딩 메서드() 선언
	public void call() {
		this.working();
		working();
		super.working();
	}
}

class Programmer extends Worker{

	public Programmer(String kind) {
		super("프로그래머");
	}
	public void working() {
		System.out.println("");
		super.working();
	}
}


class Company {
	private String name;
	public Company(String name) {
		this.name = name;
	}
	public void earnMoney() {
		System.out.println(name + " 회사가 돈을 벌다.");
	}
}

// 상위 메서드를 사용하는데, 다르게 사용하려고
class HyunDae extends Company {
	public HyunDae() {
		super("현대중공업");
	}
	public void earnMoney() {
		System.out.print("배를 만들어서 ");
		super.earnMoney();
	}
}
class Samsung extends Company {
	public Samsung() {
		super("삼성전자");
	}
	public void earnMoney() {
		System.out.print("전자제품을 만들어서 ");
		super.earnMoney();
	}
}

class Cj extends Company {
	public Cj() {
		super("cj");
	}
	public void earnMoney() {
		System.out.print("만두를 만들어서 ");
		super.earnMoney();
	}
}

/*
  		Company
  				earnMoney()
  				
  HyunDae	Samsung		DaumKakao
  earnMoney	earnMoney	earnMoney
  상위 공통된 Company를 통해서 상속받은 하위 객체들이 다양한 객체로 같은 메서드이지만, 다른 기능을 처리한다.
  이것을 다양한 객체들로 만들어진다고 하여, 다형성(polymorphism)이라는 개념으로 사용하는 것이다.
  
  Company com1 = new HyunDae();
  Company com2 = new Samsung();
  Company com3 = new DaumKakao();
  
  Company[] arry = {new HyunDae(), new Samsung(), new DaumKaKao()};
  arry[0].earnMoney;
  arry[1].earnMoney;
  arry[2].earnMoney;
 */
