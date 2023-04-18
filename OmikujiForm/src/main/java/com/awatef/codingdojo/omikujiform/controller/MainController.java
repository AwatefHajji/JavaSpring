package com.awatef.codingdojo.omikujiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	//======display route=======
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	//======action route========
	@RequestMapping("/handelForm")
	public String form(
			@RequestParam(value = "num") Integer number,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby,
			@RequestParam(value = "thing") String thing,
			@RequestParam(value = "text") String text, 
			HttpSession session
			) {
		session.setAttribute("number", number);	
		session.setAttribute("city", city);
		session.setAttribute("person", person);	
		session.setAttribute("hobby", hobby);	
		session.setAttribute("thing", thing);	
		session.setAttribute("text", text);	
		
		return "redirect:/show";
		
	}
	//====display route after send form ====
	@RequestMapping("/show")
	public String show() {
		return "show.jsp";
	}

}
