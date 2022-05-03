/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springmvc.repositories;

/**
 *
 * @author pes1ug19cs037
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(final String UserName);
}
