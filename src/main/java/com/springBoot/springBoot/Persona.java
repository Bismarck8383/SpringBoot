package com.springBoot.springBoot;

public class Persona {

    public String nombre;
    public String ciudad;
    public Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String ciudad, Integer edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }
}

