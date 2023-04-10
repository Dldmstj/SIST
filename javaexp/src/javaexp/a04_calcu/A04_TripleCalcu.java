package javaexp.a04_calcu;

import java.util.Scanner;

public class A04_TripleCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 삼항연산자
		0. 항 : 피연산자를 몇개 사용하는냐에 따른 구분
			단항연산자 =, cnt++....
			이항연산자 cnt + cnt2, num01 * num02
			삼항연산자 연산자와 피연산자를 3개를 사용하는 것을 말한다.
		1. 세개의 피연산자를 필요로 하는 연산식
		2. 기본 형식
			비교연산자|논리연산자?true일때:false일때
			ex) 나이가 18세이상이면 성인 처리 그외는 미성년자 처리
			String divAdult = age>=18?"성인":"미성년자";
			ex) 구매한 물건의 총계가 10만이상이면 할인율 15%
			그외는 5%처리
			double disRatio = buyProd>=100000?0.15:0.05;
		*/
		// ctrl + shift + o : 자동 import
	/*	Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요:");
//		int age = sc.nextInt();
//		System.out.println("입력한 나이:"+age);
//		String divAdult = age>=18?"성인":"미성년자";
//		System.out.println("구분:"+divAdult);
//		System.out.println("구분:"+(age>=18?"성인":"미성년자"));
//		ex) 획득한 점수를 입력하세요 점수기준으로 60이상이면
//		    합격 그외는 불합격을 출력하세요.
//		System.out.print("획득한 점수를 입력하세요:");
//		int point = Integer.parseInt(sc.nextLine());
//		String divPass = point>=60?"합격":"불합격";
//		System.out.println("합격여부:"+divPass);
//		ex) 나이에 따른 무료/유료 구분 처리
		System.out.print("나이를 입력하세요:");
		int age = Integer.parseInt(sc.nextLine());
//		String divFree = age<5 || age>=65?"무료":"유료";		
//		System.out.println("입장자의 나이:"+age);
//		System.out.println("무/유료 구분:"+divFree);
//		ex) 나이에 따라 청소년요금제/일반요금제 구분 
//				청소년요금제(14~17)
		String divAdole = age>=14&&age<18?"청소년요금제":"일반요금제";
		System.out.println("요금제 적용 나이:"+age);
		System.out.println("요금제:"+divAdole); */
		
//		ex) 삼항 연산자를 이용해서 구매한 물건 가격과 갯수를 입력받아 100000 이상 => 고급 사은품
//		그 외는 일반 사은품 출력, 할당
		
		Scanner sc1= new Scanner(System.in);
		System.out.print("구매한 물건 가격: ");
		int price = Integer.parseInt(sc1.nextLine());
		System.out.print("구매한 물건 갯수: ");
		int pCnt = Integer.parseInt(sc1.nextLine());
		int totPrice = price * pCnt;
		
		String isGift = totPrice >= 100000 ? "고급 사은품" : "일반 사은품";
		
		System.out.println("구매한 물건의 가격: " + price);
		System.out.println("구매한 물건의 갯수: " + pCnt);
		System.out.println("구매한 물건의 총 금액: " + totPrice + "원");
		System.out.println(isGift + " 증정 대상입니다.");
		
		
		
	}

}
