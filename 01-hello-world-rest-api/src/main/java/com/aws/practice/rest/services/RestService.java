package com.aws.practice.rest.services;

import org.springframework.stereotype.Component;

import com.aws.practice.rest.aspest.NoLogging;


@Component
public class RestService {
	
	@NoLogging
	public  void foo() {
		System.out.println("Hi fooooooooo");
	}

	public  void bar() {
		System.out.println("Hi bar....");
	}

	public static void zot() {
	}

	public static void baz() {
	}
}