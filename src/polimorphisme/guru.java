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
public class guru extends manusia{
     @Override
    void makan(){
        System.out.println("guru makan");
    }
    @Override
    void tidur(){
        System.out.println("guru tidur");
    }
    @Override
    void bergerak(){
        System.out.println("guru bergerak");
    }
    
}
