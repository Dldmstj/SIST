package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A03_File {

	public static void main(String[] args) {

		/*
		  # 파일 입력
		  	1. 데이터는 코드를 통해서 전기적 메모리에 할당해서 전송/출력할 수 있지만, 하드웨어적으로 저장하여 처리할 수도 있는데,
		  		이렇게 하드웨어적으로 저장해주는 객체가 File객체이다.
		  	2. 파일 객체의 처리하는 내용
		  		1) 일반 데이터를 물리적으로 장기간 저장할 수 있음
		  		2) 장기간 저장한 데이터를 일반 데이터로 호출하여 사용
		  		3) 특정한 파일을 저장 처리 	ex) File f = new File("a.txt");
		  		4) 특정한 경로를 저장 처리
		  		5) 파일의 메서드로 확인할 수 있는 데이터
		  			파일의 크기, 파일의 이름, 파일의 속성(쓰기/읽기/권한)
		  			파일의 생성/삭제
		  			디렉토리의 생성, 디렉토리에 포함된 파일 객체 가져오기
		  	3. 기능 메서드
		  		createNewFile() : 파일 생성
		  			프로그램적인 객체를 물리적인 파일로 만들어주는 작업
		  			=> 
		  		mkdir() : 디렉토리 생성
		  		mkdirs(): 경로상에 없는 모드 디렉토리 생성
		  		delete() : 파일 또는 디렉토리 삭제. 파일이 있으면 해당 파일을 물리적으로 삭제
		  		canExcute() : 실행 파일 여부
		  		canRead() : 읽을 수 있는지 여부
		  		cnaWrite() : 쓸 수 있는지 여부
		  		getParent(): 부모 디렉토리 리턴
		  		File getParentFile(): 부모 디렉토리를 File객체로 생성 후 리턴
		  		String getPath() :전체 경로 리턴
		  		isDirectory(): 디렉토리 인지
		  		isFile(): 파일인지
		  		long length(): 파일의 크기 리턴
		  		String[] list(): 경로로 포함된 파일 또는 서브 디렉토리
		  				배열형 리턴
		  		File[] listFiles() : 경로에 포함된 파일
		 */
//		1. 같은 폴더에 있는 파일 객체 생성
		File f01 = new File("C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\z01_sample.txt");
		System.out.println("물리적 파일 존재 여부: " + f01.exists());
//		2. 파일 생성(물리적 파일)
		File f02 = new File("C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\z02_sample.txt");
		String path = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\a13_io\\";
		File f03 = new File(path + "a03_f");
		File f04 = new File(path + "a04_f");
		File f05 = new File(path + "a05_f");
		File f06 = new File(path + "a06_f");
		
		try {	// io가 일어나기 때문에 필수 예외 처리
			if(!f02.exists())	// 물리적 파일이 없으면
			f02.createNewFile();
			
			f03.mkdir();	// 경로를 만들 때 사용하는 메서드.
			f04.mkdir();	// 경로를 만들 때는 필수 예외가 필요없다.
			f05.mkdir();
			f06.mkdir();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
