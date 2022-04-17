/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springmvc.repositories;

import com.example.springmvc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Abhijnya Bhat
 */
public interface ProductRepository extends JpaRepository<Product,Long>{
     Product findByProdName(final String prodName);
}
