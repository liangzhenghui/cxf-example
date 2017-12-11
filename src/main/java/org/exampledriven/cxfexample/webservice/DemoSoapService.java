package org.exampledriven.cxfexample.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface DemoSoapService {
	 public String getUserByName(@WebParam(name = "name") String name);
	    
	 public void setUser(String user);
}
