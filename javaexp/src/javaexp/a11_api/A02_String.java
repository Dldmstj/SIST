package javaexp.a11_api;

public class A02_String {

	public static void main(String[] args) {
		/*
		  # String
		  1. 문자열형 객체형 데이터
		  		char -> char[] -> String
		  		한자문자	문자배열	문자열 객체
		  2. 문자열의 비교
		  	1) 주소값 비교 원칙(자바 원칙)
		  		()stack/heap(		)
		  		모든 객체들은 heap영역에 실제 객체를 두고, 그 heap영역의 위치(주소값/참조변수)를 stack에 할당하여 사용함
		  		
		  		==: stack영역의 데이터를 비교하여 boolean값을 가져옴
		  		new: 무조건 객체가 heap의 다른 위치에 생성된다
		  		
		  		"홍길동"을 만들고 특정한 heap영역 위치에 할당
		  		그 다음 "홍길동" 처음에 만들었던 주소값을 그대로 사용하여 변수에 할당한다.
		  		주의) 자바는 대부분 선언을 해서 문자열을 사용하는 것이 아니라 ,
		  		
		  		String name1 = "홍길동";
		  		String name2 = "홍길동";
		  		String name3 = new String("홍길동");
		  		String name4 = new String("홍길동");
		  		
		  		name1 == name2		(?) o
		  		name3 == name4		(?) x
		  		name1 == name4		(?) x
		  		name1.equals(name4)	(?) o
		  3. String의 기능 메서드
		  	1. 생성자
		  		new String()
		  		new String(byte[]) **
		  			최종프로젝트에 활용
		  				아이디를 잊었을 때, 임시비밀번호 생성
		  				회사에서 최초 사번과 임시비밀번호 발급
		  		new String(char[])
		  		new String("문자열")
		 */
		char[] arr = {'H','E','L','L','O'};
		String str = new String(arr);
		System.out.println("문자열 데이터 생성: " +str);
		
		for(int cnt=0; cnt<=255; cnt++) {
			System.out.println(cnt + "\t" + (char)cnt);
		}
		
		byte[] arr1 = new byte[8];
		
		for(int idx=1; idx<arr1.length; idx++) {
			byte a = (byte)(Math.random()*26 +65);
			System.out.print(idx+"번째 임의의 수 " + a);
			System.out.println("\t" + (char)a);
			arr1[idx] = a;
		}
		
		// 알파벳 대문자 A~Z 임의로 8자리
		char[] arr2 = new char[8];
		for(int idx=1; idx<arr2.length; idx++) {
			char a = (char)(Math.random()*26 +65);
			System.out.print(idx+"번째 임의의 수 " + a);
			System.out.println("\t" + (char)a);
			arr2[idx] = a;
		}
		String str2 = new String(arr1);
		System.out.println("알파벳 임의 문자" + str2);
		String str3 = new String(arr2);
		System.out.println("알파벳 임의 문자" + str3);
		// 숫자 48~57, 대문자의 범위 65~90, 소문자의 범위 97~122
		
		// 알파벳 소/대문자
		char[] arr3 = new char[8];
		for(int idx=0; idx<arr3.length; idx++) {
			int ranNum = (int)(Math.random() * 52 + 65);	// ranNum 65~116
			if(ranNum>90) ranNum+=6;	// ranNum 91부터는, ranNum에 6을 더해 소문자가 나올 수 있게 함 
			arr3[idx] = (char)ranNum;
		}
		String str4 = new String(arr3);
		System.out.println("대소문자 임의 문자 " + str4);
		
		// 알파벳 소/대문자/숫자 => 과제
		char[] arr4 = new char[8];
		for(int idx=0; idx<arr4.length; idx++) {
			int ranNum = (int)(Math.random() * 62 + 48);	// ranNum 65~116
			if(ranNum>57 && ranNum<65) ranNum+=7;	// ranNum 57부터는, ranNum에 7을 더해 대문자가 나올 수 있게 함
			if(ranNum>90) ranNum+=6;
			arr4[idx] = (char)ranNum;
		}
		String str5 = new String(arr4);
		System.out.println("대/소문자/숫자 조합 8자리: " + str5);
	
	}

}
