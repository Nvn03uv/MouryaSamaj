package com.bussiness.logic.mouryasamaj.response;

public class ErrorResponse extends AbstractResponse {

  public ErrorResponse(String message) {
    super(message, 1);
  }

  public ErrorResponse(String message, Integer errorCode) {
    super(message, errorCode);
  }

}
