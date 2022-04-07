package demo2.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo2.sportyshoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}