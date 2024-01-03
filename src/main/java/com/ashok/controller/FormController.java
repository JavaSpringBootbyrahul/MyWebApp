package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/my-web-app")
public class FormController {
	
	@GetMapping("/")
	public String registerForm()
	{
		return "register";
	}
	
	@PostMapping("/save")
	public String submitForm( @RequestParam("name")String name, @RequestParam("age") int age,Model model)
	{
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "result";
	}
}
