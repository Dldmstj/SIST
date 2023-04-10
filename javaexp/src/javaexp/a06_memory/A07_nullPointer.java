package javaexp.a06_memory;

public class A07_nullPointer {

	public static void main(String[] args) {
		/*
		 # NullPointer
		 1. heap영역을 사용하는 객체 메모리에 할당하지 않을 때 해당 객체의 변수를 null로 초기화한다. 
		 2. 이 때 null이라는말 자체는 heap영역에 아직 값을 할당하지 않았다는 의미를 가진다.
		 3. 이 상황에서 해당 객체가 가지고 있는 구성요소를 호출하면 NullPointerException이라는 에러가 발생함.
		 4. 자바의 객체 메모리는 다음과 같은 순서로 메모리를 할당한다.
		 	1) 객체타입 객체명;		// 객체의 선언
		 		ex) int[] arr;		// arr[0] 호출시 컴파일 단계도 가지 못 함.
		 			String str;
		 			String str2;
		 	2) 초기화 처리
		 		arr = null;		// null로 초기화 => 사용 가능
		 		str = new String("안녕");		// heap영역에 데이터 할당 => 사용 및 호출 가능
		 		str2 = null;
		 	3) 사용
		 		arr[0] = 25;	// 호출 및 할당, 이 경우 NullPointerException이라는 런타임에러 발생
		 		str = "반가워요"; 	// 다른 객체 할당 (주소값 변경)
		 		System.out.println(str2);		
		 			// 에러는 발생하지 않지만, heap영역에 할당되지 않았기 때문에 null이라고 출력
		 		System.out.println(str2.toString());		
		 			// 에러발생. 더 이상 프로그램이 수행되지 않음.
		 			// heap메모리에 올려놓은 게 없어서 toString 메소드는 호출할 수 없음.
		 */
		
		// 선언 -> 초기화 -> 사용
		// 1. 선언만 하고 초기화하지 않고는 사용 불가 (컴파일 에러)
		// 2. null로 초기화하고,
//				1) 객체 자체를 호출(에러발생하지 않고) : null
//				2) 객체의 구성요소 index, 속성 : 런타임에러  
//						=> ArrayIndexOutOfBoundsException
//						=> NullPointerException
//			3. 객체를 생성
//				1) 해당 객체가 가지고 있는 범위 안에 배열/속성 : 호출
//				2) 해당 객체가 가지고 있지 않는 범위의 배열 index/속성
//						=> NullPointerException
//						특히 for(int idx=0; idx<=배열명.length; idx++){}
								// (x), 배열의 크기 != index
		

		int [] intArr;		// 선언
		String str01;
		String str02;
//		System.out.println(intArr); 	
			// 객체는 초기화를 해야 사용할 수 있음. 초기화해야 컴파일되어 메모리에 올릴 수 있음
		intArr = null;		// null로 초기화.
		str01 = null;		
		str02 = "홍길동";
		// 전체 해당 객체의 이름으로 호출하면 null로 표기
		System.out.println(intArr);
		System.out.println(str01);
		System.out.println(str01);
		
		// heap영역에 할당되지 않은 객체의 구성요소 호출
		System.out.println("# heap영역 #");
//		System.out.println(intArr[0]);		// java.lang.NullPointerException
//		System.out.println(str01.toString());	// java.lang.NullPointerException
			// 객체의 경우 기능 메서드, 필드(객체의 전역데이터)
		System.out.println(str02.charAt(0));	
			// 기능메서드가 지원하는 메모리 범위까지만 호출됨, "홍길동 -> charAt(2)까지만
			// heap영역에 할당된 값이 있으면 정상적으로 처리됨
		intArr = new int[3];
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);		// 지정한 메모리 이상의 범위를 호출하면 ArrayIndexOutOfBoundsException
		System.out.println();
		
//		ex) 문자열로 물건이름 3개를 할당하는 배열을 선언하고, 각 index별로 호출하고 index범위를 초과했을 때 나오는 에러 확인
		
		String [] prod = {"감자","고구마","옥수수"};
		
		System.out.println(prod); 		
		// 이대로 출력하면 배열의 데이터타입과 배열의 16진수 주소값이 출력됨
		System.out.println(prod[0]);
		System.out.println(prod[1]);
		System.out.println(prod[2]);
//		System.out.println(prod[3]);		
			// java.lang.ArrayIndexOutOfBoundsException, 배열 범위 초과 에러
			// java.lang.NullPointerException, 해당 데이터 구성요소에 대한 메모리가 없어서 발생하는 에러
		
		
	}

}
