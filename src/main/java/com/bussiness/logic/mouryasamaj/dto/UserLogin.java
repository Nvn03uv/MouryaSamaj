package com.bussiness.logic.mouryasamaj.dto;

public class UserLogin {

  private String userID;

  private String password;

  /**
   * @return the userID
   */
  public String getUserID() {
    return userID;
  }

  /**
   * @param userID the userID to set
   */
  public void setUserID(String userID) {
    this.userID = userID;
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

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "UserLogin [userID=" + userID + ", password=" + password + "]";
  }

}
