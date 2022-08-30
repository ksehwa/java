package kr.brains064.same;
import kr.brains064.other.Other;
import kr.brains064.other.Protected;

public class SameExample extends Protected {
    public static void main(String[] args) {
    	
		
    	Same same = new Same();
		System.out.println("Same Package : 같은 패키지");
		//System.out.println("same.privateField");
		System.out.println("same.defaultField");
		System.out.println("same.protectedField");
		System.out.println("same.publicField");
		
		

    	SameExample se = new SameExample();
    	System.out.println("Inheritance Relationship : 상속 관계");
		//System.out.println(se.privateField");
		//System.out.println("se.defaultField");
		System.out.println("se.protectedField");  // protected 메소드
		System.out.println("se.publicField");
		
		
		
		Other other = new Other();
		System.out.println("Other Package : 아무 관계 없는 경우");
		//System.out.println("same.privateField");
		//System.out.println("same.defaultField");
		//protected가 되려면 상속 관계가 되어 있어야 함
		//System.out.println("same.protectedField);
		System.out.println("same.publicField");
		
		
	

	}

}
