package com.bussiness.logic.mouryasamaj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bussiness.logic.mouryasamaj.dao.UserDao;
import com.bussiness.logic.mouryasamaj.dao.impl.UserDaoImpl;
import com.bussiness.logic.mouryasamaj.service.UserSer;
import com.bussiness.logic.mouryasamaj.service.impl.UserSerImpl;

@Configuration
public class AppConfig {

  @Bean
  public UserSer getUserSer() {
    return new UserSerImpl();
  }

  @Bean
  public UserDao getUserDao() {
    return new UserDaoImpl();
  }
}
