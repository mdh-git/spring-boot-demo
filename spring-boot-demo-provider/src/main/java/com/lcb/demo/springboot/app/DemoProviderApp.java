package com.lcb.demo.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude= {RedisAutoConfiguration.class})
//@EnableDubboConfiguration
@Import(DemoProviderConfig.class)
public class DemoProviderApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoProviderApp.class, args);
	}
}
