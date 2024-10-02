package com.example.perfil;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PerfilBean {
    private String nombre;
    private String carrera;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método de acción
    public void guardar() {
        // Lógica para guardar el perfil
        System.out.println("Perfil guardado: " + nombre + ", " + carrera);
    }
}
