package javaexp.z01_home;

public class A12_0419 {
//	2023-04-18
//	[1단계:조별] 1. 접근제어자에 이해와 구현
//	      1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
//	      2) 접근제어자에 맞게 구현할 수 있는가?
//	      3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
//	      4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//	         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//	         패키지2 : 당근, 양파
//	         패키지3 : 수박(참외상속)
//	         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//	[1단계:개념] 2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
//	[1단계:확인] 3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
//	[1단계:개념] 4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
//	[1단계:개념] 5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
//	[1단계:개념] 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.

	public static void main(String[] args) {

//		[1단계:조별] 1. 접근제어자에 이해와 구현
//		      1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
				/*
				  1) public : 외부패키지의 클래스에서도 접근가능
				  2) X (default) : 패키지가 같은 클래스에서 접근가능
				  3) protected : 상속관계에 있는 클래스에서만 사용할 수 있음. 외부패키지에서도 상속관계라면 접근 가능
				  4) private :	외부 클래스는 접근할 수 없음. (해당 클래스에서만 사용 가능)
				 */
		
//		      2) 접근제어자에 맞게 구현할 수 있는가?
				/*
					예.
				 */
				
		
//		      3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
		/*
		  1) 문제점
		  		: protected
		  				접근제어자를 사용하면 상속관계에서 사용할 수 있지만, default는 호출이 불가할 수 있다.
		  2) 원인
		  		: 외부패키지에 있는 경우 default 접근제어자는 호출 불가.
		 */
		
//		      4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         1) 패키지1/ 참외
//		package javaexp.a08_relation.access.pck3;
//
//		import javaexp.a08_relation.access.pck1.OrientalMelon;
//
//		public class WaterMelon extends OrientalMelon {
//
//			   public void fInfo1(){
//				      OrientalMelon f = new OrientalMelon();
////				      System.out.println("private:"+f.taste);
////				      System.out.println("default(X):"+f.price);
////				      System.out.println("protected:"+f.cnt);
//				   // Oriental 클래스에 public 으로 선언된 변수에만 "객체 생성 후" 접근할 수 있다. 
//				      System.out.println("public:"+f.store);
//				   }
//				   // 상속 클래스
//				   public void fInfo2(){
////				      System.out.println("private:"+taste);
////				      System.out.println("default(X):"+price);
//					   		// 외부 패키지에 있는 상속관계에서 protected와 public은 접근 가능
//				      System.out.println("protected:"+cnt);
//				      System.out.println("public:"+store);
//				   }
//		}

//						패키지1/ 사과, 바나나, 딸기
		
		
//						패키지1/ 멜론(참외상속)
//		package javaexp.a08_relation.access.pck1;
//
//		import javaexp.a08_relation.access.pck1.OrientalMelon;
//
//		public class Melon extends OrientalMelon {
//
//			   public void fInfo1(){
//				      OrientalMelon f = new OrientalMelon();
////				      System.out.println("private:"+f.taste);
//				      		// private, 직접적인 접근 불가
//				      System.out.println("default(X):"+f.price);
//				      System.out.println("protected:"+f.cnt);
//				      System.out.println("public:"+f.store);
//				   }
//				   // 상속 클래스
//				   public void fInfo2(){
////				      System.out.println("private:"+taste);
//					   		// private, 상속 관계에서도 직접적인 접근 불가
//				      System.out.println("default(X):"+price);
//				      System.out.println("protected:"+cnt);
//				      System.out.println("public:"+store);
//				   }
//		}

		
//		         2) 패키지2/ 당근, 양파
		
//		         3) 패키지3/ 수박(참외상속)
//		package javaexp.a08_relation.access.pck3;
//
//		import javaexp.a08_relation.access.pck1.OrientalMelon;
//
//		public class WaterMelon extends OrientalMelon {
//
//			   public void fInfo1(){
//				      OrientalMelon f = new OrientalMelon();
////				      System.out.println("private:"+f.taste);
////				      System.out.println("default(X):"+f.price);
////				      System.out.println("protected:"+f.cnt);
//				   // Oriental 클래스에 public 으로 선언된 변수에만 "객체 생성 후" 접근할 수 있다. 
//				      System.out.println("public:"+f.store);
//				   }
//				   // 상속 클래스
//				   public void fInfo2(){
////				      System.out.println("private:"+taste);
////				      System.out.println("default(X):"+price);
//					   		// 외부 패키지에 있는 상속관계에서 protected와 public은 접근 가능
//				      System.out.println("protected:"+cnt);
//				      System.out.println("public:"+store);
//				   }
//		}

		
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
		
		
//		[1단계:개념] 2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
				/*
				  	1) this.필드 : 지역변수와 구분하여 class의 전체 전역변수에 사용되는 변수를 호출해서 할당/사용할 때 사용.
				  		ex) this.name(전역변수로 선언된 name) = name(지역변수로 선언된 name); 
				  		
		  			2) this() :  생성자가 overloading으로 여러 개 선언되어 있을 때, 다른 생성자를 호출해서 데이터를 할당할 때 사용된다.
		  				- 호출시, 반드시 생성자 선언 첫 라인에서 호출해야 한다.
		  				ex)	this(), this(25), this("홍길동",25)
				 */
		
//		[1단계:확인] 3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
		class Team{
			String tname;
			String win;	// 승	
			String tie; // 무승부
			String defeat; // 패
			int odds;	// 승률
			public Team() {}
			public Team(String tname) {
				this();
				this.tname = tname;
			}
			public Team(String tname, String win) {
				this(tname);
				this.win = win;
			}
			public Team(String tname, String win, String tie) {
				this(tname,win);
				this.tie = tie;
			}
			public Team(String tname, String win, String tie, String defeat) {
				this(tname,win,tie);
				this.defeat = defeat;
			}
			public Team(String tname, String win, String tie, String defeat, int odds) {
				this(tname,win,tie,defeat);
				this.odds = odds;
			}
		}
//		[1단계:개념] 4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
				/*
				  1)필드
					   	현재 클래스와 상위 클래스에 정의된 구성요소를 구분하여 호출할 때 사용된다.
	  					this.name 	// 현재 클래스가 갖고있는 필드의 name 지칭
	  					super.name	// 상위 클래스가 갖고있는 필드의 name 지칭
	  			2) 생성자
	  				- 일반적으로는 default 생성자를 호출
		  			- 상위에 default를 사용하지 않을 때, 반드시 추가 선언 필요
	  			
	  			3) 메서드
	  				상위 선언된 메서드와 동일한 이름/매개변수를 동일하게 선언/사용이 가능한데, 메서드 overriding일 때
		  				상위 클래스 메서드 : super.메서드()
		  				하위 클래스 메서드 : this.메서드()
				 */
//		[1단계:개념] 5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
				/*
				  1) 메서드 오버라이딩
				  		: 상속관계에서, 상위클래스의 메서드를 하위클래스에서 재선언하는 것.
				  			메서드의 이름과 매개변수의 데이터타입, 갯수가 같아야 한다.
				  2) 메서드 오버로딩
				  		: 한 클래스 내에서, 이미 선언된 메서드를 재선언하는 것.
				  			메서드의 이름은 같아야되지만, 매개변수의 데이터타입과 갯수, 순서가 달라도 된다.
				  			단, 매개변수의 타입과 갯수, 순서가 모두 같다면 재선언할 수 없음.
				 */
		
//		[1단계:개념] 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.
		/*
		 1) 태그
		 	태그{속성:속성값}
		 	같은 태그에 css스타일이 적용된다.
		 		ex) h3{background-color: yellow; }
		 	
		 2) 아이디
		 	#아이디명으로 선택자를 선언하여 속성/속성명을 설정
		 	하나의 페이지에 유일한 식별자로, 하나만 적용할 때 활용.
		 		ex) #id01{color:navy;}
		 		
		 3) 클래스
		 	.(점)으로 시작하는 이름의 선택자를 선언하여, 속성/속성값을 지정
		 	그룹의 css적용이 필요할 때, 활용된다.
		 		ex) .cls01{color:yellow; }
		 		
		 4)	중첩
			선택1, 선택2, 선택3{속성:속성값;}
		 	여러 선택자를 동일 속성/속성값으로 지정.
		 		ex) h1.cls01{color:red;}
		 */
	}

}
