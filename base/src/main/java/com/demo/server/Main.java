package com.demo.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	public static final int port = 8082;

	public static void main(String[] args) {
		System.out.println("启动demo");
		ConfMonitor.conf.forEach((k, v) -> {
			System.out.println("注册接口:" + k + ",实现类:" + v);
		});
		
		exportRpc();
		
		
	}

	/**
	 * 导出RPC接口
	 */
	private static void exportRpc() {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(port);
			while (true) {
				Socket s = ss.accept();
				new RpcThread(s).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}