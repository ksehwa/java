package chap3;

public class p123 {

	public static void main(String[] args) {
		
		// 논리 연산자
		
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자군요");
		}
		
		
	    if( (charCode>=48) && ! (charCode<=57) ) {     // ! : 피연산자의 논리값을 바꿈
	    
				System.out.println("0~9 숫자군요"); 
	    }
	    
	     int Value = 6;
	    
	    if ((Value%2==0) | (Value%3==0) ) {           // | 또는 || : 피연산자중 하나만 true이면 연산결과는 True
	    	System.out.println("2또는 3의 배수군요");
	    }	
	    
	    if ((Value%2==0) || (Value%3==0) ) {
		    	System.out.println("2또는 3의 배수군요");
				
	   }

     }
 }

