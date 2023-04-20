package javaexp.a08_relation.access.story1.friendship;

public class Deer {
	void callWoodCutterInfo() {
		WoodCutter wc = new WoodCutter();
		System.out.println("default 접근제어자: " + wc.hiddenDeer);
//		System.out.println("private 접근제어자: " + wc.hiddenCloth);
			// private 접근제어자는 같은 패키지 클래스에서도 접근할 수 없다.
	}
}
