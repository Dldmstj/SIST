package javaexp.a07_classObject;

public class A02_ObjectField {

	public static void main(String[] args) {
		/*
		 # 클래스(객체)의 구성요소
		 1. 필드: 객체의 데이터가 저장되는 곳
		 2. 생성자: 기본적인 필드값을 초기화할 때 객체가 생성되면서 데이터를 입력받아서 처리한다.
		 		ex) new Baby("겸둥이1",0,....)
		 3. 메소드: 데이터 입력, 리턴하는 데이터를 처리하는 함수
		 
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