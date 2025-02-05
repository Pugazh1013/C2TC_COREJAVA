package com.example.shoppingmallmanagement.repository;
import com.example.shoppingmallmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
