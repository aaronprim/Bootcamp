package com.aaronprim.dojosurvey.controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaronprim.dojosurvey.models.Note;
import com.aaronprim.dojosurvey.services.NoteService;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String main() {
		return "index.jsp";
	}

}
