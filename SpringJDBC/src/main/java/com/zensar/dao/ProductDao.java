package com.zensar.dao;

import java.util.List;


import com.zensar.entities.Product;

/**
 * @author Mansi Hiremath
 * @creation_date 4 October,2019 10:06 AM
 * @modification_date 4 October,2019 10:06AM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description It is Data access object interface
 * 
 *
 */

public interface ProductDao {
	List<Product> getAll();
	Product getById(int productId);
	void insert(Product product);
	void delete(Product product);
	void update(Product product);
	}
