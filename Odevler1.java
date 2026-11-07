package com.mycompany.odevler1;

import java.util.Scanner;

/**
 *
 * @author ralexy
 */
public class Odevler1 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);
        System.out.println("Bir tam sayi gir:");
        String s1 = ruzgar.nextLine(); // Öncelikle string olarak tanımladım remzi hocam cunku int olarak yapıtğımda 5.5 gibi kesirli sayılar verdiğimde hata veriyordu şimdi string olarak alıp bunu double formatına ceviriyorum ve gayet iyi çalışıyor.
        System.out.println("Lutfen biraz bekleyin sayiniz kontrol ediliyor...");
        double s2 = Double.parseDouble(s1);
        if (s2 % 1 != 0) {
            System.out.println(s2 + " Hata: Gecersiz giris, Lutfen bir tam sayi giriniz.");
        } else if (s2 % 2 == 0) {
            System.out.println(s2 + " sayisi CİFT bir sayidir.");
        } else {
            System.out.println(s2 + " sayisi TEK bir sayidir."); // // Javada türkçe karakter girme yokmu yoksa compilerden mi kaynaklı hep � geliyor

        }
    }
    }
