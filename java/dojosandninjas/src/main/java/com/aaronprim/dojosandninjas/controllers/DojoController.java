package com.aaronprim.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aaronprim.dojosandninjas.models.*;
import com.aaronprim.dojosandninjas.services.*;

@Controller
public class DojoController {
	
	private DojosAndNinjasService dojoNinjaServ;
	
	public void DojoCont(DojosAndNinjasService dojoNinjaServ) {
		this.dojoNinjaServ = dojoNinjaServ;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/adddojo")
	public String addDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		}
		else {
			dojoNinjaServ.addDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") long id, Model model) {
		Dojo dojo = dojoNinjaServ.singleDojo(id);
		model.addAttribute("dojo", dojo);
		return "location.jsp";
	}
	
	
}
