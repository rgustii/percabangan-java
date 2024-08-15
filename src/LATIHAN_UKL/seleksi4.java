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
public class seleksi4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int idpel,lama,tarif = 0,biaya=0;
       String cottage,golhar;
       String[] nama = {"ali","budi","dani","edi","umar"};
       
        System.out.print(" masukkan ID : ");
        idpel= input.nextInt();
        input.nextLine();
        System.out.print(" tipe cottage : ");
        cottage= input.nextLine();   
        System.out.print(" gol hari : ");
        golhar= input.nextLine();
        System.out.print(" berapa hari : ");
        lama=  input.nextInt();
        
        switch(cottage){
            case "duku" :
            case "jeruk":
                if (golhar.equalsIgnoreCase("weekday")){tarif = 950000;}
                else if (golhar.equalsIgnoreCase("weekend")){tarif = 1025000;}
                else if (golhar.equalsIgnoreCase("holiday")){tarif = 1125000;}
                break;
            case "alpukat" :
            case "jambu air" :
                if (golhar.equalsIgnoreCase("weekday")){tarif = 575000;}
                else if (golhar.equalsIgnoreCase("weekend")){tarif = 695000;}
                else if (golhar.equalsIgnoreCase("holiday")){tarif = 895000;}
                break;
            case "durian" :
            case "melon":
                if (golhar.equalsIgnoreCase("weekday")){tarif = 595000;}
                else if (golhar.equalsIgnoreCase("weekend")){tarif = 715000;}
                else if (golhar.equalsIgnoreCase("holiday")){tarif = 915000;}
                break;  
            case "belimbing" :
            case "mangga":
            case "kedondong":
                if (golhar.equalsIgnoreCase("weekday")){tarif = 495000;}
                else if (golhar.equalsIgnoreCase("weekend")){tarif = 575000;}
                else if (golhar.equalsIgnoreCase("holiday")){tarif = 755000;}
                break;  
            case "barrack":
                if (golhar.equalsIgnoreCase("weekday")){tarif = 25000;}
                else if (golhar.equalsIgnoreCase("weekend")){tarif = 25000;}
                else if (golhar.equalsIgnoreCase("holiday")){tarif = 35000;}
                break;  
                
            
            default : System.out.println(" ora enek bro ");
        }
        biaya = lama * tarif;
            System.out.println("=================================");
            System.out.println(" ID : " + idpel);
            System.out.println(" nama : " + nama[idpel-1] );
            System.out.println(" tipe cottage : " + cottage);
            System.out.println(" gol hari : " + golhar);
            System.out.println(" berapa hari : " + lama);
            System.out.println(" biaya : " + biaya);
    }
    
}
