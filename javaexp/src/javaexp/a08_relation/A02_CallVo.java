package javaexp.a08_relation;

import javaexp.a08_relation.vo.Music;
import javaexp.a08_relation.vo.Person;

public class A02_CallVo {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동",25,"부산");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getLoc());
		
		Music ms1 = new Music("Fix you","Coldplay",2005);
		System.out.println(ms1.getTitle());
		System.out.println(ms1.getSinger());
		System.out.println(ms1.getYear());
		
	}

}
