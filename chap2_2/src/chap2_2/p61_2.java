package chap2_2;

public class p61_2 {

	public static void main(String[] args) {
		
		// byte 타입 변수
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 128;        // 컴파일에러 : 바이트 타입변수에 허용 범위 초과
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
