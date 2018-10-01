package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personal_info")
@Getter
@Setter
public class UserPersonlInformationRepo {

	@Id
	private String personalInfoID; 
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
	// private List<String> candidateImages;
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private UserInfoRepo userRepo;

}
