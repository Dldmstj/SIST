package javaexp.a11_api;

import java.util.Scanner;

public class A04_IndexOf {

	public static void main(String[] args) {
		/*
		  # 특정 문자열을 찾을 때, 활용되는 indexOf
		  1. 기본 형식
		  	문자열.IndexOf("찾을 문자열");
		  	해당 문자열 안에서 찾을 문자열의 시작 위치를 index로 리턴해준다.
		  	해당 문자열을 포함하지 않으면 -1을 리턴한다.
		  	ex) 키워드 검색시 주로 활용된다. 포함된 문자열의 시작 위치를 리턴
		 */
		String msg ="점심 맛나게 드세요!!";
		int idxLoc1 = msg.indexOf("아침");
		int idxLoc2 = msg.indexOf("맛나게");
		System.out.println("데이터가 없을 때: " + idxLoc1);
		System.out.println("데이터가 있을 때: " + idxLoc2);
		System.out.println("'맛나게' 문자열 검색결과");
		if(idxLoc2!=-1) {
			System.out.println("검색이 되었습니다.");
		}else {
			System.out.println("해당하는 데이터가 없습니다.");
		}
		// ex) menu로 사과, 바나나, 딸기 로 할당하고,
		// 		구매물건을 입력: Scanner로 받아서 판매 여부를 출력하세요.
		
//		String menu = "사과,바나나,딸기";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("구매할 물건을 입력하세요: ");
//		String msearch = sc.nextLine();
//		int result = menu.indexOf(msearch);
//		System.out.println("# '" + msearch + "' 검색결과 #");
//		if(result != -1) {
//			System.out.println("검색이 되었습니다.");
//		}else {
//			System.out.println("해당하는 데이터가 없습니다.");
//		}
		/* 
		 	# 문자열을 찾아서 변결할 때 사용하는 replace
		 	1. 기본형식
		 	 	문자열.replace("찾을 문자열","변경할 문자열");
		 */
		String target ="자바는 객체지향 프로그램입니다!";
		String newStr = target.replace("자바","JAVA");
		System.out.println(newStr);
		/*
		 	# 코드성 문자열을 추출하여 원하는 데이터를 처리하는 substring
		 	1. 기본 형식
		 		문자열.substring(추출시작위치0~,추출할마지막위치1~)
		 */
		String data = "홍길동 70 80 90";
		String name = data.substring(0,3);
		String kor = data.substring(4,6);
		String eng = data.substring(7,9);
		String math = data.substring(10,12);
		System.out.println("이름\t국어\t영어\t수학");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math);
		
		System.out.println();
//		ex) 주민번호를 임의로 입력해서, substring으로 추출. @@년 @@월 @@일 생이라고 표시
		
		String civilCode = "891212-1901725";
		String year = civilCode.substring(0,2) ;
		String month = civilCode.substring(2,4) ;
		String day = civilCode.substring(4,6);
		
		System.out.println(year+"년 "+month+"월 "+day+"일생");
		/*
		  # 특정한 구분자를 통해서 데이터를 구분하여 추출하는 형식 split
		  1. 기본형식
		  	String[] data = 문자열.split("구분자");
		  	특정한 구분자를 기준해서 문자열데이터를 만드는 메서드이다.
		 */
		String []fruits ="사과&바나나&딸기".split("&");
		System.out.println("# 과일종류 #");
		for(String fruit:fruits) {
			System.out.print(fruit+" ");
		}
		System.out.println("\n");
		
//		ex) 서울-대전-대구-광주-제주
		String []loc ="서울-대전-대구-광주-제주".split("-");
		System.out.println("# 지역이름 #");
		for(String l:loc) {
			System.out.print(l + " ");
		}
		System.out.println("\n");
//		ex) 홍길동&70&80-김길동&90&85-신길동&95&75
//		
//			홍길동	70		80
//			김길동	90		85
//			신길동	95		75
		
		String[] stds = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
		System.out.println("이름\t점수1\t점수2");
//		for(int idx=0; idx<stds.length; idx++) {
		for(String std:stds) {
			String[] scor = std.split("&");
			for(String sc:scor) {
				System.out.print(sc + "\t");
			}
			System.out.println();
		}
	}

}
