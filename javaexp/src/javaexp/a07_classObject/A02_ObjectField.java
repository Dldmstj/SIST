package javaexp.a07_classObject;

public class A02_ObjectField {

	public static void main(String[] args) {
		/*
		 # 클래스(객체)의 구성요소
		 1. 필드: 객체의 데이터가 저장되는 곳\
		 	ex) 사람의 두뇌의 저장내용 처리
		 2. 생성자: 기본적인 필드값을 초기화할 때 객체가 생성되면서 데이터를 입력받아서 처리한다.
		 			주로, 객체를 사용할 때, 생성될 때, 초기화할 데이터.
		 		ex) new Baby("겸둥이1",0,....)
		 			new Car("그랜저",3500);
		 3. 메소드: 데이터 입력, 리턴하는 데이터를 처리하는 함수
		 			참조변수와 함께 데이터를 변경처리할 때 주로 사용됨.
		 			ex) c1.speedUp(10);		// 속도를 10단위 올린다
		 				c2.takePerson(2); 	// 승객 2명 탑승 처리
		 				int speed = c3.getCarSpeed;		// 현재 속도를 확인하는 메서드 (return값 有)
		 				
		 				int dist = c1.calDist(150,2);	// 시속 150km, 시간입력
		 				// 시속 150km를 입력받고, 시간을 입력받았을 때, 갈 수 있는 거리를 연산해서 return(입력값, 로직처리-연산, 리턴값)
		 				String canGo = c1.checkFuel(150);
		 				// 가야할 거리를 입력, 필드에 저장되어 있는 연료와 함께 거리당 연료 소모량을 계산하여
		 				// 갈 수 있는지 여부를 계산하여 문자열로 리턴
		 
		 */
		Bus b1= new Bus();
		// 참조변수.필드 = 데이터;
		b1.nums = "8001";
		b1.target = "서울-인천";
		Bus b2= new Bus();
		b2.nums = "9001";
		b2.target = "대구-대전";
		Bus b3= new Bus();
		b3.nums = "7001";
		b3.target = "서울-수원";
		System.out.println(b1.nums);
		System.out.println(b2.nums);
		System.out.println(b3.nums);
		System.out.println(b1.target);
		System.out.println(b2.target);
		System.out.println(b3.target);
		// exp) Cat: 종류, 이름
//			c1, c2, c3
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		
		c1.type = "노르웨이숲";
		c2.type = "코숏";
		c3.type = "벵갈";
		c1.name = "놀";
		c2.name = "코코";
		c3.name = "벵벵";

		System.out.println(c1.type + ", " +c1.name);
		System.out.println(c2.type + ", " +c2.name);
		System.out.println(c3.type + ", " +c3.name);

	}
}

class Bus {
	String nums;
	String target;
}

class Cat {
	String type;
	String name;
	int age;
	boolean gender;
	String [] foods;
}