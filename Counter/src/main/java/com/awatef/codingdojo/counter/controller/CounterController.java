package com.awatef.codingdojo.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		// If the count is not already in session
		if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		} else {
			// increment the count by 1 using getAttribute and setAttribute
			Integer counter = (Integer) session.getAttribute("count");
			session.setAttribute("count", counter + 1);
		}
		return "index.jsp";

	}

	@RequestMapping("/counter")
	public String count() {
		return "show.jsp";
	}
}
