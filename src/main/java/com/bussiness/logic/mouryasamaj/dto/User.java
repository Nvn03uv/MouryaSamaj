package com.bussiness.logic.mouryasamaj.dto;

public class User {

  private Integer userID;

  private String mobile;

  private String email;

  private String password;

  private String fullName;

  private String Relation;

  private PersonalInfo personalInfo;

  private PrefranceInfo prefranceInfo;



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
    return Relation;
  }

  /**
   * @param relation the relation to set
   */
  public void setRelation(String relation) {
    Relation = relation;
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
  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  /**
   * @param personalInfo the personalInfo to set
   */
  public void setPersonalInfo(PersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
  }

  /**
   * @return the prefranceInfo
   */
  public PrefranceInfo getPrefranceInfo() {
    return prefranceInfo;
  }

  /**
   * @param prefranceInfo the prefranceInfo to set
   */
  public void setPrefranceInfo(PrefranceInfo prefranceInfo) {
    this.prefranceInfo = prefranceInfo;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [userID=" + userID + ", mobile=" + mobile + ", email=" + email + ", personalInfo="
        + personalInfo + ", prefranceInfo=" + prefranceInfo + "]";
  }
}
