package chap5;

public class p186 {

	public static void main(String[] args) {
		// 배열의 length 필드
		
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {     // < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기때문
			sum += scores[i];
		}
	     System.out.println("totla : " + sum);
	     
	     double avg = (double) sum / scores.length;
	     System.out.println("avg : " + avg);
	     
	
	}
	

}
