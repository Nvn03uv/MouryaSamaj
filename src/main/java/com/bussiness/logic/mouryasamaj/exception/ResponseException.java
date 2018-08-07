package com.bussiness.logic.mouryasamaj.exception;

public class ResponseException extends Exception {

  private Integer errorCode;

  public ResponseException(String message) {
    super(message);
    this.errorCode = 1;
  }

  public ResponseException(String message, Integer errorCode) {
    super(message);
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

}
