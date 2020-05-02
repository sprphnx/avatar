package com.sprphnx.avatar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sprphnx.avatar.model.ProfileDto;
import com.sprphnx.avatar.service.ProfileService;

@Controller
public class HomeContorller {
	
	@Autowired
	ProfileService profileService;

	@GetMapping("/")
	public String landing(Model model) {
		model.addAttribute("profileDto", new ProfileDto());
		
		return "home";
	}
	
	@PostMapping("/submit-profile")
	public String submitProfile(@Valid @ModelAttribute ProfileDto profileDto, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "home";
		}
		
		profileService.saveProfile(profileDto);
		
		return "redirect:/";
	}
	
}
