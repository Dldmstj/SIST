package javaexp.a08_relation.vo;

public class Matching {

	public static void main(String[] args) {

	//	Man m1 = new Man("",0,"");		// 남자1명 m1 에 할당.
		Woman w1 = new Woman("",0,"");		// 여자1명 w1 에 할당.
		
		Matching match = new Matching(w1);		// 여자 남자 x null
		
		

		
	}

	private Man man;
	private Woman woman;
	
	public Matching() {}
	
	public Matching(Woman woman) {
		this.woman = woman;
	}
	
	public Matching(Man man, Woman woman) {
		this.man = man;
		this.woman = woman;
	}

}
