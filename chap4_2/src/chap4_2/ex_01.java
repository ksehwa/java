package chap4_2;

public class ex_01 {

	public static void main(String[] args) {
		
		//2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요.
		
	    int sum = 0;
		for (int i=0; i<=100; i++){
			if (i%3 == 0) {
		      sum += i;     //sum = sum + i
	}
		}
		System.out.println(sum);
		
		  
		  }
		
		

	}


