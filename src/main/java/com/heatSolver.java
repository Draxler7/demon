package com;

public final class heatSolver extends solver {

    protected double otv;

    protected heatSolver(Double squareFlat, Double squareFlatsInHouse, Double squareHouse, Double tarif) {
        otv = Answer(squareFlat, squareFlatsInHouse, squareHouse, tarif);
    }

    public Double getOtv() {
        return otv;
    }
}
