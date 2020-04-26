package com.zrosfjord.springdi;

import com.zrosfjord.springdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		FakeDataSource fds = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fds.getUser());
		System.out.println(fds.getPassword());
		System.out.println(fds.getUrl());
	}

}
