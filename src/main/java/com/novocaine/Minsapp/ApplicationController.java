package com.novocaine.Minsapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String goHome(Model model) {
		model.addAttribute("pageTitle", "Minsapp HomePage");
		return "index";
	}
}
