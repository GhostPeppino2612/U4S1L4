package esercizio3;

import enums.Dipartimento;
import esercizio3.entities.*;
import esercizio3.interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {
        DipendenteFullTime dip1 = new DipendenteFullTime(1, 2000, Dipartimento.AMMINISTRAZIONE);
        DipendentePartTime dip2 = new DipendentePartTime(2, 1000, Dipartimento.PRODUTTORE, 300);
        Dirigente dip3 = new Dirigente(3, 2000, Dipartimento.VENDITE, 150);

        Volontario dip4 = new Volontario("Gianni", 20, "CQVPP3456");

        CheckIn[] array = {dip1, dip2, dip3, dip4};

        for (CheckIn element : array) {
            element.checkIn();
        }
    }
}
