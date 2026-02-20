package dev;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestNgTest {

	@Test
	void welcome() {
		System.out.println("Welcome to TestNg Programming");
		int a=10;
		//Sample.age=25;
		String n=Sample.name.toUpperCase();
		
		Sample.justmethod();
		RestAssured.baseURI="https://postman-echo.com";
		Response res=RestAssured.given().when().get("get?name=saravanan&city=trichy");
		int responseCode=res.getStatusCode();
		if (responseCode==201) {
			System.out.println("Test case is passed");
			
		} else {
			System.out.println("Test case is failed");
		}
	}
	
}
