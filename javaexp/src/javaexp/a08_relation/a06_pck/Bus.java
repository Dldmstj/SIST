package javaexp.a08_relation.a06_pck;

public class Bus {
	
	private String driver;		
		// 외부 클래스에서 접근 불가. 직접 접근도 불가.
	
	public int no;
	String target;
	
	public Bus() {}
	
	public Bus(String target, int no, String driver) {
		this.target = target;
		this.no = no;
		this.driver = driver;
	}
	// private 접근제어자가 있어도, 
//	생성자를 public으로 선언하면 간접적으로 driver에 접근할 수 있다.
	
	Bus(int no) {
		this.no = no;
	}

	public Bus(String target, int no) {
		this.target = target;
		this.no = no;
	}

	public void callInfo() {
		System.out.println("버스번호: " +no);
		System.out.println("목적지: " +target);
		System.out.println("버스기사: " +driver);
		// 접근이 되는 기능 메서드를 통해서 driver의 내용 호출
	}
	
}
