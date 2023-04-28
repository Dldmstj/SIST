package javaexp.a08_relation.access.story2.woodhome;

public class WoodCutter {
	/*
	  # 클래스 선언과 접근 제어자
	  1. public class 클래스명
	  	클래스 명으로 객체를 선언할 때, 외부 패키지에서 접근 가능을 확인하는 부분
	  	1) 같은 패키지에서 호출하는 경우
	  		class 클래스명
	  		클래스명 참조명;	(o)
	  	2) 외부 패키지에서 호출하는 경우
	  	 	import 패키지명.클래스명;
	  	 	클래스명 클래스명;
	  	 	위에 클래스명 선언시 public이어야만 가능하다. 혹, public을 생략할 경우에는 호출할 수 없다.
	  	 ex)
	  	 	class Person{}
	  	 	같은 패키지인 경우 : Person p1;	(o)
	  	 	외부 패키지인 경우 : Person p1; 	(o)
	  	 		// import를 전제조건으로. import하지 않을 때는 패키지명.클래스명 참조명;
	  	 # class 선언 관련해서 접근제어자는 객체의 선언에 영향을 미친다.
	  	 	주의) 이 접근제어자가 통과되지 않을 때는 하위 종속된 필드, 생성자, 메서드 등의 접근범위가 public이더라도 접근할 수 없다.
	  	 	
	  	2. 생성자에 대한 접근 제한
	  		0) 위 선언 접근제어자가 접근 범위에 있을 때를 전제 조건으로 한다.
	  		1) 생성자가 선언되지 않을 때는 기본 접근 제한자가 public으로 설정되어 있어서 외부 패키지에서도 접근이 가능하다.
	  			public class Person{
	  				
	  			}
	  			Person p1 = new Person(); 	외부 패키지에서 생성자를 호출할 수 있는 이유는, 
	  					위 Person클래스 안에 default생성자 public Person(){}이 포함되어 있기 때문이다.
	  					
	  		2) 생성자가 명시적 default 접근제어자 일 때,
	  		 	Person(){}
	  		 	
	  		 	같은 패키지일 때
		  		 	Person p1; (o)
		  		 	p1 = new Person(); (o)
	  		 	
	  		 	다른 패키지일 때
		  		 	Person p1;	(o), 전제조건인 public class Person이기에 선언까지 가능
		  		 	p1 = new Person();	(x)
	 */
	
	// 접근제어자의 목적은 자바프로그램의 은닉성
	// 기타 참조변수.필드, 참조변서.메서드는 아래의 내용에 따라 접근된다.
	// ex) wc.privSec; 		wc.outHomeSec;
	private String privSec ="개인적인 비밀";
	String ourHomeSec = "우리 가족이 사용할 돈은 뒷마당 장독 안에 있지!";
	protected String inferitSec = "상속할 재산 배분 내용";
	// 상속으로 사용될 때, 외부 패키지에서 호출가능
	// 주의) 상속이 아니고, 객체생성 참조변수로 사용할 때는 외부 패키지에서 접근할 수 없다.
	public String announce ="우리 막내딸이 5월에 신부가 됩니다!";
	
	public void callWoodInfo(){
		WoodCutter wc = new WoodCutter();
		System.out.println("private: " + wc.privSec);
		System.out.println("default: " + wc.ourHomeSec);
		System.out.println("protected: " + wc.inferitSec);
		System.out.println("public: " + wc.announce);
	}

}
