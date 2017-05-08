/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

/**
 *
 * @author juuso_j0pbwen
 */
public class Pelaaja implements Osallistuja{
    
    String nimi;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }
    

    @Override
    public String annaSiirto() {
        IO.println("");
        IO.println(nimi + " pelaajan siirto:");
        return IO.getString();
    }

    @Override
    public void asetaSiirto(String siirto) {
        
    }
    
}
