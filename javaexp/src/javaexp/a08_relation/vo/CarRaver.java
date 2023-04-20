package javaexp.a08_relation.vo;

public class CarRaver {
	// 속성: 이름, car객체
	// 메소드: buyCar()
//			 drivingCar()
//			Car 객체가 있으면 @@가 차를 운행합니다.
//				" 없으면 	차가 없네용..... ㅎㅎ
	
	private String name;
	private Car car;
	
	public CarRaver(String name) {
		this.name = name;
	}

	public CarRaver(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	public void buyCar(Car car) {
		this.car = car;
		System.out.println(car.getKind()+"자동차를 구매했습니다.");
	}
	
	public void drivingCar() {
		if(car == null) {
			System.out.println(name+"(은)는 운전할 차가 없네용 ㅎㅎ....");
		}else {
			System.out.println(name + "(이)가 차를 운전합니다.");
			car.driving();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
