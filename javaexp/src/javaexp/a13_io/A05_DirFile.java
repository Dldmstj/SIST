package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A05_DirFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\a01_folder\\";
		/*
		  # 파일 내 쓰기 기능 처리
		  	1. 기존 내용을 삭제하고 데이터 입력하기
		  		new FileWriter("경로명\\파일명");
		  		.write("저장할 문자열");
		  		.append("위 write처리 이후에 더 추가할 내용 처리");
		  	2. 기존 내용을 그대로 두고 데이터 입력하기
		  		new FileWriter("경로명\\파일명,true");
		  		.append("추가할 문자열");
		 */
//		File f01  = new File(path + "a01");
//		File f02  = new File(path + "a02");
//		File f03  = new File(path + "a03");
//		File f04  = new File(path + "a04");
//		File f05  = new File(path + "a05");
//		File f06  = new File(path + "a06");
//		File f07  = new File(path + "a07");
//		File f08  = new File(path + "a08");
//		File f09  = new File(path + "a09");
		for(int i=1; i<10; i++) {
			File f = new File(path+"a0"+i);
		}
		
		try {
//			f.mkdir();
//			f01.mkdir();
//			f02.mkdir();
//			f03.mkdir();
//			f04.mkdir();
//			f05.mkdir();
//			f06.mkdir();
//			f07.mkdir();
//			f08.mkdir();
//			f09.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
