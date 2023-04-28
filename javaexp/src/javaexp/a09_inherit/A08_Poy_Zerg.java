
package javaexp.a09_inherit;

public class A08_Poy_Zerg {

	public static void main(String[] args) {
		// 라바가 첫번째 유닉인 드론으로 변형
		Larba lar1 = new Dron();
		lar1.attack();	// 재정의한 내용이 다양하게 처리(다형성)
		
		Larba lar2 = new Zerggling();
		lar2.attack();
		
		Larba lar3 = new Hydralisk();
		lar3.attack();

	}

}
/*
 외계
  	인간 (Terran)
  	프로토스 (Protoss)
  	저그 (Zerg) - 파충류(변태과정을 거쳐서 성충)하고 비슷
  		Larba(애벌레)
  		
  	Dron Zerggling Hydralisk...
  	
  	이 다형성을 처리해주는 것을 포함하는 클래스를 정의
  	class ZergUser
  		String tcolor;
  		Larba larba;
  		ZergUser(String tcolor){
  			this.tcolor = tcolor+"저그 사용자";
  		}
  		void makeUnit(Larba larba){
  			this.larba = larba;
  			System.out.println(larba.getUnit()+"유닉을 생성하다.");
  		}
  		void attack(){
  			System.out.println(larba+"공격합니다.");
  			if(larba == null){
  				System.out.println("아직 유닉이 만들어지지 않았습니다.");
  			}else{
  				// 다형성에 의해 할당된 객체의 재정의한 메서드로 처리됨.
  				larba.attack();
  				System.out.println();
  			}
  		}
  		
 */
class ZergUser {
	String tcolor;
	Larba larba;
	
	public ZergUser(String tcolor){
		this.tcolor = tcolor+"저그 사용자";
	}
	void makeUnit(Larba larba){
		this.larba = larba;
		System.out.println(larba.getUnit()+"유닉을 생성하다.");
	}
	void attack() {
		System.out.println(larba+"공격합니다.");
		if(larba == null){
			System.out.println("아직 유닉이 만들어지지 않았습니다.");
		}else{
			// 다형성에 의해 할당된 객체의 재정의한 메서드로 처리됨.
			larba.attack();
			System.out.println();
		}
	}
}

 class Larba{
	 private String unit;

	public Larba(String unit) {
		this.unit = unit;
	}
	public void attack() {
		System.out.println(unit+ " 공격 시도");
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
 }
 
 class Dron extends Larba{

	public Dron() {
		super("드론");
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("공격력 5, 자원 채집만 합니다.");
	}
 }
 
class Zerggling extends Larba{
	public Zerggling() {
		super("저글링");
	}
		
	@Override
	public void attack() {
		super.attack();
		System.out.println("근거리공격, 공격력 5, 빠르게 이동합니다.");
	}
}

class Hydralisk extends Larba{
	public Hydralisk() {
		super("히드라");
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("원거리공격, 공격력 15, 자원 채집만 합니다.");
	}
}