package com.lcb.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcb.demo.springboot.service.IDemoService;

@RestController
public class TestDemoController
{
	@Autowired
	IDemoService demoService;
	
	@RequestMapping(value = "/say/{words}")
	public String say(@PathVariable("words") String words)
	{
		String rs = demoService.saySomething(words);
		return rs;
	}
}
