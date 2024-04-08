package test;

import java.util.Comparator;

public class Product {
	private long productId;
    private String name;
    private String category;
    private double price;

   

	public Product(long productId, String name, String category, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}



	public long getProductId() {
		return productId;
	}



	public void setProductId(long productId) {
		this.productId = productId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public static Object category(String string) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}





	public void sort(Comparator<Product> comparing) {
		// TODO Auto-generated method stub
		
	}

}
    
