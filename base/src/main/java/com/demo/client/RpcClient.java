package com.demo.client;

import com.demo.client.proxy.ProxyFactory;
import com.demo.export.IHello;
import com.demo.server.Main;

public class RpcClient {
	public static void main(String[] args) {
		String ip = "localhost";
		int port = Main.port;
		IHello hello = ProxyFactory.create(IHello.class, ip, port);
		System.out.println(hello.sayHello("rpcDemo"));
	}
}