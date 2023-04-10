package javaexp.a01_begin;

public class A10_DataType {

	public static void main(String[] args) {

		/*
		 # 자바의 데이터 유형
		 1. 기본 데이터 유형(primitive data type)
		 	1) stack 영역에서 바로 할당하여 사용하는 데이터 유형
		 	2) 숫자형
		 		정수
		 			byte(8bit)		// -128 ~ 127, 영문 문자를 나타낼 수 있음. word 단위
		 			char(2byte)		// 0~65535
		 			short(2byte)
		 			int(4byte-32)**	// -2147483648 ~ 2147483647 (약 21억)
		 			long(8byte-64))
		 		실수
		 			float(4byte)
		 			double(8byte)**
		 		강조) 정수형의 default데이터 유형은 int
		 			실수형의 default데이터 유형은 double
		 			2532 ==> 정수 int 유형
		 				byte num01 = 25;
		 				byte num02 = 25;
		 				byte num03 = num01 + num02;		// (x)
		 				int num03 = num01 + num02; 		// (o)
		 				// 연산자가 들어가는 순간 ing 유형 이상으로 할당되어야 함
		 			25.32 ==> 실수 double 유형
		 			
		 	3) 문자형 - 형태는 숫자형		
		 		cf) !주의! 문자형은 기본 데이터 유형
		 			문자열형(배열)은 객체유형
		 				char 2byte(16bit)	// 0~65535
		 	4) 논리형 boolean(1byte)
		 		true, false
		 	
		 2. 객체형 데이터(object type)
		 	1) stack영역, heap영역을 사용하는 객체형 데이터 유형
		 
		*/
		
//		int num01 = 999999999999999999; 		// (x)
		long num01 = 9999999999999999L;
		// int 유형의 범위를 넘어선 경우에는 L/l을 붙여서 long에 할당해야 함
		// 실수 유형의 경우에는 기본 유형이 double이므로, float유형으로 선언하여 할당해야 하는 경우는 F/f를 붙임
		float num02 = 12.3456F;
//		byte num04 = 9999;		// (x) byte형 정수 범위 초과
		byte num05 = 127;
		// char는 각 코드값을 가지고 있다.
		
		 for(int i = 0; i<=300; i++) { 
			 System.out.print(i+":");
			 	// 번호가 (char)에 의해 코드값으로 변환되었을 때 나타나는 코드, 
			 	// char문자는 숫자로 저장되어있다가 char에 의해 코드를 나타낸다.
			 System.out.println((char)i); }
		// 실무적으로 숫자/알파벳 대소문자 랜덤 8자를 발송할 때 활용된다.
		
		boolean isPass01 = true;
		boolean isPass02 = false;
		boolean isPass03 = 25>=5;
		System.out.println(isPass01);
		System.out.println(isPass02);
		System.out.println(isPass03);
		
		// 자바에서는 char 유형과 String 유형이 구분됨
		char code01 = 'A';		// '', 문자 하나만 입력
		char[] code02 = {'H','E','L','L','O'};		// {}, 배열
		String code03 = "Hello";		// "", 한 자를 포함하여 입력
		
//		ex) byte 유형으로 25를 할당하고, int 유형으로 3000을 할당, long유형으로 30억을 할당,
//		float 유형으로 3.14 할당하고 출력
		
		byte num1 = 25;
		int num2 = 3000;
		long num3 = 3000000000L;
		float num4 = 3.14F;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
