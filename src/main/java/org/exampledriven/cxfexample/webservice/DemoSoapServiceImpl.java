package org.exampledriven.cxfexample.webservice;

import org.springframework.stereotype.Service;

@Service("demoSoapServiceImpl")
public class DemoSoapServiceImpl implements DemoSoapService {

	@Override
	public String getUserByName(String name) {
		return name + "here you are!";
	}

	@Override
	public void setUser(String user) {
		System.out.println("-------------------------"+user+"-------------------------");
	}

}
