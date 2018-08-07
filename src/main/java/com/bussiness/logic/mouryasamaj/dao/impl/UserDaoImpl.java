package com.bussiness.logic.mouryasamaj.dao.impl;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dto.PersonalInfo;
import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.repository.PersonalInfoRepo;
import com.bussiness.logic.mouryasamaj.repository.UserRepo;
import com.fasterxml.jackson.databind.ObjectMapper;


public class UserDaoImpl implements UserDao {

  @Autowired
  EntityManager em;

  @Autowired
  ObjectMapper mapper;

  @Override
  public User checkLogin(String userId, String password) throws NoResultException {
    Query query = em.createNamedQuery("UserRepo.checklogin");
    query.setParameter("userId", userId);
    query.setParameter("password", password);
    return mapper.convertValue(query.getSingleResult(), User.class);
  }

  @Override
  @Transactional
  public void regsisterUser(User user) throws EntityExistsException {
    UserRepo userRepo = mapper.convertValue(user, UserRepo.class);
    em.persist(userRepo);
  }

  @Override
  @Transactional
  public PersonalInfo updateProfile(PersonalInfo personalInfo) throws IllegalStateException {
    PersonalInfoRepo personalInfoRepo = mapper.convertValue(personalInfo, PersonalInfoRepo.class);
    personalInfoRepo.setUserRepo(em.find(UserRepo.class, personalInfo.getUserID()));
    return mapper.convertValue(em.merge(personalInfoRepo), PersonalInfo.class);
  }

  @Override
  public User getUserByID(Integer userID) throws IllegalArgumentException {
    return mapper.convertValue(em.find(UserRepo.class, userID), User.class);
  }

  @Override
  public PersonalInfo getProfileByID(Integer userID) throws IllegalArgumentException {
    return mapper.convertValue(em.find(PersonalInfoRepo.class, userID), PersonalInfo.class);
  }
}
