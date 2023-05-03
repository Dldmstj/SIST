package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A04_File {

	public static void main(String[] args) {

		String path = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\";
		File f01 = new File(path+"a01_sample.txt");
		File f02 = new File(path+"a02_sample.txt");
		File f03 = new File(path+"a03_sample.txt");
		try {
			f01.createNewFile();
			f02.createNewFile();
			f03.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("물리적 파일 존재 여부: " + f02.exists());
	}

}
