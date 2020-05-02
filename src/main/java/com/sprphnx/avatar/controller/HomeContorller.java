package com.sprphnx.avatar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String submitProfile(@ModelAttribute ProfileDto profileDto) {
		profileService.saveProfile(profileDto);
		
		return "redirect:/";
	}
	
}
