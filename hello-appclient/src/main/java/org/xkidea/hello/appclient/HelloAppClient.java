package org.xkidea.hello.appclient;

import org.xkidea.hello.helloservice.endpoint.HelloService;
import javax.xml.ws.WebServiceRef;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation = "http://localhost:8080/helloservice-war-1.0/HelloService?WSDL")
    private static HelloService service;

    public static void main(String[] args) {
        System.out.println(sayHello("wang zilin"));
    }

    private static String sayHello(java.lang.String arg0) {
        org.xkidea.hello.helloservice.endpoint.Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }
}
