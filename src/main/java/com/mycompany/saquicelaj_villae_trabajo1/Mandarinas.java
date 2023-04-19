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
public class Mandarinas extends Frutas {
      private static int cod = 200;
    static ArrayList<Mandarinas> mandarinasLista = new ArrayList<>();

    int azucar;

    public Mandarinas(double volumen, int codigo, int azucar) {
        super(volumen, codigo);
        this.azucar = azucar;
        
    }

    public static void registrarM(double volumen, int azucar) {
        cod += 1;
        var mandarina = new Mandarinas(volumen, cod, azucar);
        mandarinasLista.add(mandarina);
        // System.out.println("Naranja Registrada");

    }

    public static void mostrarM(){
        var dim = mandarinasLista.size();
        System.out.println("\nMandarinas: ");

        for(int i=0; i<dim; i++){
            System.out.println("Codigo:" + mandarinasLista.get(i).codigo+
            "; Tamaño: " + mandarinasLista.get(i).volumen + 
            "; Nivel de azucar: " + mandarinasLista.get(i).azucar +"%");
        }
    }

    public static ArrayList<Mandarinas> getMandarinasLista() {
        return mandarinasLista;
    }
    
}