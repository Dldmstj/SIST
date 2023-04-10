package javaexp.z01_home;

import java.util.Scanner;

public class A02_0331 {

   public static void main(String[] args) {
//      [1단계:개념] 1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요

      int num1 = 22;
      int num2 = 11;
      System.out.println(num1 + num2);
      System.out.println(num1 - num2);
      System.out.println(num1 * num2);
      System.out.println(num1 / num2);
      System.out.println(num1 % num2);
//      연산자 : 연산에 사용되는 기호 (+,-,*,/,%)
//      피연산자 : 연산의 대상이 되는 데이터 (num1, num2)
//      연산식 : 피연산자와 연산자의 조합
      System.out.println();
      
//      [1단계:개념] 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
      
      int a = 10;
      int b = 20;
      
      System.out.println(a + "+" + b + "=" + (a + b));
      System.out.println(a + "-" + b + "=" + (a - b));
      System.out.println(a + "×" + b + "=" + (a * b));
      System.out.println(a + "÷" + b + "=" + (a / b));
      System.out.println(a + "%" + b + "=" + (a % b));
      System.out.println();
      
//      [1단계:코드] 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 
//         소숫점 이하가 처리된 경우와 소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요.
      
      int orange = 500;      // 오렌지쥬스의 양
      int cupCnt = 3;         // 잔의 갯수
      System.out.println("3잔에 나누면? (소숫점 x): " + (orange/cupCnt) + "cc");
      System.out.println("3잔에 나누면? (소숫점 o): " + (orange/(double)cupCnt) + "cc");
      System.out.println();
      
//      [2단계:코드] 4.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//         김밥 1개 구매  2500 
//         김밥 2개 구매  5000
//         김밥 3개 구매  10000
      
      int gimbapCnt = 1;      // 김밥의 갯수
      int gimbapMoney = 2500;   // 김밥의 단가
//      int totMoney = gimbapCnt * gimbapMoney;   // 김밥의 총 금액 계산
      System.out.println("김밥 "+ gimbapCnt + "개 구매 " + (gimbapCnt * gimbapMoney));
      gimbapCnt++;      // 김밥의 갯수 1 증가
      System.out.println("김밥 "+ gimbapCnt + "개 구매 " + (gimbapCnt * gimbapMoney) ); 
      gimbapCnt++;      // 김밥의 갯수 1 증가
      System.out.println("김밥 "+ gimbapCnt + "개 구매 " + (gimbapCnt * gimbapMoney) );
      System.out.println();
      
//      [1단계:개념] 6. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
      String str1 = new String("감자");
      String str2 = new String("감자");
      System.out.println(str1 == str2);
      // false가 출력됨. heap영역에 저장된 주소를 비교함. 둘의 주소값이 다르기 때문에 다르게 인식함.
      System.out.println(str1.equals(str2));
      // true가 출력됨. equals를 사용해서 값을 비교할 수 있다.
      System.out.println();
      
//      [1단계:개념] 7. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요.
      
//       마우스 우클릭 -> Run As -> Run Confi... -> Arguments 탭 -> 
//      Program Argu... 에서 매개변수를 직접 입력할 수 있다.

//       java A02_0331 Program Arguments에 감자 10 을 입력 -> String[] args = {"감자","10"};
//       args[0] : "감자"
//       args[1] : "10"
//      크기가 2인 배열 생성됨.
      
//      [2단계:코드] 8. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아
//               계산서(전체 총계포함)를 출력하세요.
      
//       main()의 매개변수: String[] args 
//                  = {"고구마", "3000","3","감자","1000","2"}

      int prodMoney1 = Integer.parseInt(args[1]);      // 물건명 1
      int prodMoney2 = Integer.parseInt(args[4]);      // 물건명 2
      int prodCnt1 = Integer.parseInt(args[2]);      // 물건1 갯수
      int prodCnt2 = Integer.parseInt(args[5]);      // 물건2 갯수
      int totProd = prodCnt1 + prodCnt2;            // 물건 총 갯수
      int totMoney = (prodMoney1 * prodCnt1) + (prodCnt2 * prodMoney2);   // 물건 총 가격

      System.out.println("# 계산서 #");
      System.out.println("물건명: " + args[0] + " / " + "가격: "+ args[1] 
                     + " / " + "갯수: " + args[2]);
      System.out.println("물건명: " + args[3] + " / " + "가격: "+ args[4] 
                     + " / " + "갯수: " + args[5]);
      System.out.println("총 갯수: " + totProd);
      System.out.println("총 가격: " + totMoney);
      System.out.println();
      
//      [1단계:개념] 9. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
      Scanner sc = new Scanner(System.in);   // Scanner import 해서 써야함
      System.out.println("이름을 입력하세요: ");
      String name = sc.nextLine();      
      // Scanner의 nextLine()를 사용해서 name 매개변수에 입력받은 값을 집어넣는다.
      System.out.println("입력된 이름: " + name);      // name 변수에 입력된 값 출력
      
//      [1단계:코드] 10. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 
//            선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
      System.out.print("선수명을 입력하세요: ");
      String player = sc.nextLine();      // 선수명 입력받아서 player 변수에 저장
      System.out.print("타석 수를 입력하세요: ");
      int totalCnt = Integer.parseInt(sc.nextLine());      // 타석 수 입력받아서 player 변수에 저장
      System.out.print("안타 수를 입력하세요: ");
      int hitsCnt = Integer.parseInt(sc.nextLine());      // 안타 수 입력받아서 player 변수에 저장
      double battingAvg = (double)hitsCnt / totalCnt;   // 타율 계산식 
      
      System.out.println("선수명: " + player);
      System.out.println("타석 수: " + totalCnt);
      System.out.println("안타 수: " + hitsCnt);
      System.out.println(player + " 선수의 타율은 " + battingAvg + " 입니다.");
      System.out.println();
      
//      [1단계:개념] 11. 비교연산자의 종류를 예시와 함께 기술하세요
//         비교 연산자의 종류: ==, !=, >, <, >=, <=
              int p1 = 30;
              int p2 = 20;
            System.out.println(p1 == p2);
            System.out.println(p1 != p2);
            System.out.println(p1 > p2);
            System.out.println(p1 < p2);
            System.out.println(p1 >= p2);
            System.out.println(p1 <= p2);
            System.out.println();

      
//      [1단계:코드] 12. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
            System.out.print("나이를 입력하세요: ");
            int age = sc.nextInt();
            boolean isAdol = age >= 18;
            System.out.println("성인입니까? " + isAdol);
            System.out.println();
            
//      [1단계:개념] 13. 논리연산자의 종류를 예제와 함께 기술하세요.
//         논리 연산자의 종류: &&, ||, !(not)
            boolean point1 = true;
            boolean point2 = false;
//            && (and) : 두 개의 비교 연산자가 모두 true일 때 true 반환
               System.out.println(point1 && point2);
//            || (or) :  양쪽 모두 true일 경우에만 true 반환
               System.out.println(point1 || point2);
//            ! (not) : 연산식의 결과가 true이면 false, false이면 true 반환
               System.out.println(!point1);
               System.out.println(!point2);
   
   }

}