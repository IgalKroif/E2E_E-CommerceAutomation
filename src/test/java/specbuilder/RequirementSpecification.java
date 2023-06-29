package specbuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;

import ecommerceautomation.Pojo;
import ecommerceautomation.orderpojo.OrderDeserialization;
import ecommerceautomation.orderpojo.Orders;
import ecommerceautomation.tests.E2EAutomation;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

	
	
public class RequirementSpecification {
	List<Orders> orderFields  = new ArrayList<Orders>();
	//private String productId = E2EAutomation.productId;
	public static String productId;
    Orders fields = new Orders(productId);
   static OrderDeserialization orderRequest = new OrderDeserialization();
		
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
	    @BeforeClass
	    public RequestSpecification orderProductSpecification() {
	        // Initialize the orderFields list
	        List<Orders> orderFields = new ArrayList<>();
	        
	        // Create and add the order object
	        Orders order = new Orders(RequirementSpecification.productId);
	        order.setCountry("Israel");
	        order.setProductOrderedId(RequirementSpecification.productId);
	        orderFields.add(order);
	        
	        // Create the orderRequest object and set the orderFields
	        
	        orderRequest.setOrders(orderFields);
	        
	        // Build and return the request specification
	        RequestSpecBuilder specOrder = new RequestSpecBuilder();
	        specOrder.setBaseUri("https://rahulshettyacademy.com")
	                .setContentType(ContentType.JSON)
	                .setBody(orderRequest);
	        
	        return specOrder.build();
	    }
	    public RequestSpecification deletionSpecification() {
	    	RequestSpecBuilder deleteSpec = new RequestSpecBuilder();
	    	deleteSpec.setBaseUri("https://rahulshettyacademy.com");
	    	//.setAccept(ContentType.JSON)
	    	//.setBasePath("/api/ecom/product/delete-product/");
	    	return deleteSpec.build();
	    }
}
