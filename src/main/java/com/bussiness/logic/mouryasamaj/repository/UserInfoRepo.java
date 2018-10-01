package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@NamedQueries({
		@NamedQuery(name = "UserInfoRepo.checklogin", query = "Select U from UserInfoRepo U where (email = :userId or mobile = :userId) and password = :password ") })

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "userModilenumebr" }) })
@Getter
@Setter
public class UserInfoRepo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private String userID;
	private String email;
	private String userNameOfUser;
	private String userModilenumebr;
	private Integer userVerified;
	private Integer candidateProfileVerified;
	private Integer candidateProfileNeedToUpdate;
	private String password;
	private String userfullname;
	private Integer relation;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userRepo")
	private UserPersonlInformationRepo userPersonlInformation;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userRepo")
	private PreferenceInfoRepo prefranceInfo;

}
