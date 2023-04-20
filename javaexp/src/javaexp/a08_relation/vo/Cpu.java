package javaexp.a08_relation.vo;

// ex 1) 1대1관계
//	Cpu 클래스에 제조사, 사양, showInfo() 선언

public class Cpu {
	private String comp;	// 제조사
	private String sp;		// 사양
	
	public Cpu() {}
	
	public Cpu(String comp, String sp) {
		this.comp = comp;
		this.sp = sp;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	
	public void showInfo() {
			System.out.println("제조사: " + comp);
			System.out.println("사양: " + sp);
	}
	
	
}
