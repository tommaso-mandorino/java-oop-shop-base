package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    private int code;
    String name;
    String brand;
    String description;
    BigDecimal price;
    BigDecimal vat;

    Product() {
        System.out.println("This is the test of the constructor with no parameters.");
    }

    Product(String name, String brand, String description, BigDecimal price, BigDecimal vat) {

        Random random = new Random();
        this.code = random.nextInt(5001) + 1;

        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getBrand() {
        return this.brand;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    String getDescription() {
        return this.description;
    }
    void setDescription(String description) {
        this.description = description;
    }

    BigDecimal getVat() {
        return this.vat;
    }
    void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    int getCode() {
        return this.code;
    }

    BigDecimal getBasePrice() {
        return this.price.setScale(2, RoundingMode.HALF_DOWN);
    }

    BigDecimal getFinalPrice() {
        BigDecimal productVat = this.price.divide(new BigDecimal(100)).multiply(this.vat);
        return this.price.add(productVat).setScale(2, RoundingMode.HALF_DOWN);
    }

    String getExtendedName() {
        return this.name + "-" + this.code;
    }

}