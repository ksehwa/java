package chap2_4;

public class p91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // printf() 메소드 사용 방법
	      
	      int value =123;
	      System.out.printf("상품의 가격:%d원\n", value);
	      System.out.printf("상품의 가격:%d6원\n", value);
	      System.out.printf("상품의 가격:%d-6원\n", value);
	      System.out.printf("상품의 가격:%d06원\n", value);
	      double area = 3.14159 * 10 * 10;
	      System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
	      
	      String name = "홍길동";
	      String job = "도적";
	      System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	   
	}

}
