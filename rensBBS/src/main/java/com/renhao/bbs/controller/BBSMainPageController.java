package com.renhao.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BBSMainPageController {

	@RequestMapping(value="/BBSmainPage")
	private String returnToMainPage() {
		return "BBSmainPage";
	}
}
