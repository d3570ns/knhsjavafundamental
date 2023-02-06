package com.juaracoding.knhsjavafundamental.testharian.praktikum_5;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 06/02/2023 13:38
@Last Modified 06/02/2023 13:38
Version 1.0
*/

import java.util.Scanner;

public class Praktikum5 {
    /*
	Soal Nomor 1 Praktikum 5 Java Fundamental
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        for (int baris = 1; baris <= tinggi; baris++) {
            for (int spasi = 1; spasi <= tinggi - baris; spasi++) {
                System.out.print(" ");
            }
            for (int angka = baris; angka >= 1; angka--) {
                System.out.print(angka);
            }
            System.out.println();
        }
    }
}

