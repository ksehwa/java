package chap4_2;

public class ex_04 {

	public static void main(String[] args) {
		
		// 5. 
		
//		for (int i =1; i <5; i++) 
//			
//			for (int w = 1; w <=i; w++) 
//	         {
//		          
//		        System.out.print("*");
//		         if (i == w) 
//		          {
//		              System.out.println();      // 한 줄 내림
//			     
//					
		
		// 5-1.
		
//        for (int i = 4; i > 0; i--) 
//			
//			for (int w = 1; w <=i; w++) 
//	         {
//		          
//		        System.out.print("*");
//		         if (i == w) 
//		          {
//		              System.out.println();
//		              
//				
		
		
		for (int i =1; i <5; i++) { 
			for (int w = 4; w >0; w--){ 
	         
	        	 if (i <  w) {
	               System.out.println("");      // 한 줄 내림
	        	   }else {
		        	System.out.print("*");
		          }
		         }System.out.println();
		}
		}
	
	}


