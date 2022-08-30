package kr.brains072;

public class Trapezoid extends Polygon{
	private int upper;
	
	public Trapezoid( int height, int widch, int upper) {
		super (height, widch);
        this.upper = upper;	
     }
	public int getUpper() {
		return upper;
	}
	
	public int evaluate() {
		int area = (getWidth() + getUpper()) * getHeight() / 2;
		return area;
	}

}
