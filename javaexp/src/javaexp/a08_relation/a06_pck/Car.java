package javaexp.a08_relation.a06_pck;

class Car {
	
	Bus b1;
	Car c1;	
	  void call() {
	  	b1 = new Bus();
	  	b1 = new Bus(7788);
	  	b1 = new Bus("서울행",9999);
	  	System.out.println(b1.no);
	  	System.out.println(b1.target);
//	  	System.out.println(b1.driver);
	  			// 같은 패키지 내에 있더라도 private의 직접적인 접근은 불가능
	  	b1 = new Bus("인천",9999,"마길동");
	  	b1.callInfo();
	  	
	  }
	  // 같은 패키지 내에 있어서 모두 호출 가능

}
