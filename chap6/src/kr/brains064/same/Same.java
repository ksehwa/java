package kr.brains064.same;

public class Same {
	private int privateField = 1;    // private method도 클래스 내부 사용
	int defaultField = 2;
	protected int protectedField = 3;
	public int publicField = 4;
	
	void printPtivateField() {
		System.out.println(privateField);
	}

}
