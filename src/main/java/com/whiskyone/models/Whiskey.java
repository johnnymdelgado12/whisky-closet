package com.whiskyone.models;

public class Whiskey {

    private long id;
    private String name;

    private String distilleryName;

    private Double price;

    private boolean hasAgeStatement;

    private boolean isBlended;

    private String description;

    public Whiskey() {
    }

    // constructor with id
    public Whiskey(long id, String name, String distilleryName, Double price, boolean hasAgeStatement, boolean isBlended, String description) {
        this.id = id;
        this.name = name;
        this.distilleryName = distilleryName;
        this.price = price;
        this.hasAgeStatement = hasAgeStatement;
        this.isBlended = isBlended;
        this.description = description;
    }

    // constructor w/out id
    public Whiskey(String name, String distilleryName, Double price, boolean hasAgeStatement, boolean isBlended, String description) {
        this.name = name;
        this.distilleryName = distilleryName;
        this.price = price;
        this.hasAgeStatement = hasAgeStatement;
        this.isBlended = isBlended;
        this.description = description;
    }

    // GETTERS

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistilleryName() {
        return distilleryName;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isHasAgeStatement() {
        return hasAgeStatement;
    }

    public boolean isBlended() {
        return isBlended;
    }

    public String description() {
        return description;
    }


    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistilleryName(String distilleryName) {
        this.distilleryName = distilleryName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setHasAgeStatement(boolean hasAgeStatement) {
        this.hasAgeStatement = hasAgeStatement;
    }

    public void setBlended(boolean blended) {
        isBlended = blended;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
