package com.juaracoding.knhsjavafundamental.testharian.praktikum_2;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 17/01/2023 18:38
@Last Modified 17/01/2023 18:38
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    /*
	Soal Nomor 2 Praktikum 2 Java Fundamental

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama depan: ");
        String firstName = input.nextLine();
        System.out.print("Masukkan nama belakang: ");
        String lastName = input.nextLine();


        String inisial = (firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0));
        System.out.println("Inisial " + firstName + " " + lastName + " adalah " + inisial);

    }
}

