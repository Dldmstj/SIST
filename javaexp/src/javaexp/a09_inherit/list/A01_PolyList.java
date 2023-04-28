package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A01_PolyList {

	public static void main(String[] args) {
		/*
		  # 다형성 구조의 ArrayList 할당 처리
		  1. 1:다 관계구조의 다형성을 ArrayList를 상위로 하여
		  2. 여러가지 추가되는 다형성 객체들을 할당하고,
		  3. 재정의된 메서드를 호출하여 처리하는 형식을 말함.
		  4. 기본 형식 및 순서
		  	1) 상위 클래스 선언
		  	2) 추가하는 하위 클래스 선언
		  	3) 호출하는 곳에서
		  		ArrayList<하위클래스> list = new ArrayList<하위클래스>();
		  		list.add(new 하위클래스());
		  		list.add(new 하위클래스());
		  	4) 반복문을 통해 재정의된 메서드로 각각의 기능을 처리하는 내용을 확인할 수 있다.
			  		for(하위클래스 참조변수명 : list){
			  			하위 객체의 재정의 메서드 호출;
			  		}
		 */
		ArrayList<Duck> dlist = new ArrayList<Duck>();
		dlist.add(new NomalDuck());
		dlist.add(new RubberDuck());
		dlist.add(new Mallard());
		for(Duck d : dlist) {
			d.swimming();
		}
		
		System.out.println();
		
		ArrayList<Part> plist = new ArrayList<Part>();
		plist.add(new Cpu());
		plist.add(new Ram());
		plist.add(new Ssd());
		for(Part p : plist) {
			p.get();
		}
	}
	
//	ex) Part 클래스 하위 Cpu, Ram, Ssd 생성
//		위 ArrayList<Part>에 담아 재정의된 메서드로 호출
}


class Part{
	protected String name;
	protected String spec;
	
	public Part(String name, String spec) {
		this.name = name;
		this.spec = spec;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public void get() {
		System.out.println(name + "을 장착합니다.");
	}
	void showInfo() {
		System.out.println("부품명: " + name);
		System.out.println("사양: " + spec);
	}
	
}
class Cpu extends Part{

	public Cpu() {
		super("cpu", "i7");
	}

	@Override
	public void get() {
		super.get();
		System.out.println(this.spec + "성능의 cpu 장착완료");
	}
	
	
}
class Ram extends Part{

	public Ram() {
		super("ram", "256G");
	}
	@Override
	public void get() {
		super.get();
		System.out.println(this.spec + "성능의 ram 장착완료");
	}
}
class Ssd extends Part{

	public Ssd() {
		super("ssd", "?");
	}
	@Override
	public void get() {
		super.get();
		System.out.println(this.spec + "성능의 ssd 장착완료");
	}
}


class Duck{
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	public void swimming(){
		System.out.println(kind + "가 수영을 한다!");
	}
}
class NomalDuck extends Duck{
	public NomalDuck() {
		super("집오리");
	}

	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 앞 호수에서 즐겁게 수영하는 중~");
	}
	
}
class RubberDuck extends Duck{
	public RubberDuck() {
		super("고무오리");
	}
	
	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 목욕탕에서 아이들과 함께 수영하는 중~");
	}
}
class Mallard extends Duck{
	public Mallard() {
		super("청둥오리");
	}
	
	@Override
	public void swimming() {
		super.swimming();
		System.out.println("집 목욕탕에서 아이들과 함께 수영하는 중~");
	}
}