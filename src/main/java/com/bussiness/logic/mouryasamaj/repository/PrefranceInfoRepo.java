package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "prefrance_info")
public class PrefranceInfoRepo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer PrefranceInfoID;

  private Integer prefferedAgeLowerLimit;

  private Integer prefferedHeight;

  private Integer prefferedCandidateBodyType;

  private Integer prefferedAgeUpperLimit;

  private Integer prefferedColorComplexion;

  private Integer prefferedEducationLevel;

  @JsonIgnore
  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "user_id", nullable = false)
  private UserRepo userRepo;

  /**
   * @return the prefranceInfoID
   */
  public Integer getPrefranceInfoID() {
    return PrefranceInfoID;
  }

  /**
   * @param prefranceInfoID the prefranceInfoID to set
   */
  public void setPrefranceInfoID(Integer prefranceInfoID) {
    PrefranceInfoID = prefranceInfoID;
  }

  /**
   * @return the prefferedAgeLowerLimit
   */
  public Integer getPrefferedAgeLowerLimit() {
    return prefferedAgeLowerLimit;
  }

  /**
   * @param prefferedAgeLowerLimit the prefferedAgeLowerLimit to set
   */
  public void setPrefferedAgeLowerLimit(Integer prefferedAgeLowerLimit) {
    this.prefferedAgeLowerLimit = prefferedAgeLowerLimit;
  }

  /**
   * @return the prefferedHeight
   */
  public Integer getPrefferedHeight() {
    return prefferedHeight;
  }

  /**
   * @param prefferedHeight the prefferedHeight to set
   */
  public void setPrefferedHeight(Integer prefferedHeight) {
    this.prefferedHeight = prefferedHeight;
  }

  /**
   * @return the prefferedCandidateBodyType
   */
  public Integer getPrefferedCandidateBodyType() {
    return prefferedCandidateBodyType;
  }

  /**
   * @param prefferedCandidateBodyType the prefferedCandidateBodyType to set
   */
  public void setPrefferedCandidateBodyType(Integer prefferedCandidateBodyType) {
    this.prefferedCandidateBodyType = prefferedCandidateBodyType;
  }

  /**
   * @return the prefferedAgeUpperLimit
   */
  public Integer getPrefferedAgeUpperLimit() {
    return prefferedAgeUpperLimit;
  }

  /**
   * @param prefferedAgeUpperLimit the prefferedAgeUpperLimit to set
   */
  public void setPrefferedAgeUpperLimit(Integer prefferedAgeUpperLimit) {
    this.prefferedAgeUpperLimit = prefferedAgeUpperLimit;
  }

  /**
   * @return the prefferedColorComplexion
   */
  public Integer getPrefferedColorComplexion() {
    return prefferedColorComplexion;
  }

  /**
   * @param prefferedColorComplexion the prefferedColorComplexion to set
   */
  public void setPrefferedColorComplexion(Integer prefferedColorComplexion) {
    this.prefferedColorComplexion = prefferedColorComplexion;
  }

  /**
   * @return the prefferedEducationLevel
   */
  public Integer getPrefferedEducationLevel() {
    return prefferedEducationLevel;
  }

  /**
   * @param prefferedEducationLevel the prefferedEducationLevel to set
   */
  public void setPrefferedEducationLevel(Integer prefferedEducationLevel) {
    this.prefferedEducationLevel = prefferedEducationLevel;
  }

  /**
   * @return the userRepo
   */
  public UserRepo getUserRepo() {
    return userRepo;
  }

  /**
   * @param userRepo the userRepo to set
   */
  public void setUserRepo(UserRepo userRepo) {
    this.userRepo = userRepo;
  }

}
