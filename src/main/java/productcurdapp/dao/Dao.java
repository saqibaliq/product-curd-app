package productcurdapp.dao;

import java.util.List;

import productcurdapp.model.Product;

public interface Dao {
	public void createProduct(Product product);

	public List<Product> getallProducts();

	public void deleteProduct(int pid);

	public Product getProduct(int pid);
	
	public void updateProduct(Product product);
}
