
package com.mycompany.odevler1;

import java.util.Scanner;

public class Odevler7 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);

        System.out.println("Bi sayı gir:");
        int sayi1 = ruzgar.nextInt();

        if (sayi1 % 3 == 0 && sayi1 % 5 == 0) {
            System.out.println("Sayı 3'e ve 5'e bölünüyor.");
        } else if (sayi1 % 3 == 0) {
            System.out.println("Sayı 3'e bölünüyor.");
        } else if (sayi1 % 5 == 0) {
            System.out.println("Sayı 5'e bölünüyor.");
        } else {
            System.out.println("Sayı 3'e de 5'e de bölünmüyor.");
        }

       
    }
}
