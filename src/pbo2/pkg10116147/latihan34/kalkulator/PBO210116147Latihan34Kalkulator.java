/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan34.kalkulator;
import java.util.Scanner;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program kalkulator sederhana berbasis objek.
 */

public class PBO210116147Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("======= Aplikasi Kalkulator Bilangan =======");
        System.out.print("Masukkan angka pertama\t: ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua\t: ");
        kalkulator.value2 = scanner.nextDouble();
        
        double tambah = kalkulator.tambahBilangan();
        double kurang = kalkulator.kurangBilangan();
        double kali = kalkulator.kaliBilangan();
        double bagi = kalkulator.bagiBilangan();
        double sisa = kalkulator.sisaBilangan();
        
        System.out.println("\nHasil Pertambahan\t= " + tambah);
        System.out.println("Hasil Pengurangan\t= " + kurang);
        System.out.println("Hasil Perkalian\t\t= " + kali);
        System.out.println("Hasil Pembagian\t\t= " + bagi);
        System.out.println("Hasil Sisa\t\t= " + sisa);

    }
    
}