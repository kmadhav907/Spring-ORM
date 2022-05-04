package com.spring.org.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.Products.productDao.ProductDao;
import com.product.Products.productEntity.Product;

public class ProductApp {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/org/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
		createProduct(productdao);
	}
	private static void createProduct(ProductDao productdao) {
		Product product = new Product();
		
		product.setName("iWatch");
		product.setDescription("best watch");
		product.setPrice(21560);
		int result = productdao.create(product);
		System.out.println("Number of rows inserted: " + result);
	}
}
