package javaexp.a01_begin;

public class A04_varBasic {

	public static void main(String[] args) {
		// 숫자형 데이터 선언과 할당
		// 형식: 유형 이름 = 데이터
		int num01 = 25;		// 크기와 유형에 맞지 않는 데이터는 에버가 발생함
		var num02 = 30;		// 데이터 유형 결정 x, 할당하는 순간 결정, var은 데이터에 따라 유형이 정해짐. 에러 x
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num01 + num02);
		
		int point01 = 70;
		// + : 숫자는 합산, 문자열과 사용하면 연결
		System.out.println("점수: " + point01 +"\n");
		
		// ex) 국어, 영어, 수학 점수를 영문명으로 변수 선언하고 항목별로 출력, 총계도 출력
		
		int kor = 80;
		int eng = 90;
		int math =95;
		
		System.out.println("국어: "+ kor);
		System.out.println("영어: "+ eng);
		System.out.println("수학: "+ math);
		System.out.println("총계: "+ (kor + eng + math) + "\n");
		
		// ex) 사과, 바나나, 딸기 가격을 영문변수로 선언하고, 가격 데이터를 할당한 후 항목별로 출력하고, 총 비용 출력.
		
		int app = 1000;
		int ban = 500;
		int str = 300;
		int total = app + ban + str;
		
		System.out.println("사과: " + app);
		System.out.println("바나나: " + ban);
		System.out.println("딸기: " + str);
		
		// 뒤에 + 숫자는 자동 형변환과정이 일어나서 숫자가 문자형이 됨, 소괄호()는 최우선순위 연산
		// 계산 결과를 가지고 앞에 문자열의 영향을 받아 처치.
		
		System.out.println("총 비용: " + (app + ban + str));
		System.out.println("총 비용: " + total);
		
	}
	
	

}
