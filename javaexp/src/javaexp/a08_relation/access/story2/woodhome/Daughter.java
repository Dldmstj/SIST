package javaexp.a08_relation.access.story2.woodhome;

public class Daughter extends WoodCutter {
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
//		System.out.println("private: " + wc.privSec);
		System.out.println("default: " + wc.ourHomeSec);
		System.out.println("protected: " + wc.inferitSec);
		System.out.println("public: " + wc.announce);
	}
}
