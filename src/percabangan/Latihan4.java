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
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1, bil2;
        
        System.out.print(" input bilangan 1 : ");
        bil1= input.nextInt();
        System.out.print(" input bilangan 2 : ");
        bil2= input.nextInt();
        
        if (bil1 > bil2){
            System.out.println(" bilangan 1 lebih besar "); 
    }else if (bil1 < bil2){
            System.out.println(" bilangan 1 lebih kecil ");
    }else{
            System.out.println(" bilangan kedua sama besar ");
    }
    }
    
}
