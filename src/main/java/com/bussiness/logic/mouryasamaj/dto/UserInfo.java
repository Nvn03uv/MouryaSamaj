package com.bussiness.logic.mouryasamaj.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo {

	private String userID;
	private String email;
	private String userNameOfUser;
	private String userfullname;
	private String userModilenumebr;
	private Integer userVerified;
	private Integer candidateProfileVerified;
	private Integer candidateProfileNeedToUpdate;
	private UserPersonlInformation userPersonlInformation;
	private PreferenceInfo prefranceInfo;

}
