package com.example.aula03;

public class CalculadoraFrete {
    public double calcular(double valorCompra, boolean clientePremium) {
        boolean isValidoParafreteGratis = valorCompra >= 200 || clientePremium == true;

        if (isValidoParafreteGratis) return 0.0;

        return 20.0;
    }
}
