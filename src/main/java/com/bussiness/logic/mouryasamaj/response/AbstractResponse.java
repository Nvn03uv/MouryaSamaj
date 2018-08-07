package com.bussiness.logic.mouryasamaj.response;

public abstract class AbstractResponse {

  protected Integer errorCode;
  protected String message;


  public AbstractResponse(String message, Integer errorCode) {
    this.message = message;
    this.errorCode = errorCode;
  }


  /**
   * @return the errorCode
   */
  public Integer getErrorCode() {
    return errorCode;
  }


  /**
   * @param errorCode the errorCode to set
   */
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }


  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }
}
