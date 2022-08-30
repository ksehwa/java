package chap5;

public class p187 {

	public static void main(String[] args) {
		
		// main() 메소드의 매개 변수
		
		 if(args.length != 2) {                        // 입력된 데이터 개수가 2개가 아닐 경우
			 System.out.println("값의 수가 부족합니다.");    // 실행할 때 매개값을 주지 않으면 길이 0인 String배열이 매개값으로 전달
			 System.exit(0);                           // 프로그램 강제 종료
		 } 
	
	     String strNum1 = args[0];   //10              // 첫 번째 데이터 얻기
	     String strNum2 = args[1];   //20              .// 두 번째 데이터 얻기
	     
	     int num1 = Integer.parseInt(strNum1);         // 문자열을 정수로 변환
	     int num2 = Integer.parseInt(strNum2);         // 문자열을 정수로 변환
	     
	     int result = num1 + num2;
	     System.out.println(num1 + " + " + num2 + " = " + result);
	}
	
	

}
