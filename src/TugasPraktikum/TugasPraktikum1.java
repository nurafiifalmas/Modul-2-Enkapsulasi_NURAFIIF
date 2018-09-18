/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

public class TugasPraktikum1 {
   public double penumpang;
   public double maxPenumpang;
   
   public TugasPraktikum1(double maxPenumpang){
       this.maxPenumpang = maxPenumpang;
       penumpang = 0;
   }

    
   public void addpenumpang(double penumpang){
       double temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang penuh");
             System.out.println("==============================================");
        }else{
            this.penumpang = temp;
   }
   }
        public void getAverage(double berat1, double berat2, double berat3, double berat4, double berat5 ){
           
            double counter = berat1+berat2+berat3+berat4+berat5/this.penumpang;
            System.out.println("\nRata-rata berat badan penumpang adalah : "+counter+" Kg");
   }
   public void getpenumpang(int password){
    if (password == 12345678){
        System.out.println("\nPassword Benar");
            System.out.println("\n==============================================");
    }else{
        System.out.println("Password Salah");
        System.out.println("==============================================");
    } 
   }
      public void cetak(){
       
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang Bus maksimum seharusnya adalah "+maxPenumpang);
        System.out.println("==============================================");
   }

    
    }
