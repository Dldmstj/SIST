package javaexp.z01_home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A16_0502 {

	public static void main(String[] args) {

//		[1단계:확인] 1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문제: 1+1은?");
//		System.out.println("1. 1\t2. 2\t3. 3\t4. 4");
//		String cor = "2";
//		try {
//			System.out.print("정답입력: ");
//			String ans = sc.nextLine();
//			if(!ans.equals(cor)){
//				throw new CorrectException(ans);
//			}
//			System.out.println("정답입니다.");
//		}catch(CorrectException e) {
//			System.out.println(e.getMessage());
//		}
//		[1단계:개념] 2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		/*
		  1) Math 클래스: 주로 데이터의 기능적인 처리를 할 때 활용된다. 객체의 생성 없이 사용하는 static 메서드를 지원하는 클래스
		  2) Random 클래스: 임의의 수를 보다 효과적으로 처리한다. 
		  			boolean, int, long, float, double 등의 데이터를 메소드를 이용해서 임의로 처리할 수 있다.
		 */
		
//		[1단계:확인] 3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
		Random rd = new Random();
		for(int i=1; i<=10; i++) {
			int ranNum = rd.nextInt(10);
			System.out.print(ranNum);
			if(ranNum %2 == 0) {
				System.out.println(" : 짝");
			}else {
				System.out.println(" : 홀");
			}
		}
		
//		Scanner sc10 = new Scanner(System.in);
//		Random rd10 = new Random();
//		for(int i=1; i<=10; i++) {
//			boolean isOdd = rd10.nextBoolean();		// 랜덤 홀이면 true
//			System.out.println(i + "번째 홀/짝 게임. 컴퓨터가 홀/짝 일까요?");
//			String inGame = sc10.nextLine();
//			if( (isOdd && inGame.equals("홀")) || (!isOdd && inGame.equals("짝")) ) {
//				// Random boolean값이 true이고 입력된 값이 "홀"이거나
//				// Random boolean값이 false이고 입력된 값이 "짝"일 때
//				System.out.println(inGame + " 맞췄습니다!");
//			}else {
//				System.out.println("오답입니다!");
//			}
//		}
		System.out.println();
		
//		[1단계:확인] 4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Scanner sc20 = new Scanner(System.in);
		Random rd1 = new Random();
		
		//					0	 1	 2
		String games[] = {"가위","바위","보"};
		//					0 == 1	바위
		//					1 == 2	보
		//					2 == 0	가위
		int win,eq,def;		win=eq=def = 0; // 승, 무, 패
		
//		System.out.println("# 가위/바위/보 게임 #");
//		for(int i=1; i<=3; i++) {
//			int comIdx = rd1.nextInt(3);	//0,1,2
//			System.out.print("1.가위\t2.바위\t보\n입력: ");
//			int myIdx = sc20.nextInt()-1;
//			System.out.println("컴퓨터가 낸 가위/바위/보 : " + games[comIdx]);
//			System.out.println("내가 낸 가위/바위/보 : " + games[myIdx]);
//			if(comIdx == myIdx ) {
//				System.out.println("무승부");	eq++;
//			}else if((comIdx+1)%3 == myIdx) {	// comIdx의 값에 +1 한 값이 myIdx와 동일하면,
//				System.out.println("나의 승"); win++;
//					// games[0]은 가위, games[1] 바위일 때, index기준으로 0과 1을 비교해서
//					// 0+1dl 1과 같을 때, 내가 승리
//				
//			}else {
//				System.out.println("컴퓨터 승"); def++;
//			}
//			
//		}
		
//		[1단계:개념] 5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
		/*
		  	1) List: 순서를 유지하면서 저장한다. 중복으로 저장할 수 있음.
		  		ArrayList, Vector, LinkedList
		   	2) Set: 순서에 관계없이 저장한다. 중복으로 저장할 수 없음.
		   		HashSet, TreeSet
		   	3) Map: 키-값의 쌍으로 저장된다. 키는 중복될 수 없다.
		   	 	HashMap, HashTable, TreeMap, Properties
		 */
		
//		[단계별:확인] 
//		1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
		Random rd2 = new Random();
		int rnum1 = rd2.nextInt(10);
		List<String> card1 = new ArrayList<String>();
//		for(int i=0; i<10; i++) {
//			card1.add(i,(i+1)+"");
//		}
		for(int i=1; i<=10; i++) {
			card1.add(i+"");
		}
		
		System.out.println("임의의 숫자: "+card1.get(rnum1));
		
//		2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
//		List<String> card2 = new ArrayList<String>();
//		card2.add("A");
//		for(int i=2; i<=10; i++) {
//			card2.add(i+"");
//		}
//		card2.add("J");		card2.add("Q");		card2.add("K");
//		int rIdx = rd2.nextInt(13);
//		System.out.println("임의의 번호: "+card2.get(rIdx));
		
//		3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 
//			52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
		List<Card> clist = new ArrayList<Card>();
		List<String> card3 = new ArrayList<String>();
		String[] shapes = {"♣","♥","♠","◆"};
		
		card3.add("A");
		for(int i=2; i<=10; i++) {
			card3.add(i+"");
		}
		card3.add("J");		card3.add("Q");		card3.add("K");
		System.out.println("카드 52개");
		for(String sh:shapes) {	// 모양 반복
			for(String num:card3) {	// 숫자 반복
				clist.add(new Card(sh,num));	// 객체 생성
			}
		}
		for(Card c:clist) {
			System.out.print(c.getShape()+c.getNum()+ " ");
		}
		System.out.println("카드의 총 갯수: " + clist.size());
		
//		
//		for(int i=1; i<=4; i++) {
//			Card cd = new Card();
//			if(i==1) {cd.shape ="♣"; }
//			else if(i==2) {cd.shape ="♥"; }
//			else if(i==3) {cd.shape = "♠"; }
//			else {cd.shape = "◆";}
//			
//			for(int j=1; j<=13; j++) {
//				cd.num = j+"";
//				if(j==1) {cd.num = "A"; }
//				clist.add(cd);
//			}
//		}
//		for(Card c:clist) {
//			System.out.print(c.shape +c.num+" ");
//		}
		
//		4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 
//		임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요.
		
		System.out.println();
		System.out.println("# 카드 섞기 #");
		Collections.shuffle(clist);		// 카드 섞기
		List<Card> mem01 = new ArrayList<Card>();
		List<Card> mem02 = new ArrayList<Card>();
		List<Card> mem03 = new ArrayList<Card>();
		List<Card> mem04 = new ArrayList<Card>();
		
		for(int i=0; i<28; i++) {	// 4명에게 각 7장씩 카드를 전달. 총 28번 카드 전달
			Card d = clist.get(i);	// 카드 한 장씩 뽑기
//			System.out.println(d.num);
			if(i%4==0) { mem01.add(d); System.out.println(i);}	
				// 0번째 사람한테 카드 전달, add(clist.get(i)), i=0,4,8,...
			if(i%4==1) { mem02.add(d); }
			if(i%4==2) { mem03.add(d); }
			if(i%4==3) { mem04.add(d); }
		}
		System.out.println("# 각 플레이어별 카드 내용 #");
		for(Card m1:mem01) {
			System.out.print(m1.getShape()+m1.getNum()+ " ");
		}
		System.out.println();
		for(Card m2:mem02) {
			System.out.print(m2.getShape()+m2.getNum()+ " ");
		}
		System.out.println();
		for(Card m3:mem03) {
			System.out.print(m3.getShape()+m3.getNum()+ " ");
		}
		System.out.println();
		for(Card m4:mem04) {
			System.out.print(m4.getShape()+m4.getNum()+ " ");
		}
		
	}
}
class Card{
	String shape;
	String num;
	public Card() {}
	public Card(String shape, String num) {
		this.shape = shape;
		this.num = num;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
}
class CorrectException extends Exception{
	public CorrectException(String ans) {
		super("입력한 답은: " +ans +"입니다.");
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "\n오답입니다. ";
	}
}