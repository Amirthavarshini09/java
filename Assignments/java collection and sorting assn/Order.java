package test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Order {
	private Long orderId;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliverdate;
	private List<Product>product;
	private long customerId;
//	private Customer customers;
//	public Customer getCustomers() {
//		return customers;
//	}
//	public void setCustomers(Customer customers) {
//		this.customers = customers;
	
	public Order() {



}
	public Order(Long orderId, LocalDate orderDate, LocalDate deliverdate, String status, long customerId) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.orderDate = orderDate;
		this.deliverdate = deliverdate;
		this.customerId=customerId;
		this.product=product;
	}
	public void addProduct(Product product) {
		((List<Product>) product).add(product);
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliverdate() {
		return deliverdate;
	}
	public void setDeliverdate(LocalDate deliverdate) {
		this.deliverdate = deliverdate;
		
	}
	public Long getustomerId() {
		return  customerId;
	}
	public void setCustomerId(long  customerId) {
		this. customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", status=" + status + ", orderDate=" + orderDate + ", deliverdate="
				+ deliverdate + ", productId=" + customerId + "]";
	}
	public Collection<Product> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
//	public Customer getCustomer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public Customer getCustomer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}

  
