package javaexp.a08_relation.access.pck3;

import javaexp.a08_relation.access.pck1.OrientalMelon;

public class WaterMelon extends OrientalMelon {

	   public void fInfo1(){
		      OrientalMelon f = new OrientalMelon();
//		      System.out.println("private:"+f.taste);
//		      System.out.println("default(X):"+f.price);
//		      System.out.println("protected:"+f.cnt);
		   // Oriental 클래스에 public 으로 선언된 변수에만 "객체 생성 후" 접근할 수 있다. 
		      System.out.println("public:"+f.store);
		   }
		   // 상속 클래스
		   public void fInfo2(){
//		      System.out.println("private:"+taste);
//		      System.out.println("default(X):"+price);
			   		// 외부 패키지에 있는 상속관계에서 protected와 public은 접근 가능
		      System.out.println("protected:"+cnt);
		      System.out.println("public:"+store);
		   }
}
