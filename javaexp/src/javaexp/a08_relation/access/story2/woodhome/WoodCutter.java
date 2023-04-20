package javaexp.a08_relation.access.story2.woodhome;

public class WoodCutter {
	
	private String privSec ="";
	String ourHomeSec = "";
	protected String inferitSec = "";
	public String announce ="우리 막내딸이 5월에 신부가 됩니다!";
	
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
		System.out.println("private: " + wc.privSec);
		System.out.println("default: " + wc.ourHomeSec);
		System.out.println("protected: " + wc.inferitSec);
		System.out.println("public: " + wc.announce);
	}

}
