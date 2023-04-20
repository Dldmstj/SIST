package javaexp.a08_relation.vo;

public class Score {
	private int no;		// 학생 번호
	private String sname;		// 학생 이름
	private int kor;		// 국어점수
	private int eng;		// 영어점수
	private int math;		// 수학점수
	
	
	public Score() {}
	
	public Score(int no, String sname, int kor, int eng, int math) {
		this.no = no;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
