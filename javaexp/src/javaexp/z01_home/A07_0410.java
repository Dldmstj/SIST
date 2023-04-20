package javaexp.z01_home;

public class A07_0410 {

	public static void main(String[] args) {
//		[1단계:개념] 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
			/*
			  	1) 클래스
			  		사용자 정의 객체를 위한 선언 부분으로, 객체를 만들기 위한 틀 역할을 한다. (ex. 붕어빵 틀)
			  		
			  	2) 객체
			  		클래스를 통해 여러 개의 참조변수를 사용해서 객체를 생성할 수 있다.	(ex. 붕어빵)
			 */
		
//		[1단계:개념] 2. 필드의 특성을 예제를 통해 기술하세요
			/*
			  클래스 내의 전역변수로, 클래스의 모든 구성요소에 영향을 미친다.
			  	ex) class Person{
			  			String name;
			  			int age;
			  		}
			  지역변수와 전역변수가 동일할 때, 구분자(this.)와 같이 사용된다.
			  	ex) Person(String name, int age) {
			  			this.name = name;
			  			this.age = age;
			  		}
			  객체를 생성하면 각 객체마다 참조변수와 함께 필드명으로 사용이 가능하다.
				ex) // main() 내에서
					Person p1 = new Person();
					p1.name = "홍길동";
					Person p2 = new Person();
					p2.name = "김길동";
					
			  필드는 자동으로 초기화 되므로 객체를 생성하고 바로 사용할 수 있다.
				ex) Pererson p1= new Person();
					System.out.println(p1.age);
			  
			 */
//		[1단계:개념] 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
			/*
			  1) 생성자
			  	저장과 로직처리의 기능을 수행하지만 값을 반환하지는 않는다.
			  	객체가 생성될 때 필드의 초기값을 저장한다.
			  2) 메서드
			  	저장과 로직처리의 기능을 수행하고, 생성자와는 다르게 값을 리턴한다.
			  
			 */
//		[1단계:코드] 4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
//		기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
		Computer com1 = new Computer();	
		System.out.println(com1.comp +"\t"+ com1.cpu + "\t" + com1.ram + "\t" + com1.ssd);
		System.out.println();
		Computer com2 = new Computer("INTEL","i5",32);
		System.out.println(com2.comp +"\t"+ com2.cpu + "\t" + com2.ram + "\t" + com2.ssd);
		System.out.println();
		Computer com3 = new Computer("i7",16,2);
		System.out.println(com3.comp +"\t"+ com3.cpu + "\t" + com3.ram + "\t" + com3.ssd);
		System.out.println();
		
//		[1단계:개념] 5. html의 meta 정보의 의미를 기술하세요.
			/*
			  	메타 데이터: 데이터를 설명하는 데이터
			  	검색엔진을 위한 키워드 설정, 웹페이지에 대한 설명, 문서의 저작자 등을 정의할 때 사용한다.
			 */
		
//		[1단계:개념] 6. base 태그를 처리하는 방법을 예제를 통해서 기술하세요.
			/*
			  <head> 태그 내에 <base href="http://localhost:8080/frontWeb/a03/"/> 의 형태와 같이 작성한다.
			  <body> 태그 내에서 <a href="show.html">페이지 이동</a> 의 형태로 작성하면
			  "페이지 이동"의 링크 클릭 시에 http://localhost:8080/frontWeb/a03/show.html 로 페이지를 이동한다.
			  
			 */
		
//		[1단계:확인] 8. webapp 하위에 a00_img안에 img03.jpg를 복사해와서 현재 폴드에서 
//		      img 태그로 호출해서 수행 하는 것과,  a00_img하위  img05.jpg
//		      파일을 해당 경로 그대로 두고, img 태그로 호출해서 수행하는 것의 차이점을 기술하세요.
		
			/*
				코드에서 생략해서 /frontWeb로 처리 가능

			 */
	}

}

//		[1단계:코드] 4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
//				기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 객체를 생성하고 확인하세요.
class Computer{
	String comp;
	String cpu;
	int ram;
	int ssd;
	
	Computer(){
		System.out.println("기본 생성자 호출");
	}		// 기본 생성자
	Computer(String comp, String cpu, int ram){		// 매개변수가 3개인 생성자 (제조사, cpu, ram)
		this.comp = comp;
		this.cpu = cpu;
		this.ram = ram;
		System.out.println("제조사, cpu종류, ram용량 할당 생성자 호출");
		System.out.println("제조사\tcpu종류\tram용량\tssd용량");
	}
	Computer(String cpu, int ram, int ssd){		// 매개변수가 3개인 생성자 (cpu, ram, ssd)
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		System.out.println("cpu종류, ram용량, ssd용량 할당 생성자 호출");
		System.out.println("제조사\tcpu종류\tram용량\tssd용량");
	}
	
}