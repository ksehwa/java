package thebrains.pim.controller;

import thebrains.pim.view.TUIView;

public class MemberController {    // 요청을 제어하는 요소
	/*
	 MVC (Model-View-Controller) 모델 기반 -> MVCS (MVC-Service)
	개인정보관리(Personal Information System) 개발
	 C.R.U.D (Create Read Update Delete) : 자료를 처리하는 기본 기능
	추가 기능 : 정렬, 검색 페이지
	*/

	
	// MemberView memberView = null;
	// MemberService<Member> memberService = null;
	public static TUIView tui = new TUIView();
	public MemberController() {
		
	}
	public void dispatch() {  // dispatch : 시작의 의미, 명령을 가져옴 
		int menu = 0;  // 0은 종료
	    do {
		boolean isLogin = true;
		boolean isRoot = false;
		// true, true : root 로그인, true,false : 사용자 로그인,  false : 로그인전
		tui.showMenu(isLogin,isRoot);
		menu = tui.inputMenu();
		System.out.println("입력하신 메뉴는: " + menu);
			
		}while (menu != 0);
	}

}
