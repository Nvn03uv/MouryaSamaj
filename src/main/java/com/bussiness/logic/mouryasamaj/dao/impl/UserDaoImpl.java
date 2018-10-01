package com.bussiness.logic.mouryasamaj.dao.impl;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.UserInfo;
import com.bussiness.logic.mouryasamaj.dto.UserPersonlInformation;
import com.bussiness.logic.mouryasamaj.repository.PreferenceInfoRepo;
import com.bussiness.logic.mouryasamaj.repository.UserInfoRepo;
import com.bussiness.logic.mouryasamaj.repository.UserPersonlInformationRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	EntityManager em;

	@Autowired
	ObjectMapper mapper;

	@Override
	public UserInfo checkLogin(String userId, String password) throws NoResultException {
		Query query = em.createNamedQuery("UserRepo.checklogin");
		query.setParameter("userId", userId);
		query.setParameter("password", password);
		return mapper.convertValue(query.getSingleResult(), UserInfo.class);
	}

	@Override
	@Transactional
	public void regsisterUser(UserInfo user) throws EntityExistsException {
		UserInfoRepo userRepo = mapper.convertValue(user, UserInfoRepo.class);
		em.persist(userRepo);
	}

	@Override
	public UserInfo getUserByID(Integer userID) throws IllegalArgumentException {
		return mapper.convertValue(em.find(UserInfoRepo.class, userID), UserInfo.class);
	}

	@Override
	@Transactional
	public UserPersonlInformation updateProfile(UserPersonlInformation personalInfo) throws IllegalStateException {
		String userID = personalInfo.getUserID();
		UserPersonlInformationRepo personalInfoRepo = mapper.convertValue(personalInfo,
				UserPersonlInformationRepo.class);
		personalInfoRepo.setPersonalInfoID(userID);
		personalInfoRepo.setUserRepo(em.find(UserInfoRepo.class, personalInfo.getUserID()));
		return mapper.convertValue(em.merge(personalInfoRepo), UserPersonlInformation.class);
	}

	@Override
	@Transactional
	public PreferenceInfo updatePreference(PreferenceInfo prefranceInfo) throws IllegalStateException {
		String userID = prefranceInfo.getUserID();
		PreferenceInfoRepo prefranceInfoRepo = mapper.convertValue(prefranceInfo, PreferenceInfoRepo.class);
		prefranceInfoRepo.setPrefranceInfoID(userID);
		prefranceInfoRepo.setUserRepo(em.find(UserInfoRepo.class, userID));
		return mapper.convertValue(em.merge(prefranceInfoRepo), PreferenceInfo.class);
	}

}
