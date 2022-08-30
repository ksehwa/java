package chap4;

public class p143_2 {

	public static void main(String[] args) {
		 
		// char 타입의 switch문
		// char 타입 변수를 이용해서 알파벳 대소문자에 관계없이 동일하게 처리하도록 만든 switch문

		char grade = 'B';
		
		switch(grade) {
		  case 'A':      //; 사용 금지
		  case 'a':
			  System.out.println("우수 회원입니다.");
			  break;
			  
		  case 'B':
		  case 'b':
			  System.out.println("일반 회원입니다.");
			  break;
		 
		  default:
			  System.out.println("손님 입니다.");
			  
		}
				
				
	}

}
