/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, hasil=0;
        
        System.out.print(" Masukkan Angka : ");
        nilai=input.nextInt();
        hasil=nilai;
        
        if (hasil>=75){
            System.out.println(" Anda Kompeten ");
        }else{
            System.out.println(" Anda Tidak Kompeten ");
        }
            
    }
    
}
