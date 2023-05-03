package javaexp.a11_api;

import java.util.Random;

public class A08_Random {

	public static void main(String[] args) {
		/*
		  # 임의의 수를 보다 효과적으로 처리하는 Random
		  1. boolean, int, long, float, double 등의 데이터를 메소드를 이용해서 임의로 처리할 수 있다.
		  2. 난수를 만드는 알고리즘에 사용되는 종자값(seed)설정 가능하여 처리된다. 종자값이 설정되면 처음에 나온 임의 수는
		  	계속 보존된다.
		 */
		Random r1 = new Random();
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		// r1.nextInt(경우의수)+시작수
		System.out.println(r1.nextInt(5));
		System.out.println(r1.nextInt(6)+1);
		System.out.println("주사위: "+r1.nextInt());
		System.out.println("0~100: "+r1.nextInt(101));
//		ex) 위 random 객체의 기능함수(메소드)를 이용해서 1. 임의로 합/불을 출력하게 하고
//			2. 주사위 2개의 합산값을 출력
//			3. 학생의 점수를 국/영/수 임의로 처리하여 평균 출력
		
		System.out.println();
		
		System.out.println(r1.nextInt(2));
		int ranPass = r1.nextInt(2)+1;
		String result = ranPass==0 ? "합격":"불합격";
		System.out.println(result);
		
		System.out.println();
		
		int ranDice1 = r1.nextInt(5)+1;
		int ranDice2 = r1.nextInt(5)+1;
		int tot =  ranDice1+ranDice2;
		System.out.println("랜덤주사위 1: " + ranDice1);
		System.out.println("랜덤주사위 2: " + ranDice2);
		System.out.println("두 주사위의 합: " + tot);

		System.out.println();
		int kor = r1.nextInt(101);
		int eng = r1.nextInt(101);
		int math = r1.nextInt(101);
		System.out.println("국어\t영어\t수학");
		System.out.println(kor+"\t"+eng+"\t"+math);
	}

}
