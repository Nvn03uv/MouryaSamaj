package com.bussiness.logic.mouryasamaj.service;

import com.bussiness.logic.mouryasamaj.dto.PersonalInfo;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
import com.bussiness.logic.mouryasamaj.exception.ResponseException;

public interface UserSer {

  public User checkLogin(UserLogin userLogin) throws ResponseException;

  public User registerUser(User user) throws ResponseException;

  public User getUserByID(Integer userID) throws ResponseException;

  public PersonalInfo updateProfile(PersonalInfo personalInfo) throws ResponseException;

  public PreferenceInfo updatePreference(PreferenceInfo preferenceInfo) throws ResponseException;

}
