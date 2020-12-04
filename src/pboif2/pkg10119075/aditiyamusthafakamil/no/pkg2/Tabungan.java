/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.aditiyamusthafakamil.no.pkg2;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan tabungan
 */
public class Tabungan {
  private final int saldo;
  
   public Tabungan(int saldo){
       this.saldo = saldo;
   }
   
   public int ambilUang(int jumlah){
       return saldo - jumlah;
   }
    
    
}

