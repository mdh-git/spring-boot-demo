package com.lcb.demo.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude= {RedisAutoConfiguration.class})
//@EnableDubboConfiguration
@Import(DemoConsumerConfig.class)
public class DemoConsumerApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoConsumerApp.class, args);
	}
}
