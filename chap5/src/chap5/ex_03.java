package chap5;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		// 6.
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner Scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(Scanner.nextLine());
			
			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(Scanner.nextLine());     // studentNum에 학생수 입력
				scores = new int[studentNum];
				
			}else if (selectNo == 2 ) {
				for (int i = 0; i < scores.length ; i++){	
					System.out.print("scores["+i+"]>");
					scores[i] =Integer.parseInt(Scanner.nextLine());
					}
				
				
			}else if (selectNo == 3 ) {
				for (int i = 0; i < scores.length ; i++){	
					System.out.print("scores["+i+"]: "+ scores[i]);
				}
			
			}else if (selectNo == 4 ) {
				int max = 0;
				int sum = 0;
				double avg = 0;
			
				for (int i = 0; i < scores.length ; i++){	
					max = (max< scores[i])? scores[i] : max;      // scores[i]가 입력받은 점수
					    //if (max <scores[i]) {  
				        //max =scores[i];
					sum += scores[i];
					
					avg = (double) sum / studentNum;
					System.out.print("최고점수 : "+ max);
					System.out.print("평균점수 : "+ avg);
				}
					
						
					} else if (selectNo == 5) {
				      run =false;
			}
		}
             System.out.println("프로그램 종료");
	       }

          }
