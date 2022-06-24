package com.example.ejercicio12;

public class Datos {

    public String nombre;
    public String apellido;
    public int edad;
    public String correo;

    public Datos(String nom, String apell, int ed, String cor) {
        this.nombre = nom;
        this.apellido = apell;
        this.edad = ed;
        this.correo = cor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

