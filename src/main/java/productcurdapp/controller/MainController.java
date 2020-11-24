package productcurdapp.controller;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import productcurdapp.daoImpl.DaoImpl;
import productcurdapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private DaoImpl daoImpl;

	@RequestMapping("/")
	public String home(Model model) {
		List<Product> products = daoImpl.getallProducts();
		model.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.daoImpl.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int pid, HttpServletRequest request) {
		this.daoImpl.deleteProduct(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// update view

	// update handler
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int pid, Model model) {
		// System.out.println(pid);
		// sending old data to view with the help of model
		Product product = this.daoImpl.getProduct(pid);
		model.addAttribute("product", product);
		System.out.println(product);
		// this.daoImpl.updateProduct(product);
		return "update_product_form";
	}

	@RequestMapping(value = "/update-product", method = RequestMethod.POST)
	public RedirectView UpdateProducts(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.daoImpl.updateProduct(product);
		;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
}
