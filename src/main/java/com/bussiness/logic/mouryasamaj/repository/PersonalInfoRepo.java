package com.bussiness.logic.mouryasamaj.repository;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personal_info")
public class PersonalInfoRepo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer personalInfoID;

  private String firstName;

  private String middleName;

  private String lastName;

  private String motherName;

  private String fatherName;

  private String gender;

  private String aboutMe;

  private String address;

  private String alternateontactNumber;

  private String dateOfBirth;

  private String deitHabit;

  private String bodyType;

  private String smoking;

  private String profession;

  private String colorComplexion;

  private String height;

  private String weight;

  private String eductionLevel;

  private String martialStatus;

  private String currentCityName;

  // private List<String> candidateImages;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "user_id", nullable = false)
  private UserRepo userRepo;

  /**
   * @return the personalInfoID
   */
  public Integer getPersonalInfoID() {
    return personalInfoID;
  }

  /**
   * @param personalInfoID the personalInfoID to set
   */
  public void setPersonalInfoID(Integer personalInfoID) {
    this.personalInfoID = personalInfoID;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the middleName
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * @param middleName the middleName to set
   */
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the motherName
   */
  public String getMotherName() {
    return motherName;
  }

  /**
   * @param motherName the motherName to set
   */
  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  /**
   * @return the fatherName
   */
  public String getFatherName() {
    return fatherName;
  }

  /**
   * @param fatherName the fatherName to set
   */
  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  /**
   * @return the gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * @return the aboutMe
   */
  public String getAboutMe() {
    return aboutMe;
  }

  /**
   * @param aboutMe the aboutMe to set
   */
  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the alternateontactNumber
   */
  public String getAlternateontactNumber() {
    return alternateontactNumber;
  }

  /**
   * @param alternateontactNumber the alternateontactNumber to set
   */
  public void setAlternateontactNumber(String alternateontactNumber) {
    this.alternateontactNumber = alternateontactNumber;
  }

  /**
   * @return the dateOfBirth
   */
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * @param dateOfBirth the dateOfBirth to set
   */
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * @return the deitHabit
   */
  public String getDeitHabit() {
    return deitHabit;
  }

  /**
   * @param deitHabit the deitHabit to set
   */
  public void setDeitHabit(String deitHabit) {
    this.deitHabit = deitHabit;
  }

  /**
   * @return the bodyType
   */
  public String getBodyType() {
    return bodyType;
  }

  /**
   * @param bodyType the bodyType to set
   */
  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }

  /**
   * @return the smoking
   */
  public String getSmoking() {
    return smoking;
  }

  /**
   * @param smoking the smoking to set
   */
  public void setSmoking(String smoking) {
    this.smoking = smoking;
  }

  /**
   * @return the profession
   */
  public String getProfession() {
    return profession;
  }

  /**
   * @param profession the profession to set
   */
  public void setProfession(String profession) {
    this.profession = profession;
  }

  /**
   * @return the colorComplexion
   */
  public String getColorComplexion() {
    return colorComplexion;
  }

  /**
   * @param colorComplexion the colorComplexion to set
   */
  public void setColorComplexion(String colorComplexion) {
    this.colorComplexion = colorComplexion;
  }

  /**
   * @return the height
   */
  public String getHeight() {
    return height;
  }

  /**
   * @param height the height to set
   */
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * @return the weight
   */
  public String getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * @return the eductionLevel
   */
  public String getEductionLevel() {
    return eductionLevel;
  }

  /**
   * @param eductionLevel the eductionLevel to set
   */
  public void setEductionLevel(String eductionLevel) {
    this.eductionLevel = eductionLevel;
  }

  /**
   * @return the martialStatus
   */
  public String getMartialStatus() {
    return martialStatus;
  }

  /**
   * @param martialStatus the martialStatus to set
   */
  public void setMartialStatus(String martialStatus) {
    this.martialStatus = martialStatus;
  }

  /**
   * @return the currentCityName
   */
  public String getCurrentCityName() {
    return currentCityName;
  }

  /**
   * @param currentCityName the currentCityName to set
   */
  public void setCurrentCityName(String currentCityName) {
    this.currentCityName = currentCityName;
  }

  // /**
  // * @return the candidateImages
  // */
  // public List<String> getCandidateImages() {
  // return candidateImages;
  // }
  //
  // /**
  // * @param candidateImages the candidateImages to set
  // */
  // public void setCandidateImages(List<String> candidateImages) {
  // this.candidateImages = candidateImages;
  // }

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
