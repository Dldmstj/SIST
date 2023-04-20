package javaexp.a07_classObject;

public class A11_ConMethod {

	public static void main(String[] args) {
		/*
		 # 생성자와 메서드를 활용한 객체 구현
		 1. 생성자는 주로 객체를 생성할 때, 초기 데이터를 설정할 때 사용되며
		 2. 메서드는 계속 기능적인 처리를 하여 외부에 변경되는 데이터를 입력받거나 해당 데이터를 로직에 의해
		  	리턴할 때 주로 활용된다.
		 */
		
		Car c1 = new Car("그랜저");
		
		Calculator02 cal = new Calculator02(6,3);
		int re = 0;
		
		re = cal.plus(); System.out.println(re);
		re = cal.minus(); System.out.println(re);
		re = cal.multi(); System.out.println(re);
		re = cal.divide(); System.out.println(re);
	}

}

//		ex) Carculator02 생성자를 통해 변수를 2개 받아서 기능메서드 plus(), minus(), divide()
//			출력 @@ + @@
//			리턴값으로 연산결과를 처리하세요. 결과는 외부에서 출력.
class Calculator02{
	int num01;
	int num02;
	
	public Calculator02(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}


	int plus() {
		System.out.print(num01 + " + " + num02 + " = ");
		return num01+num02;
	}
	int minus() {
		System.out.print(num01 + " - " + num02 + " = ");
		return num01-num02;
	}
	int multi() {
		System.out.print(num01 + " x " + num02 + " = ");
		return num01*num02;
	}
	int divide() {
		int sum = num02 == 0?0:num01/num02;
		System.out.print(num01 + " ÷ " + num02 + " = ");
		return sum;
	}

	
}




class Car {
	int speed;
	int fuel;	// 연료
	String kind;
	
	public Car(String kind) {
		this.kind = kind;
	}
	void addFuel(int cc) {
		// 기름을 주입한다.
		fuel += cc;
		System.out.println("기름을 주입한다: " + cc);
	}
	int getFuel() {
		// 현재 기름량 확인.
		return fuel;
	}
	int stepPadal() {
		System.out.println("엑셀을 밟다!!!!");
		fuel+=10;
		return speed;	
	}
	
	void driving() {
		
		fuel-=10;
		System.out.println("운행 시작하여 휘발유 10 차감. 현재 휘발유는:" + fuel+"cc 남았습니다.");
		if(fuel>0 && speed>0) {
			System.out.println(kind + "자동차가 운행을 한다.");
		}else {
			if(fuel<=0) {
			System.out.println("휘발유가 없습니다.");
		}
			if(speed<=0) {
				System.out.println("자동차가 멈췄습니당");
			}
		}
	}
}