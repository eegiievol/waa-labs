package edu.mum.controller;

import edu.mum.repository.CategoryRepository;
import edu.mum.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getProductForm(Model model) {
		// TODO implementation...
		List<Category> categories = categoryService.getAll();
		model.addAttribute("categories", categories);
		return "ProductForm";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String saveProduct(Product product, Model model) {
		// TODO implementation...

		Category category = categoryService.getCategory(product.getCategory().getId());
		product.setCategory(category);
		productService.save(product);
		//System.out.println(product.getDescription());
		//System.out.println(product.getCategory().getId());

		model.addAttribute("product", product);
		return "ProductDetails";
	}

	@RequestMapping(value = "/listproducts", method = RequestMethod.GET)
	public String listProducts(Model model) {
		// TODO implementation...
		model.addAttribute("products", productService.getAll());
		return "ListProducts";
	}


	@RequestMapping(value = "/productfind", method = RequestMethod.GET)
	public String findProduct() {
		// TODO
		//System.out.println(product.getCategory().getId());
		return "Find";
	}

	@RequestMapping(value = "/singleproduct")
	public String findProduct(@RequestParam("id") String id, Model model) {
		// TODO
		model.addAttribute("product", productService.getProduct(Long.parseLong(id)));
		//System.out.println(Long.parseLong(id));
		return "SingleProduct";
	}


}
