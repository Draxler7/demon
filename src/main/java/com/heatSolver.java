package com;

public final class HeatSolver extends Solver {

    protected double otv;

    // Поиск ответа через абстрактный класс
    protected HeatSolver(Double squareFlat, Double squareFlatsInHouse, Double squareHouse, Double tarif) {
        otv = answer(squareFlat, squareFlatsInHouse, squareHouse, tarif);
    }

    public Double getOtv() {
        return otv;
    }
}
