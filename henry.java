package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class henry {
	@Value("${message}")
	private String msg;
	@Value("101")
	private int id;
	@RequestMapping("/hello")
	public String earth()
	{
		return msg+" "+id;
	}
}
