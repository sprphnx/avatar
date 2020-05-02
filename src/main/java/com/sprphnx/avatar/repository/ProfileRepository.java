package com.sprphnx.avatar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprphnx.avatar.entity.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {
	
}
