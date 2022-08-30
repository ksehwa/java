package kr.brains062;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String> ();
		
		/*
		 String name = new String("이름");
		 String coler = "좋아하는 색상";
		 */
		
//		integer i = 100; // i는 Integer 클래스형 변수
		// implicit type conversion (묵시적 형변환) : 오토박싱`
		ale.add("고객");    // index 0에 저장
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("경험");
		ale.add("분석가 과정");
		ale.printHello();
		ale.add(); //add(T) add() 중첩(overloading)
		System.out.println(ale.lastIndexOf("경험"));
 		//for문 : 반복횟수가 정해진 경우 사용, 순차접근 가능,
		// 제어변수에 따른 접근
		
		for (int i=0; i < ale.size(); i+=2)
			System.out.print(ale.get(i) + "  ");
	    // foreach statement : collection 객체의 순차 접근
		System.out.println("");
		for(String s : ale)     
			System.out.print(s + " ");
		
	
	}

}
