package esercizio1;

import enums.Dipartimento;
import esercizio1.entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente(1, 2000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dip2 = new Dipendente(2, 1000, Dipartimento.PRODUTTORE);
        Dipendente dip3 = new Dipendente(3, 2000, Dipartimento.VENDITE);

        Dipendente[] array = {dip1, dip2, dip3};

        for (Dipendente dipendente : array) {
            System.out.println(dipendente.getMatricola());
        }
    }
}
