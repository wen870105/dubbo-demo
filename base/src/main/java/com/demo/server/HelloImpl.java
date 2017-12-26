package com.demo.server;

import java.util.Date;

import com.demo.export.IHello;

public class HelloImpl implements IHello {
	private static int i = 0;

	@Override
	public String sayHello(String name) {
		System.out.println("第" + (++i) + "次服务器调用," + name);
		return new Date() + "hello:" + name;
	}
}