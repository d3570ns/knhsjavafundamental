package com.juaracoding.knhsjavafundamental.testharian.praktikum_6;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 09/02/2023 16:13
@Last Modified 09/02/2023 16:13
Version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Praktikum6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        System.out.println("Masukkan angka (huruf untuk berhenti) : ");
        while (sc.hasNextInt()) {inputNumbers.add(sc.nextInt());
        }
        System.out.println("Angka yang anda input adalah : " + inputNumbers.toString());
        Collections.sort(inputNumbers);
        System.out.println("Setelah diurutkan menjadi : " + inputNumbers.toString());
        sc.close();
    }
}

