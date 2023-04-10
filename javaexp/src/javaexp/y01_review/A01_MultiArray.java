package javaexp.y01_review;

public class A01_MultiArray {

	public static void main(String[] args) {
		
		// # 다차원 배열 예제 - 기차 호차별 예상 내용 true / false
		// 1. 7개 호차 좌석 70개, 예약이 기본값으로 모두 false
		boolean[][] trains = new boolean[7][70];
		// 예약처리 .. 1호차 3좌석, 5호차 50좌석, 7호차 25좌석
		trains[0][2] = true;
		trains[4][49] = true;
		trains[6][24] = true;
		
		
		// 2. 각 호차별 좌석에 예약 내역 출력
		//		1) 외부 for문을 호차 처리 : 외부 for문의 trains.length
		for(int idx=0; idx<trains.length; idx++) {
			// 배열은 0부터 처리되므로, 1호차부터 나타내기 위해
			// index 번호+1로 처리함
			System.out.println(idx+1+"호차");
			// trains[idx]: 각 호차를 지칭
			// 각 호차 안에 좌석 배열 데이터가 들어가 있기 때문에 for문으로 처리
			// trains[0].length: 1호차의 길이
			// trains[0][0]: 1호차의 첫번째 좌석 예약 정보
			for(int jdx=0; jdx<trains[0].length; jdx++) {
				System.out.print(jdx+1+"번째 좌석 ");
				System.out.println(trains[idx][jdx]?"예약":"미예약" );
			}
		}
		System.out.println();
		
//		ex) 2개의 과목에 3명의 학생의 점수를 2차원으로 할당하여 출력하세요
//		 1번째 학생 1번째과목 점수 @@@
//		 1번째 학생 2번째과목 점수 @@@
//		 2번째 학생 1번째과목 점수 @@@
//		 2번째 학생 2번째과목 점수 @@@
//		 3번째 학생 1번째과목 점수 @@@
//		 3번째 학생 2번째과목 점수 @@@
		int[][] subj = {{70, 90}, {90, 80}, {75, 95}};
		String[] names = {"홍길동","김길동","신길동"};
		String[]sub = {"국어","영어"};
		for(int std=0; std<subj.length; std++) {
			for(int idx=0; idx<subj[0].length; idx++) {
				System.out.print("번호: " + std+1 +" ");
				System.out.print(names[std]+" 학생의 ");
				System.out.print(sub[idx]+"점수는 ");
				System.out.println(subj[std][idx]+"점");
			}
		}
		
	}

}
