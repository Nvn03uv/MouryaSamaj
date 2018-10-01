package com.bussiness.logic.mouryasamaj.dao;

import javax.persistence.EntityExistsException;
import javax.persistence.NoResultException;
import com.bussiness.logic.mouryasamaj.dto.UserPersonlInformation;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.UserInfo;

public interface UserDao {

  public UserInfo checkLogin(String usreID, String password) throws NoResultException;

  public UserInfo getUserByID(Integer userID) throws IllegalStateException;

  public void regsisterUser(UserInfo user) throws EntityExistsException;

  public UserPersonlInformation updateProfile(UserPersonlInformation personalInfo) throws IllegalStateException;

  public PreferenceInfo updatePreference(PreferenceInfo prefranceInfo) throws IllegalStateException;
}
