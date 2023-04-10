package javaexp.z01_home;

import java.util.Scanner;

public class A05_0405 {

   public static void main(String[] args) {
//      [1단계:개념] 1. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
//         자바의 주요 메모리 두 가지 : stack, heap
//            - stack: 생성된 객체의 주소값(16진수)을 저장해두는 영역.
//            - heap: 객체가 생성되면 실제로 저장되는 영역
      
//      [1단계:개념] 2. 배열의 구성요소를 예제를 통해서 기술하세요
//         데이터유형[] = 배열이름 = new 데이터유형[배열의 길이];
         int[] array00 = new int[3];

//      [1단계:개념] 3. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
         // 정수형 배열
         int[] array01;
         array01 = null;      // heap영역에 메모리 생성되지 않은 상태
         array01 = new int[3];   // array01에 크기 3의 공간 할당.
         array01[0] = 1;      // array01의 첫번째 공간에 정수 1 할당.
         
         // 실수형 배열
         double[] array02;
         array02 = null;
         array02 = new double[3];
         array02[2] = 3.33;
         
         // 문자열 배열
         String[] array03 = new String[3];   // 배열의 선언과 동시에 초기화할 수 있다.
         array03[1] = "hello";   //
         
         
//      [1단계:개념] 4. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
//         1) 배열은 선언과 동시에 값을 할당할 수 있다.
         int[] array04 = new int[] {1,2,3};
         System.out.println("배열의 크기가 " + array04.length+ "인 배열의 값 출력하기");
         for(int idx=0; idx<array04.length; idx++) {
            System.out.println(idx+1 +"번째 값: " + array04[idx]);
         }
      System.out.println("\n");
      
//         2) 배열끼리의 index가 같다면, 반복문으로 함께 출력할 수 있다.
         String[] array05 = new String[] {"a","b","c"};
         System.out.println();
         for(int idx=0;idx<array04.length;idx++) {
            System.out.print(idx+1+") ");
            System.out.print(array04[idx]+"\t");
            System.out.print(array05[idx]+"\n");
         }
      System.out.println("\n");
         
//      [1단계:코드] 5. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
         Scanner sc = new Scanner(System.in);
         int[] score = new int[] {0,0,0};
         int totScore = 0;
         double avgScore = 0;
         for(int idx=0; idx<score.length; idx++) {
            System.out.print("점수를 입력하세요: ");
            score[idx] = sc.nextInt();
            totScore += score[idx];
            avgScore = (double)totScore/score.length;
         }
         System.out.println("입력된 점수의 총 합계: " + totScore);
         System.out.println("입력된 점수의 평균: " + avgScore);
         
         System.out.println("\n");
//      [1단계:코드] 6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요.
         String stdArry[] = new String[] {"김학생","박학생","이학생"};
         int korArry[] = new int[] {70,80,90};
         int engArry[] = new int[] {100,90,80};
         System.out.println("학생이름\t국어점수\t영어점수");
         for(int idx=0; idx<stdArry.length; idx++) {
            System.out.print(stdArry[idx]+"\t");
            System.out.print(korArry[idx]+"\t");
            System.out.print(engArry[idx]+"\n");
         }
         System.out.println("\n");
         
//      [1단계:코드] 7. 배열로 가위,바위,보라고 선언한 후, 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요
         String gameArry[] = new String[] {"가위","바위","보"};
         String std1 = gameArry[(int)(Math.random() * 3)];
         String std2 = gameArry[(int)(Math.random() * 3)];
         System.out.println("학생 1: " + std1);
         System.out.println("학생 2: " + std2);
         
//       풀이)
         
			/*
			 * String games [] = {"가위","바위","보"};
			 * 
			 * int f1 = (int)(Math.random() * 3);
			 * int f2 = (int)(Math.random() * 3);
			 * 
			 * System.out.println("학생1: " + games[f1] + "\n학생2: " + games[f2]);
			 */
         
         
//      [1단계:개념] 8. 웹서버와 웹클라이언트는 어떤 프로그램으로 실행되는지? network환경과 함께 기술해보세요.
         /*
          웹 서버: Apache, Microsoft, ...
          웹 클라이언트: chrome, 오페라, 파이어폭스, ...
          */
         
//      [1단계:개념] 9. 오늘 eclipse와 vscode를 통해서 설정한 웹환경과 초기 화면 로딩을 위해 필요한 설정 부분을 기술해보세요.
         /*
          eclipse : File -> new -> Dynamic Web Project 에서 프로젝트 생성
                상단의 Window 탭 -> Preferences -> 왼쪽의 Web 탭 -> CSS Files, HTML Files, JSP Files 의 인코딩을 모두 UTF-8로 변경
          vscode : 마켓 플레이스에서 Live Server와 open in browser 설치
                파일 설정의 setting custom 탭 -> Custom Browser 을 chrome으로 설정한다.
          */
         
//      [1단계:개념] 10. html을 구성하고 있는 기본 계층구조의 태그들의 내용을 기술하세요. 
         /*
          <!DOCTYPE html> : 문서 타입
          <html></html>
          <head></head> : title, style, script를 작성
          <body></body> : h1~h6,img 등 화면에 보여질 내용을 작성
          */
         
//      [1단계:개념] 11. html에서 사용하는 3가지 언어의 예제를 통해서 기술하세요.
         /*
           1) HTML
                 <html>
                    <head></head>
                    <body>
                       <h1> 입력할 내용 <h2>
                    </body>
                 </html>
                 
           2) css 
                 <style type="text/css">
               태그{속성:속성값;}
            </style>
            
           3) java script
              <script type="text/javascript">
            function chColor(obj){
               obj.style.backgroundColor="yellow"
            }
         </script>
           
          */
         
         
         
   }

}