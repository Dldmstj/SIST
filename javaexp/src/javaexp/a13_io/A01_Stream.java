package javaexp.a13_io;

import java.io.InputStream;
import java.io.OutputStream;

public class A01_Stream {

	public static void main(String[] args) {
		/*
		  # 데이터를 전송처리하는 Stream
		  	1. 자바에서는 Stream이 API객체를 통해서, 데이터를 입력하거나 출력을 하는 등 처리를 하고 있다.
		  		- 파일의 데이터를 입/출력 또는 파일 자체를 전송처리
		  		- 문자를 입력받아서 출력하는 처리
		  		- 입력된 문자를 네트워크를 통해 전송하며 전달하는 처리
		  	2. 기본 객체
		  		1) 입력 처리: InputStream
		  			=> 자바에서 지원하는 기본 입력처리 객체
		  			System.in : InputStream객체를 리턴하는 객체
		  		2) 출력 처리: OutputStream
		  			=> 자바에서 지원하는 기본 출력처리 객체
		  			System.out : OutputStream객체를 리턴하는 객체
		  # java에서는 main()프로그램을 통해서 기본적으로 console창에서 데이터를 키보드를 통해 입력받음
		  	입력된 데이터를 System.in이라는 InputStream을 통해서 관리할 수 있고,
		  	또한 데이터를 console창에서 출력하는 System.out 객체를 통해서 문자열 형식으로 println()메소드를 통해 출력할 수 있다.
		  	
		  	3. InputStream을 통해 입력 데이터를 OutputStream으로 출력처리하기
		  		1) InputStream is1 = System.in;
		  		2) 기본입력 Stream객체는 다음과 같이 데이터를 처리한다.
		  			int data = is1. read(); 문자(char)를 byte형으로
				3) char 형변환 처리
					char ch01 = (char) data;
				4) OutputStream os1 = System. out;
					os1.printin("입력한 문자 출력: "+ch01);
				5) 필수 예외 처리하기 1s1. read()에서 10가 발생하기에 컴파일 예외 처리를 해야한다.
		 */
		System.out.println("# 기본 입력 문자 처리 #");
		System.out.print("문자 1자를 입력하세요: ");
		InputStream is01 = System.in;
		try {
			int data = is01.read();
			OutputStream os01 = System.out;
			System.out.print("입력된 내용1: ");
			os01.write(data);	// write(byte) : 코드값을 출력
			os01.flush();	// 임시메모리 자원 해제

			char c01 = (char)data;
			System.out.println();
			System.out.print("입력된 내용2: "+c01);
			os01.close(); 	// 자원 해제
		} catch (Exception e) {
			e.printStackTrace(); 	// 필수 예외 처리
			// A02_Stream.java 생성. 
		}
	}

}
