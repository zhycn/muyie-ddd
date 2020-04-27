package com.github.zhycn.muyie.interfaces;

import org.muyie.framework.config.DefaultProfileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterfacesApp {

  public static void main(String[] args) throws Exception {
    SpringApplication application = new SpringApplication(InterfacesApp.class);
    DefaultProfileUtil.addDefaultProfile(application);
    application.run(args);
  }

}
