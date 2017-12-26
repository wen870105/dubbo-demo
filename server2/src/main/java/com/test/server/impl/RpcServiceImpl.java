package com.test.server.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.test.export.bean.RpcDemoBean;
import com.test.export.service.RpcService;

@Service("rpcServiceImpl")
public class RpcServiceImpl implements RpcService {

	@Override
	public RpcDemoBean getDate(String name) {
		System.out.println("s2 服务 hhhhhhhhhhhhh");
		RpcDemoBean b = new RpcDemoBean();
		b.setName("s2"+name);
		b.setDate(new Date());
		return b;
	}

}
