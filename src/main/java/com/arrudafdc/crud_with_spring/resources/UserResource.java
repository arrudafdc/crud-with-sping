package com.arrudafdc.crud_with_spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arrudafdc.crud_with_spring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User user = new User(1L, "João", "joao@gmail.com", "99999999", "1234567");
    return ResponseEntity.ok().body(user);
  }

}
