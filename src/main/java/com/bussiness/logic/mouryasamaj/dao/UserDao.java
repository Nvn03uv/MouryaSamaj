package com.bussiness.logic.mouryasamaj.dao;

import com.bussiness.logic.mouryasamaj.dto.User;

public interface UserDao {

  public Boolean checkLogin(String usreID, String password);

  public String regsisterUser(User user);
}
