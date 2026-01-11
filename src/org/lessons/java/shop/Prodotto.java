package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;

    Prodotto() {
        Random random = new Random();
        this.codice = random.nextInt(5001) + 1;
    }

}