package javaexp.a04_calcu;

public class A01_Basic {

	public static void main(String[] args) {
		/*
		 # 연산자란?
		 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 2. 연산자 (operation)
		  1) 연산에 사용되는 표시나 기호
		  		+, -, *, =, !=, ...
		  3. 피연산자(operand)
		  	연산 대상이 되는 데이터
		  4. 연산식(expressions)
		  	연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
		  	ex) 25 + 2, num01 + num02
		  	30 * 2 = 5
		  	30, 2 : 피연산자
		  	*, = : 연산자
		  	피연산자 + 연산자 : 연산식
		  	
		  # 연산자의 종류
		  1. 산술연산자 : 사칙연산자 + 나머지연산자
		  	+, -, *, /, %
		  	
		  */
		int num01 = 25;
		int num02 = 7;
		System.out.println(num01 + "+" + num02 + "=" + (num01 + num02));
		System.out.println(num01 + "-" + num02 + "=" + (num01 - num02));
		System.out.println(num01 + "×" + num02 + "=" + (num01 * num02));
		System.out.println(num01 + "÷" + num02 + "=" + (num01 / num02));
		System.out.println(num01 + "%" + num02 + "=" + (num01 % num02));
		System.out.println();
		
// ex 1) 곰돌이 3마리가 빵을 25개 먹었다. 공평하게 나눈 갯수와 나머지 빵의 갯수를 출력하되, 
// 		변수를 효과적으로 사용하고 연산자를 처리하여 출력하세요
		int bbangCnt = 25;		// 빵의 갯수
		int bearCnt = 3;		// 곰돌이 수
		System.out.println("곰돌이 세마리가 각자 먹은 빵의 갯수는? " + (bbangCnt / bearCnt));
		System.out.println("먹고 남은 빵의 갯수는? " + (bbangCnt % bearCnt));
		System.out.println();
		
		
// ex 2) 사과가 단가가 2000원 하는 것을 5개 구매하였다. 총 비용을 출력하세요.
		int appleMoney = 2000;		// 사과의 단가
		System.out.println("사과 다섯개를 구매한 총 비용은? " + appleMoney * 5);
		System.out.println();
//
		
// ex 3) 현재 지갑 속에 20000원이 있는데, 교통비로 2000원씩 2번, 식대로 7000원을 지불하였다.
//		 잔액을 출력하세요.(변수 활용)
		int money = 20000;		// 내가 갖고있는 돈
		int bus = 2000;			// 교통비
		int eat = 7000;			// 식대
		System.out.println("내 주머니에 있는 돈은? " + money + " 원");
		System.out.println("내가 쓰고 남은 돈은? " + (money - (2*bus) - eat) + " 원");
		System.out.println();
		
		/*
		  2. 부호: +, -
		  	ex) int num01 = 25;
		  		int num02 = -num01;		// -25
		  		int num03 = -num02;		// 25
		  		
		 */
		int num03 = 25;
  		int num04 = -num03;		// -25
  		System.out.println("부호연산자 - 추가: " + num04);
  		int num05 = -num04;		// 25
  		System.out.println("부호연산자 한 번 더 추가: " + num05);
  		System.out.println();
		
// ex) 총 금액과 지출 금액을 지정하고, 위의 부호 연산자를 이용해서 잔액을 출력하세요.
  		int totMoney = 20000;
  		int pay = 5000;
  		System.out.println("총 금액은? " + totMoney + " 원");
  		System.out.println("지출? " + (-pay) + " 원");
  		System.out.println();
		/*
		  3. 대입: =
		  	왼쪽 데이터에서 오른쪽 변수에 할당할 때 사용
		  	int num04 = 50;
		  	
		 */
  		
  		int cnt1, cnt2, cnt3, cnt4, cnt5;
  		cnt1 = cnt2 = cnt3 = cnt4 = cnt5 = 1;
  		System.out.println(cnt1);
  		System.out.println(cnt2);
  		System.out.println(cnt3);
  		System.out.println(cnt4);
  		System.out.println(cnt5);
  		System.out.println();
  		
  		/*
		  4. 증감: ++, --
		  	1씩 증가하고 감소하는 연산
		  	ex) int cnt = 0;
		  		cnt++;	// 1씩 증가
		  		cnt++;
		  		System.out.println(cnt) 	// 2;
		  		cnt--; cnt--; cnt--;
		  		System.out.println(cnt) 	//-1
		*/
  		
  		System.out.println(cnt1++);		// 출력값은 1, cnt1은 1증가한 상태
  		// ++ 이 앞에 있으면 선증가 후출력, ++ 이 뒤에 있으면 선출력 후증가
  		System.out.println(cnt1++);		// 2
  		System.out.println(cnt1++);		// 3
  		System.out.println(cnt1++);		// 4
  		System.out.println(cnt1);		// 6
  		System.out.println(++cnt1);		// cnt1 1증가, 출력값 6
  		System.out.println();
  		
  		System.out.println(cnt1--);		// 출력값은 6, cnt1은 1감소한 상태
  		// -- 가 앞에 있으면 선감소 후출력, -- 가 뒤에 있으면 선출력 후감소
  		System.out.println(cnt1--);		// 5
  		System.out.println(cnt1--);		// 4
  		System.out.println(cnt1);		// 3
  		System.out.println(--cnt1);		// cnt1 1감소, 출력값 2
  		System.out.println();
  		/*
		   
		  5. 증감대입: +=, -=, (*=, /=, %= ...)
		  	특정한 수만큼 증가하고 감소하는 연산자 처리
		  	ex) int cnt = 0;
		  		cnt = cnt +2
		  		cnt = cnt +2		// cnt = 4
		  		cnt += 2;	// cnt = 6;
		  		cnt += 5;	// cnt = 11
		  		cnt = cnt -3 // 8
		  		cnt -= 3 // 5
		  		
		 */
  		
  		System.out.println("# 증감 대입연산자 #");
  		cnt2 = cnt2 +2; System.out.println(cnt2);
  		cnt2 += 2; System.out.println(cnt2);
  		cnt2 += 5; System.out.println(cnt2);
  		
  		/*
		  	6. 비교: ==, !=, >, <, >=, <=
		  		비교식을 이용하여 true/false값을 리턴하는 연산자를 말한다.
		  	ex) int point = 30;
				boolean isPass1 = point == 60;		// false
				boolean isPass2 = point != 60;		// true
		  		boolean isPass3 = point >= 60;
		  			// point가 60 이상일 때, true, 현재는 결과가 false
		  		ps) 자바에서만 사용하는 문자열 비교
					String str1 = new String("himan");
					String str2 = new String("himan");
					String str3 = "higirl";
					String str4 = "higirl";
					System.out.println(str1==str2);		
						// false, heap에 저장된 주소가 다름
					System.out.println(str3==str4);		
						// true, 두 객체 모두 heap에 있는 higirl을 가리킴
				결론: 자바에서 문자열을 비교할 때는 .equals() 를 이용해서 비교해야 한다.
			7. 논리: 
				비교 연산식이 2개 이상, 또는 not(!) 연산자를 이용할 때, 논리연산자를 이용해서 처리
					&&: 논리합(and), 두 가지 비교 연산자가 모두 true일 때 true 반환. 그 외 false
						ex) 나이에 따른 청소년 요금제 적용 여부
							boolean isAdolPay = age >= 14 && age < 18;
					||: 논리곱(or), 두 가지 비교 연산자 중 하나 이상 true이면 true 반환, 둘 다 false일 때 false
						ex) 놀이공원 나이에 따라 무료입장 적용 여부
							boolean isFree = age<5 || age >= 65;
					!: 비교 연산식이나 논리 연산식의 결과가 true이면 false로, false면 true로 처리
						ex) boolean isPass = point >= 60;	// 합격하는 경우
							boolean isNotPass = !isPass;	// 불합격하는 경우
							boolean isPay = !isFree; 		// 유료인 경우
			8. 삼항:
				조건(비교연산자, 논리연산자)? A : B
				조건식이 True일 때는 A로 처리하고, 조건식이 False일 때는 B로 처리함
				한 라인에서 조건에 따라 결과를 처리하기에 효과적인 데이터 처리가 가능.
				ex) System.out.println(age >= 18?"성인":"미성년자");
				
		 */
		

		
	}

}
