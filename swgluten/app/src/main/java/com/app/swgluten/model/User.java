package com.app.swgluten.model;

import com.parse.ParseUser;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class User extends ParseUser {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
