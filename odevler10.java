/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odevler1;

import java.util.Scanner;

/**
 *
 * @author kevir
 */
public class odevler10 {
    public static void main(String[] args) {
    Scanner ruzgar=new Scanner(System.in);
    
    System.out.println("bi sayı gir");
        int sayi1 = ruzgar.nextInt();

        int cevap = sayi1 % 7;

        if (cevap == 1) {
            System.out.println("Pazartesi");
        } else if (cevap == 2) {
            System.out.println("Salı");
        } else if (cevap == 3) {
            System.out.println("Çarşamba");
        } else if (cevap == 4) {
            System.out.println("Perşembe");
        } else if (cevap == 5) {
            System.out.println("Cuma");
        } else if (cevap == 6) {
            System.out.println("Cumartesi");
        } else if (cevap == 0) {
            System.out.println("Pazar");
        }

        
    }
}





