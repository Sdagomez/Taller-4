package edu.unbosque.Workshop4.model;

import java.util.Date;

public class DataImages {
    private String   description, image;
    private Date date;

    public DataImages(Date date, String description, String image) {

        this.date = date;
        this.description = description;
        this.image = image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


