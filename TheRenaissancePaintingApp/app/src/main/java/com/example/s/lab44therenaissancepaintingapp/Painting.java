package com.example.s.lab44therenaissancepaintingapp;

/**
 * Created by s on 2/22/2017.
 */

public class Painting {

    private String mDescription;
    private int mId;   //DRAWABLE IDENTIFICATION

    public Painting (String description, int id){
        mDescription = description;
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }
    public void setDescription(String description){
        mDescription = description;
    }

    public int getId() {
        return mId;
    }
    public void setId(int id){
        mId = id;
    }

}