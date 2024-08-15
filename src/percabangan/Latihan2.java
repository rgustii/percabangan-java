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
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil, hasil;
        
        System.out.print(" Masukkan angka : ");
        bil=input.nextInt();
        hasil=bil%2;

        if (bil==0){
            System.out.println(" genap ");
        }else{
            System.out.println(" ganjil ");
        }
    }
    
}
