package kr.brains.project;

import java.util.ArrayList;

public class WedtoonExample {
	public static ArrayList<Book>  aLBook= new ArrayList<>();
	
	public static void main(String[]args) {
		// 등록
		Book w1 = new Webtoon ("i-1234", "나혼자 레벨업" , "판타지" , "추공");
		Book w2 = new Webtoon ("i-1235", "미생 2" , "드라마" , "윤태호");
		Book w3 = new Webtoon ("i-1236", "기생수" , "스릴러" , "몰라");
		
		aLBook.add(w1);
		aLBook.add(w2);
		aLBook.add(w3);
		aLBook.add(new Webtoon("i-1237", "장풍전", "코믹", "신영우"));
		
		//출력
		for (Book b : aLBook)
			System.out.println(b.toString());  //Object : toString, equals, hashCode
				
	}

}
