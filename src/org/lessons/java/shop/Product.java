package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    public Product() {
        System.out.println("This is the test of the constructor with no parameters.");
    }

    public Product(String name, String brand, String description, BigDecimal price, BigDecimal vat) {

        Random random = new Random();
        this.code = random.nextInt(5001) + 1;

        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getVat() {
        return this.vat;
    }
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public int getCode() {
        return this.code;
    }

    public BigDecimal getBasePrice() {
        return this.price.setScale(2, RoundingMode.HALF_DOWN);
    }

    public BigDecimal getFinalPrice() {
        BigDecimal productVat = this.price.divide(new BigDecimal(100)).multiply(this.vat);
        return this.price.add(productVat).setScale(2, RoundingMode.HALF_DOWN);
    }

    public String getExtendedName() {
        return this.name + "-" + this.code;
    }

}