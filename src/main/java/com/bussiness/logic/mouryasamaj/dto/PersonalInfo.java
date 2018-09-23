package com.bussiness.logic.mouryasamaj.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonalInfo {

	private Integer userID;

	private String firstName;
	
	private String lastName;

	private String motherName;

	private String fatherName;

	private String gender;

	private String aboutMe;

	private String address;

	private String alternateontactNumber;

	private String dateOfBirth;

	private String deitHabit;

	private String bodyType;

	private String smoking;

	private String profession;

	private String colorComplexion;

	private String height;

	private String weight;

	private String eductionLevel;

	private String martialStatus;

	private String currentCityName;

	private List<String> candidateImages;
	
	private String otherProfession;
	
	private String otherEducation;
	
	private String drinking;
	
}