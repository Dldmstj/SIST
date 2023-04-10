package javaexp.z01_home;

import java.util.Scanner;

public class A04_0404 {

   public static void main(String[] args) {
//      [1단계:개념] 1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
//         for 문의 기본 형식
//          for(초기값; 반복조건; 증/감연산자){
//             반복 수행할 구문
//          }
      for(int i=1; i<=10; i++) {
         System.out.print(i + " ");
      }
      System.out.println("\n");
      
//      [1단계:코드] 2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//         1) 200~300 10단위 출력
      for(int i=200; i<=300; i+=10) {
         System.out.print(i + " ");
      }
      System.out.println("\n");
//         2) 1000~950 3단위 감소
      for(int i=1000; i>=950; i-=3) {
         System.out.print(i + " ");
      }
      System.out.println("\n");
//         3) 100~0까지 2로 나눈값
      for(int i=100; i>=0; i--) {
         System.out.print(i%2 + " ");
      }
      System.out.println("\n");
      
//      [1단계:개념] 3. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
//         1) 지역변수 : 지역변수는 선언한 현재 블럭 내에서만 사용할 수 있다.
//         2) 전역변수 : 전역변수는 상위 블럭에서 선언하면 하위 블럭에서도 모두 사용된다.
      
//      [1단계:개념] 4. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요
         int num = 10;
         for(int i=1; i<=num; i++) {      
            // 상위 블럭에서 선언한 num 변수를 for문 내에서도 사용할 수 있다.
            System.out.print(i + " ");
         }
         System.out.println("\n");
         
//      [1단계:코드] 5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//                      no 과일명  가격
//                       1 사과    3000            
//                       2 바나나   4000           
//                       3 딸기    12000
//                         총계    19000
         
         String fruName = "";      // 과일의 이름
         int fruPrice = 0;         // 과일의 가격
         String fruList = "";      // 과일이름과 가격을 문자열로 담아둘 변수
         int totFruPrice = 0;      // 과일의 총 가격을 저장할 변수
         Scanner sc1 = new Scanner(System.in);
         Scanner sc10 = new Scanner(System.in);
         for(int i=1; i<=3; i++) {
            System.out.print("과일의 이름을 입력하세요: ");
            fruName = sc1.nextLine();
            System.out.print("과일의 가격을 입력하세요: ");
            fruPrice = sc10.nextInt();
            fruList += i + "\t" + fruName + "\t" + fruPrice +"\n";
            totFruPrice += fruPrice;
         }
         System.out.println("\nno\t과일명\t가격");
         System.out.println(fruList);
         System.out.println(" 총계 :\t" + totFruPrice +"원\n");
         
         
//      [1단계:코드] 6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//                     # 출력 형식
//                     날짜  갯수 누적
//                     1일차 2개  2개
//                     2일차 4개  6개
//                     3일차 6개 12개
         int breadCnt = 0;      // 빵의 갯수
         int totCnt = 0;         // 누적된 빵의 갯수
         System.out.println("날짜\t갯수\t누적");
         for(int i=1; i<=3; i++) {
            breadCnt += 2;
            totCnt += breadCnt;
            System.out.println(i+"일차\t" + breadCnt + "개\t" +totCnt +"개");
         }
         System.out.println("\n");
         
//      [1단계:코드] 7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
         int hap04 = 0;
         for(int i=1; i<=100; i++) {
            if(i%4==0) {
               System.out.print("# ");
               hap04 += i;
            }
            System.out.print(i + " ");
         }
         System.out.println("\n1부터 100 사이에 있는 4의 배수를 모두 더하면? " + hap04);
         
         System.out.println("\n");
         
//      [2단계:코드] 8. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
         for(int i=1; i<=20; i++) {
            if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
               System.out.print("짝! ");
            }else{
               System.out.print(i + " ");
            }
         }
         System.out.println("\n");
         
//      [1단계:개념] 9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
//          for(변수1 초기화; 변수1의 반복조건; 변수1에 대한 증감연산자) {
//            for(변수2 초기화; 변수2의 반복조건; 변수2에 대한 증감연산자) {
//               반복 처리할 구문
//            }
//            반복 처리할 구문
//         }
         
//      [1단계:코드] 10. 아래 내용을 2중 for문을 활용하여
//         1) 2X2(행X열)로 ♥를 표시
         for(int row=1; row<=2; row++) {
            for(int col=1; col<=2; col++) {
               System.out.print("♥");
            }
         System.out.println();
         }
         System.out.println("\n");
         
//         2) 3X2(행X열)로 ★표시 
         for(int row=1; row<=3; row++) {
            for(int col=1; col<=2; col++) {
               System.out.print("★");
            }
            System.out.println();
         }
         System.out.println("\n");
         
//         3) 입력한 행/열로 입력한 기호표시
         Scanner sc00 = new Scanner(System.in);
         System.out.print("행을 입력하세요: ");
         int row = sc00.nextInt();
         Scanner sc01 = new Scanner(System.in);
         System.out.print("열을 입력하세요: ");
         int col = sc01.nextInt();
         Scanner sc02 = new Scanner(System.in);
         System.out.print("기호를 입력하세요: ");
         String pic = sc02.nextLine();
         
         System.out.println("#"+ row + " × " + col + "#");
         for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
               System.out.print(pic);
            }
            System.out.println();
         }
         
         System.out.println("\n");
         
//      [1단계:개념] 11. while문의 기본 형식을 예제를 통해 설명하세요.
//         while(반복할 조건) {
//              반복할 조건이 true인 동안 처리할 구문
//           }
         
//      [1단계:개념] 12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
         int cnt = 100;
         int cntHap = 0;
         while(cnt >=90) {
            System.out.print(cnt + " ");
            cntHap += cnt;
            cnt--;
         }
         System.out.println("\n100부터 90까지의 합산 결과: " + cntHap);
         System.out.println("\n");
         
//      [1단계:코드] 13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
         Scanner sc11 = new Scanner(System.in);
         int point = 0;
         int pointHap = 0;
         int stdCnt = 0;
         while(point != -1) {
            System.out.println("점수를 입력하세요(종료시 -1): ");
            point = sc11.nextInt();
            if(point != -1) {
               pointHap +=  point;
               stdCnt++;
            }
            
         }
         System.out.println("총 점수: " + pointHap);
         System.out.println("평균: " + pointHap/stdCnt);
         System.out.println("\n");
         
//      [1단계:개념] 14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
//         for (int num=1; num<=10; num++) {
//            if(조건 1) {
//               continue;      
               // 조건 1에 해당하는 경우, 본 step을 수행하지 않고 다음 step으로 넘어감
//            }else if(조건 2){
//               break;
               // 조건 2에 해당하는 경우, 반복문 수행 종료.
//            }else{
               // 그 외 수행될 구문.
//            }
//         }
   }

}