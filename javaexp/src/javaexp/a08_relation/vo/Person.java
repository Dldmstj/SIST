package javaexp.a08_relation.vo;

public class Person {
	// 일반적으로 필드는 직접 호출이 불가능하게 private으로 설정한다.
	// public으로 생성해버리면 누구나 접근(읽고 쓰기)할 수 있음.
	// 잘못된 메모리 처리, 잘못된 할당을 방지하기 위해.
	private String name;
	private int age;
	private String loc;
	
	// 
	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public Person(int age) {		
		this.age = age;
	}

	public String getName() {		// 필드를 private로 선언했기 때문에, 변수에 간접적으로 접근할 수 있게 함
		return name;
	} 	// p1.getName("");	// 필드에 있는 값을 간접적으로 읽어옴
	
	public void setName(String name) {
		this.name = name;
	}  	// p1.setName("");	// 필드에 있는 값을 간접적으로 할당
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	/*
	 * public Person(String loc) { this.loc = loc; }
	 * 
	 * public Person(String name) { this.name = name; }
	 */
	
	// 호출할 때, 매개변수의 타입이 둘 다 String이면.. 두 생성자가 다르다고 구분할 수 없음
	// 매개변수 타입과 개수 달라야된다
	
	

	
	
}
