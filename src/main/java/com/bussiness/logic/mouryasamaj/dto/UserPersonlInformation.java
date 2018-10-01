package com.bussiness.logic.mouryasamaj.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserPersonlInformation {

	private String userID; 
	private String candidateFirstName;	
	private String candidateLastName;	
	private String candidateContactNumber;	
	private String candidateFatherName;	
	private String candidateMotherName;
	private String candidateCurrentCityName;	
	private String candidateDateOfBirth;	
	private String candidateAddress;	
	private String candidateGender;	
	private String candidateBodyType;	
	private String candidateHeight;	
	private String candidateEducationLevel;	
	private String candidateProfession;	
	private String candidateColorComplexion;	
	private String candidateOtherTypeOfEductionLevel;	
	private String candidateOtherTypeOfProfession;	
	private String candidateAboutMeBrief;	
	private String candidateMartialStatus;	
	private String candidateIsDoSmoking;	 
	private String candidateIsDoDrinking;	
	private String candidateDeitHabit;	
	private String candidateWeight;	
	private List<String> candidateImages;
	
}