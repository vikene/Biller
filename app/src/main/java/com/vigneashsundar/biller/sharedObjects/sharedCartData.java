package com.vigneashsundar.biller.sharedObjects;

import com.vigneashsundar.biller.model.shoppingitem;

import java.util.ArrayList;
import java.util.List;

public  class sharedCartData {
    public List<shoppingitem> cartItems;
    private static sharedCartData data;
    public sharedCartData(){
        cartItems = new ArrayList<>();
    }
    public static sharedCartData getInstance(){
        if(data == null){
            data = new sharedCartData();
            data.cartItems = new ArrayList<>();
        }
        return  data;
    }
}
