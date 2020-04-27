package com.github.zhycn.muyie.scheduler;

import org.muyie.framework.config.DefaultProfileUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerApp {

  public static void main(String[] args) throws Exception {
    SpringApplication application = new SpringApplication(SchedulerApp.class);
    DefaultProfileUtil.addDefaultProfile(application);
    application.run(args);
  }

}
