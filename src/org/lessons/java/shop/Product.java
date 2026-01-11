package org.lessons.java.shop;

import java.util.Random;

public class Product {

    int code;
    String name;
    String description;
    float price;
    int vat;

    Product(String name, String description, float price, int vat) {

        Random random = new Random();
        this.code = random.nextInt(5001) + 1;

        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    int getCode() {
        return this.code;
    }

    float getBasePrice() {
        return this.price;
    }

    float getFinalPrice() {
        float productVat = this.price / 100 * this.vat;
        return this.price + productVat;
    }

    String getExtendedName() {
        return this.name + "-" + this.code;
    }

}