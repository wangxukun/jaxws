package org.xkidea.helloservice;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello {

    private final String message = "Hello, ";

    public Hello() {
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
