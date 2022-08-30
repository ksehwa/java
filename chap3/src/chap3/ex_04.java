package chap3;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		// 11.
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if (name.equals("java") && (password == 12345)) {
			System.out.print("로그인 성공");
		}
		else {
			System.out.print("로그인 실패:아이디 존재하지 않음");
		}
		}
		

	}


