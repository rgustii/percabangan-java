/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN_UKL;

/**
 *
 * @author rafig
 */
public class looping1 {
    public static void main(String[] args) {
        
       int suku1 = 5;
       int selisih = 3;
       int sampai = 10;
       int u = suku1;
       int s = suku1;
       
        System.out.println(" deret aritmatika adalah : ");
        for (int i = 0; i < sampai; i++) {
            System.out.println(u);
            u=u+selisih;
            s=s+u;
        }
        s=s-u;
        System.out.println(" jumlah deret aritmatikanya adalah : " + s);
        
        
        
}

    }
    

