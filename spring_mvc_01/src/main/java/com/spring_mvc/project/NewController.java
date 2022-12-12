package com.spring_mvc.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	// 루트 요청한 서비스 처리 : home.jsp 페이지로 출력
	@RequestMapping("/") // http://localhost:8080/project/
	public String home() {
		return "home"; // 뷰페이지 이름 반환 : newView.jsp
	}
	
	// 서비스 요청 처리 
	// url 매핑 이름 : /newView : 요청하는 이름 
	@RequestMapping("/newView")  // http://localhost:8080/project/newView
	public String newView() {
		return "new/newView"; // 뷰페이지 이름 반환 : newView.jsp
	//
	}
}
