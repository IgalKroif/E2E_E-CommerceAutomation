package specbuilder;

import java.io.File;

import ecommerceautomation.CreateProductDeserialization;
import ecommerceautomation.Pojo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
	
	
public class RequirementSpecification {
		
		Pojo payload = new Pojo();
		
	    public RequestSpecification buildRequestSpecification() {
	    	RequestSpecBuilder specBuilder = new RequestSpecBuilder();
	        specBuilder
	        		.setBaseUri("https://rahulshettyacademy.com")
	                .setContentType(ContentType.JSON);

	        return specBuilder.build();
	    }
	    
	    public RequestSpecification buildRequestLoginSpecification() {
	    	
	    	RequestSpecBuilder specLoginBuilder = new RequestSpecBuilder();
	    	payload.setUserEmail("igaldatester@gmail.com");
			payload.setUserPassword("Igalkroif2");
			
			specLoginBuilder.setBaseUri("https://rahulshettyacademy.com")
			.setContentType(ContentType.JSON)
			.setBody(payload)
			.log(LogDetail.ALL);
			
			return specLoginBuilder.build();
	        
	    }
	    public RequestSpecification createProductSpecification() {
	        RequestSpecBuilder specProduct = new RequestSpecBuilder();

	        specProduct.setBaseUri("https://rahulshettyacademy.com")
	                .setContentType(ContentType.MULTIPART)
	                .addMultiPart("productName", "qwerty")
	                .addMultiPart("productAddedBy", "649bc3e47244490f956f0ad2")
	                .addMultiPart("productCategory", "fashion")
	                .addMultiPart("productSubCategory", "shirts")
	                .addMultiPart("productPrice", "11500")
	                .addMultiPart("productDescription", "Originals")
	                .addMultiPart("productFor", "women")
	                .addMultiPart("productImage", new File("C:\\Users\\kyigal\\eclipse-workspace\\ecommerceautomation\\src\\test\\resources\\jpg_test.jpg"))
	                .log(LogDetail.ALL);

	        return specProduct.build();
	    }
	}
