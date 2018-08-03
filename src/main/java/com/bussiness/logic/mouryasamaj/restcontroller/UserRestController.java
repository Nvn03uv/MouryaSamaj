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
import com.bussiness.logic.mouryasamaj.exception.ApplicationException;
import com.bussiness.logic.mouryasamaj.service.UserSer;

@RestController
@RequestMapping("/user")
public class UserRestController {

  @Autowired
  private UserSer userSer;

  private ResponseEntity<ApplicationException> responseEntity;

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResponseEntity<ApplicationException> checkLogin(@RequestBody UserLogin userLogin) {

    if (userSer.checkLogin(userLogin)) {

      responseEntity = new ResponseEntity<ApplicationException>(new ApplicationException("Success"),
          HttpStatus.OK);

    } else {
      responseEntity = new ResponseEntity<ApplicationException>(new ApplicationException("Fail"),
          HttpStatus.FORBIDDEN);
    }

    return responseEntity;

  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public ResponseEntity<ApplicationException> registerUser(@RequestBody User user) {

    if (userSer.registerUser(user).equals("Success")) {
      responseEntity = new ResponseEntity<ApplicationException>(new ApplicationException("Success"),
          HttpStatus.OK);

    } else {
      responseEntity = new ResponseEntity<ApplicationException>(new ApplicationException("Fail"),
          HttpStatus.FORBIDDEN);
    }

    return responseEntity;

  }
}
