/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.saquicelaj_villae_trabajo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kristina
 */
public class SaquicelaJ_VillaE_Trabajo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var opcion = 0;
        Map<Integer, String> variedades = new HashMap<>(); // * { Arreglo asociativo
        variedades.put(1, "Navel");
        variedades.put(2, "Tarocco");
        variedades.put(3, "Sanguinello");
        variedades.put(4, "Moro");                          //* }

        var menu = "1._ Registrar Mandarina\n"
                + "2._ Registrar Naranja\n"
                + "3._ Registar Pollos\n"
                + "4._ Calcular";

        System.out.println("\n    --- BIENVENIDO ---  \n¿Qué desea hacer?");
        System.out.println(menu);

        // Registro de mandarinas
        Mandarinas.registrarM(11, 78);
        Mandarinas.registrarM(7, 34);
        Mandarinas.registrarM(4, 66);
        Mandarinas.registrarM(12, 93);

        Mandarinas.mostrarM();

        // Registro de naranjas
        System.out.println("\nRegistrar naranjas segun las variedades");
        for (int x = 1; x < 5; x++) {
            System.out.println(x + "._ " + variedades.get(x));
        }
        System.out.println("Escoja la variedad");
        opcion = entrada.nextInt();
        Naranjas.registrarN(12, variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN(4, variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN(11, variedades.get(opcion));
        opcion = entrada.nextInt();
        Naranjas.registrarN(7, variedades.get(opcion));

        entrada.close();
        Naranjas.mostrarN();
        System.out.println(" ");

        // Registro de pollos
        Pollos.registrarP(3.5);
        Pollos.registrarP(3.2);
        Pollos.registrarP(4.1);
        Pollos.registrarP(3.8);
        Pollos.mostrarP();

        Calculos calculo = new Calculos();
        System.out.println("\nCalculos del tamaño:\n");

        calculo.calcularPTamanoMayor(Mandarinas.getMandarinasLista(), 4);
        calculo.calcularPTamanoMayor(Naranjas.getNaranjasLista(), 10);
//        calculo.calcularPTamanoMayor(Pollos.getPollosLista(), 4);

        System.out.println("\nCalculos de la variedad:\n");
        calculo.calcularPVariedad(Naranjas.getNaranjasLista(), variedades.get(4));
//        calculo.calcularPVariedad(Mandarinas.getMandarinasLista(),variedades.get(4));
//        calculo.calcularPVariedad(Pollos.getPollosLista(), variedades.get(4));

        System.out.println("\nCalculos del azucar:\n");

        calculo.calcularPAzucar(Mandarinas.getMandarinasLista(), 65);
//        calculo.calcularPAzucar(Naranjas.getNaranjasLista(), 65);
//        calculo.calcularPAzucar(Pollos.getPollosLista(), 65);

        System.out.println("\nCalculos del peso del pollo:\n");

//        calculo.calcularPPeso(Mandarinas.getMandarinasLista(), 3.0);
//        calculo.calcularPPeso(Naranjas.getNaranjasLista(), 3.0);
        calculo.calcularPPeso(Pollos.getPollosLista(), 4.0);
        calculo.calcularPPeso(Animal.getAnimalLista(), 3.0);

    }

}
