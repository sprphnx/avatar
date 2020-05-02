package com.sprphnx.avatar.model;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDto {
	
	@NotEmpty(message = "First name has to filled in.")
	private String firstName;

	@NotEmpty(message = "Last name has to filled in.")
	private String lastName;

	@NotEmpty(message = "Mobile number has to filled in.")
	private String primaryMobileNumber;

	@NotEmpty(message = "EMail has to filled in.")
	private String email;

	@NotEmpty(message = "Address has to filled in.")
	private String address;

}
