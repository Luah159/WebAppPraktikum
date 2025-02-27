package dao;

import java.util.List;

import models.Katalog;
import models.Product;

public class ProductDAO {
	 List<Product> product = List.of(
			new Product(1, "my handsome product", 22.45, "test description"),
			new Product(2, "product 2", 2233.99, "test description"),
			new Product(3, "p1", 2232.45, "test description"),
			new Product(4, "p1", 22.45, "test description"),
			new Product(5, "p1", 22.45, "test description"),
			new Product(6, "p1", 2232.45, "test description"),
			new Product(7, "p1", 22.45, "test description"),
			new Product(8, "p1", 22.45, "test description"),
			new Product(9, "p1", 22.45, "test description"),
			new Product(10, "p1", 2232.45, "test description"),
			new Product(11, "p1", 22.45, "test description"),
			new Product(12, "p1", 22.45, "test description")
		);
	
			
		public List<Product> getAllProducts() {
			return this.product;
		}
		
		public Product getProduct(int id) throws Exception {
			for (Product p: this.product) {
				if (id == p.getId()) {
					return p;
				}
			}
			throw new Exception("Product with id " + id + " not found");
		}

		public boolean deleteProduct(int id) {
			return this.product.removeIf(p -> p.getId() == id);
		}
		
}
