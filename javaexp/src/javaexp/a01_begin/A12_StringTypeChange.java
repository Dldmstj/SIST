package javaexp.a01_begin;

public class A12_StringTypeChange {

	public static void main(String[] args) {
		
		/*
		 ex) 파일에 저장된 숫자, 네트워크를 통해 전달되는 숫자 => 문자열형
		 	 3000^2000^4000 => "3000" => 3000
		 	 
		 - 문자열 -> 정수형 변환 : Integer.pareInt("")
		 					내장된 Integer객체의 parseInt() 메서드를 통해 숫자형 문자열을 숫자형으로 변환해줌.
		 					ex) int num01 = Integer.parseInt("25")
		 					 	"25.7" (x) "이십오"(x) "25"(o) 
		 					
		 - 문자열 -> 실수형 변환 : Doubler.pareDouble("")
		 					내장된 Doubler객체의 parseDouble() 메서드를 통해 숫자형 문자열을 실수형으로 변환해줌.
		 					ex) double num02 = Double.parseDouble("3.14") 
		 */
		
		int num01 = Integer.parseInt("25");
		System.out.println(num01+25);
		String num02Str = "30.15";
		// 반드시 정수형 문자열이어야 한다.

//		int num02 = Integer.parseInt(num02Str); 	//컴파일은 되지만 실행시 에러가 발생함 (runtime error)
		
		double num02 = Double.parseDouble(num02Str);
		System.out.println(num02+30.5);
		// 실수형변환에서 정수형문자열을 전환이 된다.
		System.out.println(Double.parseDouble("30")+0.7);
		
		System.out.println();
		
		// ex 1) 문자열 "70"과 "20"을 정수형으로 형변환하여, 합산된 결과를 출력하세요.
		// ex 2) 문자열 "30.7"과 "40.2"를 실수형으로 형변환하여, 합산된 결과를 출력하세요.
		
//		ex1
		String str1 = "70";
		String str2 = "20";
		int str1ToNum = Integer.parseInt(str1);
		int str2ToNum = Integer.parseInt(str2);
		int hap1 = str1ToNum + str2ToNum;
		System.out.println(hap1);
		
//		ex2
		String str3 = "30.7";
		String str4 = "40.2";
		double str3ToNum = Double.parseDouble(str3);
		double str4ToNum = Double.parseDouble(str4);
		double hap2 = str3ToNum + str4ToNum;
		System.out.println(hap2);
		
	}

}
