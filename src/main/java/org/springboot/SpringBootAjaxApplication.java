package org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootAjaxApplication  extends SpringBootServletInitializer {
//使用外置的tomcat启动
//
//      默认的启动类要继承SpringBootServletInitiailzer类，并复写configure()方法。

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootAjaxApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAjaxApplication.class, args);
	}
}
