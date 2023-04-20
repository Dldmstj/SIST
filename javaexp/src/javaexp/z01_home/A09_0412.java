package javaexp.z01_home;

public class A09_0412 {

   public static void main(String[] args) {


//      [1단계:개념] 1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
         /*
           1) 메서드의 처리형태 - 입력
                 main() 메서드 내부
                 Calcu cal = new Calcu();   // 객체 생성
                 cal.plus(1,2);            // plus함수 호출하여 매개변수 입력
                 
           2) 메서드의 로직/리턴
              class Calcu {
                 int plus(int num1, int num2) {   // 메서드의 로직
                    return num1 + num2;            // 메서드의 리턴값
                 }
            }
           3) 메서드의 복합형태
                 void isAdult(int age) {         // 정수형 매개변수를 입력받고 성인인지 아닌지 판별하는 메서드
                    if (age>=18) {            // 메서드 내에 반복/조건문을 사용할 수 있다.
                       system.out.println("성인");
                    }else if(age<18){
                       system.out.println("미성년자");
                    }else{
                       system.out.println("error");
                    }
                 }
          */
      
//      [1단계:개념] 2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
         /*
              1) 생성자로 데이터를 사용할 때
                 : 주로 객체를 생성하거나, 초기 데이터를 설정할 때 사용한다.
              
              class Person{
                 String name;
                 int age;
                 
                 Person(String name, int age) {
                    this.name = name;
                    this.age = age;
                 }   // main()에서 Person()호출하여 name과 age의 데이터를 입력받아 Person객체를 생성할 수 있다.
              }
              
                 
              2) 메서드로 데이터를 사용할 때
                 1) 주로 기능적인 처리를 하거나
                 2) 외부에 변경되는 데이터를 입력받거나
                 3) 해당 데이터를 로직에 의해 리턴할 때 주로 활용함.
                 
              class Person{
                    ...
                    void agePlus() {
                       age++;
                    }   // main() 에서 agePlus() 메서드를 호출하여, 생성된 Person객체의 age변수에 변화를 줄 수 있다.
              }
          */
      
//      [1단계:확인] 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
//         1) 3개에 입력값 중에 가장 큰수 출력
            RetExp100 ret = new RetExp100();
            int ret1 = ret.getLarge(3, -1, 0);
            System.out.println("가장 큰 수: " + ret1);
            System.out.println();
      
//         2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
            String str1 = ret.isPass(69);   System.out.println(str1);
            String str2 = ret.isPass(70);   System.out.println(str2);
            System.out.println();
            
//         3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
            String str3 = ret.isSell("감자");      System.out.println(str3);
            String str4 = ret.isSell("토마토");   System.out.println(str4);
            System.out.println();
            
//   [1단계:확인] 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//         1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
            LotteWorld lw = new LotteWorld();
            String str5 = lw.isFree(4);      System.out.println(str5);
            String str6 = lw.isFree(5);      System.out.println(str6);
            String str7 = lw.isFree(64);      System.out.println(str7);
            String str8 = lw.isFree(66);      System.out.println(str8);
            System.out.println();
            
//         2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
            double tprice1 = lw.discount(7);      System.out.println((int)tprice1 +"원");
            double tprice2 = lw.discount(19);      System.out.println((int)tprice2 +"원");
            double tprice3 = lw.discount(20);      System.out.println((int)tprice3 +"원");
            System.out.println();
            
//         3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
            String str9 = lw.isMember("짱구");      System.out.println(str9);
            String str10 = lw.isMember("수지");      System.out.println(str10);
            System.out.println();
      
//      [1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//            1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
//               탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//               버스번호 @@번 @@명이 탑승했습니다.
            
            Bus bus3000 = new Bus("3000");
            int onPass = bus3000.onBus(5);      System.out.println(onPass+"명이 탑승했습니다.");
            onPass = bus3000.onBus(7);         System.out.println(onPass+"명이 탑승했습니다.");
            int offPass = bus3000.offBus(3);      System.out.println(offPass+"명이 내렸습니다.");
            
            int nowBus = bus3000.pass;         System.out.println("현재 탑승자수: " +nowBus+"명");
            int totPass = bus3000.totPass;      System.out.println("누적 탑승자수: " + totPass +"명");
            
      
//      [1단계:개념] 6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요.
         /*
           1) 일반변수
              : 객체를 선언해야 그 객체의 변수에 접근할 수 있음. 재할당 가능.
           
           2) static 변수
              : 메모리에 띄워져 있기 때문에 객체를 선언하지 않아도 접근할 수 있음. 재할당 가능.  
           
           3) final 상수
              : 객체를 선언해야 해당 상수에 접근할 수 있음. 재할당 불가능.
              
           4) static final 상수
              : 메모리에 띄워져 있기 때문에 객체를 선언하지 않아도 접근할 수 있음. 재할당 불가능.
          */
      
      
//      [1단계:확인] 7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
            /*
                1) 상대적 경로이동
                   <a href = "/test.html"> 상대적 경로이동 </a>
                // 같은 폴더 내에 있을 때
                   
                2) 절대적 경로이동
                    <a href = "/frontWeb/a01_begin/a01_start.html"> 절대적 경로이동 </a>
                 // /frontWeb 프로젝트의 /webapp
             */
   }

}
//[1단계:확인] 3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
class RetExp100 {
   
//1) 3개에 입력값 중에 가장 큰수 출력
   int getLarge(int num1, int num2, int num3) { 
      System.out.println("입력된 숫자 1: " +num1);
      System.out.println("입력된 숫자 2: " +num2);
      System.out.println("입력된 숫자 3: " +num3);
      int max = 0;
      if(num1>max) {
    	  max = num1;		// num1이 max 보다 크면 max에 num1할당
      }
      if(num2>max) {
    	  max = num2;		// num2가 max 보다 크면 max에 num2할당
      }
      if(num3>max) {
    	  max = num3;		// num3이 max 보다 크면 max에 num3할당
      }
      return max;
      
      /* if(num1 >= num2 && num1 >= num3) {
         max = num1;
      }else if(num2 >= num1 && num2 >= num3) {
         max = num2;
      }else {
         max = num3;
      }
      return max;
   */ }
   
//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
   String isPass(int point) {
      System.out.println("입력된 점수: " +point + "점");
      return point >= 70 ? "합격":"불합격";
   }
   
//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
   String [] product = {"감자","고구마","옥수수"};
   String str;		// str = "은(는) 존재하지 않는 상품입니다.";
   String isSell(String prod) {
      for(int i=0; i<product.length; i++) {
         if(prod.equals(product[i])) {
            str = prod + "은(는) 판매중입니다.";
            break;
         }else {
            str = prod + "은(는) 존재하지 않는 상품입니다.";
         }
      }
      return str;
   }
   
}

//   [1단계:확인] 4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)

//    1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
class LotteWorld {
   final int ticket = 10000;
   
   String isFree(int age) {
      System.out.println("입력된 나이: " +age+"세");
      return age < 5 || age >= 65 ? "무료" : "유료";
   }
   
//    2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
   
   double discount(int age) {
      System.out.println("입력된 나이: " +age +"세");
      double disTicket;
      if(age>=0 && age <= 8) {      // 미취학 20%
         disTicket = ticket - ticket * 0.2;
      }else if(age >8 && age <= 19) {      // 청소년 15%
         disTicket = ticket - ticket * 0.15;
      }else {
         disTicket = ticket - ticket * 0.1;         // 이외 전부 10%
      }
      return disTicket;
   }
//    3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
   String [] member = {"짱구","철수","맹구","훈이","유리"};
   String str;		// str = "은(는) 존재하지 않는 회원입니다."; 기본값으로 설정.
   String isMember(String mem) {
      for(int i=0; i<member.length; i++) {
         if(mem.equals(member[i])) {
            str = mem + "은(는) 등록된 회원입니다.";
            break;
         }else {
            str= mem + "은(는) 존재하지 않는 회원입니다.";
         }
      }
      return str;
   }
   
}

//[1단계:확인] 5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
// 버스번호 @@번 @@명이 탑승했습니다.

class Bus {
   String bnum;
   int pass;
   static int totPass;
   
   public Bus(String bnum) {
      this.bnum = bnum;
   }
   
   int onBus(int pass) {		// 탑승
      System.out.print("버스번호 " + bnum +"번 ");
      int onPass = pass;
      this.pass += pass;
      totPass += pass;
      return onPass;
   }
   int offBus(int pass) {		// 하차
      System.out.print("버스번호 " + bnum +"번 ");
      int offPass = pass;
      this.pass -= pass;
      return offPass;
   }
   
}