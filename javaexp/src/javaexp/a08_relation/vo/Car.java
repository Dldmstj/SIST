package javaexp.a08_relation.vo;

public class Car {
	// 속성 : 자동차 종류, 배기량
	// 메소드 : driving()	 	@@자동차가 운행을 시작합니다.
//			 
	private String kind;		// 차 종류
	private int displacement;	// 배기량
	
	public Car(String kind, int displacement) {
		this.kind = kind;
		this.displacement = displacement;
	}
	
	public void driving() {
		System.out.println(kind+"자동차가 운행을 시작합니다.");
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	
}
