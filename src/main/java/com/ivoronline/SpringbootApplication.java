package com.ivoronline;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(SpringbootApplication.class, args);
    
    //CREATE OBJECT
    Person person      = new Person();
           person.name = "John";
           person.age  = 20;

    //PRINT OBJECT
    JSONObject jsonObject = new JSONObject(person);
    String     personJson = jsonObject.toString();
    System.out.println(personJson);
    
  }
  
}
