/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author LENOVO
 */
//mendemontrasikan polymorphism
public class test2 {
    public static void main (String args[]){
//mendeklarasikan array tipe manusia
//dengan kata lain sebagai array memegang objek dari tipe manusia
        manusia[] manusia= new manusia[4];
        
        manusia[0]= new Siswa();
        manusia[1]= new Karyawan();
        manusia[2]= new programmer();
        manusia[3]= new guru();
//sekrang anda melakukan loop
//terhadap array tsb dan memanggil method dari class manusia
//maka setiap objek akan melakukan yang benar atau
//objek akan menggunakan method yang ada diclassnya masing-masing
        
        for(int i=0; i<manusia.length;i++){
            manusia[i].makan();
            manusia[i].tidur();
            manusia[i].bergerak();
            System.out.println();
            
        }
        
    
}
}
