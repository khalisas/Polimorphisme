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
public class Staf extends pegawai{
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;
    
    public int gaji(){
    return gajiStaf;    
        
    }
    public int Bonus(){
        return bonusStaf;
    }
    
}
