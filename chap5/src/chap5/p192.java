package chap5;

public class p192 {

	public static void main(String[] args) {
		
		// 배열 속의 배열
		
		int[][] mathScores =new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}

		 
		System.out.println();
		
		int[][] englishScores =new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}

		 System.out.println();
		 
		 
		 
	     int[][] javaScores = { {95,80},{92,96,80} };
			for(int i=0; i<mathScores.length; i++) {
				for(int k=0; k<mathScores[i].length; k++) {
					System.out.println("mathScores["+i+"]["+k+"]="
							+mathScores[i][k]);
		
		
		
	}

}
	}
}
