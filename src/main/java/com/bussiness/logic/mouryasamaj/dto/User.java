package com.bussiness.logic.mouryasamaj.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

  private Integer userID;

  private String mobile;

  private String email;

  private String password;

  private String fullName;

  private String relation;

  private PersonalInfo personalInfo;

  private PreferenceInfo prefranceInfo;

}
