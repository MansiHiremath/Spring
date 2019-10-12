package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();

	}

	@Override
	public Product findProductById(int productId) {

		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		List<Product> list1=new ArrayList<Product>();
	list=productDao.getAll();
	for(Product product:list) {
		if(product.getPrice()>=minPrice && product.getPrice()<=maxPrice) {
			list1.add(product);
		}
	}
	return list1;
	}

	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		List<Product> list1=new ArrayList<Product>();
		list=productDao.getAll();
		for(Product product:list) {
			if(product.getName()==name) {
				list1.add(product);
			}
		}
		return list1;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		List<Product> list1=new ArrayList<Product>();
		list=productDao.getAll();
		for(Product product:list) {
			if(product.getBrand()==brand) {
				list1.add(product);
			}
		}
		return list1;
	}

	@Override
	public long getproductCount() {
		// TODO Auto-generated method stub
		long count=0;
		List<Product> list=new ArrayList<Product>();
		list=productDao.getAll();
		for(Product product:list) {
			count++;
			}
		
		return count;

	}

}
