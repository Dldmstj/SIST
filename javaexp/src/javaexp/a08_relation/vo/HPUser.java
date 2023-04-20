package javaexp.a08_relation.vo;

public class HPUser {
	private String name;
	private HandPhone hp;

	public HPUser(String name) {
		this.name = name;
	}
	
	// 필드에 선언되어 있는 HandPhone 메모리에 실제 객체가 할당되도록 처리하는 메서드
	// us01.buyPhone( new HandPhone() );
	public void buyPhone(HandPhone hp) {		// 핸드폰 구매
		this.hp = hp;
		System.out.println(hp.getProCompany()+"사 핸드폰을");
		System.out.println(hp.getPrice()+"원으로 구매하다.");
	}
	public void callByPhone() {		// 핸드폰 사용
		System.out.println(name + "가 핸드폰을 사용하려고 합니다." );
		if(hp==null) {
			System.out.println("구매하지 않아서 사용 불가능합니다.");
		}else {	// hp메모리가 있을 때.... hp!=null
			hp.usingPhone();
		}
	}
	
	public void checkMyPhone() {	// 핸드폰 정보 확인
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HandPhone getHp() {
		return hp;
	}
	public void setHp(HandPhone hp) {
		this.hp = hp;
	}
	
	
}
