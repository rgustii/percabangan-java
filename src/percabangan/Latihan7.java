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
public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai,huruf;
        
        System.out.print(" input nilai : ");
        nilai=input.nextDouble();
        
        if (nilai <=100 && nilai >= 81){
            System.out.println(" nilai huruf : A ");   
        }else if (nilai <=80 && nilai >= 61){
            System.out.println(" nilai huruf : B ");
        }else if (nilai <=60 && nilai >= 41){
            System.out.println(" nilai huruf : C ");
        }else if (nilai <= 40 && nilai >= 21){
            System.out.println(" nilai huruf : D ");
        }else if (nilai <= 20 && nilai >=0){
            System.out.println(" nilai huruf : E ");
        }else{ System.out.println(" sori ora onok ");
        
    }
    
    }
}
