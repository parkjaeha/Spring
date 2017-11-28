package com.iu.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//java sevlet controller no create  after annotice type controller 
@Controller
public class MyController {
	
	@RequestMapping(value="/notice/noticeList")
	public String go(HttpServletRequest request){	
		String name =request.getParameter("name");
		System.out.println("name: " + name);
				return "notice/noticeList";
	}
	
	@RequestMapping(value="/notice/noticeView")
	public String view(){	
		//  /WEB-INF/views 가 붙으니 그 뒤를 생각하면 된다.
		return "notice/noticeView";
	}
	
	
	
}
