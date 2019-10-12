package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
List<Product> list=productService.findAllProducts();
for(Product product:list) {
	System.out.println(product);
}

Product product=productService.findProductById(1002);
	//System.out.println(product);
	
	/*Product product=new Product(1011, "Oven", "LG", 7000);
	productService.addProduct(product);*/
/*if(product!=null) {
	product.setName("Mobile");
	product.setBrand("L.G");
	product.setPrice(25000);
	productService.updateProduct(product);
}
else
{
	System.out.println("Product not found");
}
*/
/*if(product!=null) {
	productService.removeProduct(product);
	System.out.println("Deleted successfully");
}
else
{
System.out.println("Product not found");	
}
*/
	}	

}
