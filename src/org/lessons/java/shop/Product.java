package org.lessons.java.shop;

import java.util.Random;

public class Product {

    int code;
    String name;
    String description;
    float price;
    int vat;

    Product() {
        Random random = new Random();
        this.code = random.nextInt(5001) + 1;
    }

}