package com.awatef.codingDojo.HelloHuman.HumanController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/")
    public String index(@RequestParam(value="q",required=false) String searchQuery) {
		if(searchQuery == "") return "Hello Human";
		return "Hello " + searchQuery;
    }
	@RequestMapping("/name")
    public String index(@RequestParam(value="first_name", required=false) String firstName,
                        @RequestParam(value="last_name", required=false) String lastName) {
		if(firstName == null && lastName == null) {
			return "Hello Human";
		} else if(lastName == null) {
			return "Hello " + firstName;
		} else if(firstName == null) {
			return "Hello " + lastName;
		} else {
			return "Hello " + firstName + " " + lastName;
		}
    }

}
