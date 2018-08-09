package com.bussiness.logic.mouryasamaj.dto;

import com.bussiness.logic.mouryasamaj.repository.UserRepo;

public class PreferenceInfo {

  private Integer userID;

  private String prefferedAgeLowerLimit;

  private String prefferedHeight;

  private String prefferedCandidateBodyType;

  private String prefferedAgeUpperLimit;

  private String prefferedColorComplexion;

  private String prefferedEducationLevel;

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
   * @return the prefferedAgeLowerLimit
   */
  public String getPrefferedAgeLowerLimit() {
    return prefferedAgeLowerLimit;
  }

  /**
   * @param prefferedAgeLowerLimit the prefferedAgeLowerLimit to set
   */
  public void setPrefferedAgeLowerLimit(String prefferedAgeLowerLimit) {
    this.prefferedAgeLowerLimit = prefferedAgeLowerLimit;
  }

  /**
   * @return the prefferedHeight
   */
  public String getPrefferedHeight() {
    return prefferedHeight;
  }

  /**
   * @param prefferedHeight the prefferedHeight to set
   */
  public void setPrefferedHeight(String prefferedHeight) {
    this.prefferedHeight = prefferedHeight;
  }

  /**
   * @return the prefferedCandidateBodyType
   */
  public String getPrefferedCandidateBodyType() {
    return prefferedCandidateBodyType;
  }

  /**
   * @param prefferedCandidateBodyType the prefferedCandidateBodyType to set
   */
  public void setPrefferedCandidateBodyType(String prefferedCandidateBodyType) {
    this.prefferedCandidateBodyType = prefferedCandidateBodyType;
  }

  /**
   * @return the prefferedAgeUpperLimit
   */
  public String getPrefferedAgeUpperLimit() {
    return prefferedAgeUpperLimit;
  }

  /**
   * @param prefferedAgeUpperLimit the prefferedAgeUpperLimit to set
   */
  public void setPrefferedAgeUpperLimit(String prefferedAgeUpperLimit) {
    this.prefferedAgeUpperLimit = prefferedAgeUpperLimit;
  }

  /**
   * @return the prefferedColorComplexion
   */
  public String getPrefferedColorComplexion() {
    return prefferedColorComplexion;
  }

  /**
   * @param prefferedColorComplexion the prefferedColorComplexion to set
   */
  public void setPrefferedColorComplexion(String prefferedColorComplexion) {
    this.prefferedColorComplexion = prefferedColorComplexion;
  }

  /**
   * @return the prefferedEducationLevel
   */
  public String getPrefferedEducationLevel() {
    return prefferedEducationLevel;
  }

  /**
   * @param prefferedEducationLevel the prefferedEducationLevel to set
   */
  public void setPrefferedEducationLevel(String prefferedEducationLevel) {
    this.prefferedEducationLevel = prefferedEducationLevel;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "PrefranceInfo [prefferedAgeLowerLimit=" + prefferedAgeLowerLimit + ", prefferedHeight="
        + prefferedHeight + ", prefferedCandidateBodyType=" + prefferedCandidateBodyType
        + ", prefferedAgeUpperLimit=" + prefferedAgeUpperLimit + ", prefferedColorComplexion="
        + prefferedColorComplexion + ", prefferedEducationLevel=" + prefferedEducationLevel + "]";
  }

  public void setUserRepo(UserRepo find) {
    // TODO Auto-generated method stub

  }
}
