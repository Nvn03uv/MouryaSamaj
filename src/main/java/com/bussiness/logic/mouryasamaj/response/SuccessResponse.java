package com.bussiness.logic.mouryasamaj.response;

public class SuccessResponse<T> extends AbstractResponse {

  private T value;

  public SuccessResponse(String messge) {
    super(messge, 1);
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
