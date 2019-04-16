package com.vigneashsundar.biller.model;

public class shoppingitem {
    String item_name;
    String item_image;
    String item_description;
    Double item_price;
    public shoppingitem(String name, String description, String image,Double price){
        this.item_name= name;
        this.item_description = description;
        this.item_image= image;
        this.item_price = price;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_image() {
        return item_image;
    }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public Double getItem_price() {
        return item_price;
    }

    public void setItem_price(Double item_price) {
        this.item_price = item_price;
    }
}
