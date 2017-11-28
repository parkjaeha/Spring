package com.iu.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	
	@RequestMapping(value="qnaList", method={RequestMethod.GET,RequestMethod.POST})
	public String list(){
		
		return "/qna/qnaList";
	}

	@RequestMapping(value="qnaView")
	public String view(){
		
		return "/qna/qnaView";
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	public void write(){}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(String title, String writer, int age){
		System.out.println("title: " + title +" writer : " + writer + " age: " + age);
		
		return "/qna/qnaList"; 
	}


}
