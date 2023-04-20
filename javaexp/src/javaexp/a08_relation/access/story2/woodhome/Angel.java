package javaexp.a08_relation.access.story2.woodhome;

public class Angel {
	
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
//		System.out.println("private: " + wc.privSec);
		// 같은 패키지이므로p private만 접근 불가
		
		System.out.println("default: " + wc.ourHomeSec);
		System.out.println("protected: " + wc.inferitSec);
		System.out.println("public: " + wc.announce);
	}

}
