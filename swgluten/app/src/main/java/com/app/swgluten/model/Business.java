package com.app.swgluten.model;

import com.parse.ParseGeoPoint;

import java.util.ArrayList;

/**
 * Created by GabrielPereira on 27/06/2015.
 */
public class Business {
    private String name;
    private String email;
    private ParseGeoPoint location;
    private String telephone;
    private String site;
    private String working_time;
    private ArrayList<Comment> comments;

    public Business(String pname, String ptelephone, String psite, ParseGeoPoint plocation) {
        this.name = pname;
        this.telephone = ptelephone;
        this.site = psite;
        this.location = plocation;
    }

    public Business(String pname, String ptelephone, String psite, ParseGeoPoint plocation, ArrayList<Comment> pcomments) {
        this(pname, ptelephone, psite, plocation);
        this.comments = pcomments;
    }

    public String getWorking_time() {
        return working_time;
    }

    public void setWorking_time(String working_time) {
        this.working_time = working_time;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ParseGeoPoint getLocation() {
        return location;
    }

    public void setLocation(ParseGeoPoint location) {
        this.location = location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
