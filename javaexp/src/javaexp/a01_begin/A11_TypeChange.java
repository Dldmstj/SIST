package javaexp.a01_begin;

public class A11_TypeChange {

	public static void main(String[] args) {
		
		/*
		 # 형 변환
		 1. 데이터 타입을 다른 타입으로 변환하는 것을 말한다.
		 	1) 기본 데이터 타입끼리 
		 	작은 데이터유형 -> 큰 데이터 유형으로, 실수 <--> 정수
		 	2) 객체형끼리 변경
		 		- 문자열 데이터와 숫자 변경
		 			"301" vs 301	// 문자열 <-> 정수형
		 			"301" + "101" vs 301 + 101	// "301101" <-> 402
		 			ps) 실무형태
		 				모든 데이터는 기본적으로 문자열형태로만 전송하고 전달받을 수 있다.
		 				내장된 객체에서 지원하는 기능 메서드를 통해 전환 가능.
		 				문자열 => 숫자
				 				Integer.parseInt()
				 				Double.parseDouble()
				 			숫자 -> 문자
				 				System.out.println("2+3="+2+3)	// 2+3=23
				 				int num01 = 20;
				 				int num02 = 30;
				 				String str = ""+num01 + num02 // 2030
			 				최대한 간단한 방법: 문자열 ""을 선언하고 숫자를 붙이면 문자열로 변환이 된다.
			 					ex) ""+20 --> "20"
		 			
		 		- 상속관계에서 형변환 (객체 이후 진행)
		 2. 종류
		 	1) 자동(묵시적) 형변환
		 		작은 유형을 큰 유형으로 할당(promotion)
		 	2) 강제적(명시적) 형변환
		 		큰 유형을 작은 유형으로 할당(casting)
		 */
		
		byte num01 = 30;
		int num02 = 230;
		// !주의! 데이터는 오른쪽에서 왼쪽으로 할당 (= 대입 연산자에 의해)
		// 순수 데이터로 할당할 수 있는 것이 아니고, 그것을 포함하는 유형 기준으로 할당.
		//num02 = num01;		// 작은 데이터유형의 값을 큰 데이터유형의 값으로 할당, 묵시적 형변환 발생.
		
		/*
		 1. 큰 데이터유형의 값을 작은 데이터유형의 값으로 할당할 수 없음.
		 2. 형변환을 위해서 casting 작업이 필요함.
		 	!주의! 해당 범위 안에 있으면 정상적으로 할당하지만, 
		 		해당 범위를 초과하는 경우엔 정수의 경우 bit단위로 잘려지기에 원치않는 결과를 확인할 수 있음.
		 	!주의! 캐스팅은 반드시 큰 데이터가 작은 데이터로 할당하는 경우만 있는 것이 아니라,
		 		 작은 데이터가 큰 데이터로 강제 변환해서 연산을 해야하는 경우에도 사용
		*/
//		num01 = num02;		// (x)
		num01 = (byte)num02;
		// bit 단위로 casting되기 때문에 연산결과 예측이 힘들다
		// 01010100 8bit
		// 0101 4bit
		// 0100 잘려지는 효과가 있다.
		System.out.println(num01);
		
		
		/*
		 3. 정수 <-> 실수 변환
		 	
		*/
//		1) 정수 -> 실수
//			20 -> 20.0
		int num03 = 20;
		double num04 = num03;
		System.out.println(num04);
		
//		2) 실수 -> 정수
//			3.14 -> 3
		double num05 = 3.14;
		int num06 = (int)num05;
		System.out.println(num06);		// casting
		
		/*
		 # !주의! (자바에만 존재)
		 1. 자바는 정수/정수 -> 정수형 처리, 소숫점 이하를 처리해주지 않음.
		 	-> 소숫점 이하를 처리하기 위해서는 나눗셈의 데이터 중 적어도 하나는 실수형으로 형변환하여 처리해야 함.(casting)
		 	cf) casting은 무조건 큰 데이터를 작은 데이터에 할당하는 것이 아니라, 데이터 유형의 크기/종류에 상관없이
		 		강제 형변환시 사용한다. (실무 사용 多)
		*/
		int num07 = 10;
		int num08 = 3;
		
		System.out.println(num07/num08);
		System.out.println(num07/(double)num08);
		System.out.println((double)num07/num08);
		System.out.println((double)num07/(double)num08);
		
//		ex) 25와 7을 정수 변수로 선언하여, 소숫점 이하가 나오지 않는 경우와,
//			소숫점 이하가 나오게 하는 경우를 처리하여 출력하시오.
		
		int num1 = 25;
		int num2 = 7;
		
		System.out.println(num1 + " , " + (double)num1);
		System.out.println(num2 + " , " + (double)num2);
		System.out.println(num1/num2);
		System.out.println(num1/(double)num2);
		System.out.println((double)num1/num2);
		System.out.println((double)num1/(double)num2);
		
		
		// 숫자를 문자열로 변환하는 방법
		int num20 = 25;
		System.out.println("" + num20 + 30);
		Integer intRam = num20;
		System.out.println(intRam.toString()+30);
	}

}
