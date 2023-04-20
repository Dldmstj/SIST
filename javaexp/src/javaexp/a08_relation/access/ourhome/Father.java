package javaexp.a08_relation.access.ourhome;

public class Father {
	private String fatherSec="비상금 위치";
	String a ="머쓰지";
	protected String famSec ="삼촌한텐 비밀~";
	public String ann = "동네방네 소문내기";
	
	void callFatherInfo() {
		Father fa = new Father();
		System.out.println("private: " + fa.fatherSec);
		System.out.println("default: " + fa.a);
		System.out.println("protected: " + fa.famSec);
		System.out.println("public: " + fa.ann);
	}
	
	void callFatherInfo2() {
		System.out.println("private: " + fatherSec);
		System.out.println("default: " + a);
		System.out.println("protected: " + famSec);
		System.out.println("public: " + ann);
	}
	
	/*
	 * void showPlan(){ Mine me = new Mine(); System.out.println(me.plan); }
	 */
}
