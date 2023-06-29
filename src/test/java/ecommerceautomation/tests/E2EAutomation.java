package ecommerceautomation.tests;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.ArrayList;
import org.testng.annotations.Test;

import ecommerceautomation.CreateProductDeserialization;
import ecommerceautomation.LoginDeserialization;
import ecommerceautomation.orderpojo.OrderDeserialization;
import ecommerceautomation.orderpojo.Orders;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import specbuilder.RequirementSpecification;
import ecommerceautomation.orderpojo.Orders;
import ecommerceautomation.deletepojo.DeletionDesirialization;


public class E2EAutomation {
	public static String productId;
	public String token;
	
    //E2EAutomation prductId = new E2EAutomation();
	List<Orders> orderFields  = new ArrayList<Orders>();
    Orders fields = new Orders(productId);
	RequirementSpecification specbuilder = new RequirementSpecification();
	RequestSpecification mylogin = specbuilder.buildRequestLoginSpecification();
	RequestSpecification myproductSpec = specbuilder.createProductSpecification();
	CreateProductDeserialization createProduct = new CreateProductDeserialization();
	OrderDeserialization orderResponse = new OrderDeserialization();
	
	@Test
	public void test() {
		given()
		.spec(specbuilder.buildRequestSpecification());
		
	}
	
	@Test
	public void e2e() {
		LoginDeserialization loginResponse = 
				given()
				.spec(mylogin)
				.when().post("/api/ecom/auth/login")
				.then().log().all()
				.extract().response().as(LoginDeserialization.class);
		String token = loginResponse.getToken();
		
		RequestSpecification myproductSpec = specbuilder.createProductSpecification(); // Call createProductSpecification() method
	    CreateProductDeserialization addProductResponse = 
	        given()
	        .header("Authorization", token)
	        .spec(myproductSpec) // Use myproductSpec as the request specification
	        .when().post("/api/ecom/product/add-product")
	        .then()
	        .log().all()
	        .extract().response().as(CreateProductDeserialization.class);
	    String productId = addProductResponse.getProductId();
	    this.productId = productId;
	    System.out.println(this.productId);
	    E2EAutomation.productId = productId;
	    RequirementSpecification.productId = productId;

	    //OrderDeserialization orderRequest = new OrderDeserialization();
	   //orderRequest.setOrders(orderFields);
	    RequestSpecification myOrderSpec = specbuilder.orderProductSpecification();
	    OrderDeserialization orderResponse = given()
	            .spec(myOrderSpec)
	            .header("Authorization", token)
	            //.body(orderRequest)
	            .relaxedHTTPSValidation()
	            .accept(ContentType.JSON)
	            
	            .when()
	            .post("/api/ecom/order/create-order")
	            .then()
	            .log().all()
	            .extract()
	            .response().as(OrderDeserialization.class);
	    
	    	
	    // ... continue with the rest of your code ...
	    given()
	    .relaxedHTTPSValidation()
	    .header("Authorization", token)
	    //.pathParam("productId",productId)
	    .when()
	    .delete("https://rahulshettyacademy.com/api/ecom/product/delete-product/" + productId)
	    .then().log().status().and().log().body();
	}
	
	//EXTRACTS THE PRODUCT ID FROM THE REQUEST FOR EXTERNAL USE!
	@Test
	public String getProductId() {
		 e2e();
		System.out.println("The productID is : "+ productId);
		
		return this.productId;
	}
	@Test
	public void deleteTest() {
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDliYzNlNDcyNDQ0OTBmOTU2ZjBhZDIiLCJ1c2VyRW1haWwiOiJpZ2FsZGF0ZXN0ZXJAZ21haWwuY29tIiwidXNlck1vYmlsZSI6MTIzNTQ2Nzg5MCwidXNlclJvbGUiOiJjdXN0b21lciIsImlhdCI6MTY4Nzk0NTExOSwiZXhwIjoxNzE5NTAyNzE5fQ.SymqO_1rMlbPoaziUjs_PbDYApETzkvQhIY6baO2Raw";
		given()
		//.accept(ContentType.JSON)
		.header("Authorization",token)
		.when()
		.delete("https://rahulshettyacademy.com/api/ecom/product/delete-product/649d6a307244490f95704576")
		.then().log().all();
	}

}
