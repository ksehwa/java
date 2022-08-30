package chap2_3;

public class p81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 연산식에서 자동 타입 변환
	      
	      byte byteValue1 = 10;
	      byte byteValue2 = 20;
	      //byte byteValue3 = byteValue1 + byteValue2;    //컴파일 에러 : 연산결과릂 int 변수에 저장해야한다.
	      int intValue1 = byteValue1 + byteValue2;
	      System.out.println(intValue1);
	      
	      char charValue1 = 'A';
	      char charValue2 = 1;
	      //char charValue3 = char charValue1 + char charValue2   //컴파일 에러
	      int intValue2 = charValue1 + charValue2;
	      System.out.println("유니코드=" + intValue2);
	      System.out.println("출력문자=" + (char)intValue2);   // char type으로 강제 변환: 문자를 출력하기위해서	      
	      int intValue3 = 10;
	      int intValue4 = intValue3/4;
	      System.out.println(intValue4);
	      
	      int intValue5 = 10;
	      //int intValue6 = 10 / 4.0;     //컴파일 에러  
	      double doubleValue = intValue5 / 4.0;    //double type으로 변환
	      System.out.println(doubleValue);
	      
	      int x = 1;
	      int y = 2;
	      double result = (double) x / y;       //double type으로 변환
	      System.out.println(result);
	      
	      
	      

	   }

	
}
