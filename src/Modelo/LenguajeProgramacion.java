/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * Gian Harold Gonzales Quintanilla
 */
public class LenguajeProgramacion {

    
    private int AnioCreacion; 
    private String CaracteristicaPrincipal;    //Creando mis atributos
    private String Nombre;
    private String Utilizacion;

    

    public int getAnioCreacion() {  //Creando los getters
        return AnioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return CaracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }

    public LenguajeProgramacion(int AnioCreacion, String CaracteristicaPrincipal, String Nombre, String Utilizacion) {
        this.AnioCreacion = AnioCreacion;
        this.CaracteristicaPrincipal = CaracteristicaPrincipal; //Creando el constructor 
        this.Nombre = Nombre;
        this.Utilizacion = Utilizacion;
    }
    
     public void setAnioCreacion(int AnioCreacion) { //Generando los setters
        this.AnioCreacion = AnioCreacion;
    }

    public void setCaracteristicaPrincipal(String CaracteristicaPrincipal) {
        this.CaracteristicaPrincipal = CaracteristicaPrincipal;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }

    @Override
    public String toString() {
        
        return String.format(
        "LenguajeProgramacion{\n" +
        "  Año de Creación: %-10d\n" +
        "  Característica Principal: %-30s\n" +
        "  Nombre: %-20s\n" +
        "  Utilización: %-30s\n" +
        "}", 
        AnioCreacion, 
        CaracteristicaPrincipal, 
        Nombre, 
        Utilizacion
    );
    }
    


}
