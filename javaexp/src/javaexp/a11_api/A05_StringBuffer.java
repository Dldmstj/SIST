package javaexp.a11_api;

import java.util.Scanner;

public class A05_StringBuffer {

	public static void main(String[] args) {
		/*
		  # String문자열의 메모활용 문제점
		  1. += 으로 추가할 때마다 다시 객체가 생성된다.
		  2. 반복해서 =(대입연산자)를 할당하는 순간, 각각 문자열이 다르면, 다른 위치를 기준으로 객체가 생성된다.
		  3. 특히, 반복문에 댇입을 잘못 활ㅇ요하는 경우, 메모리에 문제가 생겨 더 이상 프로그램이 진행되지 못 하는 경우가 발생한다.
		  
		 */
		String strData="홍";
		System.out.println("초기 strData 주소: " + strData.hashCode());
		for(int i=0; i<=10; i++) {
			strData+=i;
		}
		System.out.println(strData);
		System.out.println("변경된 strData 주소: " + strData.hashCode());
		/*
		  # 문자열을 사용해서 += 기호(누적)를 통해서 데이터를 누적 할당하면 heap영역을 계속 만들어서 사용하는 것을 볼 수 있다.
		 	이렇게 데이터를 처리하면 메모리 overflow가 발생한다.
		 	문자열 데이터를 처리할 때, 문자열이 늘어나더라도 동일한 heap주소 안에 데이터를 처리할 수 있는 객체가 필요 => StringBuffer
		 	
		 	1. 객체 생성
		  		StringBuffer sb = new String Buffer();
		  		StringBuffer sb1 = new String Buffer("초기문자");
		  	2. 문자열 추가
		  		sb.append("추가 문자열");
		  	3. 추가된 문자열 확인
		  		sb: 모든 객체의 참조변수만으로도 호출되는 default 메서드가 toString()에 선언된 내용이기에 생략가능
		  		sb.toString()
		  	4. 기타 기능 메서드
		  		insert(int offset, ) : 특정한 위치에 문자열 삽입
		  		delete(int start, int end) : 특정 범위의 문자열을 삭제
		  		deleteCharAt(int index) : 특정 위치의 문자 삭제
		  		replace(int start, int end, String str) : 특정 위치에 문자열을 대체 변경 처리 (여러 문자열)
		  		reverse() : 문자열 뒤집기 처리
		  		setCharAt(int idx, char ch) : 특정 위치에 문자를 대체처리(문자 한자)
		 */
		
		System.out.println("# StringBuffer 객체 주소 비교 #");
		StringBuffer sb =  new StringBuffer();
		sb.append("홍");
		System.out.println(System.identityHashCode(sb));
		sb.append("길");
		System.out.println(System.identityHashCode(sb));
		sb.append("마");
		System.out.println(sb.toString());
		// 추가 이후에도 동일한 주소값을 확인할 수 있다.
		System.out.println(System.identityHashCode(sb));
		
		System.out.println();
		
//		초기 문자열 코드"1"을 할당하여 객체를 생성하고, 2~100까지 문자열을 누적하여 출력하되, 초기 생성되었을 때 주소, 누적된 문자열 확인, 주소값 확인
		System.out.println("# StringBuffer #");
		StringBuffer sb1 = new StringBuffer("1");
		System.out.println("초기 생성 주소: "+ System.identityHashCode(sb1));
		for(int i=2; i<=200; i++) {
			sb1.append(i);
		}
		System.out.println(sb1.toString());
		System.out.println("누적 생성 주소: " + System.identityHashCode(sb1));
		
		System.out.println();
		
		System.out.println(sb1.reverse());
		
		// StringBuffer를 이용하여, 과일명 3개를 Scanner에 의해 ,단위로 구분하여 입력받아서 최종적으로 입력받은 과일 리스트를 출력하되,
		// 입력받을 때마다 주소값을 확인하세요.
		Scanner sc = new Scanner(System.in);
		/*
		 * StringBuffer fruits = new StringBuffer("구매할 과일 리스트: ");
		 * System.out.println("# 과일을 세가지 입력하세요 #"); for(int i=1; i<=3; i++) {
		 * System.out.println("주소값 출력: " + System.identityHashCode(fruits));
		 * System.out.print(i+"번째 과일: "); fruits.append(sc.nextLine()+", "); }
		 * System.out.println(fruits); System.out.println("최종 주소값 출력: " +
		 * System.identityHashCode(fruits));
		 */
		
//		ex) 구매 정보를 단위당 \n으로 입력받게 하여 물건명, 구매갯수를 입력하여 물건 정보 3개를 StringBuffer에 입력하여 출력되게 하세요
		StringBuffer prd = new StringBuffer("# 구매 정보 #\n물건명\t구매갯수\n");
		System.out.println("# 구매 정보 입력하기 #");
		for(int i=1; i<=3; i++) {
			System.out.print("물건명을 입력하세요: ");
			prd.append(sc.nextLine() +"\t");
			System.out.print("구매한 갯수를 입력하세요: ");
			prd.append(sc.nextLine() +"\n");
		}
		System.out.println();
		System.out.println(prd);
		
	}

}
