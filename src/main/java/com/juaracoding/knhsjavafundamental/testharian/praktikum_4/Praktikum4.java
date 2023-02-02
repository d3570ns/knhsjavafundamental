package com.juaracoding.knhsjavafundamental.testharian.praktikum_4;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 02/02/2023 16:54
@Last Modified 02/02/2023 16:54
Version 1.0
*/

import java.util.Random;

public class Praktikum4 {
    /*
        Soal Nomor 1 Praktikum 4 Java Fundamental
    */

    public static void main(String[] args) {
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Karakter campuran
        int length = random.nextInt(15);
        for (int i = 1; i < length; i++) {
            char c = (char) (97+random.nextInt(122-97+1));
            email.append(c);
        }

        // Tanda sambung (underscore atau titik)
        email.append(random.nextInt(2) == 0 ? '_' : '.');

        // Karakter campuran
        length = random.nextInt(15);
        for (int i = 1; i < length; i++) {
            char c = (char) (97+random.nextInt(122-97+1));
            email.append(c);
        }

        // Angka 2 digit
        email.append(String.format("%02d", random.nextInt(100)));

        // @
        email.append("@");

        // Email provider
        String[] providers = {"gmail", "hotmail", "yahoo", "ymail"};
        email.append(providers[random.nextInt(providers.length)]);

        // Titik
        email.append(".");

        // Domain
        String[] domains = {"com", "co.id", "edu", "gov"};
        email.append(domains[random.nextInt(domains.length)]);

        System.out.println("Output: " + email.toString());
    }
}