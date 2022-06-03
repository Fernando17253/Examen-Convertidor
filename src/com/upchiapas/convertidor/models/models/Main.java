package com.upchiapas.convertidor.models.models;

import com.upchiapas.convertidor.models.models.models.Palabra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String convertido,palabra;
        System.out.println("ingrese el dato");
        Palabra misPalabra = new Palabra("");
        misPalabra.IngresoPila(teclado.nextLine());
    }
}
