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
public class Odevler5 {

    public static void main(String[] args) {
        Scanner ruzgar = new Scanner(System.in);

        System.err.println("Not giriniz.");
        int not = ruzgar.nextInt();
        if (not > 89 && not < 101) {
            System.out.println("AA");
        } else if (not > 79 && not < 90) {
            System.out.println("BA");
        } else if (not > 69 && not < 80) {
            System.out.println("BB");
        } else if (not > 59 && not < 70) {
            System.out.println("CB");
        } else if (not > 49 && not < 60) {
            System.out.println("CC");
        } else if (not < 50) {
            System.out.println("FF");
        } else {
            System.out.println("Geçersiz sayı");
        }
    }
    }
