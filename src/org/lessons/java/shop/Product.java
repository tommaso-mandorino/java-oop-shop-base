package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    int code;
    String name;
    String description;
    BigDecimal price;
    BigDecimal vat;

    Product(String name, String description, BigDecimal price, BigDecimal vat) {

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