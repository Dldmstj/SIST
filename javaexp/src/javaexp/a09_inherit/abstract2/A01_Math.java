package javaexp.a09_inherit.abstract2;

import java.util.ArrayList;

public class A01_Math {

	public static void main(String[] args) {
//		Robot r1 = new Robot("MZ");
//		r1.randomAttack();
//		r1.addWeapon(null);
	}

}
/*
	 # 1:다 관계 추상클래스
	 	1. 기본적으로 추상 클래스는 하나의 상위 클래스(Weapon)를 기준으로 여러가지 형태의 하위 클래스(Rocket, Missile,...)를 만들도록 하는 것.
	 		이것이 이를 이루는 다른 클래스에서 활용될 때, 해당 포함관계를 가진 클래스(Robot vs ArrayList<Weapon>)가 추상 클래스를 상속받는 하위 클래스가
	 		기능적으로 추가되어도 메인 클래스는 영향을 받지 않는 형태의 구조로 처리해야할 때 사용한다.
	 	2. 다음의 구조는 추상클래스를 활용한 1:다관계의 추상클래스 구조 중 하나이다.
	 		1) 메인 클래스 Robot을 두고, 이 로봇의 여러가지 종류를 필드로 설정
	 		2) 이 Robot이 사용하는 무기를 다양하게 구비할 수 있는 상위 Weapon을 선언,
	 			여러가지 무기를 추가 처리할 수 있는 1:다관계 필드를 선언할 수 있다.
	 			class Robot{
	 				private String kind;	로봇의 종류
	 				private ArrayList<Weapon> wlist;	무기의 종류
	 				void addWeapon(Weapon weapon){} 무기장착
	 				void showAllWeapon(){}	
	 			}
	 		3) 추상 클래스의 상위 Weapon 선언
	 			abstract class Weapon{
	 				private String wname;		// 무기 이름
	 				Weapon(String wname(){
	 					this.wname = wname;
	 				}
	 				void abstract Weapon(){		// 공통 메서드
	 					System.out.println(wname+" 장착하다.");
	 				}
	 				abstract void attack();		// 추상메서드 무기를 사용해서 공격하는 내용.
	 				
	 			}
	 		4) 추가되는 하위 실제 클래스
	 			class Rocket extends Weapon{
	 				void attack(){
	 					로켓포로 공격하다.
	 				}
	 			}
	 			class missile extends Weapon{
	 				void attack(){
	 					미사일로 공격하다.
	 				}
	 			}
	 	# 개발 순서
	 	1. 추상 클래스 만들기
	 	2. 추상 클래스를 상속받은 실제 클래스 만들기
	 	3. 1:다 관계 포함 클래스 만들기
	 	4. 메인 메소드에서 처리할 내용 확인
	 	5. 추상 클래스를 상속받은 실제 클래스 여러가지 형태 추가 및 메인 메소드에서 추가 처리내용 확인
*/
abstract class Weapon{
	private String kind;

	public Weapon(String kind) {
		this.kind = kind;
	}
	// 공통 메서드
	public void adapt(){
		System.out.println(kind+" 장착하다.");
	}
	public String getKind() {
		return kind;
	}
	// 추상 메소드
	public abstract void attack();
	
}
class Rocket extends Weapon{
	public Rocket() {
		super("로켓포");	// 상속관계에 있을 때, 상위 생성자 호출
	}
	
	@Override
	public void attack() {
		System.out.println(getKind() + ", 공격력 20으로 공격 시작.");
	}
}
class Robot{
	private String kind;
	private ArrayList<Weapon> wlist;
	// 생성시, 로봇의 종류와 물건 리스트를 추가할 수 있게 초기 생성
	public Robot(String kind, ArrayList<Weapon> wlist) {
		this.kind = kind;
		wlist = new ArrayList<Weapon>();
	}
	public void addWeapon(Weapon w) {
		wlist.add(w);	// list에 하나씩 무기를 추가
		System.out.print(kind+"로봇에");
		w.adapt();		// 무기 추가기능 공통 메서드 호출
	}
	public void showAllWeapon() {
		System.out.println(kind + " 로봇이 가진 무기들");
		for(Weapon wp:wlist) {
			System.out.println(wp.getKind());
		}
		System.out.println(wlist.size()+"개 무기 장칙");
	}
	public void randomAttack() {
		
		System.out.println(kind + "로봇이 가진 무기 중, 임의의 무기로 공격.");
		if(wlist.size()>0) {
			int ranIdx = (int)(Math.random()*wlist.size());
			wlist.get(ranIdx).attack();
		}else {
			checkWeapon();
		}
	}
	private void checkWeapon() {
		
	}
		
}