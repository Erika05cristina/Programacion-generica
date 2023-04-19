/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae_trabajo1;

import java.util.List;

/**
 *
 * @author Kristina
 */
public class Calculos {

    /*   //Prueba de porcentaje mayor que cierto tamaño
calcularPTamañoMayor(mandarina,tamaño) -> si calcula
calcularPTamañoMayor(naranja,tamaño) -> si calcula
calcularPTamañoMayor(pollo,tamaño) -> error
    
    
    
//Prueba de porcentaje de variedad
calcularPVariedad(mandarina,variedad) -> no calcula
calcularPVariedad(naranja,variedad) -> si calcula
calcularPVariedad (pollo,variedad) -> error
//Prueba de porcentaje de azúcar
calcularPAzucar(mandarina,azucar) -> si calcula
calcularPAzucar(naranja,azucar) -> no calcula
calcularPAzucar(pollo,azucar) -> error
    
//Prueba de porcentaje mayor que cierto peso
calcularPPeso(mandarina,peso) -> error
calcularPPeso(naranja,peso) -> error
calcularPPeso (pollo,peso) -> si calcula
calcularPPeso (animal,peso) -> si calcula*/
    public void calcularPTamanoMayor(List<? extends Frutas> lista, double tamaño) {
        double cont = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).volumen > tamaño) {
                cont = cont + 1;
            }
        }

        if (lista.get(0) instanceof Mandarinas) {
            System.out.println("El porcentaje de las mandarinas con mayor tamaño es: " + ((cont / lista.size()) * 100) + "%");
        } else {
            System.out.println("El porcentaje de las naranjas con mayor tamaño es: " + ((cont / lista.size()) * 100) + "%");
        }
    }

    public void calcularPVariedad(List<? super Naranjas> lista, String variedad) {

        double cont = 0;

        for (Object nan : lista) {
            if (((Naranjas) nan).variedad.equals(variedad)) {
                cont = cont + 1;
            }
        }

        switch (variedad) {
            case "Moro":
                System.out.println("El porcentaje naranjas de tipo Moro de es: " + ((cont / lista.size()) * 100) + "%");
                break;
            case "Sanguinello":
                System.out.println("El porcentaje naranjas de tipo Sanguinello de es: " + ((cont / lista.size()) * 100) + "%");
                break;
            case "Tarocco":
                System.out.println("El porcentaje naranjas de tipo Tarocco de es: " + ((cont / lista.size()) * 100) + "%");
                break;
            case "Navel":
                System.out.println("El porcentaje naranjas de tipo Navel de es: " + ((cont / lista.size()) * 100) + "%");
                break;

        }

    }

    public void calcularPAzucar(List<? super Mandarinas> lista, int azucar) {
        double cont = 0;

        for (Object nan : lista) {
            if (((Mandarinas) nan).azucar < azucar) {
                cont = cont + 1;
            }
        }
        System.out.println("El porcentaje de las mandarinas con alto de azucar es: " + ((cont / lista.size()) * 100) + "%");
    }

    public void calcularPPeso(List<? extends Animal> lista, double peso) {
        double cont = 0;

        for (Object nan : lista) {
            if (((Animal) nan).peso > peso) {
                cont = cont + 1;
            }
        }

        System.out.println("El porcentaje de los pollos de mayor peso es: " + ((cont / lista.size()) * 100) + "%");

    }

}
