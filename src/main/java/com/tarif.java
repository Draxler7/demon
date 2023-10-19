package com;

public class tarif {
    private double tarif = 0;

    protected tarif(double tarif) {
        this.tarif = tarif;
    }

    public double gettarif() {
        return this.tarif;
    }
}
