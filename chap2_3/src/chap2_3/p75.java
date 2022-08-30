package chap2_3;

public class p75 {

	public static void main(String[] args) {
		//강제 변환 타입
		
		int intValue =44032;
		char charValue = (char) intValue;

		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
