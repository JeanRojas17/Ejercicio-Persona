package com.example;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Pedro", "Pérez", "1053121010", 1998);
        Persona persona2 = new Persona("Luis", "León", "1053223344", 2001);

        System.out.println("Información de la persona 1:");
        persona1.imprimirInformacion();

        System.out.println("\nInformación de la persona 2:");
        persona2.imprimirInformacion();
    }
}