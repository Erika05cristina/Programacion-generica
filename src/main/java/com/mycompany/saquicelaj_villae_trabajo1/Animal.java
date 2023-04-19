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
public class Animal {

    double peso;
    int codigo;

    static ArrayList<Animal> animalLista = new ArrayList<>();

    public Animal(double peso, int codigo) {
        this.peso = peso;
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public static ArrayList<Animal> getAnimalLista() {
        return animalLista;
    }

}
