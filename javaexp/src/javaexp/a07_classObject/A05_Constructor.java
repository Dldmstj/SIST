package javaexp.a07_classObject;

public class A05_Constructor {

	public static void main(String[] args) {
		Person_ p01 = new Person_("홍길동",25,"서울");		// 매개변수 3개 받는 사용자정의 생성자 선언. -> 매개변수 안 넣으면 에러
		Person_ p02 = new Person_("김길동",27,"인천");
		System.out.println(p01.name);
		System.out.println(p01.age);
		System.out.println(p01.loc);
		System.out.println(p02.name);
		System.out.println(p02.age);
		System.out.println(p02.loc);
		
		Product_ prd1 = new Product_("감자",2000,3);
		Product_ prd2 = new Product_("고구마",3000,2);
		
		System.out.println();
		System.out.println("물건명\t가격\t수량");
		System.out.println(prd1.pname+"\t"+prd1.pPrice+"원\t"+prd1.pCnt);
		System.out.println(prd2.pname+"\t"+prd2.pPrice+"원\t"+prd2.pCnt);
		System.out.println();
		
		ProductVO p1 = new ProductVO("사과");
		// p1: 객체의 특정한 heap영역의 주소를 간단하게 선언한 것이다. 참조변수
		System.out.println(p1.name);
		ProductVO p2 = new ProductVO("바나나");
		System.out.println(p2.name);
		System.out.println();
		
		ProductVO p3 = new ProductVO("오렌지",2000,5);
		System.out.println("# 물건 객체 #");
		System.out.println(p3.name);
		System.out.println(p3.price);
		System.out.println(p3.cnt);
	}
}
//		ex) Product_ 클래스 선언 필드로 물건, 가격, 갯수 -> 영문으로 선언하고,
//			생성자를 통해서 초기화. main()를 통해 prd1, prd2를 참조변수로 객체를 생성해서 필드값을 출력하세여

class Product_{
	String pname;
	int pPrice;
	int pCnt;
	
	Product_(String pname, int pPrice, int pCnt){
		this.pname = pname;
		this.pPrice = pPrice;
		this.pCnt = pCnt;
	}
}
// class 선언시 에러가 발생: 동일한 패키지명 하위에 동일한 클래스 선언시 에러발생
class Person_{
	String name;
	int age;
	String loc;
	
	Person_(String name, int age, String loc){
		// field로 선언한 name과 매개변수로 전달된 name을 구분해야함.
		// 구분자 : this.
		this.name = name;
		this.age = age;
		this.loc = loc;
	}	// 사용자 정의 생성자를 선언하는 순간, default 생성자는 삭제.
//			1. 생성자의 핵심 임무 -  필드 초기화 처리
}
