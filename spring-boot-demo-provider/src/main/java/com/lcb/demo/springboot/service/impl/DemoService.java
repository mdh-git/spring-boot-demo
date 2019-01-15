package com.lcb.demo.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lcb.demo.springboot.service.IDemoService;

@Service
public class DemoService implements IDemoService
{

	@Override
	public String saySomething(String str)
	{
		String say = "Say: " + str;
		
		System.out.println("  " + say);
		
		return say;
	}

}
