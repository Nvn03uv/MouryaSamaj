package com.bussiness.logic.mouryasamaj.exception;

public class ApplicationException<T> {

  private Integer errorCode;
  private String message;

  public ApplicationException(String message) {
    this.message = message;
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

  /**
   * @return the errorCode
   */
  public Integer getErrorCode() {
    return errorCode;
  }

}
