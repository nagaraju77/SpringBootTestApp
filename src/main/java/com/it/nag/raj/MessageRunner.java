package com.it.nag.raj;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		int a=77;
		System.out.println("Hello Modified::"+a);
	}

}
