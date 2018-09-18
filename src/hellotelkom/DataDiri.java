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
public class DataDiri {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, tmp, klmn, alamat, motto;
        int nis, tgl;

        System.out.print("Nama : ");
        nama = masukan.next();
        System.out.print("NIS : ");
        nis = masukan.nextInt();
        System.out.print("Tempat Lahir : ");
        tmp = masukan.next();
        System.out.print("Tanggal Lahir : ");
        tgl = masukan.nextInt();
        System.out.print("Jenis Kelamin : ");
        klmn = masukan.next();
        System.out.print("Alamat : ");
        alamat = masukan.next();
        System.out.print("Motto Hidup : ");
        motto = masukan.next();

        System.out.println("---------DATA DIRI SISWA----------");
        System.out.println("Nama          : " + nama);
        System.out.println("NIS           : " + nis);
        System.out.println("Tempat Lahir  : " + tmp);
        System.out.println("Tanggal Lahir : " + tgl);
        System.out.println("Jenis Kelamin : " + klmn);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Motto Hidup   : " + motto);
    }
}
