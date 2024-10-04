package esercizio3.entities;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }
    @Override
    public double calculateSalary() {
        return oreLavorate * getStipendio();
    }
}
