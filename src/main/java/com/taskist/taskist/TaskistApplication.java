package com.taskist.taskist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.taskist.taskist.repository")
public class TaskistApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaskistApplication.class, args);
    System.out.println("Application Started");
  }
}
