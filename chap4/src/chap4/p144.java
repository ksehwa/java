package chap4;

public class p144 {

	public static void main(String[] args) {
		
		// string 타입의 switch문
		
		String position = "과장";     // String타입 변수를 이용
		
	switch(position) {
	  case "부장":
		  System.out.println("700만원");
		  break;
	  case "과장":
		  System.out.println("500만원");
		  break;
	  default:
		  System.out.println("300만원"); 
	}

	}

}
