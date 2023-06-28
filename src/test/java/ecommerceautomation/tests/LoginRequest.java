package ecommerceautomation.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import ecommerceautomation.LoginDeserialization;
import ecommerceautomation.Pojo;
import io.restassured.specification.RequestSpecification;
import specbuilder.RequirementSpecification;

public class LoginRequest {
	RequirementSpecification specbuilder = new RequirementSpecification();
	RequestSpecification mylogin = specbuilder.buildRequestLoginSpecification();
	
	@Test
	public void testLogin() {
		LoginDeserialization response = 
		given()
		.spec(mylogin)
		.when().post("/api/ecom/auth/login")
		.then().log().all()
		.extract().response().as(LoginDeserialization.class);
		
		System.out.println("UserGeneratedToken: " + response.getToken());
		System.out.println("UserId: "+response.getUserId());
		
		//CREATE PRODUCT
		
	}

}
