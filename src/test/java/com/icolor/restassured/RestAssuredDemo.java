package com.icolor.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class RestAssuredDemo {
	
	@Test
	public void testGetAPI() {
		
		given()
			.baseUri("https://reqres.in")
		
		.when()
			.get("/api/users?page=2")
		
		.then()
			.statusCode(200)
			.log().all();

	}

}
