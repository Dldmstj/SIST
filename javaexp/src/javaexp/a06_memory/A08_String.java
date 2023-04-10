package javaexp.a06_memory;

public class A08_String {

	public static void main(String[] args) {
		/*
		 #String의 메모리 활용
		 1. String은 char의 배열인 char[]이 고정화되어 많이 사용하게 되어, 데이터타입으로 고착화되어 만들어진 것
		 2. 문자열은 여러가지 프로그래밍에서 사용되기 때문에, 지원하는 기능 메서드도 많이 필요하여 타입으로 설정되었다.
		 3. 자바에서의 메모리 관리
		 	1) 객체로 heap에 할당되어 사용
		 	2) 자바의 String
		 		- String name1 = "홍길동";
		 			// 직접적으로 데이터를 할당하는 경우는
		 			// (실무적으로) spring framework 에서 거의 사용하지 않음
		 			// "홍길동" 동일한 이름이 있는 곳은 모든 heap영역에 단 하나만 설정이 된다.
		 					String name4 = "홍길동"; 을 선언하더라도 name1과 동일한 heap메모리를 가리킴
		 					name1 == name4 => 문자열비교 x, 주소값 비교임
		 					
		 		- String name2 = new String("홍길동");
		 		- String name3 = new String("홍길동");
		 			// new => heap영역에 새롭게 메모리를 올린다는 뜻
		 			// name2 == name3 (x)
		 	3) 문자열에 대한 내용 자체에 대한 비교는 .equals() 를 활용 
		 			-> 주소값 상관없이 내용을 비교하여 t/f 를 반환.
		 		
		 */

	}

}
