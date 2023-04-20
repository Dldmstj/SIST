package javaexp.a08_relation.vo;

public class Man {
	private String mname;
	private int age;
	private String job;
	private Woman woman;
	
	public Man() {}
	
	public Man(String mname, int age, String job) {
		this.mname = mname;
		this.age = age;
		this.job = job;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	/*
	 * public void showInfo() {
	 * 
	 * System.out.println("이름": " + mname); System.out.println("이름": " + mname);
	 * System.out.println("이름": " + mname); }
	 */
	
}
