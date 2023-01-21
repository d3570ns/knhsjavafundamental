package com.juaracoding.knhsjavafundamental.testharian.praktikum_3;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 21/01/2023 23:35
@Last Modified 21/01/2023 23:35
Version 1.0
*/

import java.util.Scanner;

public class Praktikum3 {
    /*
	    Soal Nomor 1 Praktikum 3 Java Fundamental
    */

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int intMenit = 0;
            int intDetik = 0;
            int intkonversi = 0;

            System.out.print("Masukkan jumlah detik : ");
            intkonversi = input.nextInt();

            intMenit   = (intkonversi%3600)/60;
            intDetik   = (intkonversi%3600)%60;

            System.out.println("Konversi dari : "+ intkonversi +" detik, Adalah : ");
            System.out.println(intMenit +" menit "+ intDetik +" detik");
        }
    }

