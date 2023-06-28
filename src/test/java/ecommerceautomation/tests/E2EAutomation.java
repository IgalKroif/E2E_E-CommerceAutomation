package ecommerceautomation.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import ecommerceautomation.CreateProductDeserialization;
import ecommerceautomation.LoginDeserialization;
import io.restassured.specification.RequestSpecification;
import specbuilder.RequirementSpecification;


public class E2EAutomation {
	public String token;
	RequirementSpecification specbuilder = new RequirementSpecification();
	RequestSpecification mylogin = specbuilder.buildRequestLoginSpecification();
	RequestSpecification myproductSpec = specbuilder.createProductSpecification();
	CreateProductDeserialization createProduct = new CreateProductDeserialization();
	
	@Test
	public void test() {
		given()
		.spec(specbuilder.buildRequestSpecification());
		
	}
	
	@Test
	public void e2e() {
		LoginDeserialization response = 
				given()
				.spec(mylogin)
				.when().post("/api/ecom/auth/login")
				.then().log().all()
				.extract().response().as(LoginDeserialization.class);
		String token = response.getToken();
		
		RequestSpecification myproductSpec = specbuilder.createProductSpecification(); // Call createProductSpecification() method
	    CreateProductDeserialization response1 = 
	        given()
	        .header("Authorization", token)
	        .spec(myproductSpec) // Use myproductSpec as the request specification
	        .when().post("/api/ecom/product/add-product")
	        .then()
	        .log().all()
	        .extract().response().as(CreateProductDeserialization.class);
	    System.out.println(response1.getProductName());
	}

}
