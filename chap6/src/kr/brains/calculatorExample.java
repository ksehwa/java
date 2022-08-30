package kr.brains;
// 하나의 파일에는 Public class가 하나만 존재함
// 파일 이름은  Public class가 있는 경우  Public class 이름임
//  Public class가 없는 경우 이름은 선택가능함
// class 이름은 대문자로 시작한다.
// 생성자 class 이름과 같고, 반환 유형이 없다.

public class calculatorExample {
	public static void main(String[] args) {
		
		//기본 생성자 (매개 변수가 없는) 를 호출하여 객체를 생성
		// calculator : 객체 참조 변수
		
		Calculator calcRef = new Calculator();  // <- 생성자를 호출
	    System.out.println(calcRef.calc());
	    // GC (Garbage collection) 동작으로 메모리에서 향후 제거
	    calcRef = new Calculator(23, "*",40);
	    System.out.println(calcRef.calc());
	    
	    ModCalculator modRef = new  ModCalculator();
	    System.out.println(modRef.calc());
	    
	
	
	
	}  
	
}
