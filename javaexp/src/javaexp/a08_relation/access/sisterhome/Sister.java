package javaexp.a08_relation.access.sisterhome;

import javaexp.a08_relation.access.ourhome.Father;

public class Sister extends Father {
	
	void callFatherInfo() {
		Father fa = new Father();
//		System.out.println("private: " + fa.fatherSec);
//		System.out.println("default: " + fa.a);
//		System.out.println("protected: " + fa.famSec);
				// protected 접근제어자를 사용했더라도, 객체생성을 통한 접근은 불가능 하다.
		System.out.println("public: " + fa.ann);
	}
	
	void callFatherInfo2() {
//		System.out.println("private: " + fatherSec);
//		System.out.println("default: " + a);
		System.out.println("protected: " + famSec);		
				// 다른 패키지여도 상속관계에서는 접근할 수 있는 protected
		System.out.println("public: " + ann);
	}
		public static void main(String[] args) {
			Sister sis = new Sister();
			sis.callFatherInfo();
			sis.callFatherInfo2();
		}
}
