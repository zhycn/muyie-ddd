package com.github.zhycn.muyie.application;

import org.muyie.framework.config.DefaultProfileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) throws Exception {
    SpringApplication application = new SpringApplication(Application.class);
    DefaultProfileUtil.addDefaultProfile(application);
    application.run(args);
  }

}
