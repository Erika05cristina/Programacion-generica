/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae_trabajo1;

import java.util.ArrayList;

/**
 *
 * @author Kristina
 */
public class Pollos extends Animal {

    private static int cod = 300;
    static ArrayList<Pollos> pollosLista = new ArrayList<>();

    double peso;
    int codigo;

    public Pollos(double peso, int codigo) {
        super(peso, codigo);
    }

    public static void registrarP(double peso) {
        cod += 1;
        var pollo = new Pollos(peso, cod);
        pollosLista.add(pollo);
        animalLista.add(pollo);
        // System.out.println("Naranja Registrada");

    }

    public static void mostrarP() {
        var dim = pollosLista.size();
        System.out.println("\nPollos: ");
        for (int i = 0; i < dim; i++) {

            System.out.println("Codigo:" + pollosLista.get(i).codigo
                    + "; Peso: " + pollosLista.get(i).peso + " Kg");

        }
    }

    public static ArrayList<Pollos> getPollosLista() {
        return pollosLista;
    }
}
