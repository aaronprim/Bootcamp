package com.aaronprim.languages.controllers;

import javax.validation.Valid;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aaronprim.languages.models.Language;
import com.aaronprim.languages.services.LanguageService;

@Controller
public class HomeController {
	
	private LanguageService langServ = null;
	
	public HomeController(LanguageService langServ) {
		this.langServ = langServ;
	}
	
	@RequestMapping("/languages")
	public String index(@ModelAttribute("addNew") Language lang, Model model) {
		List<Language> languages = langServ.allLanguages();
		model.addAttribute("languages", languages);
		return "home.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("addNew") Language language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Language> languages = langServ.allLanguages();
			model.addAttribute("languages", languages);
				return "home.jsp";
		}
		else {
			langServ.addLang(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String modify(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			langServ.addLang(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = langServ.findLang(id);
		model.addAttribute("language", language);
		return "single.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = langServ.findLang(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		langServ.deleteLang(id);
		return "redirect:/languages";
	}
	
	
}
