package javaexp.y01_review;

public class A02_Constructor {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동",25);
//		Person p1 = new Person();	
			// Person 클래스에 생성자를 선언해서 default 생성자는 삭제됨. 매개변수가 없으면 error
	}
}

class Person{
	String name;
	int age;
	// 보이지 않지만 생성자가 없을 때, 컴파일 시 자동으로 default 생성자를 호출하여 사용한다.
	// Person() {}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
