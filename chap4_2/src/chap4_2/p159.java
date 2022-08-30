package chap4_2;

public class p159 {

	public static void main(String[] args) {
		
		// contionue를 사용한 for문
		
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {            //홀수인 경우
				continue;
			}
			System.out.println(i);   // 홀수는 실행되지 않음
		}
		

	}

}
