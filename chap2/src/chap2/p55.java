package chap2;

public class p55 {
	public static void main(String[] args) {
		
		// <변수 사용 범위>
		
		int v1 = 15;
		if (v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 +5;      //v2 변수는 if블록 내부에 있기때문에 if블록 바깥인 여기서 v2를 사용 할 수 없어 컴파일 에러
		

	}

}
