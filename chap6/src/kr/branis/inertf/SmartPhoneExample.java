package kr.branis.inertf;

public class SmartPhoneExample {
	// 인터페이스들을 정의하고, 다중구현을 통해 클래스를 정의
	// 다중구현 (multiple implementation)을 통해 클래스를 정의
	// 정의한 클래스로부터 객체를 생성하고
	// 생선된 객체와 상호작용을 통해 문제를 해결
    
	// Java는 다중 상속은 지원하지 않음, 즉 extends 뒤에 하나만 나타남
	// 인터페이스는 다중 구현이 가능함, 즉 implements 뒤에 여러개가 나타날 수 있음
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.call(SmartPhone.PHONE_NUMBER);
		sp.playMusic("번개맨송");
		sp.sendMsg (SmartPhone.PHONE_NUMBER, "아! 힘들다");
		Timer t = sp;  //sp가 참조하는 객체를 timer 인터페이스 구현한 구현체
		((SmartPhone) t).call (SmartPhone.PHONE_NUMBER);
		sp.call(SmartPhone.PHONE_NUMBER);
		
		
		
   
	}

	

}
