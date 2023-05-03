package javaexp.y01_review;

import java.util.ArrayList;

public class A04_ArrayList {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student("20060201","홍길동",80,1,19,90,80));
		slist.add(new Student("20060203","김길동",80,1,18,90,80));
		slist.add(new Student("20060204","신길동",80,1,17,90,80));
		// 하나의 객체 가져오기
		Student std = slist.get(0);
		System.out.println("이름:" + std.getName());
		System.out.println("총점:" + std.totPoint());
		System.out.println("학점:" + std.getStuGrade());
		for(Student st:slist) {
			System.out.print(st.getName()+"\t");
			System.out.print(st.totPoint()+"\t");
			System.out.println(st.getStuGrade());
		}
	}
}
/*
#  ArrayList #
1. 개념: 데이터를 나열해서 처리하는 것은 배열이라는 개념주터 시작되었다. 객체형으로 배열의 관계인 동적을
추가/각제;/변경을 지원하는 것으로, 선형구조로 하나씩 추가할 수 있는 구조를 말한다.
2) 기본 사용
	1) 생성
		ArrayList<타입> 참조변수 = new ArrayList<타입>();
		ex) ArrayList<Student> stList = new ArrayList<Student>;
		ex) ArrayList<Member> mtList = new ArrayList<Member>;
		ex) ArrayList<product> ptList = new ArrayList<product>;
	2)메서드
		stList.add(추가할 객체);
		stList.get(index 번호);
		stList.add);	// 크기
		ex) stList.add(new Student("홍길동", 40,80,90));
			Student st = stList.get(0);
		
3. 처리 순서(ArrayList)
	1) 보통 2차원의 데이터(Excel 데이터를 한 개 row기준으로 데이터유형과 크기에 맞게 하나의 vo 객체를 생성
	2. class XXX{}로 선언되면, 생성자의 getter/setter메서드 생서
	3) 위 내용을 행단위 데이터를 객체 generic 타입으로 선언과 생성
		ArrayList<XXX> slist = new ArrayList<XXX>();
	4) 그외 ArrayList 메소드를 이용하여 추가, 가져오기, for문 처리 등을 한다;.
		slist.add(new @@@());
		@@@@ s = slist.get(idx);
		slist.size() 크기 가져오기
4.
	1) 학생 점수 리스트
	2) 회원 정보 리스트
	3) 물건 정보 리스트

*/
class Student{
	private String stNo;	// 고정된 고유 번호는 문자로 할 때도 있다.
	private String name;
	private int homePt;
	private int absPt;
	private int attPt;
	private int midTst;
	private int lstTst;
	
	public Student(String stNo, String name, int homePt, int absPt, int attPt, int midTst, int lstTst) {
		this.stNo = stNo;
		this.name = name;
		this.homePt = homePt;
		this.absPt = absPt;
		this.attPt = attPt;
		this.midTst = midTst;
		this.lstTst = lstTst;
	}
	public String getStNo() {
		return stNo;
	}
	public void setStNo(String stNo) {
		this.stNo = stNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHomePt() {
		return homePt;
	}
	public void setHomePt(int homePt) {
		this.homePt = homePt;
	}
	public int getAbsPt() {
		return absPt;
	}
	public void setAbsPt(int absPt) {
		this.absPt = absPt;
	}
	public int getAttPt() {
		return attPt;
	}
	public void setAttPt(int attPt) {
		this.attPt = attPt;
	}
	public int getMidTst() {
		return midTst;
	}
	public void setMidTst(int midTst) {
		this.midTst = midTst;
	}
	public int getLstTst() {
		return lstTst;
	}
	public void setLstTst(int lstTst) {
		this.lstTst = lstTst;
	}
	// 점수 처리 메소드
	public int totPoint() {
		// 출결점수 20% 반영, 과제점수 10% 반영, 시험점수 70%반영
		int attAll = (int)(attPt/(absPt+attPt)*20);
		int homePt = (int)(this.homePt*0.1);
		int avg = (int)((midTst + lstTst)/2*0.7);		// 70wja
		return attAll+homePt+avg;
	}
	public String getStuGrade() {
		String grade ="";
		if(totPoint()>=90) { grade = "A"; }
		else if(totPoint()>=80) { grade = "B"; }
		else if(totPoint()>=70) { grade = "C"; }
		else if(totPoint()>=60) { grade = "D"; }
		else { grade = "F"; }
		return grade;
	}
	
}