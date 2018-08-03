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

@NamedQueries({@NamedQuery(name = "UserRepo.chechlogin",
    query = "Select count(1) from UserRepo where (email = :userId or mobile = :userId) and password = :password ")})


@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"email", "mobile"})})
public class UserRepo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_id")
  private Integer userID;

  private String email;

  private String mobile;

  private String password;

  private String fullName;

  private String relation;

  @OneToOne(fetch = FetchType.LAZY, mappedBy = "userRepo")
  private PersonalInfoRepo personalInfo;

  @OneToOne(fetch = FetchType.LAZY, mappedBy = "userRepo")
  private PrefranceInfoRepo prefranceInfo;

  /**
   * @return the fullName
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * @param fullName the fullName to set
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * @return the relation
   */
  public String getRelation() {
    return relation;
  }

  /**
   * @param relation the relation to set
   */
  public void setRelation(String relation) {
    this.relation = relation;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the userID
   */
  public Integer getUserID() {
    return userID;
  }

  /**
   * @param userID the userID to set
   */
  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  /**
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the personalInfo
   */
  public PersonalInfoRepo getPersonalInfo() {
    return personalInfo;
  }

  /**
   * @param personalInfo the personalInfo to set
   */
  public void setPersonalInfo(PersonalInfoRepo personalInfo) {
    this.personalInfo = personalInfo;
  }

  /**
   * @return the prefranceInfo
   */
  public PrefranceInfoRepo getPrefranceInfo() {
    return prefranceInfo;
  }

  /**
   * @param prefranceInfo the prefranceInfo to set
   */
  public void setPrefranceInfo(PrefranceInfoRepo prefranceInfo) {
    this.prefranceInfo = prefranceInfo;
  }

}
