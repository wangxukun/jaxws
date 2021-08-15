
package org.xkidea.hello.helloservice.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://helloservice.xkidea.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://helloservice.xkidea.org/", className = "org.xkidea.hello.helloservice.endpoint.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://helloservice.xkidea.org/", className = "org.xkidea.hello.helloservice.endpoint.SayHelloResponse")
    @Action(input = "http://helloservice.xkidea.org/Hello/sayHelloRequest", output = "http://helloservice.xkidea.org/Hello/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}