package kr.brains072;

public class Triangle extends Polygon {
	// 생성자 : 객체 초기화를 담당,
	// sub 클래스로부터 객체를 생성할때,
	// super 클래스의 객체(필드, 메소드)도 준비되어 함
	public Triangle (int height, int widch) {
		super(height, widch);
		setName("Triangle");
	}
	
	
	public int evaluate() {  //메소드 선언부 : 사용법 또는 활용법
		int area =  getHeight() * getWidth() / 2;
		return area;
	}
	

}
