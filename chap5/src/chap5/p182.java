package chap5;

public class p182 {

	public static void main(String[] args) {
		
		// 값 목록으로 배열 생성
		
		int[] scores = {83,90,87,};
		
		int sum1 =0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
        System.out.println("총합: " + sum1);
        
       // 값 목록으로 배열을 생성함과 동시에 add()메소드의 매개값으로 사용시 new 연산자를 사용
        int sum2 = add ( new int[] {83,90,87} );       //new 미사용시 오류    
		System.out.println("총합: " + sum2);
		System.out.println();
		
	}
	
	public static int add(int[]scores) {
		int sum = 0;
		int num = scores.length;     //array size
		System.out.println("lengh" +num);
		//for (int i=0; x<num; i++)
		  for(int i=0; i<3; i++) {           
			sum += scores[i];                // 총합을 계산해서 리턴하는 메소드
		}                               
        return sum;
}
}