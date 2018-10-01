package com.bussiness.logic.mouryasamaj.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bussiness.logic.mouryasamaj.dto.UserPersonlInformation;
import com.bussiness.logic.mouryasamaj.dto.PreferenceInfo;
import com.bussiness.logic.mouryasamaj.dto.UserInfo;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
import com.bussiness.logic.mouryasamaj.exception.ResponseException;
import com.bussiness.logic.mouryasamaj.response.AbstractResponse;
import com.bussiness.logic.mouryasamaj.response.ErrorResponse;
import com.bussiness.logic.mouryasamaj.response.SuccessResponse;
import com.bussiness.logic.mouryasamaj.service.UserSer;

@RestController
@RequestMapping("/user")
public class UserRestController {

  @Autowired
  private UserSer userSer;

  private ResponseEntity<? extends AbstractResponse> responseEntity;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResponseEntity<? extends AbstractResponse> checkLogin(@RequestBody UserLogin userLogin) {
    try {
      UserInfo user = userSer.checkLogin(userLogin);
      SuccessResponse<UserInfo> successResponse = new SuccessResponse<>();
      successResponse.setValue(user);
      responseEntity = new ResponseEntity<SuccessResponse<UserInfo>>(successResponse, HttpStatus.OK);

    } catch (ResponseException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public ResponseEntity<? extends AbstractResponse> registerUser(@RequestBody UserInfo user) {
    try {
      user = userSer.registerUser(user);
      SuccessResponse<UserInfo> successResponse = new SuccessResponse<>();
      successResponse.setValue(user);
      responseEntity = new ResponseEntity<SuccessResponse<UserInfo>>(successResponse, HttpStatus.OK);

    } catch (ResponseException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }

  @RequestMapping(value = "/{userID}", method = RequestMethod.GET)
  public ResponseEntity<? extends AbstractResponse> getUserByID(@PathVariable Integer userID) {
    try {
      UserInfo user = userSer.getUserByID(userID);
      SuccessResponse<UserInfo> successResponse = new SuccessResponse<>();
      successResponse.setValue(user);
      responseEntity = new ResponseEntity<SuccessResponse<UserInfo>>(successResponse, HttpStatus.OK);

    } catch (ResponseException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }

  @RequestMapping(value = "/profile", method = RequestMethod.PUT)
  public ResponseEntity<? extends AbstractResponse> updateProfile(
      @RequestBody UserPersonlInformation personalInfo) {
    try {
      personalInfo = userSer.updateProfile(personalInfo);
      SuccessResponse<UserPersonlInformation> successResponse = new SuccessResponse<>();
      successResponse.setValue(personalInfo);
      responseEntity =
          new ResponseEntity<SuccessResponse<UserPersonlInformation>>(successResponse, HttpStatus.OK);

    } catch (ResponseException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }

  @RequestMapping(value = "/prefrence", method = RequestMethod.PUT)
  public ResponseEntity<? extends AbstractResponse> updatePrefrance(
      @RequestBody PreferenceInfo preferenceInfo) {
    try {
      preferenceInfo = userSer.updatePreference(preferenceInfo);
      SuccessResponse<PreferenceInfo> successResponse = new SuccessResponse<>();
      successResponse.setValue(preferenceInfo);
      responseEntity =
          new ResponseEntity<SuccessResponse<PreferenceInfo>>(successResponse, HttpStatus.OK);

    } catch (ResponseException e) {
      ErrorResponse errorResponse = new ErrorResponse(e.getMessage());
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }

}
