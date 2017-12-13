package com.renhao.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BBSMainPageController {

	@RequestMapping("/home")
	private String returnToMainPage() {
		System.out.println("dddddddddd");
		
		return "BBSmainPage";
	}
}
