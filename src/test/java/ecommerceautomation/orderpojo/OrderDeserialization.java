package ecommerceautomation.orderpojo;

import java.util.List;

public class OrderDeserialization {
    private List<Orders> orders;
    private List<Orders> productOrderId;
    private String type;
    private Object message;
    
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<Orders> getProductOrderId() {
		return productOrderId;
	}
	public void setProductOrderId(List<Orders> productOrderId) {
		this.productOrderId = productOrderId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}

  
}