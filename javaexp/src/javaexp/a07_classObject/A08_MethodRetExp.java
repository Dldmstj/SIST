package javaexp.a07_classObject;

public class A08_MethodRetExp {

	public static void main(String[] args) {

		Product11 p1 = new Product11();
		// 생성자는 호출시마다 다른 heap영역을 만들기 때문에, 참조값이 달라져서 하나의 객체에 하나의 생성자만 사용할 수 있지만,
		
		// 메서드는 참조명.메서드명(데이터...) 으로 같은 heap 영역 위치에서 동일한 메서드를 2~3번 이상 호출하더라도 메모리 변경이 없다.
		int tot1 = p1.totPay("사과", 2000, 5);
		System.out.println("총비용 1: " +tot1);
		System.out.println("총비용 2: " +p1.totPay("오렌지", 2500, 3));
		int tot3 = p1.totPay("수박", 12000, 3);
		System.out.println("총비용 3: " + tot3);
		
		System.out.println();
		
		Student01 std1 = new Student01();
		double avg = std1.subAvg("신짱구", 100, 90, 95);
		System.out.println("점수의 평균: " + avg);
	}

}

// Student01, records() 메서드에 이름, 국어, 영어, 수학 입력받고, 해당 내용을 출력, 평균(double) 리턴하세요

class Student01{
	double subAvg(String name, int kor, int eng, int math) {
		int tot = kor + eng + math;
		double avg = tot/3;
		System.out.println("이름: "+name+"\n국어점수: " + kor+"\n영어점수: " + eng+"\n수학점수: " + math);
		System.out.println("점수의 총 합계: " +tot);
		return avg;
	}
}


//물건 객체를 생성해서, 구매할 물건과 가격, 갯수를 입력받아, 총 비용을 리턴하는 처리를 해보자.

class Product11{
	int totPay(String pname, int price, int cnt) {
		System.out.println("입력한 물건명: "+pname);
		System.out.println("가격: "+price);
		System.out.println("갯수: "+cnt);
		int tot = price * cnt;
		return tot;
	}
	
//	 ex) 물건 가격, 할인율을 입력받아서, 할인율이 적용된 금액을 casting해서 정수형을 리턴하여 main()에서 호출하세요
	int dis(int price, double dc) {
		System.out.println(price + "원" + dc + "% 할인: ");
		int dcPrice =(int)(price*100);
		return (int)dcPrice;
	}
}
