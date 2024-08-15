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
public class seleksi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String masuk, keluar;
        int gol, biaya = 0;
        
        System.out.print(" jalur masuk : ");
        masuk = input.nextLine();
        System.out.print(" jalur keluar : ");
        keluar = input.nextLine();
        System.out.print(" golongan : ");
        gol = input.nextInt();
        
        switch (masuk){
            case "dupak" : 
                if (keluar.equalsIgnoreCase("waru")){
                    if (gol == 1){biaya = 5000;}
                    else if (gol == 2 || gol == 3){biaya = 8000;}
                    else if (gol == 4 || gol == 5){biaya = 10500;}
                    else {System.out.println(" golongan not found ");}
                }
                else{
                    System.out.println(" jalur keluar not found ");
                }
                break;
            case "waru" :
                 if (keluar.equalsIgnoreCase("Sidoarjo")){
                    if (gol == 1){biaya = 6000;}
                    else if (gol == 2 || gol == 3){biaya = 9000;}
                    else if (gol == 4 || gol == 5){biaya = 12000;}
                    else {System.out.println(" golongan not found ");}
                }
        else if (keluar.equalsIgnoreCase("porong")){
                if (gol == 1) {biaya = 9000;}
                else if (gol == 2 || gol == 3){biaya = 14000;}
                else if (gol == 4 || gol == 5){biaya = 18500;}
                else{ System.out.println(" golongan not found");}      
        }
        else{
                     System.out.println(" jalur not found ");
        }
                 break;
                 
             case "sidoarjo":
                 if (keluar.equalsIgnoreCase("waru")){
                     if (gol == 1){biaya = 6000;}
                     else if (gol == 2 || gol == 3){biaya = 9000;}
                     else if (gol == 4 || gol == 5){biaya = 12000;}
                     else{System.out.println(" golongan not found ");}      
                 }
                  else if (keluar.equalsIgnoreCase("porong")){
                if (gol == 1) {biaya = 5500;}
                else if (gol == 2 || gol == 3){biaya = 8500;}
                else if (gol == 4 || gol == 5){biaya = 11500;}
                else{ System.out.println(" golongan not found");}      
        }
        else{
                     System.out.println(" jalur not found ");
        }
                 break;
            case "porong":
                 if (keluar.equalsIgnoreCase("sidoarjo")){
                     if (gol == 1){biaya = 5500;}
                     else if (gol == 2 || gol == 3){biaya = 8500;}
                     else if (gol == 4 || gol == 5){biaya = 11500;}
                     else{System.out.println(" golongan not found ");}      
                 }
                  else if (keluar.equalsIgnoreCase("waru")){
                if (gol == 1) {biaya = 9000;}
                else if (gol == 2 || gol == 3){biaya = 14000;}
                else if (gol == 4 || gol == 5){biaya = 18500;}
                else{ System.out.println(" golongan not found");}      
        }
             else if (keluar.equalsIgnoreCase("kejapanan")){
                if (gol == 1) {biaya = 6000;}
                else if (gol == 2 || gol == 3){biaya = 8500;}
                else if (gol == 4 || gol == 5){biaya = 11500;}
                else{ System.out.println(" golongan not found");}      
        }     
        else{
                     System.out.println(" jalur not found ");
        }
                 break;     
            case "kejapanan" : 
                if (keluar.equalsIgnoreCase("gempol")){
                    if (gol == 1){biaya = 3000;}
                    else if (gol == 2 || gol == 3){biaya = 5000;}
                    else if (gol == 4 || gol == 5){biaya = 6500;}
                    else {System.out.println(" golongan not found ");}
                }
                else{
                    System.out.println(" jalur keluar not found ");
                }
                break;        
        }
        System.out.println(" jalur masuk : " + masuk);
        System.out.println(" jalur keluar : " + keluar);
        System.out.println(" golongan : " + gol);
        System.out.println(" biaya : "+ biaya);
     
    }
    
}
