package com.lcb.demo.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations= {"classpath:applicationContext.xml"})
public class DemoConsumerConfig
{

}
