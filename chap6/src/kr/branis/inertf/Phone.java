package kr.branis.inertf;

public interface Phone {
	// 인터페이스에 선언도니 모든 필드 정적 최종이다. 즉, 상수 변수이다.
	String PHONE_NUMBER = "010-4567-1234";
	void call(String phoneNumber);
	void receive();

}
