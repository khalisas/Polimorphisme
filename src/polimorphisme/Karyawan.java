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
public class Karyawan extends manusia {
     @Override
    void makan(){
        System.out.println("karyawan makan");
    }
    @Override
    void tidur(){
        System.out.println("karyawan tidur");
    }
    @Override
    void bergerak(){
        System.out.println("karyawan bergerak");
    }
    
}
