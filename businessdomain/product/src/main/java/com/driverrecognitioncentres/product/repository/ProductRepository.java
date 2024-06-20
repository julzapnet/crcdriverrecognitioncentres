/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.driverrecognitioncentres.product.repository;

import com.driverrecognitioncentres.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julza
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
