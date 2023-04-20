package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Father;
import javaexp.a08_relation.access.ourhome.Mine;

public class Uncle {
	
	
	void callFatherInfo() {
		Father fa = new Father();
//		System.out.println("private: " + fa.fatherSec);
//		System.out.println("default: " + fa.a);
//		System.out.println("protected: " + fa.famSec);
		System.out.println("public: " + fa.ann);
				// Father 클래스에 public 으로 선언된 변수에만 객체 생성 후, 접근할 수 있다. 
	}
	
	// 상속관계에서만 사용할 수 있기 때문에 전부 사용 불가.
	void callFatherInfo2() {
//		System.out.println("private: " + fatherSec);
//		System.out.println("default: " + a);
//		System.out.println("protected: " + famSec);
//		System.out.println("public: " + ann);
	}
	public static void main(String[] args) {
		Uncle un = new Uncle();
		un.callFatherInfo();
		un.callFatherInfo2();
	}
	
	/*
	 * void showPlan(){ Mine me = new Mine(); // System.out.println(me.plan); }
	 */

}
