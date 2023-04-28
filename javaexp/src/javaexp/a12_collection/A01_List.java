package javaexp.a12_collection;

import java.util.ArrayList;

public class A01_List {

	public static void main(String[] args) {
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