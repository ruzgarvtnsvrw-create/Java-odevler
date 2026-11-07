/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.odevler1;

import java.util.Scanner;

public class Odevler9 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);

        System.out.println("1. kenarı gir");
        int sayi1 = ruzgar.nextInt();

        System.out.println("2. kenarı ");
        int sayi2 = ruzgar.nextInt();

        System.out.println("3. kenarı ");
        int sayi3 = ruzgar.nextInt();

        if (sayi1 <= 0 || sayi2 <= 0 || sayi3 <= 0) {
            System.out.println("geçersiz bi kenar galiba - yazdın başına");
        }
        else if (sayi1 + sayi2 > sayi3 &&
                 sayi1 + sayi3 > sayi2 &&
                 sayi2 + sayi3 > sayi1) {

            System.out.println("Üçgen oluyo");

            if (sayi1 == sayi2 && sayi2 == sayi3) {
                System.out.println("eşkenar");
            }
            else if (sayi1 == sayi2 || sayi1 == sayi3 || sayi2 == sayi3) {
                System.out.println("ikizkenar.");
            }
            else {
                System.out.println("çeşitkenar.");
            }

        }
        else {
            System.out.println("Üçgen oluşmaz.");
        }

        
    }
}

