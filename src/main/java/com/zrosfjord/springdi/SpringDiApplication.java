package com.zrosfjord.springdi;

import com.zrosfjord.springdi.examplebeans.FakeDataSource;
import com.zrosfjord.springdi.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		System.out.println("Fake Data Sourse --------------");

		FakeDataSource fds = ctx.getBean(FakeDataSource.class);

		System.out.println(fds.getUser());
		System.out.println(fds.getPassword());
		System.out.println(fds.getUrl());

		System.out.println("Fake JMS Broker ----------");

		FakeJmsBroker fjb = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fjb.getUsername());
		System.out.println(fjb.getPassword());
		System.out.println(fjb.getUrl());
	}

}
