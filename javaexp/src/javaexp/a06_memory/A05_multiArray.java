package javaexp.a06_memory;

public class A05_multiArray {

	public static void main(String[] args) {
		/*
		 # 다차원 배열
		 1. 배열이 2차원 이상인 경우를 말한다.
		  - 변수는 초기에 한 개의 데이터를 할당
		  - 1차원 배열에서는 두 개 이상의 데이터를 하나의 단위 안에 연속적으로 할당.
		  - 2차원 배열에서는 위 1차원 배열이 여러 개를 처리하는 것을 말한다.
		 2. 자바는 1차원 배열을 이용하여 1차원 이상의 배열을 처리한다.
		 	1) 선언
		 		- 1차원 배열
		 			데이터타입 [] 배열명;
		 		- 2차원 배열
		 			데이터타입 [][] 배열명;
		 		- 다차원 배열
		 			데이터타입 [][]...[] 배열명;
		 	2) 데이터 할당
		 		- 1차원
		 			배열명 = new 데이터타입[데이터크기];
		 		- 2차원
		 			배열명 = new 데이터타입[상위차원크기][하위차원크기];
		 				ex) multiArr = new int[2][2];
		 				 	상위 차원은 2개, 그에 종속된 하위 차원도 2개.
		 				ex) 기차 5개의 호차 - 1차원 배열
		 					각 호차마다 좌석 - 2차원 배열
		 				int [][] arry = {{1000,2000},{3000,4000}};
		 						
		 				데이터 사용
		 					배열명[상위차원idx]하위차원idx] : 호출
		 						// arry[0][0] = 1000, arry[1][0] = 3000
		 */
		// 숫자로 기차에 좌석이 예약되어 사용되면 1,
		// 사용되고 있지 않으면 0으로 처리해보자
		int [][] train = new int[8][60];
		// train[0]: 각각의 1차원의 배열 안에 60개의 정수 data가 존재.
		// {{60개 data},{},...{}}
		// train.length == 8
		// train[0].length == 60
		System.out.println(train.length);
		System.out.println(train[0].length);
		
		train[0][0] =1;
		train[5][55] = 1;
		train[6][55] = 1;
		
		for(int idx=0; idx<train.length;idx++) {
			// 호차를 반복
			for(int jdx=0; jdx<train[0].length; jdx++) {
				// 좌석을 반복
				System.out.print(idx+1+"호차 ");
				System.out.print(jdx+1+"좌석"+": ");
				System.out.println(train[idx][jdx]);
			}
			System.out.println();
		}
		System.out.println();
		
		
//		ex) 학생 3명의 국어, 영어, 수학점수를 2차원 배열에 넣고, 초기값은 모두 0, 
//			1번째 학생의 국어점수 90, 두 번째 학생의 영어점수 80, 세 번째 학생의 수학점수는 80을 할당하여 2중 for문으로 출력
		int [][] std = new int[3][3];
		std[0][0] = 90;
		std[1][1] = 80;
		std[2][2] = 80;
		String []subj = {"국어","영어","수학"};
//		System.out.println("학생번호\t국어\t영어\t수학");
		for(int idx=0; idx<std.length; idx++) {
			
			for(int jdx=0; jdx<std[0].length; jdx++) {
				System.out.print(idx+1+"번째 학생의 ");
				System.out.print(subj[jdx]+"점수\t" );
				System.out.println(std[idx][jdx]);
			}
			System.out.println();
		}
		
	}


}
