package com.bussiness.logic.mouryasamaj.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PreferenceInfo {

	private String userID;
	private String prefferedAgeLowerLimit;
	private String prefferedHeight;
	private String prefferedCandidateBodyType;
	private String prefferedAgeUpperLimit;
	private String prefferedColorComplexion;
	private String prefferedEducationLevel;
	private Integer prefferedDietHabit;
	private Integer prefferedMartialStatus;

}
