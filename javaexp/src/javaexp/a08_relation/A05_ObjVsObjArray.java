package javaexp.a08_relation;

import javaexp.a08_relation.vo.Mart;
import javaexp.a08_relation.vo.Product;

public class A05_ObjVsObjArray {

	public static void main(String[] args) {

		Mart m1 = new Mart("행복마트");
		// 예외 내용 확인
		m1.buyList();
		
		m1.buyProduct(new Product("사과",3000,2));
		m1.buyProdPlan("홍길동", 3);		// 나는 홍길동이고 물건은 세 종류 구매할 거다
		m1.buyProduct(new Product("오렌지",1200,5));
		m1.buyProduct(new Product("딸기",8000,2));
		m1.buyProduct(new Product("수박",15000,4));
		
		// 예외 내용 확인
		m1.buyProduct(new Product("키위",1200,5));		// 세 종류만 구매할 거니까 키위는 못 삼
		m1.buyList();		// 구매한 리스트 출력
		
		//		Product p1 = new Product("김치",300,1);
//		Product p2 = new Product("감자",300,1);
//		Product p3 = new Product("고구마",300,1);
//		m1.buyProdPlan("홍길동", 2);
//		
//		m1.buyProduct(p1);
		
	}

}
