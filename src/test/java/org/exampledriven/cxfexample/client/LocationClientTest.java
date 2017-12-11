package org.exampledriven.cxfexample.client;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class LocationClientTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//@Test
	public void getLocation() {

		String city = "Budapest";

		// LocationData locationData = new LocationClient().getLocation(city);
		// logger.debug("", locationData);
		//
		// assertEquals(city, locationData.getLocation());
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
		Client client = factory.createClient("http://192.168.56.200:8083/approve/service/Users.cxf?wsdl");
		Object[] obj = null;
		try {
			obj = client.invoke("setUser", "xiao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("resp:"+obj[0]);

	}

	//@Test
	public void soapTest() {
		// LocationData locationData = new LocationClient().getLocation(city);
		// logger.debug("", locationData);
		//
		// assertEquals(city, locationData.getLocation());
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
		Client client = factory.createClient("http://localhost:8080/cxf/soapdemo?wsdl");
		Object[] obj = null;
		try {
			obj = client.invoke("setUser", "xiao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("resp:"+obj[0]);

	}
	
	@Test
	public void soapTestGet() {
		// LocationData locationData = new LocationClient().getLocation(city);
		// logger.debug("", locationData);
		//
		// assertEquals(city, locationData.getLocation());
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
		Client client = factory.createClient("http://localhost:8080/cxf/soapdemo?wsdl");
		Object[] obj = null;
		try {
			obj = client.invoke("getUserByName", "xiao");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("resp:"+obj[0]);

	}
}
