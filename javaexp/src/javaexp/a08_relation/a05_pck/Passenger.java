package javaexp.a08_relation.a05_pck;

import javaexp.a08_relation.a06_pck.Bus;

public class Passenger {
	/*
	  Bus b1;
	  Car c1; (x)
	  void call() {
	  	b1 = new Bus(); (o)
	  	b1 = new Bus(7788); (x)
	  	b1 = new Bus("서울행",9999); (o)
	  	System.out.println(b1.no); (o)
	  	System.out.println(b1.target); (x)
	  }
	 */
	
	Bus b1;
//	  Car c1;	(x)
	  void call() {
	  	b1 = new Bus();
//	  	b1 = new Bus(7788); 	(x)
	  	b1 = new Bus("서울행",9999);
	  	System.out.println(b1.no);
//	  	System.out.println(b1.target);	(x)
	  }
}
