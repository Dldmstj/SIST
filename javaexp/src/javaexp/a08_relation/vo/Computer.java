package javaexp.a08_relation.vo;

public class Computer {
	
	public static void main(String[] args) {
		Cpu cpu1 = new Cpu("인텔","i7");
		Computer com1 = new Computer("samsung");
		Ram ram1 = new Ram(256);
		com1.addCpu(cpu1);
		com1.showCom();
		com1.addRam(ram1);
		com1.showCom();
	}
	
	private Cpu cpu;
	private String kind;
	private Ram ram;
	
	public Computer() {}
	
	public Computer(String kind) {
		this.kind = kind;
	}
	
	// com.addCpu(new Cpu("AMD","6core"));
	public void addCpu(Cpu cpu) {
		this.cpu = cpu;
		System.out.println(cpu.getSp() + " 사양의 cpu 장착");
	}
	public void addRam(Ram ram) {
		this.ram = ram;
		System.out.println(ram.getSize() + "용량의 ram 장착");
	}
	public void showCom() {
		System.out.println(kind+ "컴퓨터의 부품 정보");
		if(this.cpu == null || this.ram == null) {
			System.out.println("부품이 모두 조립되지 않았습니다.");
		}else {
			cpu.showInfo();
			ram.showInfo();
			
		}
		// ram 메모리 여부 확인해서 ram정보 출력
	}
}
