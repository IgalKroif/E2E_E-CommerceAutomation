package ecommerceautomation.orderpojo;

public class Orders {
	private String country;
	private String productOrderedId;
	private String order;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProductOrderedId() {
		return productOrderedId;
	}
	public void setProductOrderedId(String productOrderedId) {
		this.productOrderedId = productOrderedId;
	}
	
	   public Orders(String order) {
	        this.order = order;
	    }

	    public String getOrder() {
	        return order;
	    }

	    public void setOrder(String order) {
	        this.order = order;
	    }
	}
