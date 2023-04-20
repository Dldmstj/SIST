package javaexp.a08_relation.a02_pck;

public class Product {
	public static String pCode = "제품코드1000";
	static int no = 9999;
	public String name;		// 모든 외부 패키지에서 접근 가능
	int age;	// 같은 패키지만 접근 가능
//	private String loc;	// 현재 클래스 내에서만 사용 가능
	
	public Product() {} 	// default 생성자의 접근범위는 public!!
	
	public Product(String name, int age) {
		this.name = name;
		this.age = age;
	}


	Product(String name) {		// 접근제어자가 없기 때문에 다른 패키지에서 접근 불가
		this.name = name;
	}

	public Product(int age) {	// public: 다른 패키지에서 접근 가능
		this.age = age;
	}
	
}

// public 이 아닌 클래스
class Fruit{}
