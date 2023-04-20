package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRaver;
import javaexp.a08_relation.vo.HPUser;
import javaexp.a08_relation.vo.HandPhone;

public class A03_ObjVsObj {

	public static void main(String[] args) {
		HandPhone hp = new HandPhone("삼성",1200000);
		
		HPUser user01 = new HPUser("홍길동");
		user01.callByPhone();
		
		user01.buyPhone(hp);
		user01.buyPhone(new HandPhone("애플",1500000));
		
		
		user01.callByPhone();
		System.out.println();
		
		Car c1 = new Car("소나타",100);
		CarRaver r1 = new CarRaver("짱구");
		r1.drivingCar();
		r1.buyCar(c1);
		r1.drivingCar();
		System.out.println();
		
		CarRaver r2 = new CarRaver("훈이");
		r2.drivingCar();
	}

}
