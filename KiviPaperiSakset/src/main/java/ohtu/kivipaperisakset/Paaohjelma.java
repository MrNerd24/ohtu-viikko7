package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {

        while (true) {
            IO.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = IO.getString();
            IO.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");

            if (vastaus.endsWith("a")) {
                PeliFactory.pelaajaVsPelaaja().pelaa();
            } else if (vastaus.endsWith("b")) {
                PeliFactory.pelaajaVsTekoaly().pelaa();
            } else if (vastaus.endsWith("c")) {
                PeliFactory.pelaajaVsParanneltuTekoaly().pelaa();
            } else {
                break;
            }

        }

    }
}
