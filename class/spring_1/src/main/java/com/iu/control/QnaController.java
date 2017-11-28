package com.iu.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	
	@RequestMapping(value="qnaList", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView list(ModelAndView mv ,@RequestParam(defaultValue="0",required=false) int curPage){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(29);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println(curPage);
		
		return mv;
	}

	@RequestMapping(value="qnaView")
	public String view(Model model){
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("choa");
		qnaDTO.setAge(29);
		// 그냥 오브젝트를 넣으면 그 오브젝트 이름이 키가 된다.
		//model.addAttribute("board","Qna"); 메서드채이닝 가능
		model.addAttribute("view", qnaDTO).addAttribute("board","Qna");
		// model 보내겟따는 동작 없이 그냥 보내진다. 

		return "/qna/qnaView";
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	public void write(){}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(QnaDTO qnaDTO, String title){
		//@RequestParam(value="title")String subject, String writer,int age, @RequestParam(defaultValue="iu") String[] name
		
		/*QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle(subject);
		qnaDTO.setWriter(writer);
		qnaDTO.setAge(age);
		qnaDTO.setName(name);*/
		
		 			for(String s : qnaDTO.getName()){
		 					System.out.println(s);
		 			}
		 			
		 			System.out.println(" title      : " + title);
		 			System.out.println("title: " + qnaDTO.getTitle() +" writer : " + qnaDTO.getWriter() + " age: " + qnaDTO.getAge());
		 			 
		/*for(int i =0; i<name.length; i++){
			System.out.println("name"+i+" : " + name[i]); }*/
		//return "/qna/qnaList";
		 			// 클라이언트가 주소를 치고 들어온것인다.  redirect 할때 데이터를 담아서 보낼 수 있다.
		 			return "redirect:./qnaList?curPage=5";   // 위에 list 함수로 간것이다. 
	}


}
