package chap4_2;

public class p157 {

	public static void main(String[] args) {
		
		// break문으로 while문 종료
		
		while(true) {
			int num = (int)(Math.random() * 6)+1;
			System.out.println(num);
			if (num==6) {
				break;
			}
					
		}
       System.out.println("프로그램 종료");
	}

}
