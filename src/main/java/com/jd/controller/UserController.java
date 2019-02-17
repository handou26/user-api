package com.jd.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jd.api.FeginOrderService;

@RestController
public class UserController {
	
	@Value("${server.port}")
	private String port;
	
	
	@Value("${spring.application.name}")
	private String hostname;
	
	
	@Resource
	private FeginOrderService  feginOrderService;
	
	@RequestMapping("user")
	public String user(@RequestParam String name ){
		
		 return "你好，" + name + "我是用户系统，" + hostname + ",端口是" + port;
		
	}
	
	@RequestMapping("getpatientsFormOrder")
	public String getpatientsFormOrder( ){
		
		 return feginOrderService.getPatients();
		
	}

}
