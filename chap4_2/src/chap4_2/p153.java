package chap4_2;

public class p153 {

	public static void main(String[] args) {
		
		
		//중첩 for문 사용 구구단 출력하기
		
		for (int m=2; m<=9; m++) {                 // 바깥쪽 for문
			System.out.println("***" + m + "단**");
		
			for (int n=1; n<=9; n++) {             // 중첩 for문
				System.out.println(m  + " x " + n + " = " +(m*n));
				
		}

	}

}
 
}