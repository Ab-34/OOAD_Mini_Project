package com.example.springmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String recipeName;

    private String recipeDesc;

    private String recipeImage;
    
    private ArrayList<String> ing;
    
    private ArrayList<Integer> quant;

    private String recipeCourse;

    public Recipe() {
    }

    public Recipe(String recipeName, String recipeDesc, String recipeImage, String course, ArrayList<String> ing,  ArrayList<Integer> quant) {
        this.recipeName = recipeName;
        this.recipeDesc = recipeDesc;
        this.recipeImage = recipeImage;
        this.recipeCourse = course;
        this.ing=ing;
        this.quant=quant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDesc() {
        return recipeDesc;
    }

    public void setRecipeDesc(String recipeDesc) {
        this.recipeDesc = recipeDesc;
    }

    public String getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getRecipeCourse() {
        return this.recipeCourse;
    }

    public void setRecipeCourse(String recipeCourse) {
        this.recipeCourse = recipeCourse;
    }
}