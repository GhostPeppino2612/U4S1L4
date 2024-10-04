package esercizio3.entities;

import enums.Dipartimento;
import esercizio3.interfaces.CheckIn;

public abstract class Dipendente implements CheckIn {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente " + matricola + " ha fatto check-in.");
    }
}
