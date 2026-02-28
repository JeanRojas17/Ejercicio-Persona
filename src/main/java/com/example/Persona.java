package com.example;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private String documentoIdentidad;
    private int añoNacimiento;

    public Persona(String nombre, String apellidos, String documentoIdentidad, int añoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
        this.añoNacimiento = añoNacimiento;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento de Identidad: " + documentoIdentidad);
        System.out.println("Año de Nacimiento: " + añoNacimiento);
    }

    public int calcularEdad() {
        int añoActual = 2026;
        return añoActual - añoNacimiento;
    }
}