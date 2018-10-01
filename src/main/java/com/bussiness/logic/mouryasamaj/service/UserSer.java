package com.bussiness.logic.mouryasamaj.service;

import com.bussiness.logic.mouryasamaj.dto.UserPersonlInformation;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.UserInfo;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
import com.bussiness.logic.mouryasamaj.exception.ResponseException;

public interface UserSer {

  public UserInfo checkLogin(UserLogin userLogin) throws ResponseException;

  public UserInfo registerUser(UserInfo user) throws ResponseException;

  public UserInfo getUserByID(Integer userID) throws ResponseException;

  public UserPersonlInformation updateProfile(UserPersonlInformation personalInfo) throws ResponseException;

  public PreferenceInfo updatePreference(PreferenceInfo preferenceInfo) throws ResponseException;

}
