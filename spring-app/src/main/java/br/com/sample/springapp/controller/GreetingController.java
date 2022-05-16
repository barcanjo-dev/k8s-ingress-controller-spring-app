package br.com.sample.springapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController
 */
@RestController
@RequestMapping("/greetings")
public class GreetingController {

  @GetMapping
  public ResponseEntity<?> getGreeting() {
    return ResponseEntity.ok("Hello!");
  }
}