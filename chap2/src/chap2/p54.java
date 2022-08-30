package chap2;

public class p54 {

	public static void main(String[] args) {
		
		// 변수 값 교환
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);
		// x=y;  
		
		
		int temp = x;    //1--- x=3, temp=3
		x = y;           //2--- x=5
		y = temp;        //3--- y=3
		System.out.println("x:" + x + ",y:" + y);
	}

}
