package test;

import java.util.List;

public class Customer {
    private long customerId;
    private String name;
    private int tier;
	private List<Order>order;

   

	public Customer(long customerId, String name, int tier) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.tier = tier;
		this.order=order;
	}
	private List<Order>Order;



	public long getCustomerId() {
		return customerId;
	}



	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getTier() {
		return tier;
	}



	public void setTier(int tier) {
		this.tier = tier;
	}

}
