package dao;

import java.util.List;

import models.Product;

public class ProductDAO {
	List<Product> products = List.of(
		new Product(1, "my handsome product", 22.45, "test description"),
		new Product(2, "product 2", 2233.99, "test description"),
		new Product(3, "p1", 2232.45, "test description"),
		new Product(4, "p1", 22.45, "test description"),
		new Product(5, "p1", 22.45, "test description")
	);
	
	public List<Product> getAllProducts() {
		return this.products;
	}
	
	public Product getProduct(int id) throws Exception {
		for (Product p: this.products) {
			if (id == p.getId()) {
				return p;
			}
		}
		throw new Exception("Product with id " + id + " not found");
	}

	public boolean deleteProduct(int id) {
		return this.products.removeIf(p -> p.getId() == id);
	}
	
//	public boolean updateProduct(int id, Product newProduct) {
//		this.products.
//	}
}
