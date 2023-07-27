package resouces;

import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class utilities {
	
//	RequestSpecification req;
//	
//	public RequestSpecification requestSpecification()
//	{
//		
//		PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		
//		req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("Key", "qaclick123").
//				addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo("printstrem" ));
//	}

}
