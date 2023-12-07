package com;

public abstract class Solver {
    private double tarif = 0;
    private double squareFlat = 0;
    private double squareHouse = 0;
    private double squareFlatsInHouse = 0;

    // Формула решения
    public double answer(Double squareFlat, Double squareFlatsInHouse, Double squareHouse, Double tarif) {
        return (squareFlat / squareFlatsInHouse) * squareHouse * tarif;
    }

    protected void settarif(double tarif) {
        this.tarif = tarif;
    }

    public double gettarif() {
        return this.tarif;
    }

    protected void setsquareFlat(double squareFlat) {
        this.squareFlat = squareFlat;
    }

    public double getsquareFlat() {
        return this.squareFlat;
    }

    protected void setsquareHouse(double squareHouse) {
        this.squareHouse = squareHouse;
    }

    public double getsquareHouse() {
        return this.squareHouse;
    }

    protected void setsquareFlatsInHouse(double squareFlatsInHouse) {
        this.squareFlatsInHouse = squareFlatsInHouse;
    }

    public double getsquareFlatsInHouse() {
        return this.squareFlatsInHouse;
    }
}
