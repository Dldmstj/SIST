package javaexp.a08_relation.vo;

public class Ram {
	private int size;

	public Ram() {}
	
	public Ram(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void showInfo() {
		
		System.out.println("용량: " + size);
	}
}
