package com.sprphnx.avatar.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprphnx.avatar.entity.Profile;
import com.sprphnx.avatar.model.ProfileDto;
import com.sprphnx.avatar.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	ProfileRepository profileRepository;
	
	public Profile saveProfile(ProfileDto profileDto) {
		Profile profile = new Profile();
		BeanUtils.copyProperties(profileDto, profile);
		
		return profileRepository.save(profile);
	}

}
