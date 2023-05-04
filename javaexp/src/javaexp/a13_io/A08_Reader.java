package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A08_Reader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\";
		Reader rd = null;
		
		try {
			rd = new FileReader(path + "z04_data.txt");
			while(true) {
				int code = rd.read(); 		// 코드를 한 자씩 가져옴
				if(code == -1) { break;}	// code가 -1이되면 더이상 데이터가 없는 상태. 반복문 종료함.
				System.out.print((char)code); 	// code를 char로 형변환
			}
			rd.close();
			System.out.println();
			System.out.println("--자원 해제--");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 읽어올 수 없습니다.");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException.");
			System.out.println(e.getMessage());
		}
	}

}
