package com.zensar.services;

/**
 * @author Mansi Hiremath
 * @creation_date 4 October,2019 11:39 AM
 * @modification_date 4 October,2019 11:39 AM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is Service class. It is used in business layer
 * 
 *
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
	List<Product> findAllProducts();

	Product findProductById(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);
	
	List<Product> findProductsByPriceRange(float minPrice,float maxprice);
	
	List<Product> findProductByName(String name);
	
	List<Product> findProductByBrand(String brand);
	
	long getproductCount();

}
