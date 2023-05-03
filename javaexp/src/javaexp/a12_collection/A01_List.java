package javaexp.a12_collection;

import java.util.ArrayList;
import java.util.List;

public class A01_List {
	/*
	  # List 컬렉션
	   1. 특징
	   		1) 인덱스로 관리
	   		2) 중복해서 객체 저장 가능
	   2. 구현 실제 클래스
	   		ArrayList
	   		Vector
	   		LinkedList
	   3. 공통 메서드
	   		1) boolean add(추가할 객체): 제일 마지막에 추가
	   		2) void add(int index, 추가 객체): 특정한 위치에 추가
	   		3) set(int index, 변경할 객체)
	   		4) boolean contains(요소객체): 요소객체 있는지 여부
	   		5) get(int index): 특정 위치에 있는 요소 객체 가져오기
	   		^) boolean isEmpty(): 컬렉션이 비어있는지 확인
	   		7) int size(): 크기
	   		8) void clear(): 포함된 모든 객체 삭제
	   		9) remove(int index): 해당 위치의 객체 삭제
	   		10) boolean remove(Object o): 주어진 객체 삭제
	 */

	public static void main(String[] args) {
		
//		ex) List<String>형태로 회원 3명의 아이디를 추가하고
//			1) 특정 회원을 1번째 위치에 추가,
//			2) 2번째 특정 회원을 변경 처리
//			3) "himan" 이 있는지 확인
//			4) 마지막 회원을 삭제처리
//			5) 전체 회원 리스트 출력
		
		List<String> memList = new ArrayList<String>();
		memList.add("짱구");
		memList.add("철수");
		memList.add("맹구");
		memList.set(2, "훈이");
		if(memList.contains("himan")) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		memList.remove(memList.size()-1);
		for(String m:memList) {
			System.out.println(m);
		}
		System.out.println();
		
		List<String> flist = new ArrayList<String>();
		flist.add("사과");
		flist.add("수박");
		flist.add("참외");
		flist.add(0,"오렌지");
		flist.set(1, "키위");
		System.out.println("있는지 여부: " + flist.contains("키위"));
		if(!flist.isEmpty()) {
			System.out.println("리스트의 크기는: " + flist.size());
		}else {
			System.out.println("리스트 비어있음.");
		}
		flist.remove(1);
		System.out.println("현재 데이터 내용");
		for(int i=0; i<flist.size(); i++) {
			System.out.println(i+1+")" +flist.get(i));
		}
		flist.clear();
		System.out.println("리스트가 비어있나요? " + flist.isEmpty());
		
		System.out.println();
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("홍길동",25,"서울"));
		plist.add(new Person("김길동",27,"부산"));
		plist.add(new Person("신길동",30,"대구"));
		plist.add(new Person("오길동",31,"광주"));
		plist.add(new Person("마길동",20,"제주"));
		
		Person p1 = plist.get(1);
		
		System.out.println("두번째 객체의 이름: " + p1.getName() );
		System.out.println("다섯번째 객체의 이름: " + plist.get(4).getName() );
		
		System.out.println();
		
		System.out.println("이름\t나이\t거주지");
		for(Person per: plist) {
			System.out.print(per.getName()+ "\t");
			System.out.print(per.getAge()+ "\t");
			System.out.print(per.getLoc()+ "\n");
		}
		System.out.println();
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,1,"짱구",60));
		slist.add(new Student(2,5,"철수",100));
		slist.add(new Student(3,10,"맹구",80));
		
		Student std1 = slist.get(0);
		Student std2 = slist.get(1);
		Student std3 = slist.get(2);
		
		System.out.println("학생 리스트의 길이: " + slist.size());
		System.out.println("마지막 객체의 이름: " + std3.getSname());
		System.out.println("첫번째 객체의 점수: " + std1.getScore());
		
		System.out.println();
		
		System.out.println("반\t번호\t이름\t점수");
		for(Student std: slist) {
			System.out.print(std.getBan()+"\t");
			System.out.print(std.getSnum()+"\t");
			System.out.print(std.getSname()+"\t");
			System.out.print(std.getScore()+"\n");
		}
	}

}

//	ex) Student class / 필드: 반, 번호, 이름, 점수 => ArrayList에 할당
//		3개 할당한 후, 마지막 객체의 이름 호출, 첫번째 객체의 점수 호출

class Student{
	private int ban;
	private int snum;
	private String sname;
	private int score;
	
	public Student() {}

	public Student(int ban, int snum, String sname, int score) {
		this.ban = ban;
		this.snum = snum;
		this.sname = sname;
		this.score = score;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

class Person{
	private String name;
	private int age;
	private String loc;
	
	public Person() {}
	
	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}