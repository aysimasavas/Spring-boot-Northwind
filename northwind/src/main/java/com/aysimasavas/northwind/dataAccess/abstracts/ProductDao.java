package com.aysimasavas.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aysimasavas.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {


}
