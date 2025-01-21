package com.berna.foro.hub.modelo;

import java.util.Objects;

public class curso {

    private Long id;
    private String nombre;
    private String categoria;

    // Constructor
    public curso(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Métodos get y set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Sobrescritura de hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Sobrescritura de equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        curso other = (curso) obj;
        return Objects.equals(id, other.id);
    }

    // Método toString (opcional, para mayor legibilidad)
    @Override
    public String toString() {
        return "curso{id=" + id + ", nombre='" + nombre + "', categoria='" + categoria + "'}";
    }
}
