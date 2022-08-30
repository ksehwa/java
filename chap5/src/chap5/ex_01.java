package chap5;

public class ex_01 {

	public static void main(String[] args) {
		
		//4.
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length ; i++){	
			if (max <array[i]) {   // 0<1 , 1<5, 5<3, 5<8, 8<2
				max =array[i];     // max=1, max,5,max=8
			}
		}	
		   System.out.println("max: "+ max);	
		
	}

}
