package chap5;

public class exam {

	public static void main(String[] args) {
		
		//2차원 배열
		
		int sum = 0;
		int[][]javaScores = {{88,95,80},{92,96,81}};
		// int[][]javaScores = {{95,80},{92,96,80}};
		
		for(int x=0; x<javaScores.length; x++)
		{
			for(int y=0; y<javaScores[x].length; y++)     // [x] 는 행만큼
			{
				
				System.out.println("javaScores["+x+"]["+y+"]="
						+ javaScores[x][y]);
				
			  
			     sum += javaScores[x][y];     // 합계 구하기
					
				 }
			     System.out.println(sum);
		}   
		}
		
		
		
	}

