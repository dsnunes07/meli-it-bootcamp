package meli.bootcamp.unittesting.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import meli.bootcamp.unittesting.testing.domain.Calculator;

@RestController
public class TestingController {
  @GetMapping("/soma")
  public int sum(@RequestParam int a, @RequestParam int b) {
    return Calculator.sum(a, b);
  }
}
