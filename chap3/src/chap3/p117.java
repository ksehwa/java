package chap3;

public class p117 {

	public static void main(String[] args) {
		
		// char 타입의 산술 연산
		
	   char c1 = 'A' + 1;
	   char c2 = 'A';
	   // char c3 =c2 + 1;      //c2는 int타입으로 변환되고 1과 연산이 되기 때문에 연산결과는 int 타입니 된다.
	                            //그런데 char 타입인 c3에 저장하므로 컴파일에러 발생
	                            //char c3 = (char) (c2+1)으로 강제 변환을 해야함
	   
	  
	   System.out.println("c1:" + c1);
	   System.out.println("c2:" + c2);
	   //System.out.println("c3:" + c3);

	}

}
