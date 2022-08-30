package chap4;

public class p143_1 {

	public static void main(String[] args) {
		
		// break문이 없는 case

				int time = (int)(Math.random() *4) + 8;       // 8<= ~ <=11 사이의 정수 뽑기
				System.out.println("[현재시각: "+ time +" 시)]");
				
				switch(time) {
				  case 8:
					  System.out.println("출근합니다.");         //break가 없으면 case값과 상관없이 다음 case가 연달아 실행.
				  case 9:
					  System.out.println("회의를 합니다.");
				  case 10:
					  System.out.println("업무를 봅니다.");
				  default:
					  System.out.println("외근을 나갑니다.");

	}

}

}