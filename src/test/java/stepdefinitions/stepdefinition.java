package stepdefinitions;

import java.awt.List;
import java.util.ArrayList;

import pojo.addLocation;
import pojo.addplace;
//import pojo.Location;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.addplace;
import pojo.addLocation;

public class stepdefinition {
	
	@Given("add place payload")
	public void add_place_payload()
	{
		//Write code here that turns the phrase above into concrete actions
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		addplace p=new addplace();
		p.setAccuracy(50);
		p.setAdress("29, side layout, cohen 09");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline house");
		
		
		ArrayList mylist =new ArrayList();
		mylist.add("shoe park");
		mylist.add("shop");
		
		p.setTypes(mylist);
		addLocation l=new addLocation();
		l.setLat(0);
		l.setLng(0);
		p.setLocation(l);
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		
		RequestSpecification resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType()
		
				RequestSpecification res= given().spec(req);
		
	}


	@When("user calls {string} with the POST http method")
	public void user_calls_with_the_post_http_method(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("the Api call got success with the status code {int}")
	public void the_api_call_got_success_with_the_status_code(Integer int1) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("{string} in responce body is {string}")
	public void in_responce_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
