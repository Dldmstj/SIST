package javaexp.a07_classObject;

public class A09_MethodProcess {

	public static void main(String[] args) {
		/*
		 # 메서드기능(입력+프로세스처리)
		 1. 프로세스 처리
		 	1) 전역변수 저장 처리
		 	2) 원하는 데이터를 위한 알고리즘 처리
		 		- 조건/반복문 처리
		 	3) 화면 출력
		 */
		
		Calculator2 cal = new Calculator2();
		// 생성자 데이터를 처리할 때와, 메서드를 통해 데이터를 처리할 때를 구분해서 처리한다.
		cal.showInf();
		cal.setData(1000, 2000);
		cal.showInf();
		cal.setData(500, 500);	// 전역변수 바뀜
		cal.showInf();
		cal.addData(500, 1500);	// 전역변수에 누적
		cal.showInf();
		System.out.println();
		
		cal.getGreater(100, 100);
		System.out.println();
		
		cal.getLessNum(300, 200);
		System.out.println();
		
		cal.showTot(1,50);
		System.out.println();
		
		cal.showTot(1,10);
		System.out.println();
		System.out.println();
		
		cal.showGugu(3, 7);
		System.out.println();
		
		cal.callBuyMaxCnt(3000, 4);
	}
}

class Calculator2{
	int num01;
	int num02;
	
	
	// 출력하는 메서드
	public void showInf() {
		System.out.println("데이터1: " + num01);
		System.out.println("데이터2: " + num02);
		
	}
	
	// 전역변수에 값 저장: 메서드 호출시마다 변수가 변경됨.
	public void setData(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	} //ex) 클래스가 쇼핑몰 사이트인 경우. login(String id, String pw)
		// buy(String pname, int cnt)
	
	// 전역변수에 누적 저장: 메서드 호출시마다 변수가 누적 추가
	public void addData(int num01, int num02) {
		this.num01 += num01;
		this.num02 += num02;
	}	// ex) 클래스가 은행 사이트인 경우.
//	searchAccount(String accId)
//	addAccount(int pcnt) 가입시마다 계좌 수 누적
//	addTotMoney(int money) 누적된 내용이 처리
	
	// 두 수를 입력받아서 더 큰 수를 출력처리 if
	public void getGreater(int num01, int num02) {
		System.out.println("첫번째숫자: " + num01);
		System.out.println("두번째숫자: " + num02);
		
		if (num01>num02) {
			System.out.println("더 큰 숫자는? " +num01);
		}else if(num02>num01) {
			System.out.println("더 큰 숫자는? " +num02);
		}else {
			System.out.println("두 수가 동일하네용");
		}
	}
	// ex) 더 작은 수를 표시하는 기능 메서드 처리
	public void getLessNum(int num01, int num02) {
		System.out.println("첫번째 숫자: " + num01);
		System.out.println("두번째 숫자: " + num02);
		if(num01<num02) {
			System.out.println("더 작은 숫자는? " + num01);
		}else if(num02<num01) {
			System.out.println("더 작은 숫자는? " + num02);
		}else if(num01 == num02) {
			System.out.println("두 수가 동일합니다");
		}else {
			System.out.println("error");
		}
	}
	
	// 시작 수와 마지막 수를 입력받아 numbering하고, 총계
	
	public void showTot(int start, int end) {
		int tot = 0;
		for(int i=start; i<=end; i++) {
			System.out.print(i); {
				tot += i;
				if(i==end) {
					System.out.print(" = " + tot);
				}else {
					System.out.print(" + ");
				}
			}
		}
	}
	
//	ex) 매개변수를 받아서, 두 개의 값을 입력받아, 해당 2개의 구구단 단수의 결과를 출력하세요.
	public void showGugu(int dan01, int dan02) {
		System.out.println("# "+ dan01  +" 단 출력 #");
	
			for(int j=1; j<=9; j++) {
				System.out.println(dan01 + " X " + j + " = " + dan01*j);
			}
		System.out.println();
		System.out.println("#"+ dan02  +" 단 출력 #");
			for(int j=1; j<=9; j++) {
				System.out.println(dan02 + " X " + j + " = " + dan02*j);
			}
	}
	
//	ex) 판매하는 물건의 단가, 확인 구매 갯수 최대치
//				3000	4
//				1개 구매시 3000
//				2개 구매시 6000
//				3개 구매시 9000
//				4개 구매시 12000
	public void callBuyMaxCnt(int prdPrice, int prdCnt) {
		System.out.println("물건의 단가: " + prdPrice);
		System.out.println("최대 구매 갯수: " + prdCnt);
		System.out.println();
		for(int i=1; i<=prdCnt; i++) {
			int totPrice = i * prdPrice;
			System.out.print(i + "개 구매시 ");
			System.out.println(totPrice);
		}
	}
	
	
}