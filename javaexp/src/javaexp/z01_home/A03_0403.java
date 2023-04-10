package javaexp.z01_home;

import java.util.Scanner;

public class A03_0403 {

   public static void main(String[] args) {
//      [1단계:개념] 1. 3항 연산자의 기본형식을 새로운 예제로 설명하세요
      Scanner sc1 = new Scanner(System.in);
      System.out.print("숫자를 입력하세요: ");
      int a = sc1.nextInt();
      System.out.println("입력한 값: " + a);
      String div = a % 2 == 1 ? "홀수" : "짝수";      // 삼항연산자
      System.out.println("구분: " + div);
      System.out.println();
      
//      [1단계:코드] 2. 3항 연산자를 활용하여 문제(3+4=?)를 내고, 해당 문제의 정답이 맞을 때, 정답 그외는 오답으로 처리하세요
      
      Scanner sc2 = new Scanner(System.in);
      System.out.print("3 + 4 = ? ");
      int inputNum = sc2.nextInt();
      int cor = 7;
      System.out.println("입력한 값: " + inputNum);
      String isPass = cor == inputNum ? "정답입니다." : "오답입니다. 정답은 7";
      System.out.println(isPass);
      System.out.println();
      
//      [1단계:개념] 3. Math.random 클래스와 메서드의 기능을 정수의 임의범위 처리 예제를 통해서 기술하세요
//      >> Math.random() 의 기본 범위 (실수)
      double n1 = Math.random(); System.out.println(n1);   // 0.0 <= Math.random() < 1.0
//      Math.random() 로 임의의 정수 생성하기
//      >> 0 ~ 9 까지의 10가지 경우의 수
      int n2 = (int)(Math.random()); System.out.println(n2); // 0 <= (int)(Math.random() * 10) < 10
//      >> 1 ~ 10 까지의 10가지 경우의 수
      int n3 = (int)(Math.random() * 10 + 1);   System.out.println(n3); // 1 <= (int)(Math.random() * 10+1) < 11
      System.out.println();
      
//      [1단계:코드] 4. 두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 각각 나온 주사위 합을 출력하세요
      int hongDice = (int)(Math.random() * 6 + 1);   // 홍길동의 랜덤 주사위
      int kimDice = (int)(Math.random() * 6 + 1);      // 김길동의 랜덤 주사위
      int hapDice = hongDice + kimDice;
      System.out.println("홍길동의 주사위 값: " + hongDice);
      System.out.println("김길동의 주사위 값: " + kimDice);
      System.out.println("두 주사위를 합한 값: " + hapDice);
      System.out.println();
      
//      [1단계:개념] 5. if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요 
//         중괄호 블럭을 사용한 if 문
      int p1 = 0;
      System.out.println("p1 값이 5가되면 * 출력"); p1++;
      System.out.println("p1의 현재 값은? " + p1); p1++;
      System.out.println("p1의 현재 값은? " + p1); p1++;
      System.out.println("p1의 현재 값은? " + p1); p1++;
      System.out.println("p1의 현재 값은? " + p1); p1++;
      if (p1 == 5) {
         System.out.println("p1의 현재 값은? " + p1 + " * ");
      }
      System.out.println();
      
//         if문 바로 옆의 조건문 수행
      int p2 = 0;
      System.out.println("p2의 값이 3이되면 * 출력"); p2++;
      System.out.println("p2의 현재 값은? " + p2); p2++;
      if(p2 == 3) System.out.println("p2의 현재 값은? " + p2 + " * ");
      System.out.println("p2의 현재 값은? " + p2); p2++;
      if(p2 == 3) System.out.println("p2의 현재 값은? " + p2 + " * ");
      System.out.println();
      
//         if문 바로 아래의 조건문 수행
      int p3 = 0;
      System.out.println("p3의 값이 6이되면 * 출력"); p3++;
      System.out.println("p3의 현재 값은? " + p3); p3++;
      if(p3 == 6)
         System.out.println("p3의 현재 값은? " + p3 + " * ");
      System.out.println("p3의 현재 값은? " + p3); p3++;
      if(p3 == 6)
         System.out.println("p3의 현재 값은? " + p3 + " * ");
      System.out.println("p3의 현재 값은? " + p3); p3++;
      if(p3 == 6)
         System.out.println("p3의 현재 값은? " + p3 + " * ");
      System.out.println("p3의 현재 값은? " + p3); p3++;
      if(p3 == 6)
         System.out.println("p3의 현재 값은? " + p3 + " * ");
      System.out.println("p3의 현재 값은? " + p3); p3++;
      if(p3 == 6)
         System.out.println("p3의 현재 값은? " + p3 + " * ");
      System.out.println();
      
      
//      [1단계:코드] 6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
      System.out.println("이상할 때 가는 곳은? ");
      Scanner sc3 = new Scanner(System.in);
      String inputAns = (sc3.nextLine());
      String corAns = "치과";
      System.out.println("내가 입력한 답: " + inputAns);
      if(inputAns.equals(corAns)) {
         System.out.println("정답입니다!");
      }else {
         System.out.println("오답입니다. 정답은 치과입니다.");
      }
      System.out.println();
      
//      [1단계:코드] 7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
//                 0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
      int rDice = (int)(Math.random() * 10 +1);
      System.out.println("구슬의 갯수를 맞춰보세요: ");
      Scanner sc4 = new Scanner(System.in);
      int inDice = sc4.nextInt();
      System.out.println("내가 입력한 답: " + inDice);
      System.out.println("구슬의 갯수: " + rDice);
      if(inDice == rDice) {
         System.out.println("success");
      }else {
         System.out.println("failure");
      }
      System.out.println();
      
//                 1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
      
      System.out.println("홀(1), 짝(0): ");
      Scanner sc = new Scanner(System.in);
      int hol = sc.nextInt();
      System.out.println("내가 입력한 답: " + hol);
      if(hol == 1 || hol == 0) {
         System.out.println("success");
      }else {
         System.out.println("failure");
      }
      System.out.println();
      
//                 2) 홀/짝을 입력하여, success/failure 처리하세요.
      System.out.println("홀수(홀), 짝수(짝): ");
      Scanner sc5 = new Scanner(System.in);
      String hj = sc5.nextLine();
      System.out.println("내가 입력한 답: " + hj);
      if(hj.equals("홀") || hj.equals("짝")) {
         System.out.println("success");
      }else {
         System.out.println("failure");
      }
      System.out.println();
      
//      [1단계:개념] 8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
      int age = (int)(Math.random()* 99 +1);   // 1 ~ 99 중의 임의의 수
      System.out.println("나이: " + age);
      if(age >= 90) {
         System.out.println("90대 입니다.");
      }else if(age >= 80) {         // if(point < 90 && point >= 80)
         System.out.println("80대 입니다.");
      }else if(age >= 70) {
         System.out.println("70대 입니다.");
      }else if(age >= 60) {
         System.out.println("60대 입니다.");
      }else if(age >= 50) {
         System.out.println("50대 입니다.");
      }else if(age >= 40) {
         System.out.println("40대 입니다.");
      }else if(age >= 30) {
         System.out.println("30대 입니다.");
      }else if(age >= 20) {
         System.out.println("20대 입니다.");
      }else if(age >= 10) {
         System.out.println("10대 입니다.");
      }else {
         System.out.println("아동 입니다.");
      }
      System.out.println();
      
//      [1단계:코드] 9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를
//                 비교하여, 승/무/패를 출력하세요.
      int comDice = (int)(Math.random() * 6 + 1);   // 컴퓨터의 랜덤 주사위
      int myDice = (int)(Math.random() * 6 + 1);      // 나의 랜덤 주사위
      System.out.println("컴퓨터의 주사위: " + comDice);
      System.out.println("내 주사위: " + myDice);
      if(comDice == myDice) {
         System.out.println("무승부");
      }else if(comDice > myDice){
         System.out.println("컴퓨터에게 졌습니다.");
      }else {
         System.out.println("컴퓨터에게 이겼습니다.");
      }
      System.out.println();
      
//      [1단계:개념] 10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
      System.out.print("1 ~ 5 중에 한가지 숫자를 입력하세요: ");
      Scanner sc6 = new Scanner(System.in);
      int holjjak = sc6.nextInt();
      System.out.println("입력한 숫자: "+ holjjak);
      switch(holjjak) {
         case 1:
         case 3:
         case 5:
            System.out.println("홀수입니다.");
            break;
         case 2:
         case 4:
            System.out.println("짝수입니다.");
            break;
         default:      // case에서 나열된 데이터가 아닐 때
            System.out.println("1~5까지만 입력해주세요.");
      }
      System.out.println();
      
//      [1단계:코드] 11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, switch case처리하여 해당 최종 위치를 처리하고,
//               그외는 정보가 없습니다 라고 표시하세요.
      System.out.println("검색할 버스 노선을 입력해주세요: ");
      Scanner sc7 = new Scanner(System.in);
      int bus = sc2.nextInt();
      switch(bus) {
         case 100:
         case 200:
         case 500:
            System.out.println( bus + "번 버스의 목적지는 @@동");
            break;
         case 300:
         case 400:
         case 600:
            System.out.println(bus + "번 버스의 목적지는 $$동");
            break;
         default:
            System.out.println("정보가 없습니다.");
      }
   }

}