package com.dnyanesh.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/")
public class HelloController {

	@Value("${client.message}")
	private String message;

	@GetMapping
	public String getMessage() {
		return message;
	}

}
