package com.example.springmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

import java.util.List;
import java.util.Arrays;
import java.util.*;



class dictionary {

    Dictionary geek = new Hashtable();

    dictionary() {

        this.geek.put("flour", "3.64");
        this.geek.put("sugar", "3.87");
    }

    public Dictionary getDict() {
        return geek;
    }

}

@Entity
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String recipeName;

    private String recipeDesc;

    private String recipeImage;
    
    public int portionsize;
    
    public String[] inglist;
    
    public String ingprint;

    public float[] quantlist;
    
    public String quantprint;

    private String recipeCourse;
    
    public String metric;
    
    public float cal;

    public Recipe() {
    }

    public Recipe(String metric, int portionsize, String recipeName, String recipeDesc, String recipeImage, String course, String ingprint, String quantprint) {
        this.recipeName = recipeName;
        this.recipeDesc = recipeDesc;
        this.recipeImage = recipeImage;
        this.recipeCourse = course;
        this.ingprint=ingprint;
        this.quantprint=quantprint;
        this.portionsize = portionsize;
        this.metric=metric;
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
    
    public void setPortionSize(int portionsize){
        this.portionsize=portionsize;
    }
    
    public int getPortionSize(){
        return this.portionsize;
    }
    
    public String getMetric() {
        return this.metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
    
    public void setIng(String ing) {
        this.ingprint=ing;
        String str[] = ing.split(",");
        String[] al = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            al[i]=str[i];
        }
        this.inglist = al;

    }
    public void setQuant(String ing) {
        this.quantprint = ing;
        String str[] = ing.split(",");
        float[] al = new float[str.length];
        for (int i = 0; i < str.length; i++) {
            al[i]=Integer.parseInt(str[i]);
        }
        this.quantlist = al;

    }
    
    public String getIng(){
//        String ingredients ="";
//        for(int i=0;i<this.inglist.length;i++){
//            ingredients+=((this.inglist[i])+",");
//            
//        }
        return this.ingprint;
    }

    public String getQuant(){
//        String ingredients ="";
//        for(int i=0;i<this.quantlist.length;i++){
//            ingredients+=(Integer.toString(this.quantlist[i])+",");
//            
//        }
        return this.quantprint;
    }
    
    public void setCal() {
        dictionary d = new dictionary();
        Dictionary geek = d.getDict();
//        this.cal=Float.parseFloat((String)geek.get("flour"));
        float tot = 0;
        double factor=1.0;
        
        if (this.metric=="ounce"){
            factor=0.035274;
        }
        
        
        for (int i = 0; i < quantlist.length; i++) {
            try{
                float cal = Float.parseFloat((String)(geek.get(this.inglist[i])));
            tot += quantlist[i] * (cal*factor);
            }
            catch (Exception e){
               
            }            
        }
        
        this.cal=tot;
    }
    
    public float getCal(){
        return this.cal;
    }
    
    
}