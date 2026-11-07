package com.mycompany.odevler1;

import java.util.Scanner;

/**
 *
 * @author ralexy
 */
public class Odevler3 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);
        System.out.println("İlk Sayınızı Giriniz.");
        double sayi1 = ruzgar.nextDouble();
        System.out.println("İkinci sayınızı giriniz");
        double sayi2 = ruzgar.nextDouble();
        System.out.println("Lütfen Bekleyiniz İşleminiz Yapılıyor...");
        if (sayi1 < sayi2) {
            System.out.println("İlk Girdiğiniz Sayı İkinciden Küçüktür.");
        } else if (sayi1 > sayi2) {
            System.out.println("İlk Girdiğiniz Sayı İkinciden Büyüktür.");
        } else {
            System.out.println("İkiside Eşit");
        }

    }

}
