package com.mycompany.odevler1;

import java.util.Scanner;

/**
 *
 * @author ralexy
 */
public class Odevler2 {

   
    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz.");
        String ates = ruzgar.nextLine();
        System.out.println("Sayınız Kontrol Edilmekte...");
        double toprak = Double.parseDouble(ates);
        if (toprak == 0 || toprak < 0 || toprak > 0) {
            if (toprak == 0) {
                System.out.println("Sayı 0'a eşit");
            } else if (toprak < 0) {
                System.out.println("Sayınız negatiftir.");
            } else {
                System.out.println("Sayınız Pozitiftir.");
            }

        } else {
            System.out.println("Nasıl bir sayı girdiyseniz yok böyle bi sayı");
        }

    }
}
