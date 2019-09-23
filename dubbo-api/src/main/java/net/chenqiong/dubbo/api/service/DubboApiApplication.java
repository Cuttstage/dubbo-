package net.chenqiong.dubbo.api.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消费者启动类
 */
@EnableDubbo
@SpringBootApplication
public class DubboApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboApiApplication.class, args);
	}
}
