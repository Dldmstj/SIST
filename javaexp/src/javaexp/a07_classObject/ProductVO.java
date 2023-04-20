package javaexp.a07_classObject;

// 상단 메뉴에 refactor => rename
// class 명을 바꾸면, 물리적 파일명도 변경됨.
// 이 클래스를 호출하는 모든 파일이 변경
public class ProductVO {
	
	String name;
	int cnt;
	int price;
	
	// new ProductVO()를 매개변수가 있는 생성자가 있더라도 호출이 필요할 시
	public ProductVO() {
		super();		// 상속시 상위 객체를 지칭
		// TODO Auto-generated constructor stub
	}

	public ProductVO(String name, int cnt, int price) {
		this.name = name;
		this.cnt = cnt;
		this.price = price;
	}
	// ProductVO p1= new ProductVO("사과");
	// p1.name에 데이터가 할당되어 사용할 수 있다.
	public ProductVO(String name) {
		// String name : 지역(매개변수)
		// this.name: 객체 전역변수/상수 (필드)
		this.name = name;
	}

	public ProductVO(int cnt, int price) {
		this.cnt = cnt;
		this.price = price;
	}
	
}
