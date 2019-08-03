package com.ddivine.travelmantics;

public class TravelDeal {
    private String id;
    private String Title;
    private String Price;
    private String Description;
    private String imageUrl;

    public TravelDeal () {}

    public TravelDeal(String title, String description, String price, String imageUrl) {
        this.setId(getId());
        setTitle(title);
        setPrice(price);
        setDescription(description);
        this.setImageUrl(imageUrl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
