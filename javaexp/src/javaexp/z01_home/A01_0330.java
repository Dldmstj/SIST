package javaexp.z01_home;

public class A01_0330 {
   public static void main(String[] args) {
//      [1단계:개념] 1. Z01_JavaPro.java의 실행과정의 오늘한 예제 기준으로 정리해보세요.
      
      System.out.println("start java");// A01_0330.java 소스코드 작성
      /*      
       javac A01_0330.java   // 컴파일 파일 생성.
       A01_0330.java.class 생성
       java A01_0330 : main()가 있는 파일에서 메모리 로딩 -> 실행
      */
      

      /*
       [1단계:코드] 2. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요 
          - 이름, 나이, 키 
          - 좋아하는 음악명, 발매연도
          - 오늘 지출금액 목록과 비용, 합산
       */
      
      String name = "이은서";      // 이름
      String age = "25";         // 나이
      String height = "162";      // 키
      
      String music = "Fix you";   // 좋아하는 음악
      String musicYear = "2005";   // 발매연도
      
      String lunch = "점심";      // 지출
      String snack = "간식";      // 지출
      int lunchMoney = 4000;      // 점심 비용
      int snackMoney = 5000;      // 간식 비용
      int hap = lunchMoney + snackMoney ;      // 지출 합산
      
      System.out.println("이름:" + name + ", 나이: " + age + ", 키:" + height);
      System.out.println("좋아하는 음악:" + music + ", 발매연도: " + musicYear);
      System.out.println("오늘의 지출: " + lunch +", "+ snack + " / " + "지출 합산: " + hap);
      System.out.println("-------------------------------------");
      
      
//      [1단계:개념] 3. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
      
      System.out.print("안");
      System.out.print("녕하");
      System.out.print("세요");      // 줄바꿈 x
      
      System.out.println("\n");
      
      System.out.println("안");
      System.out.println("녕하");
      System.out.println("세요");      // 줄바꿈 o
      
      System.out.println();
      
      System.out.println("안녕하세요 \n제 이름은 \"이은서\"입니다.");
      // \n 줄바꿈, \" 따옴표
      System.out.println("이\t은\t서");
      // \t 탭간격
      System.out.println("-------------------------------------");
      
//      [1단계:개념] 4. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
      
      System.out.println("변수명의 선언 규칙");
      
      int num01 = 0;      // 변수의 첫번째 글자는 문자로 시작
      int _num01;      // 변수명의 특수문자는 $,_만 허용된다
      int Num01;      // 변수명에서 대소문자는 구분된다.
      num01 = 30;      // 동일한 변수명은 사용할 수 없지만, 재할당은 가능하다.
//      int for = 100;   // 예약어로된 변수명은 사용할 수 없다.
      
      int payMoney = 1000;      // 가독성을 위해 대문자로 구분하여 선언한다.
      
//      [1단계:개념] 5. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
      
      byte num1 = 127;
      short num2 = 12345;
      int num3 = 2147483647;
      long num4 = 99999999999L;      // long 데이터 유형을 할당할 때 l/L 붙이기
      
      float num5 = 3.14f;         // float 데이터 유형을 할당할 때 f/F 붙이기
      double num6 = 1.234567;
      
      System.out.println("데이터의 기본 유형");
      System.out.println("정수형");
      System.out.println(num1+", "+num2+", "+num3+", "+num4);
      System.out.println("실수형");
      System.out.println(num5+", "+num6);
      
//      [1단계:개념] 6. 형변환이란 무엇인가 예제를 통해서 기술하세요.
      byte i= 25;
      int j = 10;
      j = i;      //   작은 데이터 유형을 큰 데이터 유형으로 묵시적 형변환
      i = (byte)j;   // 큰 데이터 유형을 작은 데이터 유형으로 명시적 형변환

//      [1단계:코드] 7. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
      
      int n1 = 2100000000;
      int n2 = 1500000000;
      
      System.out.println();
      System.out.println("21억 + 15억 = " + ((long)n1 + (long)n2));
      
//      [1단계:개념] 8. char유형과 code값의 관계에 대하여 기술하세요.
//       : char 자료형으로 선언한 변수에는 문자가 저장되는 것이 아닌, 문자에 해당되는 아스키코드 값이 저장됨
      
//      [1단계:코드] 9. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요. 
       for(char a = 'A'; a<='z'; a++) { 
          System.out.print(a+":");
            System.out.println((int)a);
       }
       
       System.out.println("\n");
       
       for(int b=0; b<10; b++) {
            System.out.print(b+":");
            System.out.println((char)b);
         }
   }
}