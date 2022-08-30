package chap4_2;

public class p152 {

	public static void main(String[] args) {
		//  for문 사용 1부터 100까지 합을 출력
		
//		int sum = 0;
//		
//		int i = 0;
//		for(i=1; i<=100; i++) {
//			sum += i;
//			
//		
//		}
//        System.out.println("1~100 합: " + sum);	
		
		
		
		int sum = 0;
	
		int i = 0;
		
		// for(i=1; i<=100; i++) {
		// for(i=1; i<=100; i+=2)         //홀수 i+=2
	    // for(; i<=100; i+=2) {          //짝수 i+=2  
		   for(i=2; i<=100; i+=2) {       //짝수 i+=2
		
		     sum += i;
		     System.out.println("i:" + i);
		}
       
		// System.out.println("1~" + (i-1) + "합 :"  + sum);	


	
	}
}


