package kr.brains072;

public class Rectangle extends Polygon{
	public  Rectangle (int height, int width) {
		// 컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출 
		//super(height,width);
		setName("Ractangle");
		
	}
    // annotation : 어노테이션, 애노테이션
	// 컴파일러에게 컴파일을 잘 할 수 있도록 정보를 제공
	// 재정의 : 메소드이름, 매개변수 갯수, 타입 동일
	
	public int evaluate() {
		 return (getHeight() * getWidth());
	}
}
