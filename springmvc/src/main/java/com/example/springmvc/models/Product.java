package com.example.springmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prodName;

    private String prodDesc;

    private String prodImage;
    
    private ArrayList<String> ing;
    
    private ArrayList<Integer> quant;

    private String course;

    public Product() {
    }

    public Product(String prodName, String prodDesc, String prodImage, String course, ArrayList<String> ing,  ArrayList<Integer> quant) {
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodImage = prodImage;
        this.course = course;
        this.ing=ing;
        this.quant=quant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdImage() {
        return prodImage;
    }

    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }

    public String getProdPrice() {
        return course;
    }

    public void setProdPrice(String prodPrice) {
        this.course = prodPrice;
    }
    
    

}