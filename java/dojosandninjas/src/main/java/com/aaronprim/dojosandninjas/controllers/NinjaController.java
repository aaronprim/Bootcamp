package com.aaronprim.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aaronprim.dojosandninjas.models.*;
import com.aaronprim.dojosandninjas.services.*;

@Controller
public class NinjaController {
	private DojosAndNinjasService dojoNinjaServ;
	
	public void NinjaCont(DojosAndNinjasService dojoNinjaServ) {
		this.dojoNinjaServ = dojoNinjaServ;
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaObject") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoNinjaServ.getAllDojos());
		return "ninja.jsp";
	}
	
	@PostMapping("/addninja")
	public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}
		else {
			dojoNinjaServ.addNinja(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId();
		}
		
	}
}
