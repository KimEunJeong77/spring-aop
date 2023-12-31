package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;

@RestController
@RequestMapping("/api")
public class RestApiController {
	@GetMapping("/get/{id}")
	public String get(@PathVariable Long id, @RequestParam String name) {
		System.out.println("get method 실행");
		return id+","+name;
	}
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		System.out.println("post method 실행");
		return user;
	}
}