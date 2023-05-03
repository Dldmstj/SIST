package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Map;

public class A03_Map {

	public static void main(String[] args) {
		/*
		  # Map 컬렉션의 특징 및 주요 메소드
		  	1. 특징
		  		- 키와 값으로 구성된 Map.Entry객체를 저장하는 구조
		  		- 키와 값은 모두 객체
		  		- 키는 중복될 수 없지만, 값은 중복하여 저장할 수 있다.
		  			// ex) 학번-이름, 주민번호-이름
		  	2. 구현 클래스
		  		HashMap, HashTable, LinkedHashMap, Properties, TreeMap
		  	3. 주요 메소드
		  		put(keym value): 주어진 키와 값을 추가, 저장이 되는 값을 리턴
		  		containsKey(Object key): 주어진 키가 있는지 여부
		  		containsValue(Object val): 주어진 값이 있는지 여부
		  		Set<Map.Entry<K,V>> entrySet()
		  			키와 값의 쌍으로 구성된 모든 Map.Entry객체를 Set에 담아서 리턴
		  		V get(Object key): 컬렉션에 있는 데이터를 가져온다.
		  		keySet(): 모든 키를 Set객체에 담아서 리턴
		  		size():저장된 크기
		  		clear(): 전체 삭제
		  		remove(Object key): 해당 키의 구성데이터 삭제
		 */
//		문자열 key, 문자열 value로 설정 map 선언과 할당.
		Map<String,String> map01 = new HashMap<String, String>();
		map01.put("1001", "홍길동");
		map01.put("1001", "김길동");	// key 중복
		map01.put("1002", "신길동");
		map01.put("1003", "신길동");	// value 중복
		
		for(String key:map01.keySet()) {	// map01.keySet() 키를 Set객체로 가져오는 메소드
			System.out.print(key+"\t");
			// .get(key): 해당 key에 대한 값을 가져온다.
			System.out.print(map01.get(key)+"\n");
		}
		// key는 중복되지 않으나, value는 중복되어 가져올 수 있음.
		// key의 중복은 최종으로 입력된 것을 기준으로 처리된다.
		System.out.println();
		
//		ex) 물건명과 가격을 key-value로 설정하여 Map 에 할당.
		Map<String,Integer> prd = new HashMap<String, Integer>();
		// Integer i = 3000; 	autoBoxing
		// int num = i; 		autoUnBoxing
		prd.put("딸기", 2000);
		prd.put("딸기", 3000);	// key 중복
		prd.put("포도", 5000);
		prd.put("사과", 5000);	// value 중복
		
		System.out.println("# 물건 가격 #");
		for(String key:prd.keySet()) {
			System.out.print(key+"\t");
			System.out.print(prd.get(key)+"원\n");
		}
		/*
		// 키, 값 형식으로 처리되기에 사용자 정의 클래스를 통한 객체도 키/객체 형식으로 할당할 수 있다.
		 1. 처리순서
		 	1) 사용자 정의 클래스 정의
		 	2) key/객체 형식으로 추가 처리
		 	3) 반복문을 통한 객체의 속성값 호출
		 2. 예제
		 	학생 번호를 key로 하여 학생 클래스를 정의하고, 해당 학생 객체를 key에 할당하여 처리하자.
		 */
		Map<Integer, StudentMap> stdMap = new HashMap<Integer,StudentMap>();
		stdMap.put(1000, new StudentMap("짱구", 70, 80, 60));
		stdMap.put(1001, new StudentMap("훈이", 70, 60, 40));
		stdMap.put(1002, new StudentMap("맹구", 80, 80, 90));
		stdMap.put(1002, new StudentMap("철수", 100, 100, 90));
		stdMap.put(1002, new StudentMap("유리", 70, 80, 70));
		System.out.println("\t\t국어\t영어\t수학");
		for(int stdno: stdMap.keySet()) {
			StudentMap std = stdMap.get(stdno);
			System.out.print("학번: " + stdno +" ");
			System.out.print(std.getName() +"\t");
			System.out.print(std.getKor() +"\t");
			System.out.print(std.getEng() +"\t");
			System.out.print(std.getMath() +"\n");
		}
		System.out.println();
		
//		ex) 물건의 serialno를 key로 하여 Product클래스를 만들어 Map으로 할당, 출력하세요
		Map<Long,ProductMap> prdMap = new HashMap<Long,ProductMap>();
		prdMap.put(1001l, new ProductMap("감자", 3000));
		prdMap.put(1002l, new ProductMap("고구마", 2000));
		prdMap.put(1003l, new ProductMap("옥수수", 5000));
		prdMap.put(1004l, new ProductMap("토마토", 8000));
		System.out.println("상품번호\t제품명\t가격");
		for(long serNo:prdMap.keySet()) {
			ProductMap prd1 = prdMap.get(serNo);
			System.out.print(serNo+"\t");
			System.out.print(prd1.getPname()+"\t");
			System.out.println(prd1.getPrice());
		}
	}
}
class ProductMap{
//	private int serialNo;
	private String pname;
	private int price;
	public ProductMap(String pname, int price) {
		this.pname = pname;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

class StudentMap{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public StudentMap(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
}