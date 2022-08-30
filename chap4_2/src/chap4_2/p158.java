package chap4_2;

public class p158 {

	public static void main(String[] args) {
		
		//바깥쪽 반복문 종료
		 
		outter: // Label 사용
			for(char upper='A'; upper<='Z'; upper++) {
			  for(char lower= 'a'; lower<= 'z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break outter;
				}
			}
		}

		System.out.println("프로그램 실행 종료");
	}

}
