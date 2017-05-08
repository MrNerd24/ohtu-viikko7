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
public class PeliFactory {
    
    public static KPSPeli pelaajaVsPelaaja() {
        return new KPSPeli(new Pelaaja("Ensimmäisen"), new Pelaaja("Toisen"));
    }
    
    public static KPSPeli pelaajaVsTekoaly() {
        return new KPSPeli(new Pelaaja("Ensimmäisen"), new Tekoaly());
    }
    
    public static KPSPeli pelaajaVsParanneltuTekoaly() {
        return new KPSPeli(new Pelaaja("Ensimmäisen"), new TekoalyParannettu(20));
    }
}
