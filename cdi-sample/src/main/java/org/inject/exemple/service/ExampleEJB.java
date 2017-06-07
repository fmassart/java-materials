package org.inject.exemple.service;

import org.inject.exemple.beans.HelloService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import java.io.Serializable;

@Stateless
@WebService
public class ExampleEJB implements Serializable {

	private HelloService helloService;

	public void logName(String name) {
		System.out.println(helloService.sayHello(name));
	}

	@Inject
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
}