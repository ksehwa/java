package chap2_4;

public class p94 {

	public static void main(String[] args) throws Exception{
		int keycode;
		
		// 입력된 키의 개수와 상관없이 키보드 읽기
 
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
		}
	}

}
