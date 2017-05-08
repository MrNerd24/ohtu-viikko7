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
public class KPSPeli {
    
    Osallistuja pelaaja1;
    Osallistuja pelaaja2;
    Tuomari tuomari;

    public KPSPeli(Osallistuja pelaaja1, Osallistuja pelaaja2) {
        this.pelaaja1 = pelaaja1;
        this.pelaaja2 = pelaaja2;
        this.tuomari = new Tuomari();
    }
    
    public void pelaa() {
        while (true) {
            String ekaValinta = pelaaja1.annaSiirto();
            String tokaValinta = pelaaja2.annaSiirto();
            
            if (!isValidAnswer(ekaValinta) || !isValidAnswer(tokaValinta)) {
                break;
            }
            
            tuomari.kirjaaSiirto(ekaValinta, tokaValinta);
            pelaaja1.asetaSiirto(tokaValinta);
            pelaaja2.asetaSiirto(ekaValinta);
            
            IO.println("");
            IO.println(tuomari);
            
        }
        
        
    }
    
    public boolean isValidAnswer(String ans) {
        return ans.equals("k") || ans.equals("p") || ans.equals("s");
    }
}
