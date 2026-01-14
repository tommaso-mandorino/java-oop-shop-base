package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        Product product1 = new Product("TestName", "TestBrand", "TestDescription", new BigDecimal(5.50), new BigDecimal(22));
        Product product2 = new Product();

        System.out.println("");

        System.out.println(product1.getCode());
        System.out.println(product1.getName());
        System.out.println(product1.getBrand());
        System.out.println(product1.getDescription());
        System.out.println(product1.getBasePrice());
        System.out.println(product1.getVat());
        System.out.println(product1.getFinalPrice());
        System.out.println(product1.getExtendedName());
    }

}