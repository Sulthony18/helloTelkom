/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellotelkom;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int c, pilihan;
        double r, f, k;

        System.out.println("---------------KONVERSI SUHU----------------");
        System.out.print("Suhu = ");
        c = masukan.nextInt();
        System.out.println("Pilih Konversi Suhu  : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Pilihan : ");
        pilihan = masukan.nextInt();

        if (pilihan == 1) {
            r = c * 4 / 5;
            System.out.println("Suhu menjadi " + r + " R");
        }
        if (pilihan == 2) {
            f = c * 9 / 5 + 32;
            System.out.println("Suhu menjadi " + f + " F");
        }
        if (pilihan == 3) {
            k = c + 273;
            System.out.println("Suhu menjadi " + k + " K");
        }

    }
}
