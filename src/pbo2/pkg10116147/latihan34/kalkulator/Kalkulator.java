/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan34.kalkulator;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program kalkulator berbasis objek.
 */

public class Kalkulator {
    public double value1, value2;
    
    public double tambahBilangan() {
        return value1 + value2;
    }
    
    public double kurangBilangan() {
        return value1 - value2;
    }
    
    public double kaliBilangan() {
        return value1 * value2;
    }
    
    public double bagiBilangan() {
        return value1 / value2;
    }
    
    public double sisaBilangan() {
        return value1 % value2;
    }
}