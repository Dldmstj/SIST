package javaexp.z01_home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A17_0503 {

	public static void main(String[] args) {
		//[1단계:개념] 1. set객체의 특징을 예제를 통하여 기술하세요
		/*
		  # set 객체의 특징
	  		저장 순서가 유지되지 않는다.
	  		객체를 중복되게 저장할 수 없다.
	  		하나의 null만 저장할 수 있다.
		 */
		Set<String> set = new HashSet<String>();
		System.out.println("# set 객체의 중복데이터 test #");
		set.add("감자");
		set.add("감자");
		set.add("고구마");
		set.add("고구마");
		set.add("옥수수");
		set.add("옥수수");		// 중복 x
		for(String s:set) {
			System.out.print(s+" ");		// 출력: 고구마 감자 옥수수
		}
		System.out.println();
		System.out.println("set의 크기: " + set.size());	// set.size(): 3, 중복 저장 x

		System.out.println();
		
		//[1단계:확인] 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
		Set<String> pocket = new HashSet<String>();
		Random rd1 = new Random();
		System.out.println("# 랜덤 과일 리스트 #");
		String [] fruits = {"사과","바나나","딸기","오렌지","수박"};
		
		for(int i=1; i<=10; i++) {		// 10번 반복
			int rfruit = rd1.nextInt(fruits.length);	// 랜덤수 생성
			pocket.add(fruits[rfruit]);		// 주머니에 과일 랜덤으로 넣기
		}
		for(String flist:pocket) {		// 주머니에 있는 과일 종류 출력하기
			System.out.print(flist+" ");
		}
		System.out.println();
		System.out.println();

		//[1단계:개념] 3. map객체의 특징을 기본 예제를 통하여 설명하세요
		/*
		 	# map 객체의 특징
		 		키와 값으로 구성된 Map.Entry객체를 저장하는 구조이다.
		  		키와 값은 모두 객체이다.
		  		키는 중복될 수 없지만, 값은 중복하여 저장할 수 있다.
		 */
		System.out.println("# map 객체의 중복데이터 test #");
		Map<String,String> map = new HashMap<String, String>();
		map.put("5001", "김밥");
		map.put("5001", "주먹밥");	// key 중복
		map.put("5002", "떡볶이");
		map.put("5003", "떡볶이");	// value 중복
		
		for(String key:map.keySet()) {
			System.out.print(key+"\t");
			System.out.print(map.get(key)+"\n");
		}
		System.out.println();
		
		//[1단계:확인] 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때, 
//				동일한 id로 회원 정보를 입력하고 변경되는 회원 정보를 처리해보세요.
		System.out.println("# map으로  회원 정보 저장하기 #");
		Map<String,String> members = new HashMap<String, String>();
		members.put("sh1n", "짱구");
		members.put("sh1n", "맹구");	// key 중복
		members.put("H00n", "훈이");
		members.put("Cheo1", "철수");	// value 중복
		// key의 중복은 최종으로 입력된 것을 기준으로 처리된다.
		System.out.println("회원id\t이름");
		System.out.println("-----------");
		for(String key:members.keySet()) {
			System.out.print(key+"\t");
			System.out.print(members.get(key)+"\n");
		}
		System.out.println();
		
		//[1단계:개념] 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.
		/*
		  	1) 입력처리 (InputStream)
		  		console창에서 데이터를 키보드를 통해 입력받는다.
		  		입력된 데이터를 System.in이라는 InputStream을 통해서 관리할 수 있다.
		  		
		  	2) 출력처리 (OutputStream)
		  		console창에서 데이터를 출력한다. 
		  		System.out 객체를 통해서 문자열 형식으로 println()메소드를 통해 출력할 수 있다.
		 */
//		System.out.println("# java 기본 입/출력 처리 #");
//		System.out.print("문자 입력: ");
//		InputStream is = System.in;
//		try {
//			int data = is.read();
//			OutputStream os = System.out;
//			System.out.print("입력된 내용1: ");
//			os.write(data);	// write(byte) : 코드값을 출력
//			os.flush();	// 임시메모리 자원 해제
//
//			char ch = (char)data;
//			System.out.println();
//			System.out.print("입력된 내용2: "+ch);
//			os.close(); 	// 자원 해제
//		} catch (Exception e) {
//			e.printStackTrace(); 	// 필수 예외 처리
//		}
//		System.out.println();
		
		//[1단계:확인] 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고, 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
//		String path1 = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\z03_fileExp\\";	
//		for(int i=1; i<10; i++) {
//			File f = new File(path1+"show0"+i+".txt");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//[1단계:확인] 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.
		String path2 = "C:\\Users\\user\\git\\SIST\\javaexp\\src\\javaexp\\z03_fileExp\\";	
		Writer fout = null;
		try {
			fout = new FileWriter(path2 + "show01.txt");
			Scanner sc = new Scanner(System.in);
			System.out.print("물건명을 입력하세요: ");
			String pname = sc.nextLine();
			System.out.print("가격을 입력하세요: ");
			String price= sc.nextLine();
			System.out.print("갯수를 입력하세요: ");
			String pcnt = sc.nextLine();
			
//			fout.write("물건명: " + pname);	// 덮어쓰기
//			fout.write("\n가격: " + price +"원");
//			fout.write("\n갯수: " + pcnt+"개");
//			System.out.println("입력 완료!");
			fout.append("물건명: " + pname);	// 기존의 내용에 누적됨
			fout.append("\n가격: " + price +"원");
			fout.append("\n갯수: " + pcnt+"개");
			System.out.println("입력 완료!");
			
			fout.flush(); 	// buffer에 있는 임시메모리 해제
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();	// 자원 해제
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
