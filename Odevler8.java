/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odevler1;

import java.util.Scanner;
/**
 *
 * @author ruzgar
 */
public class Odevler8 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);

        System.out.println("İlk sayıyı gir:");
        double sayi1 = ruzgar.nextDouble();

        System.out.println("İkinci sayıyı gir:");
        double sayi2 = ruzgar.nextDouble();

        System.out.println("İşlem gir (+ - * /):");
        char cevap = ruzgar.next().charAt(0);
        double un1 = sayi1+sayi2;
        double un2 = sayi1-sayi2;
        double un3 = sayi1/sayi2;
        double un4 = sayi1*sayi2; 
        if (cevap == '+') {
            
            
            System.out.println("Sonuc: " + un1);
        } 
        else if (cevap == '-') {
            
            System.out.println("Sonuc: " + un2);
        } else if (cevap == '*') {
            
                        System.out.println("Sonuc: " + un4);
        }   
        else if (cevap == '/') {
            
            if (sayi2 == 0) {
                                     System.out.println("sıfıra bolunmez.");
            } else {
                        System.out.println("Sonuc " + un3);
            }
        } else {
                                System.out.println("islem yanlis");
        }

        
    }
}
