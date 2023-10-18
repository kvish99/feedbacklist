package com.example.feedbacklist.Model;

public class Milkshakes {

    private String Name;

    private String Price;

    private String Description;

    private int Image;

    public Milkshakes(String name, String price, String description, int image) {
        Name = name;
        Price = price;
        Description = description;
        Image = image;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
