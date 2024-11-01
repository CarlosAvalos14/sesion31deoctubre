package org.example;

public class Persona {

    private String nombres;
    private int edad;
    private String genero;

    public Persona(String nombres, int edad, String genero) {
        this.nombres = nombres;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void imprimirInformacion() {
        System.out.println("Información de la Persona:");
        System.out.println("Nombres: " + nombres);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
    }
}

