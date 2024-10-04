package esercizio2;

import enums.Dipartimento;
import esercizio2.entities.Dipendente;
import esercizio2.entities.DipendenteFullTime;
import esercizio2.entities.DipendentePartTime;
import esercizio2.entities.Dirigente;

public class Main {
    public static void main(String[] args) {
        DipendenteFullTime dip1 = new DipendenteFullTime(1, 2000, Dipartimento.AMMINISTRAZIONE);
        DipendentePartTime dip2 = new DipendentePartTime(2, 1000, Dipartimento.PRODUTTORE, 300);
        Dirigente dip3 = new Dirigente(3, 2000, Dipartimento.VENDITE, 150);

        Dipendente[] array = {dip1, dip2, dip3};

        for (Dipendente dipendente : array) {
            System.out.println(dipendente.calculateSalary());
        }
    }
}
