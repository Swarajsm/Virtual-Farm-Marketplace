package com.virtualfarmapp.marketplace;

public class SellAd {
    private String productName;
    private String description;
    private int price;

    public SellAd(String nm, String desc, int p){
        productName = nm;
        description = desc;
        price = p;
    }
    public String getName(){
        return productName;
    }
    public String getDescription(){
        return description;
    }
    public int getPrice(){
        return price;
    }
}
