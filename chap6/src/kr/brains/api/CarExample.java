package kr.brains.api;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarExample {
    // throw : Exception 유형의 예외가 발생하면 호춣나 메소드로 전달
	public static void main(String[] args) throws ClassNotFoundException {
		
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.get(Calendar.YEAR));
		
		Week today = null;
		
		for (Week w : Week.values())
			System.out.println(w);
		
		int dow = rightNow.get(Calendar.DAY_OF_WEEK);  // 일요일 1, 목요일 5
	    switch(dow) {
	    case 1 : today = Week.SUNDAY; break;
	    case 2 : today = Week.MONDAY; break;
	    case 3 : today = Week.THURSDAY; break;
	    case 4 : today = Week.WEDNESDAY; break;
	    case 5 : today = Week.THURSDAY; break;
	    case 6 : today = Week.FRIDAY; break;
	    }
	    
	    System.out.println("오늘은 : " + today);
	  
	    Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date));
		
		Class clazz = Car.class;
		System.out.println(clazz.getPackageName() + "." + clazz.getName());
		
		Class clazz1 = null;
		//  try {
			clazz1 = Class.forName("kr.brains.api.Car");
		//} catch (ClassNotFoundException e) {          // 예외처리
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		System.out.println(clazz1.getPackageName());
		}
	
	}
