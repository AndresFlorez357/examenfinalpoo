package org.example;

import org.example.modelos.Seguro;

public class Main {
    public static void main(String[] args) {

        Seguro seguro = new Seguro();
        seguro.setEdadAsegurado(-35);
        seguro.setNombreAsegurado("123hgfjgihlggdflkjjfdtfdjuljjhftedygkhlkhkl");
        seguro.setMontoCobertura(1600);
        seguro.setFechaInicioCobertura("2145/06/20");
        seguro.setBeneficiario("camilo123");
        System.out.println(seguro.calcularPrima());

    }
}