package javaexp.a08_relation.access.ourhome;

public class Brother {
	
	void showPlan(){
		Mine me = new Mine();
		System.out.println(me.plan);
//		me.mySecret = "";	
		me.callMySecret();
	}
	public static void main(String[] args) {
		Brother bro = new Brother();
		bro.showPlan();
	}
	
}
