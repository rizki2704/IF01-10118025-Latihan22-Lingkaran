/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan22.lingkaran;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class Lingkaran {
    
    int dm, jr;
    double luasLing, kelLing;
    final double phi = 3.14;
    String Validasi;
    boolean valid = true;
    
    public void Hasil(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran=====");
        
        while(valid = true){
            System.out.println("Masukkan Nilai Diameter Lingkaran : ");
            Validasi = scan.nextLine();
            
            if (Validasi.matches("[0-9]*")){
                dm = scan.nextInt();
                
                jr = (dm/2);
                luasLing = phi*jr*jr;
                kelLing = phi * dm;
                
                System.out.println("=====Hasil Hitung=====");
                System.out.println("Jari Jari Lingkatan \t: " + jr);
                System.out.println("Luas Lingkaran \t: " +  luasLing);
                System.out.println("Keliing Lingkaran \t: " + kelLing);
                valid = false;
                break;
            } else{
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.Hasil();
    }
    //Jika yg akan dimasukkan adalah angka enter terlebih dahulu
}
