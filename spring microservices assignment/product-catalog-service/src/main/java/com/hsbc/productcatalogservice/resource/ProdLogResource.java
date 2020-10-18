/**
 * Author -parth bapat
 * catalog resource uses spring jdbc
 * recieves category from categoory service and fetches the products under the category from underlying database
 * Uses a dao layer to process database queries.
 * ProductList wrapper class is used to return a list of Product object to manager service
 */
package com.hsbc.productcatalogservice.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcatalogservice.dao.ProductDao;
import com.hsbc.productcatalogservice.model.Product;
import com.hsbc.productcatalogservice.model.ProductList;

@RestController
@RequestMapping("catalog")
public class ProdLogResource {
	
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/{catId}")
	public ProductList getProducts(@PathVariable("catId") String catId){
		ProductList obj=new ProductList();
		List<Product> plist1=dao.getAllProducts(catId);
		obj.setPlist(plist1);
		
		return obj;
		
	}

}
