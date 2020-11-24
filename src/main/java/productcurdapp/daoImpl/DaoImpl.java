package productcurdapp.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcurdapp.dao.Dao;
import productcurdapp.model.Product;

@Component
public class DaoImpl implements Dao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);

	}

	public List<Product> getallProducts() {
		List<Product> loadAll = this.hibernateTemplate.loadAll(Product.class);
		return loadAll;
	}

	@Transactional
	public void deleteProduct(int pid) {
		Product load = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(load);
	}

	public Product getProduct(int pid) {
		Product product = this.hibernateTemplate.get(Product.class, pid);
		return product;
	}

	@Transactional
	public void updateProduct(Product product) {
		System.out.println("DaoImpl : " + product);
		// Product loadupdate = this.hibernateTemplate.load(Product.class,
		// product.getId());
		this.hibernateTemplate.update(product);
	}
/*
	@Transactional
	public void updateProduct(int product) {
		Product loadsingledata = this.hibernateTemplate.load(Product.class, product);
		this.hibernateTemplate.update(loadsingledata);
		
	}*/

}
