package ohtu.kivipaperisakset;

public class Tekoaly implements Osallistuja{

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;
        
        String ans;
        if (siirto == 0) {
            ans = "k";
        } else if (siirto == 1) {
            ans = "p";
        } else {
            ans = "s";
        }
        IO.println("Tietokone valitsi:");
        IO.println(ans);
        return ans;
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
