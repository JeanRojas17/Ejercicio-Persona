package com.example;
import java.time.Year;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private String documentoIdentidad;
    private int añoNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellidos, String documentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento de Identidad: " + documentoIdentidad);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
        System.out.println("País de Nacimiento: "+ paisNacimiento);
        System.out.println("Género: "+ genero);
    }

    public int calcularEdad() {
        int añoActual = Year.now().getValue();
        return añoActual - añoNacimiento;
    }
}