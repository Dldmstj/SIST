package javaexp.a09_inherit.abstrac;

public class A03_DuckWorld {


	public static void main(String[] args) {
		Duck d01 = new NomalDuck();
		d01.swimming();
		d01.fly();
		Duck d02 = new Mallartd();
		d02.swimming();
		d02.fly();
		
		Duck d03 = new RubberDuck();
		d03.fly();
		d03.swimming();
//		d03.usingForKids();
		/*
		  하위에 RubberDuck
		  		추상 클래스 상속받아서 처리하되, swimming() 은 재정의해서 목욕탕에서 놀다.
		  		+ 추가메서드 usingForKids() 아이들을 위해 만들어졌다.
		 */
	}
/*
  	ex) 아래와 같이 추상클래스 Duck을 선언하여 main()에서 호출하세요.
  		Duck (추상)
  			kind 종류(필드)
  			매개변수 1개 생성자
  			swimming() 수영을 하다(공통)
  			getKind() 공통
  			fly() 추상메서드
  		NomalDuck(실제 클래스)	일반 오리 : fly() 날지 못함
  		Mallard(실제 클래스)	청동 오리 : fly() 훨훨 날다!
 */
}
abstract class Duck{
	private String kind;

	public Duck(String kind) {		// 매개변수 1개 생성자
		this.kind = kind;
	}
	
	public abstract void fly();		// 추상메서드 fly()
	
	public void swimming() {		// 공통메서드 swimming()
		System.out.println(kind+"가 수영을 합니다.");
	}
	public String getKind() {		// 공통메서드 getKind()
		return kind;
	}
	/*
	 * public void setKind(String kind) { this.kind = kind; }
	 */
}
class RubberDuck extends Duck{

	public RubberDuck() {
		super("고무오리");
	}

	@Override
	public void fly() {
		System.out.println(getKind() +"는 날 수 없습니다.");
	}
	@Override
	public void swimming() {
		System.out.println(getKind() + "가 목욕탕에서 노는 중");
	}
	public void usingForKids() {
		System.out.println("아이들을 위해 만들어졌습니다!");
	}
}
class NomalDuck extends Duck {

	public NomalDuck() {
		super("집오리");
	}
	@Override
	public void swimming() {
		super.swimming();
	}
	@Override
	public void fly() {
		System.out.println(getKind()+"는 날 수 없습니다.");
	}
	
}
class Mallartd extends Duck {
	
	public Mallartd() {
		super("청둥오리");
	}
	@Override
	public void swimming() {
		super.swimming();
	}
	@Override
	public void fly() {
		System.out.println(getKind()+"가 훨훨 납니다!");
	}
	
}