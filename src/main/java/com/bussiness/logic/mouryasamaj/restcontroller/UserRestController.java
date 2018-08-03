package com.bussiness.logic.mouryasamaj.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bussiness.logic.mouryasamaj.dto.User;
import com.bussiness.logic.mouryasamaj.dto.UserLogin;
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
    return buildResponse(userSer.checkLogin(userLogin));
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public ResponseEntity<? extends AbstractResponse> registerUser(@RequestBody User user) {
    return buildResponse(userSer.registerUser(user).equals("Success"));
  }

  private ResponseEntity<? extends AbstractResponse> buildResponse(Boolean result) {
    if (result) {
      SuccessResponse<String> successResponse = new SuccessResponse<>("Success");
      responseEntity = new ResponseEntity<SuccessResponse<String>>(successResponse, HttpStatus.OK);
    } else {
      ErrorResponse errorResponse = new ErrorResponse("Fail");
      responseEntity = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.FORBIDDEN);
    }
    return responseEntity;
  }
}
