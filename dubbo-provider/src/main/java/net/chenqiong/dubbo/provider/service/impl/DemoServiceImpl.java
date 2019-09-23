package net.chenqiong.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import net.chenqiong.dubbo.api.service.DemoService;

/**
 * 服务提供类
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + " (from your Dubbo&Zokeeper.)";
	}
}
