package com.demo;

import org.apache.http.StatusLine;
import org.apache.http.client.fluent.Request;

public class Response_code {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
 String url = "http://www.testingexcellence.com/how-to-get-response-status-code-with-selenium-webdriver/";
 
 try {
	
	 StatusLine resp = Request.Get(url).execute().returnResponse().getStatusLine();
	 System.out.println(resp);
} catch (Exception e) {
	// TODO: handle exception
	throw new RuntimeException(e);
	
}
	}

}
