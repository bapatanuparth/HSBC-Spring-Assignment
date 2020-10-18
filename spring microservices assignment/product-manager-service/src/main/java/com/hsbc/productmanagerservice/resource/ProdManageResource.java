package com.hsbc.productmanagerservice.resource;

/**
 * Author- parth bapat
 * product-manager-resource is the base url called by user.
 * In turn calls category service to randomly get categories of product.
 * Passes the category to catalog service which fetches the product data from underlying database
 * Returns a list of products back
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.productmanagerservice.model.Category;
import com.hsbc.productmanagerservice.model.Product;
import com.hsbc.productmanagerservice.model.ProductList;

@RestController
@RequestMapping("/products")
public class ProdManageResource {
	
	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/items")
	public List<Product> getProducts(){
		
	//	RestTemplate rt=new RestTemplate();
		Category cat=rt.getForObject("http://product-category-service/category/value", Category.class);
		
		System.out.println(cat.getCatName());
		
		ProductList plist=rt.getForObject("http://product-catalog-service/catalog/"+cat.getCatName(), ProductList.class);
		
		
		return plist.getPlist();
		
	}

}
