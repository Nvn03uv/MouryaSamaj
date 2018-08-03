package com.bussiness.logic.mouryasamaj.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.repository.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;


public class UserDaoImpl implements UserDao {

  @Autowired
  EntityManager em;

  @Autowired
  ObjectMapper mapper;

  @Override
  public Boolean checkLogin(String userId, String password) {
    Query query = em.createNamedQuery("UserRepo.chechlogin");
    query.setParameter("userId", userId);
    query.setParameter("password", password);
    Integer count = ((Long) query.getSingleResult()).intValue();

    if (count == 1) {
      return true;
    } else {
      return false;
    }

  }

  @Override
  @Transactional
  public String regsisterUser(User user) {

    UserRepo userRepo = mapper.convertValue(user, UserRepo.class);
    try {
      em.persist(userRepo);
      return "Success";
    } catch (Exception e) {
      e.printStackTrace();
      return "Fail";
    }
  }

}
