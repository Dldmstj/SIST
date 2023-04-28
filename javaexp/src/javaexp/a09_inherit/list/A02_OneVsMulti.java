package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A02_OneVsMulti {

	public static void main(String[] args) {
		/*
		 # 실제 처리할 객체에서 다형성 처리로 등록, 전체 리스트 확인
		 1. 포함될 클래스
			  1) 상위 (Part)
			  2) 하위 (Cpu,Ram,Ssd)
		 2. 포함할 클래스
		 	class Computer{
		 		String company
		 		ArrayList<Part> plist;
		 		void addPart(Part part)
		 			plist.add(part)
		 		void showAllParts()
		 			컴퓨터종류 : company
		 			for(Part p:plist){
		 				p.showAll();
		 			}
		 	}
		 */
		Computer com1 = new Computer("맥북");
		com1.addPart(new Cpu());
		com1.addPart(new Ram());
		com1.addPart(new Ssd());
		com1.addPart(new Graphic());
		com1.addPart(new PowerSupplier());
		com1.showAllInfo();
	}
}
class PowerSupplier extends Part {

	public PowerSupplier() {
		super("파워서플라이","600W");
	}

	@Override
	void showInfo() {
		super.showInfo();
	}
}

class Graphic extends Part{

	public Graphic() {
		super("그래픽카드", "128bit");
	}

	@Override
	void showInfo() {
		super.showInfo();
	}
}

class Computer{
	private String kind;
	private ArrayList<Part> plist;
	
	public Computer() {}
	public Computer(String kind) {
		this.kind = kind;
		plist = new ArrayList<Part>();
		// 생성자를 만들 때, 부품 리스트 객체생성
	}
	
	public void addPart(Part part) {
		plist.add(part);
		System.out.println(kind + " 에 " + part.getName()+"를 추가합니다.");
	}
	
	public void showAllInfo() {
		System.out.println(kind+" 컴퓨터 부품리스트");
		for(Part p:plist) {
			if (p != null) {
				p.showInfo();
			}else {
				System.out.println("부품이 없네요!");
			}
		}
	
	}
}