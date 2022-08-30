package kr.brains062;

import kr.brains.ModCalculator;       

public class GugudanExample {
	public static void main(String[] args) {
		// 클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조번수에 할당
		// 참조 변수도 참조하는 클래스와 같은(상위 클래스형)
		Gugudan gugudan = new Gugudan();
		
		ModCalculator nc = new ModCalculator(10, "*", 20);

		
//		gugudan.printOne(3);
//		gugudan.printAll();
//		gugudan.printFrom(7);
		
		SubGugudan subRef = new SubGugudan();
		subRef.printOne(7);
		subRef.printFrom(5);
		subRef.printFrom(5, "down");
	}

}
