package javaexp.a08_relation.access.story2.woodhome;

public class Daughter extends WoodCutter {
	// 상속 + 같은 패키지에 있는 클래스는 private이외에 접근 가능
	// 객체 생성과 상속으로 사용
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
//		System.out.println("private: " + wc.privSec);
		System.out.println("default: " + wc.ourHomeSec);
		System.out.println("protected: " + wc.inferitSec);
		System.out.println("public: " + wc.announce);
	}
}
