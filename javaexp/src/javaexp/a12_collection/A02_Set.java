package javaexp.a12_collection;

import java.util.HashSet;
import java.util.Set;

public class A02_Set {
	public static void main(String[] args) {
		/*
	  # Set 컬렉션
	  	1. 특징
	  		수학의 집합에 비유
	  		저장 순서가 유지되지 않음
	  		객체를 중복저장할 수 없다
	  		하나의 null만 저장할 수 있음
	  	2. 구현 실제 클래스
	  		HashSet, LinkedHashSet, TreeSet
	  	3. 주요 메서드
	  		add() : 추가
	  		contains(): 내용포함 여부
	  		isEmpty(): 비어있는지 여부
	  		Iterator<E> iterator() 
	  		size(): 크기
	  		clear(): 비우기
	  		remove(Object obj): 객체 삭제
	  		
	  	4. 기본 형식
	  		Set<E> set = new HashSet<E>();
		 */
		Set<String> set = new HashSet<String>();
		set.add("오렌지");
		set.add("오렌지");
		set.add("수박");
		set.add("수박");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");
		set.add("딸기");		// 중복 x
		for(String flist:set) {
			System.out.print(flist+" ");		// 출력: 수박 오렌지 딸기
		}
		System.out.println();
		
//		ex) 주머니 속에 빨간구슬2, 파란구슬3, 노란구슬2개를 Set으로 할당해서 넣고, 현재 주머니 속에 있는 구슬의 종류를 출력하세요.
		Set<String> balls = new HashSet<String>();
		balls.add("빨강색");
		balls.add("빨강색");
		balls.add("파란색");
		balls.add("파란색");
		balls.add("파란색");
		balls.add("노란색");
		balls.add("노란색");
		for(String blist:balls) {
			System.out.println(blist+" ");
		}
		System.out.println("set의 크기(주머니 속 구슬의 개수): " + balls.size());
	}
}
