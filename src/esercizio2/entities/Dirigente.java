package esercizio2.entities;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    private int oreLavorate;
    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * getStipendio();
    }
}
