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
public class BeaSiswa {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan nilai TPA = ");
        int TPA = masukan.nextInt();
        System.out.println("Masukkan nilai bahasa inggris = ");
        int BahasaIngris = masukan.nextInt();
        int BahasaInggris = 0;
        if ((TPA > 85) && (BahasaInggris > 80)) {
            System.out.println("Siswa dapat beasiswa ");
        } else {
            System.out.println("Siswa tidak dapat Beasiswa");
        }

    }
}
