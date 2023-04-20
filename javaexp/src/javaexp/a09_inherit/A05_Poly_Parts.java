package javaexp.a09_inherit;

public class A05_Poly_Parts {
	
	public static void main(String[] args) {
		Computer com1 = new Computer("삼성");
		com1.showPartsInfo();
		com1.addPart(new Cpu("i7"));
		com1.addPart(new Ram("8G"));
		com1.showPartsInfo();
		
		
	}
}
class Part{
	private String kind;
	private String spec;

	public Part(String kind, String spec) {
		this.kind = kind;
		this.spec = spec;
	}
	public void showInfo() {
		System.out.println("# 부품정보 #");
		System.out.println("부품명: " + kind);
		System.out.println("사양: " + spec);
	}
}


class Cpu extends Part{

	public Cpu(String spec) {
		super("cpu", spec);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CPU는 컴퓨터의 핵심 부품으로, 중앙처리를 한다.");
	}
	
}


class Ssd extends Part{

	public Ssd(String spec) {
		super("ssd", spec);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("ssd");
	}
	
}
class Ram extends Part{
	
	public Ram(String spec) {
		super("ram", spec);
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Ram 메모리는 컴퓨터의 휘발성 메모리를 처리한다.");
	}
	
}
class Computer{
	private String company;
	private Part part;

	public Computer(String company) {
		this.company = company;
	}
	
	public void addPart(Part part) {
		this.part = part;
		System.out.println("부품이 장착되었습니다.");
	}
	public void showPartsInfo() {
		System.out.println(company+" 컴퓨터.");
		if(part!= null) {
			part.showInfo();
		}else {
			System.out.println("부품이 장착되지 않았습니다.");
		}
	}
	
	
}