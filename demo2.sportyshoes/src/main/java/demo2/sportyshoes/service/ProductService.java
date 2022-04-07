package demo2.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo2.sportyshoes.entity.Categories;
import demo2.sportyshoes.entity.Product;
import demo2.sportyshoes.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}