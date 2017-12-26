package com.test.server.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.test.export.bean.RpcDemoBean;
import com.test.export.service.RpcService;

@Service("rpcServiceImpl")
public class RpcServiceImpl implements RpcService {

	@Override
	public RpcDemoBean getDate(String name) {
		int flag = 2;

		RpcDemoBean b = new RpcDemoBean();
		b.setName("s1:" + name);
		b.setDate(new Date());

		if (flag == 1) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw new RuntimeException("testestestg");
		}
		return b;
	}

}
