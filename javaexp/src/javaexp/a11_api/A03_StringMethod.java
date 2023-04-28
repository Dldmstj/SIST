package javaexp.a11_api;

public class A03_StringMethod {

	public static void main(String[] args) {
		/*
		  # String 클래스에서 사용되는 기능메서드
		  1. charAt(int idx): 특정위치에 문자리턴
		  
		 */
		String greet = "안녕하세요! 반갑습니다!";
		System.out.println(greet.charAt(5));
		// 주의: 배열의 길이는 배열.length, 문자열의 길이는 문자열.length()
		for(int idx=0; idx<greet.length(); idx++) {
			System.out.print(greet.charAt(idx));
		}
		
		System.out.println("\n");
		
		String data = "1991/10/12";
		// 이 데이터는 생년월일이 있는 데이터이다. 위 charAt을 이용해 년,월,일 을 출력하세요
		for(int idx=0; idx<data.length(); idx++) {
			if(idx == 4) {
				System.out.print("년 ");
				continue;
			}else if(idx == 7) {
				System.out.print("월 ");
				continue;
			}
			System.out.print(data.charAt(idx));
		}
		System.out.print("일");
		/*
		  2. getBytes(): 문자열을 byte배열로 가져온다.
		 */
		System.out.println("\n");
		
		String str1 = "Hello";
		byte[] bytes01 = str1.getBytes();
		for(byte b: bytes01) {
			System.out.print(b + "(");
			System.out.print((char)b + "),");
		}
		System.out.println();
	}

}
