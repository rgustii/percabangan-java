/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN_UKL;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class seleksi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] id = {1,2,3,4};
        String[] nama = {"Galuh","Indro","Jedi","kanu"};
        int[] gol = {1,3,2,3};
        String[] alamat = {"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
        
        int idPelanggan, pemakaian;
        int tarif = 0, tagihan = 0;
        
        System.out.print(" Masukkan id pelanggan : ");
        idPelanggan = input.nextInt();
        System.out.print(" Masukkan banyak pemakaian : ");
        pemakaian = input.nextInt();
        
        System.out.println("======DATA USER======");
        System.out.println(" ID       : " + id [idPelanggan-1]);   
        System.out.println(" Nama     : " + nama[idPelanggan-1]);
        System.out.println(" Golongan : " + gol[idPelanggan-1]);
        System.out.println(" Alamat   : " + alamat[idPelanggan-1]);  
        
        if (gol[idPelanggan-1] == 1){
            tarif = 1000;
        }else if (gol[idPelanggan-1] == 1){
            tarif = 1300;
        }else{
            tarif = 1500;
        }
        tagihan = tarif * pemakaian;
        
        if(tagihan < 50000){
            tagihan = 50000;
        }
        System.out.println("========PAYMENT=======");
        System.out.println(" harus dibayar : Rp" + (tagihan + 13000));
    }
    
}
