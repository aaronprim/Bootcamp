package com.aaronprim.controllerandviews.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aaronprim.controllerandviews.models.User;
import com.aaronprim.controllerandviews.services.UserService;

@Controller
public class Users {
    private final UserService userService;
    
    public Users(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "loginReg.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User newUser, BindingResult result, HttpSession session) {
    	if(result.hasErrors()) {
    		return "loginReg.jsp";
    	}
    	else {userService.registerUser(newUser);
    		session.setAttribute("userId", newUser.getId());
    		return "redirect:/home";
    	}
    	
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        boolean isAuthenticated = userService.authenticateUser(email, password);
        if(isAuthenticated) {
        		User u = userService.findByEmail(email);
        		session.setAttribute("userId", u.getId());
        		return "redirect:/home";
        }
        else {
        		model.addAttribute("error", "invalid email/password");
        		return "loginReg.jsp";
        }
        		
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    		Long userId = (Long) session.getAttribute("userId");
    		User u = userService.findUserById(userId);
    		model.addAttribute("user", u);
    		return "home.jsp";
    }
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    		session.invalidate();
    		return "redirect:/";
    }
}