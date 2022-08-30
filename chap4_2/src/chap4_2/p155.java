package chap4_2;

public class p155 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 출력
		
		int sum = 0;     // 합계를 저장 할 변수
		
		int i =1;        // 루프 카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
			}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}
