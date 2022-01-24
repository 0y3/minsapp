package com.novocaine.Minsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

	@GetMapping("/contacts")
	public String goContries(Model model) {
		model.addAttribute("pageTitle", "Contact Management Page");
		return "Blankpage";
	}
}
