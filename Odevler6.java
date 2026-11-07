
package com.mycompany.odevler1;

import java.util.Scanner;

/**
 *
 * @author ruzgar
 */
public class Odevler6 { // artık yıl 400 e bölünen , 100 bölünüyosa olmayan 4 e bölünüyosa olan bişeymiş öncelik olarak 400>100>4 müş
public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in); 
        
    System.out.println("Bir yıl girin");
        int yıl=ruzgar.nextInt();

if (yıl % 400 == 0) {
    System.out.println("Artık yıl");
} else if (yıl % 100 == 0) {
    System.out.println("Artık yıl değil");
} else if (yıl % 4 == 0) {
    System.out.println("Artık yıl");
} else {
    System.out.println("Artık yıl değil");
}
        
        
        
        
        
        
        
        
        
        
        
        
}
}