package chap3;

public class ex_03 {

	public static void main(String[] args) {
		//7. 
		
		float var1 = 10f;
		float var2 = var1 / 100;    
		if(var2 == 0.1) {          // float 타입 0.1f는 정확히 0.1 이 아니기 때문
			System.out.println("10%입니다.");
			}else {
			System.out.println("10%가 아닙니다.");	
			}

	}

}
