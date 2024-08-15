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
public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String huruf;
        
        System.out.print(" input huruf : ");
        huruf= input.nextLine();
        huruf= huruf.toUpperCase();
        
        if (huruf.equals("A")) {    
            System.out.println(" A = huruf vokal ");
        }else if (huruf.equals ("I")) {
            System.out.println(" I = huruf vokal ");
        }else if (huruf.equals ("U")){
            System.out.println(" U = huruf vokal ");
        }else if (huruf.equals("E")){
            System.out.println(" E = huruf vokal ");
        }else if (huruf.equals ("O")){
            System.out.println(" O = huruf vokal "); 
                }else{
            System.out.println(" huruf konsonan ");
        }
    }
    
           
}
