package com.bussiness.logic.mouryasamaj.service.impl;

import javax.persistence.EntityExistsException;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dto.UserPersonlInformation;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.UserInfo;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
import com.bussiness.logic.mouryasamaj.exception.ExceptionMessage;
import com.bussiness.logic.mouryasamaj.exception.ResponseException;
import com.bussiness.logic.mouryasamaj.service.UserSer;

public class UserSerImpl implements UserSer {

  @Autowired
  private UserDao userDao;

  private static final Logger logger = LoggerFactory.getLogger(UserSerImpl.class);

  @Override
  public UserInfo checkLogin(UserLogin userLogin) throws ResponseException {
    UserInfo user = null;
    try {
      user = userDao.checkLogin(userLogin.getUserID(), userLogin.getPassword());
    } catch (NoResultException e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.INVALID_USER);
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }
    if (user == null) {
      logger.error(ExceptionMessage.INVALID_USER);
      throw new ResponseException(ExceptionMessage.INVALID_USER);
    }
    return user;
  }

  @Override
  public UserInfo registerUser(UserInfo user) throws ResponseException {

    try {
      userDao.regsisterUser(user);
    } catch (EntityExistsException e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.ALREADY_EXISTS);
    } catch (PersistenceException e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.ALREADY_EXISTS);
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }

    return user;
  }

  @Override
  public UserInfo getUserByID(Integer userID) throws ResponseException {

    UserInfo user = null;
    try {
      user = userDao.getUserByID(userID);
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }
    if (user == null) {
      logger.error(ExceptionMessage.USER_NOT_EXISTS);
      throw new ResponseException(ExceptionMessage.USER_NOT_EXISTS);
    }
    return user;
  }

  @Override
  public UserPersonlInformation updateProfile(UserPersonlInformation personalInfo) throws ResponseException {
    try {
      personalInfo = userDao.updateProfile(personalInfo);
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }
    if (personalInfo == null) {
      logger.error(ExceptionMessage.TECHNICAL_ERROR);
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }

    return personalInfo;
  }

  @Override
  public PreferenceInfo updatePreference(PreferenceInfo preferenceInfo) throws ResponseException {
    try {
      preferenceInfo = userDao.updatePreference(preferenceInfo);
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }
    if (preferenceInfo == null) {
      logger.error(ExceptionMessage.TECHNICAL_ERROR);
      throw new ResponseException(ExceptionMessage.TECHNICAL_ERROR);
    }

    return preferenceInfo;
  }

}
