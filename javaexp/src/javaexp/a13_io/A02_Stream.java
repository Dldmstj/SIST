package javaexp.a13_io;

import java.io.InputStream;
import java.io.OutputStream;

public class A02_Stream {

	public static void main(String[] args) {
//		 ex) A02_Stream.java 생성. 정답 번호를 입력하세요. 입력된 정답 번호: @@, 정답여부:@@
		System.out.println("# 입/출력 Stream test #");
		System.out.print("정답은? ");
		char cor = '1';
		InputStream is01 = System.in;	// 입력처리
		try {
			int ans = is01.read();
			char input = (char)ans;
//			is01.read(byte[] bytes);	: 여러개의 문자를 입력받음
//			bytes: 입력된 문자의 배열을 코드값으로 배열에 저장
//			new String(bytes): 여러 개의 문자열 데이터를 확인
			OutputStream os01 = System.out;
			System.out.print("입력된 답: ");
			os01.write(ans);	// 입력된 답 출력
			System.out.println();
			System.out.println("정답: " + cor);
			os01.flush();
			
			if(ans==cor) {
				System.out.println("정답");
			}else {
				System.out.println("오답");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
