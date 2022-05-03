/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springmvc.repositories;

import com.example.springmvc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aditi
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserId(final String UserId);
}
