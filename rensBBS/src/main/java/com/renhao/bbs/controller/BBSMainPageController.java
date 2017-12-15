package com.renhao.bbs.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BBSMainPageController {

	@RequestMapping(value ="/home1")
	public String returnToMainPage() {
		System.out.println("mainPage request got");
		
		return "BBSmainPage";
	}
	
	
	@Test
	public void foo(){
		System.out.println("JunitTest!");
	}
	
}
