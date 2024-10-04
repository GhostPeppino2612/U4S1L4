package esercizio3.entities;

import esercizio3.interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String nome;
    private int età;
    private String cv;

    public Volontario(String nome, int età, String cv) {
        this.nome = nome;
        this.età = età;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha fatto check-in.");
    }
}
