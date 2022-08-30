package kr.brains063;

public class CarExample {
	String programName = "CarExample";

	public static void main(String[] args) {
		CarExample ce = new CarExample();
		System.out.println(ce.programName);
	
		
		//setGet(정넉 메소드가 아니므로 객체 생성후 접근가능
		//System.out.println("현재 모델:" + Car.setGas)("86");
		//car.MODEL = "전기차";
		System.out.println("현재 모델:" + Car.model);
		System.out.println("가장큰 int 값 :" + Integer.MAX_VALUE);
		int i =1_000_000_000;
		int j =1000000000;
		
		Car car = new Car();// 객체생성
		// car.model = "전기차"; // 직접 인스턴스 변수 값 배정(assignment)
		car.setGas("70L");     // setter를 이용한 값 배정 : "30l" 문자열,
		// 검증된 값을 배정
		//car.gas = 61;
		System.out.println("현재 Gas : "+ car.getGas());
		
		car.run();
		
		
//		String str = "현대자동차";
//		System.out.println(str.charAt(3));
//		int i = 66;
//		///Integer : int 기본형을 효과적으로 조작하기 위해 정의한 클래스
//		// Wrapper Class : 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
//		System.out.println(Integer.toHexString(i));

	}

}
