package javaexp.a13_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class A06_WriteFile {

	public static void main(String[] args) {

		/*
		  # 파일 내용 입력 처리
		  	1. 여러가지 데이터들을 File내용으로 저장할 수 있다.
		  	2. 프로그램에서 입력되는 내용을 File에 쓰는 작업을 처리해보자.
		  	3. 사용할 객체
		  		1) 상위객체: Writer
		  		2) 하위 파일 쓰기 객체: FileWriter("경로명");
		  		3) 쓰기 처리 메서드
		  			writer("문자열");
		  			flush();	// 임시 메모리 해제
		  			close(); 	// Stream객체 해제
		 */
		String path="C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\";
		Writer fout = null;
		try {
			fout = new FileWriter(path + "z01_sample.txt",true);
			Scanner sc = new Scanner(System.in);
			System.out.print("파일에 쓸 내용을 입력하세요: ");
			String data = sc.nextLine();
//			fout.write("기존 내용");	// 내용 새로 덮어씀
			fout.append("\n" + data);	// 기존의 내용에 누적됨
			System.out.println("입력 완료!");
			fout.flush(); 	// buffer에 있는 임시메모리 해제
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
