package demo2.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo2.sportyshoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}