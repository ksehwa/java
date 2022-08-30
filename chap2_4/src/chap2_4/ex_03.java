package chap2_4;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	      String name,idf6,tel;
	      
	      System.out.print("[필수 정보 입력] \n"+"1. 이름: ");
	      name = scanner.nextLine();
	      
	      System.out.print("2. 주민번호 앞 6자리: ");
	      idf6 = scanner.nextLine();

	      System.out.print("3. 전화번호: ");
	      tel = scanner.nextLine();
	     
	      
	      System.out.printf("\n[입력한 내용] \n"+"%1$s"+"\n%2$s"+"\n%3$s", name,idf6,tel);

	}

}
