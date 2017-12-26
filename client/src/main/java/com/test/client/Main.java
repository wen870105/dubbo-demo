package com.test.client;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.export.bean.RpcDemoBean;
import com.test.export.service.RpcService;

public class Main {
	public static void main(String[] args) throws IOException {
 		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		RpcService service = ctx.getBean(RpcService.class);
//		for(int i=0;i<10;i++){
			RpcDemoBean b = service.getDate("wwww");
			System.out.println("===============:   "+b.getName() +"返回的服务器时间: " + b.getDate() );
//		}
		
		ctx.close();

		System.in.read();
		System.out.println("=================");
	}
}
