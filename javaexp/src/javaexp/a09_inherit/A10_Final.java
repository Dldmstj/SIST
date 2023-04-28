package javaexp.a09_inherit;

public class A10_Final {

	public static void main(String[] args) {
		/*
		 1. 필드에서 final
		 	객체단위 final : 하나의 클래스에서 생성되는 여러개의 객체에, 객체별로 변경하지 않는 상수
		 		class Person{
//		 			static final String KIND ="황인";
		 			final String name;
		 			Person(String name){
		 				this.name = name;
		 			}
		 		}
		 		Person.KIND;			// static이기 때문에 객체의 생성없이 호출할 수는 있으나,
		 		Person.KIND = "백인";		// final이기 때문에 변경할 수 없음
		 		Person p1 = new Person("홍길동");
		 		Person p2 = new Person("김길동");		// 객체별로 초기화는 가능하나
		 		p1.name="오길동";		// 한 번 할당된 데이터는 변경할 수 없음 (final)
		 		p2.name="마길동";
		 		
		 	객체공유 클래스 final
		 	
		 2. class명 앞에 final	: 상속을 할 수 없는 class
		 3. 메서드명 앞에 final		: 하위클래스에서 재정의할 수 없는 메서드
		  
		 */
	}
}
final class Riger {}
//class NewSpec extends Riger{}	 => final 으로 선언된 클래스는 상속할 수 없음
class Book{
	void showPrice() {}
	final void showAll() {
		System.out.println("책 정보 보여주기");
	}
}
class SubBook extends Book{

	@Override
//	void showAll() {	super.showPrice();	}		// 상위 클래스에서 final로 선언되어 오버라이딩 불가
	void showPrice() {	super.showPrice();	}		// 오버라이딩 가능
	
}