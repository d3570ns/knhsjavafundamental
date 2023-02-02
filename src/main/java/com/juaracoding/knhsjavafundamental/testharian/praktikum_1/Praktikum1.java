package com.juaracoding.knhsjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 15/01/2023 22:37
@Last Modified 15/01/2023 22:37
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {

       char chX = 'K';
       int intX = chX;
        System.out.println(intX);
        Scanner scanner = new Scanner(System.in);
        String strx = scanner.nextLine();
        System.out.println("Nilai STRX Adalah:"+strx);

        int intTampung = 0;

        for (int i=0;i<strx.length();i++){
            chX = strx.charAt(i);
            intX = chX;
            if (intX>=32 && intX<=90){
                intTampung = intTampung + intX;
                System.out.println("INDEX KE "+i+" HURUF "+chX+" KODE ASCII "+intX);
            }
        }
        System.out.println("NILAI INT TAMPUNG ADALAH :"+intTampung);
            }
        }

