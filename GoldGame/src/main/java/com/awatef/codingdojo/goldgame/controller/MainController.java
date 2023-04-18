package com.awatef.codingdojo.goldgame.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
public class MainController {
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public String index(HttpSession session,
			@RequestParam(value = "farm", required = false) String farm,
			@RequestParam(value = "cave", required = false) String cave,
			@RequestParam(value = "house",required = false) String house,
			@RequestParam(value = "quest",required = false) String quest
			) {
		Integer gold=0;
		ArrayList<String> Activities = new ArrayList<String>();
		 LocalDateTime now = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy h:mm a");
	     String formattedDate = now.format(formatter);
		
		if(session.getAttribute("gold") == null) {
		session.setAttribute("gold",gold);
		session.setAttribute("Activities", Activities);}
		else {
			gold = (Integer) session.getAttribute("gold");
			Activities =(ArrayList<String>) session.getAttribute("Activities");
		}
		if(farm != null) {
			int amount = new Random().nextInt(10, 20);
			gold+=amount;
			session.setAttribute("gold", gold);
			Activities.add(0,"you entred a farm and earned "+amount+" gold. ("+formattedDate+")");
		}
		else if(cave != null) {
			int amount = new Random().nextInt(5, 10);
			gold+=amount;
			session.setAttribute("gold", gold);
			Activities.add(0,"you entred a cave and earned "+amount+" gold. ("+formattedDate+")");
		}
		else if(house != null) {
			int amount = new Random().nextInt(2, 5);
			gold+=amount;
			session.setAttribute("gold", gold);
			Activities.add(0,"you entred a house and earned "+amount+" gold. ("+formattedDate+")");
		}
		else if (quest != null) {
			int amount = new Random().nextInt(-50, 50);
			gold+=amount;
			session.setAttribute("gold", gold);
			if(amount>0) {
			Activities.add(0,"you entred a quest and earned "+amount+" gold. ("+formattedDate+")");
			}else {Activities.add(0,"you entred a quest and lost "+amount+" gold. Ouch("+formattedDate+")");}
			}
		
		return "index.jsp";
	}
	@RequestMapping("/activities")
	public String show() {
		return "activities.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
