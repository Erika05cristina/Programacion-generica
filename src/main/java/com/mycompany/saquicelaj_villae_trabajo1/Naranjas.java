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
public class Naranjas extends Frutas {
    private static int cod = 100;
    static ArrayList<Naranjas> naranjasLista = new ArrayList<>();

    String variedad;

    private Naranjas(double volumen, int codigo, String variedad) {
        super(volumen, codigo);
        this.variedad = variedad;

    }

    public static void registrarN(double volumen, String variedad) {
        cod += 1;
        var naranja = new Naranjas(volumen, cod, variedad);
        naranjasLista.add(naranja);
        // System.out.println("Naranja Registrada");

    }

    public static void mostrarN(){
        var dim = naranjasLista.size();
        System.out.println("\nNaranjas: ");
        for(int i=0; i<dim; i++){
            System.out.println("Codigo:" + naranjasLista.get(i).codigo+
            "; Tamaño: " + naranjasLista.get(i).volumen + 
            "; Variedad: " + naranjasLista.get(i).variedad);
        }
    }

    public static ArrayList<Naranjas> getNaranjasLista() {
        return naranjasLista;
    }
    

}