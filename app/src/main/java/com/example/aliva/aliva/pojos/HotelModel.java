package com.example.aliva.aliva.pojos;

public class HotelModel {

    private String id;
    private int image;
    private String name;
    private String location;
    private String description;
    private String rating;
    private int is_fav;
    private String price;

    public HotelModel(String id, int image, String name, String location, String description, String rating, String price, int is_fav) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.description = description;
        this.is_fav = is_fav;
    }

    public HotelModel(int image, String name, String location, String description, String rating, String price) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getIs_fav() {
        return is_fav;
    }

    public void setIs_fav(int is_fav) {
        this.is_fav = is_fav;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
