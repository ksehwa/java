package kr.branis.inertf;

//Java 믈래스 단일 상속 - <서브클래스> extends <수퍼클래스>
//인터페이스 다중 상속 - <서브인터페이스> extends <수퍼인터페이스>[,<수퍼인터페이스>] 다수
//인터페이스 다중 구현 - <클래스> implements <인터페이스>[, <인터페이스>] 다수

//다중구현
public class SmartPhone implements CameraPhone, Timer, Messenger {
	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 겁니다.");
		// TODO Auto-generated method stub		
	}
	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	}
	@Override
	public void sendMsg(String phoneNumber, String msg) {
		// TODO Auto-generated method stub
		System.out.printf("[%s]로 %s메시지 전송 \n", phoneNumber, msg); //printf : 포멧화된 객채 출력
	}
	@Override
	public void receiveMsg() {
		// TODO Auto-generated method stub
		System.out.println("메시지가 도착했습니다.");
	}

	@Override
	public void playBeep() {
		// TODO Auto-generated method stub
		System.out.println("알람 : 비프음 재생.");
	}

	@Override
	public void playMusic(String title) {
		// TODO Auto-generated method stub
		System.out.printf("알람 :%s 음악재생.", title);
	}

	@Override
		public void takeaPicture() {
		System.out.println("사진을 촬영한다");
	}
			// TODO Auto-generated method stub
		
	}

