/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class Bus3 {
   public int penumpang;
   public int maxPenumpang;
   
   public Bus3(int maxPenumpang){
       this.maxPenumpang = maxPenumpang;
       penumpang = 0;
   }
   public void addpenumpang(int penumpang){
       int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
   }
   }
   public void getpenumpang(int password){
    if (password == 24){
        System.out.println("Password Benar");
    }else{
        System.out.println("Password Salah");
    }
   }
      public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang Bus maksimum seharusnya adalah "+maxPenumpang);

   }
}

