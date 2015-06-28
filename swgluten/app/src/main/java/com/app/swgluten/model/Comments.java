package com.app.swgluten.model;

import java.util.List;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class Comments {
    private int avaliation;
    private int price_category;
    private String description;
    private List<User> user;
    private Business business;

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice_category() {
        return price_category;
    }

    public void setPrice_category(int price_category) {
        this.price_category = price_category;
    }

    public int getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(int avaliation) {
        this.avaliation = avaliation;
    }
}
