package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        
        Product product1 = new Product("TestProduct", "TestProduct Description", 5.50f, 22);

        System.out.println(product1.getCode());
        System.out.println(product1.getBasePrice());
        System.out.println(product1.getFinalPrice());
        System.out.println(product1.getExtendedName());
    }

}