package javaexp.a08_relation.access.pck1;

import javaexp.a08_relation.access.pck1.OrientalMelon;

public class Melon extends OrientalMelon {

	   public void fInfo1(){
		      OrientalMelon f = new OrientalMelon();
//		      System.out.println("private:"+f.taste);
		      		// private, 직접적인 접근 불가
		      System.out.println("default(X):"+f.price);
		      System.out.println("protected:"+f.cnt);
		      System.out.println("public:"+f.store);
		   }
		   // 상속 클래스
		   public void fInfo2(){
//		      System.out.println("private:"+taste);
			   		// private, 상속 관계에서도 직접적인 접근 불가
		      System.out.println("default(X):"+price);
		      System.out.println("protected:"+cnt);
		      System.out.println("public:"+store);
		   }
}
