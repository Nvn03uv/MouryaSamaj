package com.bussiness.logic.mouryasamaj.response;

public class SuccessResponse<T> extends AbstractResponse {

  private T value;

  private static final String MSG = "Success";
  private static final Integer ERROR_CODE = 0;

  public SuccessResponse() {
    super(MSG, ERROR_CODE);
  }

  public SuccessResponse(String messge) {
    super(messge, ERROR_CODE);
  }

  public SuccessResponse(String messge, Integer errorCode) {
    super(messge, errorCode);
  }

  /**
   * @return the value
   */
  public T getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(T value) {
    this.value = value;
  }

}
