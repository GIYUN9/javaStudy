package com.kh.miniProject_inveManage_stop;
import java.util.*;

public class ProductController {
	private static List<Product> products = new ArrayList<>();
	
	public static void setProducts(List<Product> products) {
		ProductController.products = products;
	}

	public void addProduct(Product product) {
	    products.add(product);
	  }

	  public void updateProduct(int id, Product product) {
	    products.set(id, product);
	  }

	  public void deleteProduct(String name) {
	    products.remove(name);
	  }

	  public Product getProductById(int id) {
	    return products.get(id);
	  }

	  public static List<Product> getProducts() {
	    return products;
	  }
	  public static Product getProductByName(String productName) {
		  for (Product product : products) {
		    if (product.getName().equals(productName)) {
		      return product;
		    }
		  }
		  return null;
		}
	  
}
