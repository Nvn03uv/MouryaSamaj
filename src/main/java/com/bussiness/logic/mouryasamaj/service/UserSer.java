package com.bussiness.logic.mouryasamaj.service;

import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;

public interface UserSer {

  public Boolean checkLogin(UserLogin userLogin);

  public String registerUser(User user);

}
