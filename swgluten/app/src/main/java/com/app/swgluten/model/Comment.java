package com.app.swgluten.model;

import java.util.List;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class Comment {
    private int avaliation;
    private int price_category;
    private String description;
    private User user;

    public Comment(String description, int avaliation, int price_category) {
        this.description = description;
        this.avaliation = avaliation;
        this.price_category = price_category;
    }

    public Comment(String description, int avaliation, int price_category, User user) {
        this(description, avaliation, price_category);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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
