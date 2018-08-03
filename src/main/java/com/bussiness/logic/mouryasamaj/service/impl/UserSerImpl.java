package com.bussiness.logic.mouryasamaj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
import com.bussiness.logic.mouryasamaj.service.UserSer;

public class UserSerImpl implements UserSer {

  @Autowired
  private UserDao userDao;

  @Override
  public Boolean checkLogin(UserLogin userLogin) {
    return userDao.checkLogin(userLogin.getUserID(), userLogin.getPassword());
  }

  @Override
  public String registerUser(User user) {
    return userDao.regsisterUser(user);
  }

}
