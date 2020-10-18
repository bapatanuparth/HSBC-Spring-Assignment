/**
 * Author- Parth Bapat
 * Category resource randomly returns a category name from list of all categories
 * 
 */
package com.hsbc.productcategoryservice.resource;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.productcategoryservice.model.Category;

@RestController
@RequestMapping("/category")
public class ProdCatResource {
	 List<Category> catList=Arrays.asList(new Category("Electronics"),new Category("Clothes"),new Category("Books"));
	
	@RequestMapping("/value")
	public Category getCat() {
		ProdCatResource p=new ProdCatResource();
		Random rand=new Random();
		return p.catList.get(rand.nextInt(3));
		
	}
}
