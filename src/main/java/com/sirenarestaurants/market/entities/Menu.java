package com.sirenarestaurants.market.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="MENU")
public class Menu{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="ITEM")
    private String item;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="SYMBOL")
    private String symbol;

    @Column(name="PRICE")
    private Double price;


    /* Getter Methods
     * getId, getItem, getDescription, getSymbol, getPrice.
    */

    // getId
    public Integer getId(){
        return this.id;
    }

    // getItem
    public String getItem(){
        return this.item;
    }

    // getDescription
    public String getDescription(){
        return this.description;
    }

    // getSymbol: Lt, KG, GM e etc 
    public String getSymbol(){
        return this.symbol;
    }

    // getPrice
    public Double getPrice(){
        return this.price;
    }

    /* Setter Methods
     * setId, setItem, setDescription, setSymbol,setPrice.
    */

    // setId
    public void setId(Integer id){
        this.id = id;
    }

    // setItem
    public void setItem(String item){
        this.item = item;
    }

    // setDescription
    public void setDescription(String description){
        this.description = description;
    }

    // setSymbol
    public void setSymbol(Double price){
        this.price = price;
    }

}
