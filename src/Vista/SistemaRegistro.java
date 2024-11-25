/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.GestionLenguaje;
import java.util.Scanner;
/**
 *
 *Gian Harold Gonzales Quintanilla
 */
public class SistemaRegistro {

    public static void main(String[] args) {
       GestionLenguaje gestionesLenguajes = new GestionLenguaje();
        Scanner entrada = new Scanner(System.in);

        // Llamar al método Menu
        Menu(gestionesLenguajes, entrada);

        entrada.close();
    }

    // Método privado para mostrar el menú de opciones
    private static void Menu(GestionLenguaje gestionesLenguajes, Scanner entrada) {
        int opciones;

        do {
            // Mostrar menú utilizando printf para dar formato
            System.out.printf(
                "===============================================\n" +
                "|       Menú de Gestión de Lenguajes          |\n" +
                "===============================================\n" +
                "| %-3s %-30s |\n" +
                "| %-3s %-30s |\n" +
                "| %-3s %-30s |\n" +
                "| %-3s %-30s |\n" +
                "| %-3s %-30s |\n" +
                "===============================================\n" +
                "Seleccione una opción: ",
                "1.", "Agregar Lenguaje",
                "2.", "Buscar Lenguaje",
                "3.", "Eliminar Lenguaje",
                "4.", "Imprimir Lenguajes",
                "5.", "Salir"
            );
            
            opciones = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opciones) {  
                case 1:
                    System.out.print("Ingrese el nombre del lenguaje: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese el año de creación: ");
                    int anioCreacion = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese la característica principal: ");
                    String caracteristica = entrada.nextLine();
                    System.out.print("Ingrese la utilización: ");
                    String utilizacion = entrada.nextLine();

                    gestionesLenguajes.AgregarLenguaje(anioCreacion, caracteristica, nombre, utilizacion);
                    System.out.println("Lenguaje agregado correctamente.\n");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre para buscar el lenguaje deseado: ");
                    nombre = entrada.nextLine();
                    var lenguajeEncontrado = gestionesLenguajes.BuscarLenguaje(nombre);
                    if (lenguajeEncontrado != null) {
                        System.out.println("Lenguaje encontrado: " + lenguajeEncontrado);
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
                    nombre = entrada.nextLine();
                    if (gestionesLenguajes.EliminarLenguaje(nombre)) {
                        System.out.println("Lenguaje eliminado correctamente.");
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                    System.out.println();
                    break;

                case 4:
                    gestionesLenguajes.ImprimirLenguajes();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.\n");
                    break;
            }
        } while (opciones != 5);



    }

}