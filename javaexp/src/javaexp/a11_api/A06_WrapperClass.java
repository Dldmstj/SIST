package javaexp.a11_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		  # Wrapper 클래스
		  1. 기본 데이터 유형을 사용하다보면 여러 형태로 변환이 필요하거나 기능적으로 처리해야 하는 경우가 많다.
		  	type이 기본 유형으로 되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가 발생한다.
		  2. 이 때, 자바 api에서는 기본 데이터 유형과 연결되는 객체 유형을 만들어 필요에 따라 제공되는 메서드를 이용해서
		  	여러가지 데이터 유형 변경, 치환, 기능 처리 등을 할 수 있게 하는데 이것을 Wrapper클래스라고 한다.
		  3. 형태(기본 유형과 연결)
		  		byte => Byte
		  		char => Character
		  		...
		  		int => Integer
		  		double => Double
		  		boolean => Boolean
		  	
		 */
		int num01 = 25;		// 기본 데이터 유형
		Integer numWrap01 = new Integer(num01);
		// Wrapper 클래스
//		numWrap01.XXXX(); 를 통해 포함되는 여러 기능 메서드를 지원함.
		System.out.println(numWrap01.byteValue());
		System.out.println(numWrap01.hashCode());
		System.out.println(numWrap01.MAX_VALUE);
		/*
		  3. 변경 처리
		  	1) 기본 데이터 => Wrapper class (Boxing)
		  		Integer ob1 = Integer.valueOf(1000);
		  		1000 정수를 Wrapper클래스 ob1에 할당
		  		Byte ob2 = Byte.valueOf(25);
		  	2) Wrapper class => Wrapper class (UnBoxing)
		 */
		// Boxing
		Byte obj1 = Byte.valueOf("25");
		Integer obj2 = Integer.valueOf(30);
		Double obj3 = Double.valueOf("30.7");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
//		ex) boolean, float, short, char을 
		
		Boolean ob01 = Boolean.valueOf(true);
		Float ob02 = Float.valueOf("3.14f");
		Short ob03 = Short.valueOf("0");
		Character ob04 = Character.valueOf('A');
		System.out.println(ob01);
		System.out.println(ob02);
		System.out.println(ob03);
		System.out.println(ob04);
		
		// UnBoxing: 기본 유형의 데이터로 할당
		byte num1 = obj1.byteValue();
		int num2 = obj2.intValue();
		double num3 = obj3.doubleValue();
		/*
		  # Auto Boxing / Auto UnBoxing
		  1. 기본 데이터 유형을 보다 간편하게 객체형으로, 또는 기본 유형으로 변경처리하는 기능이 필요해서
		  	자바에서는 이러한 auto기능을 대입 연산자로 지원하고 있다.
		 */
		// Auto Boxing
		Integer obj10 = 30;	// 바로 대입처리
		// Auto UnBoxing
		Double obj11 = Double.valueOf("30.7");
		double num4 = obj11;
		System.out.println(obj10);
		System.out.println(num4);
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(Integer.valueOf(25));
		ilist.add(Integer.valueOf(75));
		ilist.add(30);		// Auto Boxing
		ilist.add(70);
		
		System.out.println("# Auto Boxing #");
		for(Integer i: ilist) {
			System.out.println(i+50);
		}
		System.out.println();
		
//		ex) args 에서 3000 true 40.2F 문자열로 입력받아서 Wrapper클래스에 할당하고 출력
		System.out.println("# args : 3000 true 40.2F #");
		
		Integer data1 = Integer.valueOf(args[0]);
		Boolean data2 = Boolean.valueOf(args[1]);
		Float data3 = Float.valueOf(args[2]);
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}

}
