/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LenguajeProgramacion;
 
/**Gian Harold Gonzales Quintanilla
 *
 * @author Usuario
 */
public class GestionLenguaje {
  private LenguajeProgramacion[] ArregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private int ContadorLenguajes = 2;
    private static final int FACTOR_CRECIMIENTO = 2;

    // Constructor inicializando con ejemplos
    public GestionLenguaje() {
        ArregloLenguajes[0] = new LenguajeProgramacion(1995, "POO", "Java", "Desarrollo web ");
        ArregloLenguajes[1] = new LenguajeProgramacion(1983, "Eficiencia", "C++", "Videojuegos");
    }

    // Métodos
    public void AgregarLenguaje(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        if (ContadorLenguajes == ArregloLenguajes.length) {
            ExpandirArreglo();
        }
        ArregloLenguajes[ContadorLenguajes++] = new LenguajeProgramacion(AnioCreacion, CaracteristicaPrincipal, Nombre, Utilizacion);
    }

    public LenguajeProgramacion BuscarLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                return ArregloLenguajes[i];
            }
        }
        return null;
    }

    public boolean EliminarLenguaje(String Nombre) {
        for (int i = 0; i < ContadorLenguajes; i++) {
            if (ArregloLenguajes[i].getNombre().equalsIgnoreCase(Nombre)) {
                
                for (int j = i; j < ContadorLenguajes - 1; j++) {// Movera los elementos hacia atrás al eliminarlo
                    ArregloLenguajes[j] = ArregloLenguajes[j + 1];
                }
                ArregloLenguajes[--ContadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }

    public LenguajeProgramacion[] GetArregloLenguajes() {
        return ArregloLenguajes;
    }

    public void ImprimirLenguajes() {
        System.out.println("===== Lista de Lenguajes de Programación =====");
        for (int i = 0; i < ContadorLenguajes; i++) {
            System.out.println(ArregloLenguajes[i].toString());
        }
    }

    // Método auxiliar para expandir el tamaño del arreglo
    private void ExpandirArreglo() {
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[ArregloLenguajes.length + FACTOR_CRECIMIENTO];
        System.arraycopy(ArregloLenguajes, 0, nuevoArreglo, 0, ArregloLenguajes.length);
        ArregloLenguajes = nuevoArreglo;
    }
}