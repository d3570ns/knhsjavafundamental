package com.juaracoding.knhsjavafundamental.cobacoba;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author User a.k.a. Kevin Nodeston Hasudungan Silalahi
Java Developer
Created on 19/01/2023 18:58
@Last Modified 19/01/2023 18:58
Version 1.0
*/

import java.util.Scanner;

public class Cobacoba1 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int intX = 0;
        int intData = 0;
        float floAvg = 0;

        System.out.println("Masukkan angka sepuasnya : ");
        do {
            try{
                intX++;
                intData = sn.nextInt();
                floAvg += intData; }
            catch (Exception e){
                floAvg /= intX - 1;
                System.out.println("Rata-rata :"+floAvg);
                intX = -1;
            }
        }while(intX!=-1);
    }
}