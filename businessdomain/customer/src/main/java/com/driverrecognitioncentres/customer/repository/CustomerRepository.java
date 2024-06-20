/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.driverrecognitioncentres.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.driverrecognitioncentres.customer.entities.Customer;
import org.springframework.data.jpa.repository.Query;


/**
 *
 * @author julza
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
    @Query("SELECT c FROM Customer c WHERE c.code = ?1")
    public Customer findByCode(String code);
    
}
