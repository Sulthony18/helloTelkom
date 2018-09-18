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
public class TugasLuasBola {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double r, l;
        System.out.println("------LUAS PERMUKAAN BOLA------");
        System.out.print("Masukan nilai jari - jari = ");
        r = masukan.nextDouble();
        l = 4 * 3.14 * r * r;
        System.out.println("Luas Permukaan bola adalah = " + l);
    }
}
