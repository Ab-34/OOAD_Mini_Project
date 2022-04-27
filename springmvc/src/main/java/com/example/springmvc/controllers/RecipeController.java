/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc.controllers;

import com.example.springmvc.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.springmvc.repositories.RecipeRepository;

@Controller
public class RecipeController {
    
    @Autowired
    RecipeRepository recipeRepository;

    @RequestMapping("/recipebook")
    public String recipe(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipebook";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String recipeName, @RequestParam String recipeDesc, @RequestParam String recipeCourse, @RequestParam String recipeImage) {
        Recipe recipe = new Recipe();
        recipe.setRecipeName(recipeName);
        recipe.setRecipeDesc(recipeDesc);
        recipe.setRecipeImage(recipeImage);
        recipe.setRecipeCourse(recipeCourse);
        recipeRepository.save(recipe);

        return "redirect:/showrecipe/" + recipe.getId();
    }

    @RequestMapping("/showrecipe/{id}")
    public String show(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", recipeRepository.findById(id).orElse(null));
        return "showrecipe";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam Long id) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        recipeRepository.delete(recipe);

        return "redirect:/recipebook";
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("recipe", recipeRepository.findById(id).orElse(null));
        return "edit";
    }

    @RequestMapping("/update")
    public String update(@RequestParam Long id, @RequestParam String recipeName, @RequestParam String recipeDesc, @RequestParam String recipeCourse, @RequestParam String recipeImage) {
        Recipe recipe = recipeRepository.findById(id).orElse(null);
        recipe.setRecipeName(recipeName);
        recipe.setRecipeDesc(recipeDesc);
        recipe.setRecipeImage(recipeImage);
        recipe.setRecipeCourse(recipeCourse);
        recipeRepository.save(recipe);

        return "redirect:/showrecipe/" + recipe.getId();
    }
    
}