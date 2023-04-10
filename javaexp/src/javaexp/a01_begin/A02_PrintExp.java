package javaexp.a01_begin;

public class A02_PrintExp {

	public static void main(String[] args) {

/*
 - 다중행 주석
 1. 출력 처리의 여러가지 형식
 	1) 자바는 기본적으로 System.out.println("출력문자열");
 		명령을 통해서 !'줄바꿈과 함께'! 문자열을 출력한다.
 */
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
// 줄바꿈 없는 출력문
		System.out.print("홍");
		System.out.print("길");
		System.out.print("동\n\n");
//		ex) 국어 70
//			영어 80
//			수학 90
//		국어, 70, 영어, 80, 수학, 90
//		각각 System.out.println("국어")에 넣어 위 형식으로 출력되도록
//		
//		
		System.out.println("국어 70");
		System.out.println("영어 80");
		System.out.println("수학 90");
		System.out.print("국어, ");
		System.out.print("70, ");
		System.out.print("영어, ");
		System.out.print("80, ");
		System.out.print("수학, ");
		System.out.print("90");
	}

}
