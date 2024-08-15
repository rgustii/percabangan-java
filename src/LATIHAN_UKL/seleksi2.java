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
public class seleksi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //dek variabel
        int[] id= {1,2,3,4};
        String[] nama= {"mira","nina","oemar","pena"};
        String[] jalur= {"SBMPTN","SNMPTN","mandiri","SBMPTN"};
        String[] alamat= {"Sawojajar","Kadung Kadang","Ijen","Dinoyo"};
        
        int idmaha,gaji,spp = 0;
        
        System.out.print(" Nomer ID    : ");
        idmaha= input.nextInt();
        System.out.println("======== PENDAPATAN =========");
        System.out.println(" Kategori    |    Pendapatan ");
        System.out.println(" 1.          |    < 2 juta    ");
        System.out.println(" 2.          |    2 - 10 juta");
        System.out.println(" 3.          |    > 10 juta");
        System.out.println("=============================");
        System.out.print(" input nomer : ");
        gaji= input.nextInt();
        
        
        if (gaji == 1){
            spp = 500000;
        }else if (gaji == 2){
            spp = 1000000;
        }else if(gaji == 3){
            spp = 2000000;
        }else{
            System.out.println(" ORA ENEK ");
        }
    
        
        System.out.println("======DATA USER======");
        System.out.println(" ID         : " + id [idmaha-1]);   
        System.out.println(" Nama       : " + nama[idmaha-1]);
        System.out.println(" Jalur      : " + jalur[idmaha-1]);
        System.out.println(" Alamat     : " + alamat[idmaha-1]);  
        System.out.println(" Pendapatan : " + gaji);
        System.out.println(" Bayar SPP  : " + spp);
    }
    
}
