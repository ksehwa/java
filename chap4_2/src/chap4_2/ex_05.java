package chap4_2;

import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		// 7.
		
		boolean run = true;
		int balance = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			while(run) {
				System.out.println("----------------------------------");
				System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
				System.out.println("----------------------------------");
				System.out.println("선택>");
				
				int menuNum = Integer.parseInt(scanner.nextLine());     // 숫자 형식 예외(알파벳이나 특수문자 등을 숫자타입으로 변환)
				
				switch (menuNum){
				case 1:
					System.out.print("예금액>");
					balance += Integer.parseInt(scanner.nextLine());
					break;
				
				case 2:
					System.out.print("출금액>");
					balance -= Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(balance);
					break;
				case 4:
				   run = false;
				   break;
				   
				}
				   
			    System.out.println();
			  }
		} 
		
		System.out.println("프로그램 종료");
  }
}