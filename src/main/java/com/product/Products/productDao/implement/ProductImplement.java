package com.product.Products.productDao.implement;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.product.Products.productDao.ProductDao;
import com.product.Products.productEntity.Product;

@Component(value="productDaoImpl")
public class ProductImplement implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result  = (Integer) hibernateTemplate.save(product);
		return result;
	}
}
