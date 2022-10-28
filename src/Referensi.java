/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Referensi {
    public static void main (String args[]){
        Parent ref;
        Parent dentObject = new Parent();
        Employee employeeObject = new Employee();
        
        ref= studentObject;//titik referensi Person kepada object student 
//      get name dari class Student dipanggil
         String temp= ref.getName();
         System.out.println(temp);
         
         ref=employeeObject;//titik referensi object kepada employee
         
         //get name dari class Employee dipanggil
         String temp= ref.getName();
         System.out.println(temp);
    }
    
}
