package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A07_Reader {

	public static void main(String[] args) {
		/*
		  # 파일에 있는 내용을 읽어오는 Reader객체
		  	1. 지정한 파일 객체에 있는 내용을 읽어와서 출력처리
		  	2. 처리순서
		  		1) Reader객체를 상위로 하여 FileReader객체 생성
		  		2) read() 메서드를 통해 문자 한 자씩 가져와서 담기 처리
		  		3) 위 내용이 코드 번호이기 때문에 char로 형변환 처리
		  		4) 더 이상 읽어올 데이터가 없는 -1일 경우 종료처리
		 */
		String path = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\";
		
		Reader rd = null;
		try {
			rd = new FileReader(path+"z03_data.txt");
			while(true) {
				int code = rd.read();		// 한 자씩 코드값을 가져온다.
				if(code == -1) {	// 더 이상 데이터가 없을 때, 반복문 종료
					break;
				}
				System.out.print((char)code);
			}
			rd.close();
			System.out.println("읽기 종료.");
		} catch (FileNotFoundException e) {		// 해당 file이 존재하지 않는 예외
			System.out.println("해당 파일을 읽어올 수 없습니다.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException");
			System.out.println(e.getMessage());
		}
	}

}
