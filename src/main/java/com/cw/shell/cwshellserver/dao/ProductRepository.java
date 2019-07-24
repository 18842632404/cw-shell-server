package com.cw.shell.cwshellserver.dao;

import com.cw.shell.cwshellserver.model.po.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
