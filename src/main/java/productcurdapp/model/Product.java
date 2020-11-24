package productcurdapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )

	private int Id;
	private String productName;
	private String productDesc;
	private Long price;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Product(int id, String productName, String productDesc, Long price) {
		super();
		Id = id;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", productName=" + productName + ", productDesc=" + productDesc + ", price="
				+ price + "]";
	}

}
