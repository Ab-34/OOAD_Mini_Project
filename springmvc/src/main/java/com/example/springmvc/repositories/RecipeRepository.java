/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.springmvc.repositories;

import com.example.springmvc.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Abhijnya Bhat
 */
public interface RecipeRepository extends JpaRepository<Recipe,Long>{
    Recipe findByRecipeName(final String recipeName);
}
