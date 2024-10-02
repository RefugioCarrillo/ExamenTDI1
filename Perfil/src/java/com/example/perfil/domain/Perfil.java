package com.example.perfil.domain;

import java.util.List;

public class Perfil {
    private String nombre;
    private String carrera;
    private String foto; // Nombre de la imagen
    private List<String> lenguajesProgramacion;
    private List<String> basesDatos;
    private List<String> proyectosRealizados;
    private double promedio;

    // Constructor
    public Perfil(String nombre, String carrera, String foto, List<String> lenguajesProgramacion,
                  List<String> basesDatos, List<String> proyectosRealizados, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.foto = foto;
        this.lenguajesProgramacion = lenguajesProgramacion;
        this.basesDatos = basesDatos;
        this.proyectosRealizados = proyectosRealizados;
        this.promedio = promedio;
    }

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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<String> getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public void setLenguajesProgramacion(List<String> lenguajesProgramacion) {
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    public List<String> getBasesDatos() {
        return basesDatos;
    }

    public void setBasesDatos(List<String> basesDatos) {
        this.basesDatos = basesDatos;
    }

    public List<String> getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(List<String> proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
